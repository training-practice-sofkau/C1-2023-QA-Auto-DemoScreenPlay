package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PausaPublicitaria extends PageObject {

    public static Target DISMISS_ADS = Target.the("Boton cerrar publicidad")
            .located(By.xpath("//div[@id='dismiss-button']"));
}
