package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionComentario {
    public static Target MENSAJE_COMENTARIO = Target.the("mensaje con la orden confirmada")
            .located(By.cssSelector("div[class='alert-success alert'] span"));
}
