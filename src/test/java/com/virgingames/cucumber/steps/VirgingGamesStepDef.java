package com.virgingames.cucumber.steps;

import com.virgingames.virigininfo.VirginGamesSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

import java.util.List;

public class VirgingGamesStepDef {
    static ValidatableResponse response;
    static List<String> currency;
    @Steps
    VirginGamesSteps virginSteps;


    @Given("User is on Homepage")
    public void userIsOnHomepage() {
    }

    @When("User get data of Bingo's Jackpot currency")
    public void userGetDataOfBingoSJackpotCurrency() {
        response = virginSteps.getAllDataInGBP();
        response.log().all();

    }

    @Then("User must get back a valid status code {int}")
    public void userMustGetBackAValidStatusCode(int statusCode) {
        response.statusCode(statusCode);
    }

    @And("User verify currency is GBP")
    public void userVerifyCurrencyGBP() {
        response.extract().jsonPath().get("data.pots.currency");

        }

    }




