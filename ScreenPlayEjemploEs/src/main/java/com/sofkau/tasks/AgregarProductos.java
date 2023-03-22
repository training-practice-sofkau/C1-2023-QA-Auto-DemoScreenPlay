package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.sofkau.ui.PaginaCompletarRegistro.CAMPO_FIRST_NAME;
import static com.sofkau.ui.PaginaPrincipal.*;


public class AgregarProductos implements Task {

    private String numProducto;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(COMPRAR_PRODUCTO),
                Click.on(Target.the("Comprar sexto producto")
                        .located(By.cssSelector("a[href='/product_details/1']"))),

                Refrescar.refrescar(),
                Click.on(Target.the("Comprar sexto producto")
                        .located(By.cssSelector("a[href='/product_details/1']"))),
                Click.on(AGREGAR_AL_CARRO),
                Click.on(CONTINUAR_COMPRANDO),
                Click.on(VOLVER_PAGINA_PRINCIPAL)
        );
        for(int i=2;i<=3;i++){
            actor.attemptsTo(
                    Scroll.to(COMPRAR_PRODUCTO),
                    Click.on(Target.the("Comprar sexto producto")
                            .located(By.cssSelector("a[href='/product_details/"+String.valueOf(i)+"']"))),
                    Click.on(AGREGAR_AL_CARRO),
                    Click.on(CONTINUAR_COMPRANDO),
                    Click.on(VOLVER_PAGINA_PRINCIPAL)
                    );
        }



    }

    public static AgregarProductos agregarProductos(){
        return new AgregarProductos();
    }
}
