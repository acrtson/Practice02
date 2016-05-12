package com.jalasoft.selenium.practice02.PageObject;

import org.openqa.selenium.By;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class CampaignPage extends Page {

    private NewCampaignPage newCampaignPage;

    public CampaignPage() {

    }

    public CampaignPage clickOnNewButton(String buttonId){
        pageInstance.getDriver().findElement(By.name(buttonId)).click();
        return this;
    }

    public void createNewCampaign(){
        newCampaignPage = new NewCampaignPage();

        newCampaignPage.fillInputs();

        newCampaignPage.fillSelects();

        newCampaignPage.fillCheckboxes();

        pageInstance.getDriver().findElement(By.name("save")).click();
    }
}
