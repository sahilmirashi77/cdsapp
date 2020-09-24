package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class gdtopics extends AppCompatActivity {

    TextView gdtopics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gdtopics);
        gdtopics=findViewById(R.id.gdtopicscontent);

        gdtopics.setText(Html.fromHtml(getString(R.string.gdtopics)));



    }
}
