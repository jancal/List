package com.jancal.list.common;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Jancal on 2016/12/22.
 */

public class System {

    public static SQLiteDatabase db;
    public static final String DataBaseName = "list";


    public static void initDb(SQLiteDatabase database) {
        db = database;
        if (!isTableExist("item")) {
            db.execSQL("CREATE TABLE item (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "label_name INTEGER, " +
                    "sum FLOAT, " +
                    "date DATETIME" +
                    ")");
        }
    }

    private static boolean isTableExist(String tableName) {
        boolean result = false;
        if (tableName == null) {
            return false;
        }

        String sql = "select count(*) as c from " + DataBaseName + " where type ='table' and name ='" + tableName.trim() + "' ";
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToNext()) {
            int count = cursor.getInt(0);
            if (count > 0) {
                result = true;
            }
        }
        cursor.close();
        return result;
    }
}
