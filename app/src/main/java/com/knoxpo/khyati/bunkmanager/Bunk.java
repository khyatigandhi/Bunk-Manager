package com.knoxpo.khyati.bunkmanager;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Bunk {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private  String mDay;
    private Boolean mChecked;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getDay() {
        return mDay;
    }

    public void setDay(String day) {
        mDay = day;
    }

    public Boolean getChecked(boolean isChecked) {
        return mChecked;
    }

    public void setChecked(Boolean checked) {
        mChecked = checked;
    }

    public Bunk()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
