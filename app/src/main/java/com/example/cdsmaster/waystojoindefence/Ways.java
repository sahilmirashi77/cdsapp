package com.example.cdsmaster.waystojoindefence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cdsmaster.Helperclasses.FeauteredAdapter;
import com.example.cdsmaster.Helperclasses.FeauteredAdapter2;
import com.example.cdsmaster.Helperclasses.Feauteredhelperclasstwo;
import com.example.cdsmaster.Helperclasses.feauteredhelperclass;
import com.example.cdsmaster.R;
import com.example.cdsmaster.ssb.MyAdapter;

import java.util.ArrayList;

public class Ways extends AppCompatActivity {

    private RecyclerView recyclerView;



    private RecyclerView.Adapter    adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ways);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerviewways);


      feauturedRecycler();

    }



    private void feauturedRecycler() {

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<feauteredhelperclass> featuredlocations=new ArrayList<>();

        featuredlocations.add(new feauteredhelperclass(R.drawable.image5,"birdone","firstwaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.image6,"birdon","2ndwaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.image7,"birdtwo","3rdwaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.image8,"birdofe","4thwaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.image9,"birdonfe","5twaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.image10,"birddne","firstwffaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.bird1,"birsssdone","fifffrstwaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.bird2,"birdo]]ne","firffstwaytojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.bird3,"ss","ff"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.bird4,"birdffone","firstwaytfffojoinarmy"));
        featuredlocations.add(new feauteredhelperclass(R.drawable.bird1,"birdffone","firstwaywwtojoinarmy"));

         adapter = new FeauteredAdapter(featuredlocations);
        recyclerView.setAdapter(adapter);

    }

}
