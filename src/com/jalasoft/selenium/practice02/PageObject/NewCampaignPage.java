package com.jalasoft.selenium.practice02.PageObject;

import com.jalasoft.selenium.practice02.Utils.CampaignData;
import com.jalasoft.selenium.practice02.Utils.CheckboxField;
import com.jalasoft.selenium.practice02.Utils.Input;
import com.jalasoft.selenium.practice02.Utils.SelectField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by Alex Alvarez on 11-05-16.
 */
public class NewCampaignPage {
    private CampaignData campaignData;

    private final WebDriver driver;


    public NewCampaignPage(WebDriver driver) {
        this.driver = driver;
        campaignData = new CampaignData();

    }

    public void fillInputs() {
        for (Input input : campaignData.getInputs()) {
            driver.findElement(By.id(input.getIdentifier())).clear();
            driver.findElement(By.id(input.getIdentifier())).sendKeys(input.getValue());
        }
    }

    public void fillSelects() {
        for (SelectField select : campaignData.getSelects()) {
            Select selectCombobox = new Select(driver.findElement(By.id(select.getIdentifier())));
            selectCombobox.selectByVisibleText(select.getValue());
        }
    }

    public void fillCheckboxes(){
        for(CheckboxField checkboxField: campaignData.getCheckboxes()){
            WebElement checkbox = driver.findElement(By.id(checkboxField.getIdentifier()));
            checkbox.click();
        }
    }
}
