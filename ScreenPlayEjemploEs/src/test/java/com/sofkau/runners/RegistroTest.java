package com.sofkau.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/registrarse.feature"},
        glue = {"com.sofkau.stepdefinitions"},
        tags = {"@Registro"}
)
public class RegistroTest {
}
