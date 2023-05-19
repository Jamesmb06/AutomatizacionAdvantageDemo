package com.sqa.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sqa.ui.ConfirmarRegistro.NOMBRE_USUARIO;
import static com.sqa.ui.PaginaRegistro.*;

public class LlenarDatosRegistro implements Task {

    private String usuario;
    private String contrasenna;
    private String email;

    public LlenarDatosRegistro conElUsuario(String usuario){
        this.usuario=usuario;
        return this;
    }
    public LlenarDatosRegistro yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }
    public LlenarDatosRegistro yConElEmail(String email){
        this.email=email;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker();

        actor.attemptsTo(
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Enter.theValue(contrasenna).into(CAMPO_CONFIRMAR_CONTRASENNA),
                Enter.theValue(faker.name().firstName()).into(NOMBRE),
                Enter.theValue(faker.name().lastName()).into(APELLIDO),
                Enter.theValue(faker.phoneNumber().cellPhone()).into(CELULAR),
                Click.on(PAIS),
                Click.on(AUSTRALIA),
                Enter.theValue(faker.address().city()).into(CIUDAD),
                Enter.theValue(faker.address().streetAddress()).into(DIRECCION),
                Enter.theValue(faker.address().state()).into(ESTADO),
                Enter.theValue(faker.address().zipCode()).into(CODIGO_POSTAL),
                WaitUntil.the(TERMINOS_CONDICIONES, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TERMINOS_CONDICIONES),
                WaitUntil.the(BOTON_REGISTRO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_REGISTRO),
                WaitUntil.the(NOMBRE_USUARIO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()

        );
    }
    public static LlenarDatosRegistro llenarDatosRegistro () {

        return new LlenarDatosRegistro();
    }
}


