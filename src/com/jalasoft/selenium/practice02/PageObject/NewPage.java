package com.jalasoft.selenium.practice02.PageObject;

import java.util.List;

import com.jalasoft.selenium.practice02.Utils.CheckboxField;
import com.jalasoft.selenium.practice02.Utils.InputField;
import com.jalasoft.selenium.practice02.Utils.SelectField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Alex Alvarez on 5/12/2016.
 */
public abstract class NewPage extends Page {

    public NewPage() {
    }

    protected void setInputFieldValue(InputField inputField) {
        WebElement textbox = pageInstance.getDriver().findElement(By.id(inputField.getIdentifier()));
        wait.until(ExpectedConditions.visibilityOf(textbox));
        textbox.clear();
        textbox.sendKeys(inputField.getValue());
    }

    protected void setSelectFieldValue(SelectField select) {
        WebElement combobox = pageInstance.getDriver().findElement(By.id(select.getIdentifier()));
        wait.until(ExpectedConditions.visibilityOf(combobox));
        Select selectCombobox = new Select(combobox);
        selectCombobox.selectByVisibleText(select.getValue());
    }

    protected void setCheckboxFieldValue(CheckboxField checkboxField) {
        WebElement checkbox = pageInstance.getDriver().findElement(By.id(checkboxField.getIdentifier()));
        wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        checkboxField.setCheckboxStatus(checkbox);
    }


    public void fillInputFields(List<InputField> inputsList) {
        for (InputField inputField : inputsList) {
            setInputFieldValue(inputField);
        }
    }

    public void fillSelectFields(List<SelectField> selectsList) {
        for (SelectField select : selectsList) {
            setSelectFieldValue(select);
        }
    }

    public void fillCheckboxFields(List<CheckboxField> checkboxesList) {
        for (CheckboxField checkboxField : checkboxesList) {
            setCheckboxFieldValue(checkboxField);
        }
    }
}
