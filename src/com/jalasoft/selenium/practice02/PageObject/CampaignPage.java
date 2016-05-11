package com.jalasoft.selenium.practice02.PageObject;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Alex Alvarez on 5/10/2016.
 */
public class CampaignPage {
    private final WebDriver driver;

    public CampaignPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnNewButton(String buttonId){
        driver.findElement(By.name(buttonId)).click();
    }

    public void createNewCampaign(Map campaignData){
        //Campaign Name
        driver.findElement(By.id("cpn1")).clear();
        driver.findElement(By.id("cpn1")).sendKeys(campaignData.get("cpn1").toString());

        //Active
        WebElement activeCheckbox = driver.findElement(By.id("cpn16"));

        activeCheckbox.getTagName();

        if (!activeCheckbox.isSelected() && campaignData.get("cpn16").toString().equals("Yes")) {
            activeCheckbox.click();
        }

        //Type combobox
        Select typeCombobox = new Select(driver.findElement(By.id("cpn2")));
        typeCombobox.selectByVisibleText(campaignData.get("cpn2").toString());

        //Status
        Select statusCombobox = new Select(driver.findElement(By.id("cpn3")));
        statusCombobox.selectByVisibleText(campaignData.get("cpn3").toString());

        //Start Date
        driver.findElement(By.id("cpn5")).clear();
        driver.findElement(By.id("cpn5")).sendKeys(campaignData.get("cpn5").toString());

        //End Date
        driver.findElement(By.id("cpn6")).clear();
        driver.findElement(By.id("cpn6")).sendKeys(campaignData.get("cpn6").toString());

        //Expected Revenue
        driver.findElement(By.id("cpn8")).clear();
        driver.findElement(By.id("cpn8")).sendKeys(campaignData.get("cpn8").toString());

        //Budgeted Cost
        driver.findElement(By.id("cpn9")).clear();
        driver.findElement(By.id("cpn9")).sendKeys(campaignData.get("cpn9").toString());

        //Actual Cost
        driver.findElement(By.id("cpn10")).clear();
        driver.findElement(By.id("cpn10")).sendKeys(campaignData.get("cpn10").toString());

        //Expected Response (%)
        driver.findElement(By.id("cpn11")).clear();
        driver.findElement(By.id("cpn11")).sendKeys(campaignData.get("cpn11").toString());

        //Num Sent
        driver.findElement(By.id("cpn13")).clear();
        driver.findElement(By.id("cpn13")).sendKeys(campaignData.get("cpn11").toString());

        //Description
        driver.findElement(By.id("cpn4")).clear();
        driver.findElement(By.id("cpn4")).sendKeys(campaignData.get("cpn4").toString());

        driver.findElement(By.name("save")).click();

    }

}
