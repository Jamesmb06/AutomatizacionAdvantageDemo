package com.sqa.setup;

import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Configuracion {
    private static final String ACTOR = "James";
    private static final String LOG4J_PROPERTIES_FILE_PATH = "/path/to/log4j.properties";

    @Managed()
    protected WebDriver webDriver;

    private void setupUser() {
        configurarDriver();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
        maximizar(webDriver);
    }

    private void configurarDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarDriver() {
        webDriver.quit();
    }

    protected void configurarNavegador() {
        setupUser();
        setUplog4j();
    }

    private void setUplog4j() {
        PropertyConfigurator.configure(LOG4J_PROPERTIES_FILE_PATH);
    }

}
