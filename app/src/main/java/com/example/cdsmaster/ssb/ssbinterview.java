package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.cdsmaster.R;

public class ssbinterview extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;

    String[]  ciq={"R.string.ssbappearence","R.string.decisionmakingability"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbinterview);
        spinner=findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter    aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,ciq);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),ciq[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
