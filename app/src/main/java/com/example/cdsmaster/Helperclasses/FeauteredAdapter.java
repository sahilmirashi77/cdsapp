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

public class FeauteredAdapter   extends RecyclerView.Adapter<FeauteredAdapter.FEAuteredViewHolder> {


    ArrayList<feauteredhelperclass> featuredLocations;

    public FeauteredAdapter(ArrayList<feauteredhelperclass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public FEAuteredViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View   view= LayoutInflater.from(parent.getContext()).inflate(R.layout.featuredcard,parent,false);

        FEAuteredViewHolder feAuteredViewHolder=new FEAuteredViewHolder(view);
        return feAuteredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FEAuteredViewHolder holder, int position) {


        feauteredhelperclass    feauteredhelperclass=featuredLocations.get(position);
        holder.image.setImageResource(feauteredhelperclass.getImage());
        holder.title.setText(feauteredhelperclass.getTitle());
        holder.desc.setText(feauteredhelperclass.getDescription());


    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }


    public static class FEAuteredViewHolder extends RecyclerView.ViewHolder{

        ImageView   image;
        TextView    title,desc;
        public FEAuteredViewHolder(@NonNull View itemView) {
            super(itemView);

            //hooks

            image=itemView.findViewById(R.id.feauterimage);
            title=itemView.findViewById(R.id.feautertitle);
            desc=itemView.findViewById(R.id.feautredescription);

        }
    }

}
