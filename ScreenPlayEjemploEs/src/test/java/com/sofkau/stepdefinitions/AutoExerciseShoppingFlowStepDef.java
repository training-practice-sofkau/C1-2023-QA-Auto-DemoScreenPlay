package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuration;
import com.sofkau.tasks.OpenHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.IsAccountCreated.isAccountCreated;
import static com.sofkau.questions.IsOrderPlaced.isOrderPlaced;
import static com.sofkau.questions.LoggedInAs.loggedInAs;
import static com.sofkau.tasks.BuyJean.buyJean;
import static com.sofkau.tasks.DoSignup.doSignup;
import static com.sofkau.tasks.GoToSignup.goToSignup;
import static com.sofkau.tasks.Login.login;
import static com.sofkau.tasks.NavigateToSignupLogin.navigateToSignupLogin;
import static com.sofkau.ui.PaymentDone.DELETE_ACCOUNT;
import static com.sofkau.util.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutoExerciseShoppingFlowStepDef extends Configuration {
    private final Logger log = LoggerFactory.getLogger(AutoExerciseShoppingFlowStepDef.class);

    @Given("I accessed the home page")
    public void iAccessedTheHomePage() {
        try {
            log.info("Init scenario");
            setupBrowser();
            theActorInTheSpotlight().wasAbleTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong Setup provided");
            quitDriver();
        }
    }

    @When("I navigate to the registration form")
    public void iNavigateToTheRegistrationForm() {
        try {
            log.info("Running selection");
            theActorInTheSpotlight().attemptsTo(
                    navigateToSignupLogin()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            quitDriver();
        }
    }

    @And("I fill in all registration fields")
    public void iFillInAllRegistrationFields() {
        try {
            log.info("Running selection");
            theActorInTheSpotlight().attemptsTo(
                    goToSignup(),
                    doSignup()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            quitDriver();
        }
    }

    @Then("I will be redirected to home page")
    public void iWillBeRedirectedToHomePage() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(isAccountCreated(), equalTo(E_TITLE))
            );
            log.info("Test 1 passed");
        } catch (Exception e) {
            log.error("Test failed");
            quitDriver();
            Assertions.fail();
        } finally {
            quitDriver();
        }
    }

    @And("I fill in all login fields")
    public void iFillInAllLoginFields() {
        try {
            log.info("Running selection");
            theActorInTheSpotlight().attemptsTo(
                    login()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            quitDriver();
        }
    }

    @Then("I will see my name on home page")
    public void iWillSeeMyNameOnHomePage() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(loggedInAs(), equalTo(LOGGED_IN_AS))
            );
            log.info("Test 2 passed");
        } catch (Exception e) {
            log.error("Test failed");
            quitDriver();
            Assertions.fail();
        } finally {
            quitDriver();
        }
    }

    @And("I make a purchase of a men's jean")
    public void iMakeAPurchaseOfAMenSJean() {
        try {
            log.info("Running selection");
            theActorInTheSpotlight().attemptsTo(
                    buyJean()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            quitDriver();
        }
    }

    @Then("I will see an order confirmation message")
    public void iWillSeeAnOrderConfirmationMessage() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(isOrderPlaced(), equalTo(E_TITLE_ORDER))
            );
            theActorInTheSpotlight().attemptsTo(Click.on(DELETE_ACCOUNT));
            log.info("Test 3 passed");
        } catch (Exception e) {
            log.error("Test failed");
            quitDriver();
            Assertions.fail();
        } finally {
            quitDriver();
        }
    }
}