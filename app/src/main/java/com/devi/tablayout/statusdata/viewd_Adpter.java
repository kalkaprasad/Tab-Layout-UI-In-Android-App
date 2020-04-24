package com.devi.tablayout.statusdata;

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

public class viewd_Adpter extends RecyclerView.Adapter<viewd_Adpter.myviewholder> {


    Context mcontext;
    List<vieved_status_info> vieveddata;
    public viewd_Adpter(Context mcontext, List<vieved_status_info> vieveddata) {
        this.mcontext = mcontext;
        this.vieveddata = vieveddata;
    }



    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View view;
        view= LayoutInflater.from(mcontext).inflate(R.layout.viewd_status_recyview_layout,parent,false);
        myviewholder myviewholder= new myviewholder(view);

        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.viwedusername.setText(vieveddata.get(position).getStstus_username());
        holder.viewedtime.setText(vieveddata.get(position).getStatus_duration());
        holder.vieweduserphoto.setImageResource(vieveddata.get(position).getStstususerPhoto());

    }

    @Override
    public int getItemCount() {
        return vieveddata.size();
    }

    public  class  myviewholder extends  RecyclerView.ViewHolder{

            TextView viwedusername;
            TextView viewedtime;
            ImageView vieweduserphoto;
        public myviewholder(@NonNull View itemView) {

            super(itemView);
            viwedusername=itemView.findViewById(R.id.viewd_user_name);
            viewedtime=itemView.findViewById(R.id.viewd_user_time);
            vieweduserphoto=itemView.findViewById(R.id.viewed_user_profile_photo);
        }
    }
}
