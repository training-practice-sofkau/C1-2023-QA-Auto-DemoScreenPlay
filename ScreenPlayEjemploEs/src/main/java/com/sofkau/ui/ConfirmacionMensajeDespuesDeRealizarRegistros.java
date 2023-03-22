package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionMensajeDespuesDeRealizarRegistros {

    public static Target MENSAJE_REGISTRO_EXITOSO = Target.the("Mensaje de registro exitoso")
            .located(By.xpath("//h2[@data-qa='account-created']//b"));
}
