package com.co.demo.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SerenityCarrierPage extends PageObject {

    private static By TXT_COMPANY = By.name("CompanyName");
    private static By TXT_PHONE = By.name("Phone");
    private static By BTN_SAVE = By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div/div[1]/span");

    private static By TXT_LIST = By.xpath("/html/body/main/section/div/div[3]/div[5]/div");


    public static By getTxtCompany() { return TXT_COMPANY; }

    public static By getTxtPhone() { return TXT_PHONE; }

    public static By getBtnSave() { return BTN_SAVE; }

    public static By getTxtList() { return TXT_LIST; }




}
