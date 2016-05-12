package com.jalasoft.selenium.practice02.Utils;

import java.util.*;

/**
 * Created by Alex Alvarez on 10-05-16.
 */
public class CampaignData {
    private final Date currentDate;

    private final List<InputField> inputFields;

    private final List<SelectField> selects;

    private final List<CheckboxField> checkboxes;

    public CampaignData() {
        currentDate = new Date();
        inputFields = new ArrayList<>();
        selects = new ArrayList<>();
        checkboxes = new ArrayList<>();
    }

    private void getDataInputField() {
        inputFields.add(new InputField("cpn1", "NewCompaigname" + currentDate.getTime()));
        inputFields.add(new InputField("cpn5", "5/15/2016"));
        inputFields.add(new InputField("cpn6", "5/18/2016"));
        inputFields.add(new InputField("cpn8", "3560.50"));
        inputFields.add(new InputField("cpn9", "5050.99"));
        inputFields.add(new InputField("cpn10", "5100.99"));
        inputFields.add(new InputField("cpn11", "35.15"));
        inputFields.add(new InputField("cpn13", "99"));
        inputFields.add(new InputField("Parent", ""));
        inputFields.add(new InputField("cpn4", "This is a description for textAre Description"));
    }

    private void getDataSelectField() {
        selects.add(new SelectField("cpn2", "Email"));
        selects.add(new SelectField("cpn3", "In Progress"));
    }

    private void getDataCheckboxField() {
        checkboxes.add(new CheckboxField("cpn16", "Yes"));
    }

    public List<InputField> getInputFields() {
        getDataInputField();
        return inputFields;
    }

    public List<SelectField> getSelects() {
        getDataSelectField();
        return selects;
    }

    public List<CheckboxField> getCheckboxes() {
        getDataCheckboxField();
        return checkboxes;
    }
}
