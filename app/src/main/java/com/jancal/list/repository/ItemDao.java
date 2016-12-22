package com.jancal.list.repository;

import android.content.ContentValues;
import android.database.Cursor;

import com.jancal.list.common.System;
import com.jancal.list.domain.Item;
import com.jancal.list.repository_api.IItemDao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Jancal on 2016/12/22.
 */

public class ItemDao implements IItemDao {
    @Override
    public void insertItem(Item item) {
        try {
            System.db.execSQL("INSERT INTO item VALUES (?, ?, ?, ?)",
                    new Object[]{item.getId(), item.getLabel().getName(), item.getSum(), item.getDate()});
        } finally {
            System.db.close();
        }
    }

    @Override
    public void delItem(int id) {
        try {
            System.db.delete("item", "id = ?", new String[]{String.valueOf(id)});
        } finally {
            System.db.close();
        }
    }

    @Override
    public void updateItem(Item item) {
        ContentValues cv = new ContentValues();
        cv.put("sum", item.getSum());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(item.getDate());
        cv.put("date", date);
        cv.put("label_name", item.getLabel().getName());
        System.db.update("item", cv, "id = ?", new String[]{item.getId() + ""});
    }

    @Override
    public Item getItem(int id) {
        Cursor result = System.db.rawQuery("SELECT id, label_name, sum, date FROM item where id = ?", new String[]{id + ""});
        result.moveToFirst();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(result.getString(3));
        } catch (ParseException e) {
            e.printStackTrace();
        }
//            return new Item(result.getInt(0), result.getString(1), result.getFloat(2), date);
        result.close();
        return null;
    }

    @Override
    public List<Item> findItems() {
        Cursor result = System.db.rawQuery("SELECT id, label_name, sum, date FROM item where id = ?", null);
        result.moveToFirst();
        while (!result.isAfterLast()) {
            int id = result.getInt(0);
            String name = result.getString(1);
            int inventory = result.getInt(2);
            // do something useful with these
            result.moveToNext();
        }
        result.close();
        return null;
    }
}
