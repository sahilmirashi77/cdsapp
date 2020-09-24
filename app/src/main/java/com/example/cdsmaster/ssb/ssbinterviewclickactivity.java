package com.example.cdsmaster.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cdsmaster.R;

import java.util.ArrayList;
import java.util.List;

public class ssbinterviewclickactivity extends AppCompatActivity {

    Button tip1,tip2,tip3,tip4,faq2,faq3,faq4;
    TextView ans1,ans2,ans3,ans4,ans5,ans6,ans7;

    Spinner spinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssbinterviewclickactivity);



        spinner=findViewById(R.id.spinner);

      //  ans1=findViewById(R.id.interviewtextone);
       // ans2=findViewById(R.id.interviewtexttwo);
        //ans3=findViewById(R.id.interviewtextthree);
        //ans4=findViewById(R.id.interviewtextfour);
        //ans5=findViewById(R.id.textfaqtwo);
        //ans6=findViewById(R.id.textfaqthree);
        //ans7=findViewById(R.id.textfaqfour);



   //     tip1.setOnClickListener(new View.OnClickListener() {
            //@Override
         //   public void onClick(View v) {
//
    //            ans1.setText(getString(R.string.ssbappearence));
  //          }
      //  });

        //tip2.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View v) {
            //    ans2.setText(R.string.dosandonts);
          //  }
        //});

        //tip3.setOnClickListener(new View.OnClickListener() {
           // @Override
          //  public void onClick(View v) {
               // ans3.setText(Html.fromHtml(getString(R.string.html)));

         //   }
      //  });


        List<String>    category=new ArrayList<>();

        category.add(0,"choosecategory");
        category.add("bag");
        category.add("ven");
        category.add("ven");
        category.add("ven");
        category.add("ven");
        category.add("ven");

        ArrayAdapter<String>  dataAdapter;

        dataAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);
    }






}
