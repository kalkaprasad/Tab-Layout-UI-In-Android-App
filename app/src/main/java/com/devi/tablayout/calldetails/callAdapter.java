package com.devi.tablayout.calldetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devi.tablayout.R;

import java.util.List;

public class callAdapter extends RecyclerView.Adapter<callAdapter.myviewholder> {

        Context mcotext;
        List<calldata> cldata;

    public callAdapter(Context mcotext, List<calldata> cldata) {
        this.mcotext = mcotext;
        this.cldata = cldata;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view= LayoutInflater.from(mcotext).inflate(R.layout.call_recy_layout,parent,false);
        myviewholder myviewholder= new myviewholder(view);

        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {


        holder.callname.setText(cldata.get(position).getCallername());
        holder.calldate.setText(cldata.get(position).callingtime);
        holder.callerphoto.setImageResource(cldata.get(position).getCallerprofile());
        holder.callststus.setImageResource(cldata.get(position).missedcallicon);


    }

    @Override
    public int getItemCount() {
        return cldata.size();
    }

    public  class myviewholder extends RecyclerView.ViewHolder{


        TextView callname;
        TextView calldate;
        ImageView callststus;
        ImageView callerphoto;


        public myviewholder(@NonNull View itemView) {
            super(itemView);


            calldate=itemView.findViewById(R.id.call_Date);
            callname=itemView.findViewById(R.id.call_username);
            callststus=itemView.findViewById(R.id.call_missed_Call);
            callerphoto=itemView.findViewById(R.id.call_profile_image);
        }
    }
}
