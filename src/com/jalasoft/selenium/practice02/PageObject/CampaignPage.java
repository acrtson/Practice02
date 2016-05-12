package com.jalasoft.selenium.practice02.PageObject;

import com.jalasoft.selenium.practice02.Utils.CampaignData;
import org.openqa.selenium.By;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class CampaignPage extends Page {

    private NewCampaignPage newCampaignPage;

    public CampaignPage() {

    }

    public CampaignPage clickOnNewButton(String buttonId) {
        pageInstance.getDriver().findElement(By.name(buttonId)).click();
        return this;
    }

    public void createNewCampaign(CampaignData campaignData) {
        newCampaignPage = new NewCampaignPage();

        newCampaignPage.fillInputFields(campaignData.getInputFields());

        newCampaignPage.fillSelectFields(campaignData.getSelects());

        newCampaignPage.fillCheckboxFields(campaignData.getCheckboxes());

        pageInstance.getDriver().findElement(By.name("save")).click();
    }
}
