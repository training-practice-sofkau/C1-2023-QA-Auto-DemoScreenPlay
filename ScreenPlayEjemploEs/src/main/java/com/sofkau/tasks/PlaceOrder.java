package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

import static com.sofkau.ui.Checkout.PLACE_ORDER;

public class PlaceOrder implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PLACE_ORDER),
        Click.on(PLACE_ORDER)
        );
    }

    public static PlaceOrder placeOrder() {
        return new PlaceOrder();
    }
}
