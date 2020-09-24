package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cdsmaster.R;

public class gpeclicklistener extends AppCompatActivity {

    TextView gpeintro,gpemiddle;

    Button gpeproblemone,gpeproblemtwo,gpeproblemthree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpeclicklistener);

        gpeintro=findViewById(R.id.gpeintro);

        gpemiddle=findViewById(R.id.gpemiddle);


        gpeproblemone=findViewById(R.id.gpemodelsample);

        gpeproblemtwo=findViewById(R.id.gpesample2);

        gpeintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gpeintro.setText(Html.fromHtml(getString(R.string.gpeintroo)));
            }


        });

        gpeproblemtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String urlgpe="https://defenceaspire.weebly.com/uploads/1/3/0/8/130885487/gpe_4_.pdf";
                Intent  intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlgpe));
                startActivity(intent);
            }
        });

        gpeproblemone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gpeone="https://defenceaspire.weebly.com/uploads/1/3/0/8/130885487/gpe__3_.pdf";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(gpeone));
                startActivity(intent);

            }
        });




    }


}
