package com.knoxpo.khyati.bunkmanager;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Bunk {
    private UUID mId;
    private Date mDate;
    private boolean mChecked;


    public Bunk()
    {

        this(new Date());
    }

    public Bunk(Date date){
        mId = UUID.randomUUID();
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void setChecked(boolean checked) {
        mChecked = checked;
    }


}
