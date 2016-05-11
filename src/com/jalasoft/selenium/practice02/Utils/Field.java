package com.jalasoft.selenium.practice02.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by aj on 10-05-16.
 */
public abstract class Field {
    private final String identifier;

    private final String value;

    public Field(String identifier, String value) {
        this.identifier = identifier;
        this.value = value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getValue() {
        return value;
    }

}
