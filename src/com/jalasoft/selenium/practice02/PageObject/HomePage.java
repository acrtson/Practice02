package com.jalasoft.selenium.practice02.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alex Alvarez on 5/10/2016.
 */
public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CampaignPage goTo(String menuOption){
        driver.findElement(By.linkText(menuOption)).click();
        return new CampaignPage(driver);
    }
}
