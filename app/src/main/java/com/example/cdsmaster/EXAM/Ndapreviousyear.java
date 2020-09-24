package com.example.cdsmaster.EXAM;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.cdsmaster.R;


import java.net.URL;
import java.net.URLEncoder;

public class Ndapreviousyear extends AppCompatActivity {

    WebView webView;
    String url="https://drive.google.com/file/d/1pWzIDuekL3w6ZOqCbNpIkXXc0WuBHH6O/view?usp=drivesdk/view";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ndapreviousyear);

        final ProgressDialog progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("loadingdata...");
        progressDialog.setCancelable(false);
        webView= findViewById(R.id.webview);
        webView.requestFocus();
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptEnabled(true);

        String URL="https://drive.google.com/file/d/1K7obDJd0PP6sKwM4bOku5Qz4/view?usp=drivesdk";
        String url="https://drive.google.com/viewerng/viewer?embedded=true&url="+URL;

    }

}
