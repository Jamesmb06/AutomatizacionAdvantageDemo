package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {

    public static final Target BOTON_MI_CUENTA = Target.the("Boton ir a mi cuenta")
            .located(By.xpath("(//a[@id='menuUserLink'])"));

}
