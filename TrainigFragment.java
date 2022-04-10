package com.govind8061.homeandgymworkoutsmen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.govind8061.homeandgymworkoutsmen.adapters.WeeklyBannerAdapter;


public class TrainigFragment extends Fragment {

    private RecyclerView rvWeeklyBanners,rvBodyfocus;
    public TrainigFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_trainig, container, false);

        rvWeeklyBanners=rootView.findViewById(R.id.rvWeeklyBanners);
        rvBodyfocus=rootView.findViewById(R.id.rvBodyfocus);


        int[] images={R.drawable.thursday,R.drawable.friday,R.drawable.saturday,R.drawable.monday,R.drawable.tuesday,R.drawable.wednesday};

        WeeklyBannerAdapter weeklyBannerAdapter=new WeeklyBannerAdapter(images);
        rvWeeklyBanners.setAdapter(weeklyBannerAdapter);


        return rootView;
    }
}