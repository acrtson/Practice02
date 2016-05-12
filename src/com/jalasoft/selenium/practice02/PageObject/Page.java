package com.jalasoft.selenium.practice02.PageObject;

import com.jalasoft.selenium.practice02.Utils.SingleObject;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Alex Alvarez on 5/11/2016.
 */
public abstract class Page {
    SingleObject pageInstance = SingleObject.getInstance();

    protected WebDriverWait wait = new WebDriverWait(pageInstance.getDriver(), 15);

    public Page() {
    }
}
