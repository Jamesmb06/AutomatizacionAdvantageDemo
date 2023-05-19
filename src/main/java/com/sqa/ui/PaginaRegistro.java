package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("escribir usuario")
            .located(By.xpath(""));
    public static final Target CAMPO_EMAIL = Target.the("escribir correo")
            .located(By.xpath(""));
    public static final Target CAMPO_CONTRASENNA = Target.the("escribir contraseña")
            .located(By.xpath(""));
    public static final Target CAMPO__CONFIRMAR_CONTRASENNA = Target.the("confirmar contraseña")
            .located(By.xpath(""));
    public static final Target REGISTRO_USUARIO = Target.the("Boton crear cuenta")
            .located(By.xpath(""));
}
