package com.hfad.tabletography;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class TabletographyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "tabletography";
    private static final int DB_VERSION = 0;

    TabletographyDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion){

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion,
                            int newVersion){

    }

    private static void insertPost(SQLiteDatabase db, String title,
                                   String description, int resourceId,
                                   String[][] comments,
                                   String[][] reviews){

    }

}
