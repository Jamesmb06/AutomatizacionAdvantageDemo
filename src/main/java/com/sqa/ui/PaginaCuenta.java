package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCuenta extends PageObject {
    public static final Target BOTON_CREAR_CUENTA = Target.the("boton crear cuenta")
            .located(By.xpath("(//a[@class='create-new-account ng-scope'])"));
}
