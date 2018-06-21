package com.knoxpo.khyati.bunkmanager;

import android.content.Context;
import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BunkLab {
    private static BunkLab sBunkLab;
    private List<Bunk> mBunks;

    public static BunkLab get(Context context) {
        if (sBunkLab == null) {
            sBunkLab = new BunkLab(context);
        }
        return sBunkLab;
    }

    private BunkLab(Context context) {
        mBunks = new ArrayList<Bunk>();

        int totalDay = Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < totalDay; i++) {

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DATE, (i + 1));

            Date date = calendar.getTime();
            Bunk bunk = new Bunk(date);
            mBunks.add(bunk);
        }
    }

    public List<Bunk> getBunks() {
        return mBunks;
    }

    public Bunk getBunk(UUID id) {
        for (Bunk bunk : mBunks) {
            if (bunk.getId().equals(id)) {
                return bunk;
            }
        }
        return null;
    }
}
