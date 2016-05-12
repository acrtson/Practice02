package com.jalasoft.selenium.practice02.Utils;

import org.openqa.selenium.WebElement;

/**
 * Created by Alex Alvarez on 11-05-16.
 */
public class CheckboxField extends Field {
    public CheckboxField(String identifier, String value) {
        super(identifier, value);
    }

    public void setCheckboxStatus(WebElement checkbox){
        if(getValue().equals("Yes")){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }else{
            if(checkbox.isSelected()){
                checkbox.click();
            }
        }
    }
}
