package com.jancal.list.domain;

import java.util.Date;

public class Item{
    private int id;
    private float sum;
    private Date date;
    private Label label;

    public Item(int id, float sum, Label label, Date date) {
        this.setId(id);
        this.setSum(sum);
        this.setLabel(label);
        this.setDate(date);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id should be large than zero");
        }
        this.id = id;
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
