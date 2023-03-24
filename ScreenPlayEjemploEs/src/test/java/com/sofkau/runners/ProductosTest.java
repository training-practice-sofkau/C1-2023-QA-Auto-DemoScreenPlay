package com.sofkau.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/escogerProductoHacerPago.feature"},
        glue = {"com.sofkau.stepdefinitions"},
        tags = {"@Productos"})
public class ProductosTest {
}
