package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;


import com.example.cdsmaster.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ssbinterview extends AppCompatActivity {



    ExpandableListView  expandableListView;

    List<String>  faq;
    Map<String,List<String>>  content;

    ExpandableListAdapter  listAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbinterview);

        listAdapter=new Myexpandablelistadapter(this,faq,content);

        expandableListView=findViewById(R.id.expandablelistview);
        filldata();

        expandableListView.setAdapter(listAdapter);

    }

    public void filldata()
    {
        faq=new ArrayList<>();
        content=new HashMap<>();
        faq.add("faqone");
        faq.add("faqtwo");
        faq.add("faqthree");

        List<String>   questionone=new ArrayList<>();
        List<String>    questiontwo=new ArrayList<>();
        List<String>    questionthree=new ArrayList<>();

        questionone.add(getString(R.string.frequentquestion1));
        questiontwo.add(getString(R.string.faq2));
        questionthree.add(getString(R.string.faq3));

        content.put(faq.get(0),questionone);
        content.put(faq.get(1),questiontwo);
        content.put(faq.get(2),questionthree);




    }
}
