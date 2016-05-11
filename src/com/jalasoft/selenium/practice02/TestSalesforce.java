package com.jalasoft.selenium.practice02;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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

        Date currentDate = new Date();

        Map<String, String> campaignData = new HashMap<String, String>();
        campaignData.put("cpn1", "NewCompaigname" + currentDate.getTime());    //Campaign Name
        campaignData.put("cpn16", "Yes");      //Active
        campaignData.put("cpn2", "Email");    //Type
        campaignData.put("cpn3", "In Progress");    //Status
        campaignData.put("cpn5", "5/15/2016");    //Start Date
        campaignData.put("cpn6", "5/15/2016");    //End Date
        campaignData.put("cpn8", "3560.50");      //Expected Revenue
        campaignData.put("cpn9", "5050.99");     //Budgeted Cost
        campaignData.put("cpn10", "5100.99");          //Actual Cost
        campaignData.put("cpn11", "35.15");   //Expected Response (%)
        campaignData.put("cpn13", "99");    //Num Sent
        campaignData.put("cpn4", "This is a description for textAre Descriptio");    //Descriptio

        campaignPage.clickOnNewButton("new");

        campaignPage.createNewCampaign(campaignData);

    }


}
