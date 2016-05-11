package com.jalasoft.selenium.practice02.Utils;

import java.util.*;

/**
 * Created by Alex Alvarez on 10-05-16.
 */
public class CampaignData {
    private final Date currentDate;

    private final List<Input> inputs;

    private final List<SelectField> selects;

    private final List<CheckboxField> checkboxes;

    public CampaignData() {
        currentDate = new Date();
        inputs = new ArrayList<>();
        selects = new ArrayList<>();
        checkboxes = new ArrayList<>();
    }

    private void getDataInputField() {
        inputs.add(new Input("cpn1", "NewCompaigname" + currentDate.getTime()));
        inputs.add(new Input("cpn5", "5/15/2016"));
        inputs.add(new Input("cpn6", "5/18/2016"));
        inputs.add(new Input("cpn8", "3560.50"));
        inputs.add(new Input("cpn9", "5050.99"));
        inputs.add(new Input("cpn10", "5100.99"));
        inputs.add(new Input("cpn11", "35.15"));
        inputs.add(new Input("cpn13", "99"));
        inputs.add(new Input("Parent", ""));
        inputs.add(new Input("cpn4", "This is a description for textAre Description"));
    }

    private void getDataSelectField() {
        selects.add(new SelectField("cpn2", "Email"));
        selects.add(new SelectField("cpn3", "In Progress"));
    }

    private void getDataCheckboxField() {
        checkboxes.add(new CheckboxField("cpn16", "Yes"));
    }

    public List<Input> getInputs() {
        getDataInputField();
        return inputs;
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
