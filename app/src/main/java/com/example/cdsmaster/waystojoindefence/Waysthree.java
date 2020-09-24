package com.example.cdsmaster.waystojoindefence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cdsmaster.Helperclasses.FeauteredAdapter2;
import com.example.cdsmaster.Helperclasses.Feauteredhelperclasstwo;
import com.example.cdsmaster.Helperclasses.FeautredHelperclass3;
import com.example.cdsmaster.Helperclasses.FeauturedAdapter3;
import com.example.cdsmaster.R;

import java.util.ArrayList;

public class Waysthree extends AppCompatActivity {

    RecyclerView    recyclerView3;

    RecyclerView.Adapter    adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waysthree);

        recyclerView3=findViewById(R.id.recyclerviewways3);

        feauturedRecycler3();
    }


    private void feauturedRecycler3() {

        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeautredHelperclass3> featuredlocations=new ArrayList<>();

        featuredlocations.add(new FeautredHelperclass3(R.drawable.image5,"birdone","firstwaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.image6,"birdon","2ndwaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.image7,"birdtwo","3rdwaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.image8,"birdofe","4thwaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.image9,"birdonfe","5twaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.image10,"birddne","firstwffaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.bird1,"birsssdone","fifffrstwaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.bird2,"birdo]]ne","firffstwaytojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.bird3,"ss","ff"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.bird4,"birdffone","firstwaytfffojoinarmy"));
        featuredlocations.add(new FeautredHelperclass3(R.drawable.bird1,"birdffone","firstwaywwtojoinarmy"));

        adapter3 = new FeauturedAdapter3(featuredlocations);
        recyclerView3.setAdapter(adapter3);

    }

}
