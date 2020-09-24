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

public class FeauteredAdapter2   extends RecyclerView.Adapter<FeauteredAdapter2.FEAuteredViewHolder2> {


    ArrayList<Feauteredhelperclasstwo> featuredLocations2;

    public FeauteredAdapter2(ArrayList<Feauteredhelperclasstwo> featuredLocations2) {
        this.featuredLocations2 = featuredLocations2;
    }

    @NonNull
    @Override
    public FEAuteredViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View   view1= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        FEAuteredViewHolder2 feAuteredViewHolder1=new FEAuteredViewHolder2(view1);

        return  feAuteredViewHolder1 ;
    }

    @Override
    public void onBindViewHolder(@NonNull FEAuteredViewHolder2 holder, int position) {


        Feauteredhelperclasstwo   feauteredhelperclasstwo=featuredLocations2.get(position);
        holder.image.setImageResource(feauteredhelperclasstwo.getImage());
        holder.title.setText(feauteredhelperclasstwo.getTitle());
        holder.desc.setText(feauteredhelperclasstwo.getDescription());


    }

    @Override
    public int getItemCount() {
        return featuredLocations2.size();
    }


    public static class FEAuteredViewHolder2 extends RecyclerView.ViewHolder{

        ImageView   image;
        TextView    title,desc;
        public FEAuteredViewHolder2(@NonNull View itemView) {
            super(itemView);

            //hooks

            image=itemView.findViewById(R.id.feauterimage2);
            title=itemView.findViewById(R.id.feautertitle2);
            desc=itemView.findViewById(R.id.feautredescription2);

        }
    }

}
