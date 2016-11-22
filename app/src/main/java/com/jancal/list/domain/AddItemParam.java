package com.jancal.list.domain;

import java.util.Date;


public class AddItemParam {

    private float sum;
    private Date date;
    private Label label;


    public AddItemParam(float sum, Label label, Date date) {
        this.setSum(sum);
        this.setLabel(label);
        this.setDate(date);
    }


    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        if (sum <= 0) {
            throw new IllegalArgumentException("sum should large than zero");
        }
        this.sum = sum;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("date should not be empty");
        }
        this.date = date;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        if (label == null) {
            throw new IllegalArgumentException("Label should not be empty");
        }
        this.label = label;
    }
}
