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
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class BunkListFragment extends Fragment {
    private RecyclerView mBunkRecyclerView;
    private BunkAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bunk_list,container,false);
        mBunkRecyclerView = view.findViewById(R.id.bunk_recycler_view);
        mBunkRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;

    }

    private void updateUI() {
        BunkLab bunkLab = BunkLab.get(getActivity());
        List<Bunk> bunks = bunkLab.getBunks();
        mAdapter = new BunkAdapter(bunks);
        mBunkRecyclerView.setAdapter(mAdapter);
    }

    private class BunkHolder extends RecyclerView.ViewHolder{
        private TextView mDayTextView;
        private TextView mDateTextView;
        private CheckBox mCheckBox;
        private Bunk mBunk;

        public BunkHolder(LayoutInflater inflater,ViewGroup parent){
            super(inflater.inflate(R.layout.fragment_bunk,parent,false));
            mDayTextView = itemView.findViewById(R.id.day);
            mDateTextView = itemView.findViewById(R.id.date);
            mCheckBox =itemView.findViewById(R.id.checked);

        }
        public void bind(Bunk bunk){
            mBunk=bunk;
            mDayTextView.setText(mBunk.getDay());
            mDateTextView.setText(mBunk.getDate().toString());
            if(mCheckBox.isChecked()){
                mCheckBox.setChecked(false);
            }
        }
    }
    private class BunkAdapter extends RecyclerView.Adapter<BunkHolder> {
        private List<Bunk> mBunks;
        public BunkAdapter(List<Bunk> bunks) {
            mBunks = bunks;
        }

        @NonNull
        @Override
        public BunkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new BunkHolder(layoutInflater,parent);
        }

        @Override
        public void onBindViewHolder(@NonNull BunkHolder holder, int position) {
            Bunk bunk = mBunks.get(position);
            holder.bind(bunk);
        }

        @Override
        public int getItemCount() {
            return mBunks.size();
        }
    }
}
