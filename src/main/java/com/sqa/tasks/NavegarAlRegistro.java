package com.sqa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sqa.ui.PaginaCuenta.BOTON_CREAR_CUENTA;
import static com.sqa.ui.PaginaInicial.BOTON_MI_CUENTA;

public class NavegarAlRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_MI_CUENTA, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BOTON_MI_CUENTA),
                WaitUntil.the(BOTON_CREAR_CUENTA, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BOTON_CREAR_CUENTA)
        );
    }
        public static NavegarAlRegistro navegarAlRegistro(){
        return new NavegarAlRegistro();
    }
}
