package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.cdsmaster.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class physcologicaltest extends AppCompatActivity {

      TabLayout tabLayout;
      TabItem wat,tat,srt;

      ViewPager viewPager;



      @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_physcologicaltest);

        tabLayout=findViewById(R.id.tablayout);
        wat=findViewById(R.id.wat);
        tat=findViewById(R.id.tat);
        srt=findViewById(R.id.srttext);
        viewPager=findViewById(R.id.viewpagerphysco);


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final MyAdapter adapter=new MyAdapter(this,getSupportFragmentManager(),tabLayout.getTabCount());


        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }
}


