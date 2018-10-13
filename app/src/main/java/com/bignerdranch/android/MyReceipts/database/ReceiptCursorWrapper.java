package com.bignerdranch.android.MyReceipts.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.bignerdranch.android.MyReceipts.Receipt;

import java.util.Date;
import java.util.UUID;

public class ReceiptCursorWrapper extends CursorWrapper {

    public ReceiptCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Receipt getReceipt() {
        String uuidString = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.UUID));
        String title = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.TITLE));
        long date = getLong(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.DATE));
        String comment = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.COMMENT));
        String shopname = getString(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.SHOPNAME));
        Double longitude = getDouble(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.LONGITUDE));
        Double latitude = getDouble(getColumnIndex(ReceiptDbSchema.ReceiptTable.Cols.LATITUDE));

        Receipt receipt = new Receipt(UUID.fromString(uuidString));
        receipt.setmTitle(title);
        receipt.setmDate(new Date(date));
        receipt.setmComment(comment);
        receipt.setmName(shopname);
        receipt.setmLongitude(longitude);
        receipt.setmLatitude(latitude);

        return receipt;
    }
}
