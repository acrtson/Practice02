package com.jalasoft.selenium.practice02.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class SingleObject {
    protected WebDriver driver;

    protected final static String baseUrl = "https://login.salesforce.com";

    private static SingleObject instance = null;

    private SingleObject() {
    }

    public static SingleObject getInstance(){
        if (instance == null){
            instance = new SingleObject();
            instance.initDriver();
        }
        return instance;
    }

    public void initDriver(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
