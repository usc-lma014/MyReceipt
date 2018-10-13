package com.bignerdranch.android.MyReceipts;

import java.util.Date;
import java.util.UUID;

public class Receipt {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private String mComment;
    private String mName;
    private Double mLatitude;
    private Double mLongitude;
    public Receipt() {
        this(UUID.randomUUID());
    }

    public Receipt(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public Double getmLongitude(){return mLongitude;}

    public void setmLongitude(Double longitude){mLongitude = longitude;}

    public Double getmLatitude(){return mLatitude;}

    public void setmLatitude(Double latitude){mLatitude = latitude;}

    public String getmName(){
        return mName;
    }

    public void setmName(String name){
        mName = name;
    }

    public String getmComment(){
        return mComment;
    }

    public void setmComment(String comment){
        mComment = comment;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        mTitle = title;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date date) {
        mDate = date;
    }

    public String getPhotoFilename() {
        return "IMG_" + getmId().toString() + ".jpg";
    }
}
