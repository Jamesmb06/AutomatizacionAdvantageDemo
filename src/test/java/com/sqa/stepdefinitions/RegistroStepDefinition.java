package com.sqa.stepdefinitions;

import com.sqa.setup.Configuracion;
import com.sqa.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;
import java.util.List;

import static com.sqa.questions.ValidarUsuarioCreado.validarUsuarioCreado;
import static com.sqa.tasks.LlenarDatosRegistro.llenarDatosRegistro;
import static com.sqa.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.sqa.util.LoadCredentials.getCredentials;

public class RegistroStepDefinition extends Configuracion {

    private final List<String> credentials = getCredentials();
    public static Logger LOGGER = Logger.getLogger(RegistroStepDefinition.class);

    public RegistroStepDefinition() throws IOException {
    }

    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try {
            configurarNavegador();
            LOGGER.info("Inicio de la Automatizacion");
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        } catch (Exception e) {
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("navega hasta la el formulario de registro")
    public void navegaHastaLaElFormularioDeRegistro() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarAlRegistro()
            );
            LOGGER.info("Se dirige el campo para crear la cuenta");
        } catch (Exception e) {
            LOGGER.info("No se ingresa al campo crear cuenta");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @When("llena todos los campos correctamente")
    public void llenaTodosLosCamposCorrectamente() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    llenarDatosRegistro()
                            .conElUsuario(credentials.get(0))
                            .yConElEmail(credentials.get(1))
                            .yConLaContrasenna(credentials.get(2))
            );
            LOGGER.info("Se llenan los datos de registro");
        } catch (Exception e) {
            LOGGER.info("fallo al realizar el registro");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Then("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
        try {
            LOGGER.info("Verificando que el usuario vea el nombre del usuario creado");
            String nombreUsuario = theActorInTheSpotlight().asksFor(validarUsuarioCreado());
            Assert.assertEquals("JamesSQ", nombreUsuario);
            LOGGER.info("usuario creado validado correctamente");
        } catch (Exception e) {
            LOGGER.info("error al validar el usuario creado");
            LOGGER.warn(e.getMessage());
            Assert.fail("Assertion failed");
            quitarDriver();
        }
    }
}
