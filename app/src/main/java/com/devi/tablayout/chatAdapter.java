package com.devi.tablayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devi.tablayout.dataclass.chat_info;


import java.util.List;

public class chatAdapter extends RecyclerView.Adapter<chatAdapter.myviewholder> {

    Context mcontext;  // it most compulsory for  the create a constructer of the Adapter
    List<chat_info> mdata;

    public chatAdapter(Context mcontext, List<chat_info> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // View is a class which use the infalte the any xml files on the Activity.
        View view;
        view= LayoutInflater.from(mcontext).inflate(R.layout.chat_recy_layout,parent,false); // Layout infalter use for the infalate the xml file from the Layout directry


        myviewholder myviewholder= new myviewholder(view); // here myviewholder holde the view of the xml file
        return myviewholder;


    }



    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)

    {
        holder.username.setText(mdata.get(position).getName());
        holder.userMessage.setText(mdata.get(position).getMessege());
        holder.date.setText(mdata.get(position).getDate());
        holder.imageView.setImageResource(mdata.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public  class myviewholder extends RecyclerView.ViewHolder{

 // in this class we  hold the all item  from the layout.

        TextView username;
        TextView userMessage;
        TextView date;
        ImageView imageView;

        public myviewholder(@NonNull View itemView) {

            super(itemView);

            username=(TextView) itemView.findViewById(R.id.username);
            userMessage=(TextView) itemView.findViewById(R.id.usermessage);
            date=(TextView) itemView.findViewById(R.id.message_Sent_time);
            imageView=(ImageView) itemView.findViewById(R.id.profile_image);
        }
    }

}
