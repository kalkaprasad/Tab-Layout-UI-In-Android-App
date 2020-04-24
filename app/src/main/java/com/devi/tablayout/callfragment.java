package com.devi.tablayout;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devi.tablayout.calldetails.callAdapter;
import com.devi.tablayout.calldetails.calldata;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class callfragment extends Fragment {

    RecyclerView recyclerView;
    List<calldata> calldata;


    public callfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)

    {


        View view=inflater.inflate(R.layout.fragment_callfragment, container, false);
        // Inflate the layout for this fragment


        recyclerView=view.findViewById(R.id.call_recyle);

        callAdapter callAdapter=new callAdapter(getActivity(),calldata);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(callAdapter);


        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        calldata=new ArrayList<>();
        calldata.add(new calldata("kalka prasad","Today:6:59PM",R.drawable.kalka,R.drawable.missedcall));
        calldata.add(new calldata("kiran singh","Today:01:59PM",R.drawable.kirti,R.drawable.acceptcall));
        calldata.add(new calldata("Ramesh ","Today:10:59PM",R.drawable.call2,R.drawable.missedcall));
        calldata.add(new calldata("Abhijit singh","Today:8:59PM",R.drawable.call1,R.drawable.acceptcall));
        calldata.add(new calldata("Dipu singh","Today:7:59PM",R.drawable.call3,R.drawable.missedcall));
        calldata.add(new calldata("Pooja singh","Today:9:59PM",R.drawable.kirti,R.drawable.acceptcall));
        calldata.add(new calldata("kiran singh","Today:01:59PM",R.drawable.kirti,R.drawable.acceptcall));
        calldata.add(new calldata("Ramesh ","Today:10:59PM",R.drawable.call2,R.drawable.missedcall));
        calldata.add(new calldata("Abhijit singh","Today:8:59PM",R.drawable.call1,R.drawable.acceptcall));
        calldata.add(new calldata("Dipu singh","Today:7:59PM",R.drawable.call3,R.drawable.missedcall));


    }
}
