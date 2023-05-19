package com.sqa.stepdefinitions;

import com.sqa.setup.Configuracion;
import com.sqa.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(RegistroStepDefinition.class);

    @Given("que el usuario esta en la pagina de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        try {
            // Se configura el navegador y se inicia la automatización
            configurarNavegador();
            LOGGER.info("Inicio de la Automatizacion");
            // El actor realiza las acciones de abrir la página inicial y navegar a la cuenta
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        } catch (Exception e) {
            // Si ocurre una excepción, se registra en el log y se hace un Assertion.fail() para indicar que el escenario falló
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @When("navega hasta la el formulario de registro")
    public void navegaHastaLaElFormularioDeRegistro() {
    }

    @When("llena todos los campos correctamente")
    public void llenaTodosLosCamposCorrectamente() {
    }

    @Then("el usuario debe ver su nombre en la pagina principal")
    public void elUsuarioDebeVerSuNombreEnLaPaginaPrincipal() {
    }










}
