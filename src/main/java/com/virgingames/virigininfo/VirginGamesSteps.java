package com.virgingames.virigininfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class VirginGamesSteps {
    @Step("Getting all data of currency in GBP")
    public ValidatableResponse getAllDataInGBP(){
        return SerenityRest.given().log().all()
                .queryParam(EndPoints.CURRENCY)
                .when()
                .get(EndPoints.GET_ALL_CURRENCY_NAME)
                .then().statusCode(200);
    }
}
