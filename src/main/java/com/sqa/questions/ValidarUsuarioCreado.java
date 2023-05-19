package com.sqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sqa.ui.ConfirmarRegistro.NOMBRE_USUARIO;

public class ValidarUsuarioCreado implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return NOMBRE_USUARIO.resolveFor(actor).getText();
    }

    public static ValidarUsuarioCreado validarUsuarioCreado(){
        return new ValidarUsuarioCreado();
    }
}

