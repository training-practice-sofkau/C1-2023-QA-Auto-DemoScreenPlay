package com.sofkau.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Configuracion {
    private static final String SWITCHES = "--remote-allow-origins=*";
    private static final String ACTOR = "Juanes";

    @Managed()
    protected WebDriver webDriver;


    private void setupUser(WebDriver webDriver) {
        configurarDriver();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
        maximizar(webDriver);
    }

    private void configurarDriver() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments(SWITCHES);
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(co);
    }

    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarDriver() {
        webDriver.quit();
    }

    protected void configurarNavegador() {
        setupUser(webDriver);
    }

    public static void waitExplicit() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
}