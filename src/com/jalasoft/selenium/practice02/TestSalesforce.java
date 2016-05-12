package com.jalasoft.selenium.practice02;

import com.jalasoft.selenium.practice02.PageObject.CampaignPage;
import com.jalasoft.selenium.practice02.PageObject.HomePage;
import com.jalasoft.selenium.practice02.PageObject.LoginPage;
import org.testng.annotations.Test;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class TestSalesforce {
    @Test
    public void testSalesforcePage(){
        LoginPage loginPage = new LoginPage();

        HomePage homePage = loginPage.login("acrtson@gmail.com", "Selenium123*");

        CampaignPage campaignPage = homePage.goTo("Campaigns");

        campaignPage.clickOnNewButton("new").createNewCampaign();

    }
}
