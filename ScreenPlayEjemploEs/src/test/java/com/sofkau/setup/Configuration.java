package com.sofkau.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.sofkau.util.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Configuration {

    @Managed()
    protected WebDriver webDriver;


    protected void setupBrowser() {
        configureDriver();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
        maximize(webDriver);
    }

    private void configureDriver() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*", "--incognito");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(opt);
    }

    private static void maximize(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitDriver() {
        webDriver.quit();
    }
}