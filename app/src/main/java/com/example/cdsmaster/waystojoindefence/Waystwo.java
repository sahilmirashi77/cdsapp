package com.example.cdsmaster.waystojoindefence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cdsmaster.Helperclasses.FeauteredAdapter;
import com.example.cdsmaster.Helperclasses.FeauteredAdapter2;
import com.example.cdsmaster.Helperclasses.Feauteredhelperclasstwo;
import com.example.cdsmaster.Helperclasses.feauteredhelperclass;
import com.example.cdsmaster.R;

import java.util.ArrayList;

public class Waystwo extends AppCompatActivity {

    private RecyclerView recyclerView2;



    private RecyclerView.Adapter    adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waystwo);

        recyclerView2=findViewById(R.id.recyclerviewways2);

        feauturedRecycler2();

    }

    private void feauturedRecycler2() {

        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<Feauteredhelperclasstwo> featuredlocations=new ArrayList<>();

        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.image5,"birdone","firstwaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.image6,"birdon","2ndwaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.image7,"birdtwo","3rdwaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.image8,"birdofe","4thwaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.image9,"birdonfe","5twaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.image10,"birddne","firstwffaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.bird1,"birsssdone","fifffrstwaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.bird2,"birdo]]ne","firffstwaytojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.bird3,"ss","ff"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.bird4,"birdffone","firstwaytfffojoinarmy"));
        featuredlocations.add(new Feauteredhelperclasstwo(R.drawable.bird1,"birdffone","firstwaywwtojoinarmy"));

        adapter2 = new FeauteredAdapter2(featuredlocations);
        recyclerView2.setAdapter(adapter2);

    }



}
