package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCrearCuenta extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("boton crear cuenta")
            .located(By.xpath(""));

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.xpath(""));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath(""));

    public static final Target BOTON_INICIAR_SESION = Target.the("Botón iniciar sesion")
            .located(By.xpath(""));

    public static final Target REGISTRO_USUARIO = Target.the("Boton crear cuenta")
            .located(By.xpath(""));

    public static final Target REGISTRO_EMAIL = Target.the("Boton crear cuenta")
            .located(By.xpath(""));
    public static final Target BOTON_REGISTRO2 = Target.the("Boton ir al registro")
            .located(By.xpath(""));
}
