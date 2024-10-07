package com.co.demo.steps;

import com.co.demo.models.UserLoombokData;
import com.co.demo.pageobjects.SerenityCarrierPage;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.getDriver;

public class SerenityCarrierSteps {

    SerenityCarrierPage CarrierPage = new SerenityCarrierPage();

    @Step
    public void OpenForm(String url) {
        getDriver().get(url);
    }

    @Step
    public void NewC(UserLoombokData userLoombokData) {

        CarrierPage.getDriver().findElement(SerenityCarrierPage.getTxtCompany()).clear();
        CarrierPage.getDriver().findElement(SerenityCarrierPage.getTxtPhone()).clear();

        CarrierPage.getDriver().findElement(SerenityCarrierPage.getTxtCompany()).sendKeys(userLoombokData.getCompany());
        CarrierPage.getDriver().findElement(SerenityCarrierPage.getTxtPhone()).sendKeys(userLoombokData.getPhone());

        CarrierPage.getDriver().findElement(SerenityCarrierPage.getBtnSave()).click();


    }

    @Step
    public void validateList(String text) {
        assert CarrierPage.getDriver().findElement(SerenityCarrierPage.getTxtList()).getText().contains(text);
    }
}
