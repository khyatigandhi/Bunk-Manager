package com.knoxpo.khyati.bunkmanager;

import android.support.v4.app.Fragment;

public class BunkListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new BunkListFragment();
    }
}
