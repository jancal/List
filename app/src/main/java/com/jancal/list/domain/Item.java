package com.jancal.list.domain;

import java.util.Date;

public class Item extends ItemInit {
    private int id;

    public Item(int id, float sum, Label label, Date date) {
        super(sum, label, date);
        this.setId(id);
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
}
