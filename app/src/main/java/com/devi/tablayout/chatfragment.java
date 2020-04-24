package com.devi.tablayout;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devi.tablayout.dataclass.chat_info;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class chatfragment extends Fragment {



    RecyclerView recyclerView;
    List<chat_info> infodetails;
    public chatfragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_chatfragment, container, false);
        // View Class are use for the inflate the xml files in the fragment..
        // Inflate the layout for this fragment
        recyclerView=view.findViewById(R.id.chatrecyleview);

        chatAdapter chatAdapter = new chatAdapter(getContext(),infodetails);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(chatAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        infodetails=new ArrayList<>(); // this is the Array list
        infodetails.add(new chat_info("kalka prasad","How are your ","02:05 Pm",R.drawable.img2));
        infodetails.add(new chat_info("Abhjit tripathi","Hello baba ","02:05 Pm",R.drawable.img3));
        infodetails.add(new chat_info("Preeti sahu","hello kp .. ","08:05 Pm",R.drawable.img4));
        infodetails.add(new chat_info("Ramesh patel","kaisab baro ","07:05 Pm",R.drawable.img5));
        infodetails.add(new chat_info("dependra singh","kaisai ho kp  ","03:05 Pm",R.drawable.img8));
        infodetails.add(new chat_info("rohan singh","please contact to me  ","10:05 Pm",R.drawable.call2));
        infodetails.add(new chat_info("Saleem khan","Are you going college ?  ","10:05 Pm",R.drawable.call3));
        infodetails.add(new chat_info("Pradeep kumar","Where are you from  ","10:05 Pm",R.drawable.call1));
        infodetails.add(new chat_info("Rakesh sharma","Click on this link and contact to me  ","10:05 Pm",R.drawable.call3));
        infodetails.add(new chat_info("kirti shukla","please pickup my call ","10:05 Pm",R.drawable.call2));




    }
}
