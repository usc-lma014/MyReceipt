package com.bignerdranch.android.MyReceipts.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ReceiptBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public ReceiptBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + ReceiptDbSchema.ReceiptTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                ReceiptDbSchema.ReceiptTable.Cols.UUID + ", " +
                ReceiptDbSchema.ReceiptTable.Cols.TITLE + ", " +
                ReceiptDbSchema.ReceiptTable.Cols.DATE + ", " +
                ReceiptDbSchema.ReceiptTable.Cols.COMMENT + ", " +
                ReceiptDbSchema.ReceiptTable.Cols.SHOPNAME + ", " +
                ReceiptDbSchema.ReceiptTable.Cols.LATITUDE + ", " +
                ReceiptDbSchema.ReceiptTable.Cols.LONGITUDE +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}