package com.example.cdsmaster.EXAM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class Exam extends AppCompatActivity {

    TextView nda,cds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        nda=findViewById(R.id.nda);
        cds=findViewById(R.id.cds);

        nda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Exam.this, Ndaexam.class);
                startActivity(intent);
            }
        });

    }
}
