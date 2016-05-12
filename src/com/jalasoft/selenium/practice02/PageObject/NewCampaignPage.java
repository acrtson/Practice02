package com.jalasoft.selenium.practice02.PageObject;

import com.jalasoft.selenium.practice02.Utils.CampaignData;
import com.jalasoft.selenium.practice02.Utils.CheckboxField;
import com.jalasoft.selenium.practice02.Utils.Input;
import com.jalasoft.selenium.practice02.Utils.SelectField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class NewCampaignPage extends Page {
    private CampaignData campaignData;
    WebDriverWait wait = new WebDriverWait(pageInstance.getDriver(), 15);

    public NewCampaignPage() {
        campaignData = new CampaignData();
    }

    public void fillInputs() {
        for (Input input : campaignData.getInputs()) {
            WebElement inputField = pageInstance.getDriver().findElement(By.id(input.getIdentifier()));
            wait.until(ExpectedConditions.visibilityOf(inputField));
            inputField.clear();
            inputField.sendKeys(input.getValue());
        }
    }

    public void fillSelects() {
        for (SelectField select : campaignData.getSelects()) {
            Select selectCombobox = new Select(pageInstance.getDriver().findElement(By.id(select.getIdentifier())));
            selectCombobox.selectByVisibleText(select.getValue());
        }
    }

    public void fillCheckboxes() {
        for (CheckboxField checkboxField : campaignData.getCheckboxes()) {
            WebElement checkbox = pageInstance.getDriver().findElement(By.id(checkboxField.getIdentifier()));
            wait.until(ExpectedConditions.elementToBeClickable(checkbox));
            checkbox.click();
        }
    }
}
