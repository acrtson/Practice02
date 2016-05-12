package com.jalasoft.selenium.practice02.PageObject;

import com.jalasoft.selenium.practice02.Utils.InputField;
import org.openqa.selenium.By;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public class LoginPage extends NewPage {

    private final String userNameId = "username";

    private final String passwordId = "password";

    private final String loginId = "Login";

    public LoginPage() {
    }

    public HomePage login(String userName, String password) {
        //set userName field
        setInputFieldValue(new InputField(userNameId, userName));

        //set password field
        setInputFieldValue(new InputField(passwordId, password));

        pageInstance.getDriver().findElement(By.id(loginId)).click();

        return new HomePage();
    }
}
