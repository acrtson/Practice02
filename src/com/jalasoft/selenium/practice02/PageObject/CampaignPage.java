package com.jalasoft.selenium.practice02.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Alex Alvarez on 5/10/2016.
 */
public class CampaignPage {
    private final WebDriver driver;
    private final NewCampaignPage newCampaignPage;

    public CampaignPage(WebDriver driver) {
        this.driver = driver;
        newCampaignPage = new NewCampaignPage(driver);
    }

    public void clickOnNewButton(String buttonId){
        driver.findElement(By.name(buttonId)).click();
    }

    public void createNewCampaign(){
        newCampaignPage.fillInputs();

        newCampaignPage.fillSelects();

        newCampaignPage.fillCheckboxes();

        driver.findElement(By.name("save")).click();
    }

}
