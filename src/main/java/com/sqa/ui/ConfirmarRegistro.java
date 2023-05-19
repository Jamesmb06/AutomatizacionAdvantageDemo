package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmarRegistro extends PageObject {

    public static Target NOMBRE_USUARIO = Target.the("nombre del usuario creado")
            .located(By.xpath(""));
}
