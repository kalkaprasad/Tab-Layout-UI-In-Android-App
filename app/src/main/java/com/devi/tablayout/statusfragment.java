package com.devi.tablayout;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devi.tablayout.statusdata.recent_statusAdapter;
import com.devi.tablayout.statusdata.recent_status_info;
import com.devi.tablayout.statusdata.vieved_status_info;
import com.devi.tablayout.statusdata.viewd_Adpter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class statusfragment extends Fragment {


    RecyclerView recyclerView,recyclerView2;
    List<recent_status_info> restatus; // this is the status bar object..
    List<vieved_status_info> oldstatus;// this is the Viewed Apter ArrayList;

    public statusfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_statusfragment, container, false);

        recyclerView=view.findViewById(R.id.recentststus_Recyview);
        recyclerView2=view.findViewById(R.id.viewed_status_Recyview);

        recent_statusAdapter recent_statusAdapter= new recent_statusAdapter(getContext(),restatus);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recent_statusAdapter);
        viewd_Adpter viewd_adpter=new viewd_Adpter(getContext(),oldstatus);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView2.setAdapter(viewd_adpter);
        return view;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        restatus= new ArrayList<>();
        oldstatus=new ArrayList<>();
        restatus.add(new recent_status_info("Ashish Mishra","Today,4:05 Pm",R.drawable.call2));
        restatus.add(new recent_status_info("kalka Prasad","Today,4:05 Pm",R.drawable.img3));
        restatus.add(new recent_status_info("Dipendra singh","Today,4:05 Pm",R.drawable.kalka));
        restatus.add(new recent_status_info("Kirti singh","Today,4:05 Pm",R.drawable.kirti));

        /// this is the viewed  status code
        oldstatus.add(new vieved_status_info("Kp Singh","Today ,5:09 PM",R.drawable.kalka));
        oldstatus.add(new vieved_status_info("Ram Babu","Today ,5:09 PM",R.drawable.img9));
        oldstatus.add(new vieved_status_info("Rashmi","Today ,5:09 PM",R.drawable.kirti));


    }
}
