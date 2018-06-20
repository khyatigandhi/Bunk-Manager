package com.knoxpo.khyati.bunkmanager;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BunkListFragment extends Fragment {
    private RecyclerView mBunkRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bunk_list,container,false);
        mBunkRecyclerView = view.findViewById(R.id.bunk_recycler_view);
        mBunkRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }
}
