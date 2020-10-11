package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class SSBprocedure extends AppCompatActivity {

    TextView    day1,day2,day34,day5,cd1,cd2,cd34,cd5;

    private int clickcount=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_s_bprocedure);
        day1=findViewById(R.id.dayone);
        day2=findViewById(R.id.day2);
        day34=findViewById(R.id.day34);
        day5=findViewById(R.id.day5);
        cd1=findViewById(R.id.contentdayone);
        cd2=findViewById(R.id.contentdaytwo);
        cd34=findViewById(R.id.contentday34);
        cd5=findViewById(R.id.contentday5);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==0)
                {
                    cd1.setText(getString(R.string.introdayone));
                }
                else {
                    cd1.setText("");

                }
            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==0)
                {
                    cd2.setText(getString(R.string.pysco));
                }
                else {
                    cd2.setText("");

                }
            }

        });

        day34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==0)
                {
                    cd34.setText(getString(R.string.interviewngto));
                }
                else {
                    cd34.setText("");

                }
            }

        });

        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==0)
                {
                    cd5.setText(getString(R.string.conference));
                }
                else {
                    cd5.setText("");

                }

            }
        });



    }
}
