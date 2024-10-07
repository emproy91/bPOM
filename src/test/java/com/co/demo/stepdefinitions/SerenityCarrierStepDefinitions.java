package com.co.demo.stepdefinitions;

import com.co.demo.models.UserLoombokData;
import com.co.demo.steps.SerenityCarrierSteps;
import com.co.demo.utils.GlobalData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SerenityCarrierStepDefinitions {

    @Steps
    private SerenityCarrierSteps carrierSteps;

    @Given("the user needs add new carrier")
    public void theUserNeedsAddNewCarrier() throws InterruptedException {
        carrierSteps.OpenForm(GlobalData.carrierUrl);
    }

    @When("Provides the new carrier details")
    public void ProvidesTheNewCarrierDetails(DataTable table) {
        carrierSteps.NewC(UserLoombokData.setData(table).get(0));
    }

    @Then("^will validate the new company in the list (.*)$")
    public void willValidateTheNewCompanyInTheList(String text) {
        carrierSteps.validateList(text);
    }

}
