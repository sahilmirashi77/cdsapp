package com.example.cdsmaster.Helperclasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cdsmaster.R;

import java.util.ArrayList;

public class FeauturedAdapter3 extends RecyclerView.Adapter {

    ArrayList<FeautredHelperclass3> feauturedlocations3;

    public FeauturedAdapter3(ArrayList<FeautredHelperclass3> feauturedlocations3) {
        this.feauturedlocations3 = feauturedlocations3;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View    view2= LayoutInflater.from(parent.getContext()).inflate(R.layout.navyways,parent,false);

        FeautredViewHolder3 feautredViewHolder3=new FeautredViewHolder3(view2);


        return  feautredViewHolder3 ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return feauturedlocations3.size();
    }


    public static class FeautredViewHolder3 extends RecyclerView.ViewHolder{

        ImageView   image;


        public FeautredViewHolder3(@NonNull View itemView) {
            super(itemView);

            //hooks

            image=itemView.findViewById(R.id.feauterimage3);
            title=itemView.findViewById(R.id.feautertitle3);
            desc=itemView.findViewById(R.id.feautredescription3);




        }

        TextView    title,desc;
    }
}
