package com.jalasoft.selenium.practice02.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class LoginPage extends Page {

    private final String userNameId = "username";

    private final String passwordId = "password";

    private final String loginId = "Login";

    public LoginPage() {
    }

    public HomePage login(String userName, String password){
        //set userName field
        setLoginFields(userName, userNameId);

        //set password field
        setLoginFields(password, passwordId);

        pageInstance.getDriver().findElement(By.id(loginId)).click();

        return new HomePage();
    }

    private void setLoginFields(String inputData, String idField){
        WebElement inputField = pageInstance.getDriver().findElement(By.id(idField));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.clear();
        inputField.sendKeys(inputData);
    }
}
