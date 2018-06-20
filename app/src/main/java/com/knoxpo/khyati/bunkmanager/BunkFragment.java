package com.knoxpo.khyati.bunkmanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.knoxpo.khyati.bunkmanager.Bunk;
import com.knoxpo.khyati.bunkmanager.R;

public class BunkFragment extends Fragment{
    private Bunk mBunk;
    private TextView mDateTextView;
    private CheckBox mCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBunk = new Bunk();
    }
    public View onCreateView(LayoutInflater inflator, ViewGroup container,Bundle savedInstanceState){
        View v = inflator.inflate(R.layout.fragment_bunk,container,false);
        mDateTextView = v.findViewById(R.id.date);
        mDateTextView.setText(mBunk.getDate().toString());

        mCheckBox = v.findViewById(R.id.checked);
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mBunk.getChecked(isChecked);
            }
        });
        return v;
    }
}
