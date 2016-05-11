package com.jalasoft.selenium.practice02.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alex Alvarez on 5/10/2016.
 */
public class LoginPage {
    private final WebDriver driver;

    private final String url;

    private final String userName;

    private final String password;


    public LoginPage(WebDriver driver, String url, String userName, String password) {
        this.driver = driver;
        this.url = url;
        this.userName = userName;
        this.password = password;

    }

    public HomePage login() {
        driver.get(url + "/");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();

        return new HomePage(driver);
    }
}
