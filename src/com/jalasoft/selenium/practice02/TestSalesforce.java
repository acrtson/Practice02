package com.jalasoft.selenium.practice02;

import java.util.concurrent.TimeUnit;

import com.jalasoft.selenium.practice02.PageObject.CampaignPage;
import com.jalasoft.selenium.practice02.PageObject.HomePage;
import com.jalasoft.selenium.practice02.PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Alex Alvarez on 5/10/2016.
 */
public class TestSalesforce {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://login.salesforce.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSalesforce() {
        LoginPage loginPage = new LoginPage(driver, baseUrl, "acrtson@gmail.com", "Selenium123*");

        HomePage homePage = loginPage.login();

        CampaignPage campaignPage = homePage.goTo("Campaigns");

        campaignPage.clickOnNewButton("new");

        campaignPage.createNewCampaign();

    }


}
