package com.sqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("escribir usuario")
            .located(By.xpath("(//input[@type='text'])[4]"));
    public static final Target CAMPO_EMAIL = Target.the("escribir correo")
            .located(By.xpath("(//input[@type='text'])[5]"));
    public static final Target CAMPO_CONTRASENNA = Target.the("escribir contraseña")
            .located(By.xpath("(//input[@type='password'])[2]"));
    public static final Target CAMPO_CONFIRMAR_CONTRASENNA = Target.the("confirmar contraseña")
            .located(By.xpath("(//input[@type='password'])[3]"));
    public static final Target NOMBRE= Target.the("escribir el nombre")
            .located(By.xpath("(//input[@type='text'])[6]"));
    public static final Target APELLIDO = Target.the("escribir el apellido")
            .located(By.xpath("(//input[@type='text'])[7]"));
    public static final Target CELULAR = Target.the("escribir el celular")
            .located(By.xpath("(//input[@type='text'])[8]"));
    public static final Target PAIS = Target.the("escoger el pais")
            .located(By.xpath("(//option[@class=''])"));
    public static final Target AUSTRALIA = Target.the("PAIS")
            .located(By.xpath("(//option[@label='Australia'])"));
    public static final Target CIUDAD = Target.the("escribir la ciudad")
            .located(By.xpath("(//input[@type='text'])[9]"));
    public static final Target DIRECCION = Target.the("escribir la dirección")
            .located(By.xpath("(//input[@type='text'])[10]"));
    public static final Target ESTADO = Target.the("escribir el estado")
            .located(By.xpath("(//input[@type='text'])[11]"));
    public static final Target CODIGO_POSTAL = Target.the("escribir el codigo postal")
            .located(By.xpath("(//input[@type='text'])[12]"));
    public static final Target TERMINOS_CONDICIONES = Target.the("chulear terminos y condiciones")
            .located(By.xpath("(//label[@data-ng-click='labelClicked()'])[16]"));
    public static final Target BOTON_REGISTRO= Target.the("Boton registrar usuario")
            .located(By.xpath("//button[normalize-space()='REGISTER']"));
}
