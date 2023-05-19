package com.sqa.tasks;

import com.sqa.ui.PaginaRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

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

        actor.attemptsTo(
                Enter.theValue(usuario).into(PaginaRegistro.CAMPO_USUARIO),
                Enter.theValue(email).into(PaginaRegistro.CAMPO_EMAIL),
                Enter.theValue(contrasenna).into(PaginaRegistro.CAMPO_CONTRASENNA),
                Enter.theValue(contrasenna).into(PaginaRegistro.CAMPO__CONFIRMAR_CONTRASENNA)

        );
    }
    public static LlenarDatosRegistro llenarDatosRegistro () {

        return new LlenarDatosRegistro();
    }
}


