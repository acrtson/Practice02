package com.jalasoft.selenium.practice02.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class HomePage extends Page {
    public HomePage() {
    }

    public CampaignPage goTo(String menuOption) {
        WebElement link = pageInstance.getDriver().findElement(By.linkText(menuOption));
        wait.until(ExpectedConditions.visibilityOf(link));
        link.click();
        return new CampaignPage();
    }
}
