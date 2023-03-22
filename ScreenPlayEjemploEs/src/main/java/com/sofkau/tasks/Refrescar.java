package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static com.sofkau.ui.ComprarProductos.PRODUCTOS;

public class Refrescar implements Task {
    public Refrescar() { }

    public static Refrescar thePage() {

        return Tasks.instrumented(Refrescar.class);
    }

    @Override
    @Step("{0} refreshes the browser")
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.navigate().refresh();
    }
}
