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

public class recent_statusAdapter extends RecyclerView.Adapter<recent_statusAdapter.myviewholder> {
    Context mcontext;

    public recent_statusAdapter(Context mcontext, List<recent_status_info> stinfo) {
        this.mcontext = mcontext;
        this.stinfo = stinfo;
    }

    List<recent_status_info> stinfo;

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view= LayoutInflater.from(mcontext).inflate(R.layout.recent_status_view_recyview_layout,parent,false);
        myviewholder myviewholder=new myviewholder(view);

        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.userstatus_name.setText(stinfo.get(position).getStatus_userName());
        holder.user_Status_time.setText(stinfo.get(position).getStstusDuration());
        holder.statususerphoto.setImageResource(stinfo.get(position).getStatususer_profile_pic());

    }

    @Override
    public int getItemCount() {
        return stinfo.size();
    }

    public  class  myviewholder extends RecyclerView.ViewHolder{

        ImageView statususerphoto;// this is the id of satus bar icon of the user
        TextView userstatus_name;
        TextView user_Status_time;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            statususerphoto=itemView.findViewById(R.id.recent_user_profile_photo);
            userstatus_name=(TextView)itemView.findViewById(R.id.recent_user_name);
            user_Status_time=(TextView)itemView.findViewById(R.id.recent_user_time);

        }
    }
}
