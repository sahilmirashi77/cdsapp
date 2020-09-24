package com.example.cdsmaster;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class loginactivity extends AppCompatActivity implements View.OnClickListener {

    Button  signin;
    GoogleSignInClient  mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        GoogleSignInOptions gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

         mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

           findViewById(R.id.signin).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.signin:
                signIn();
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        GoogleSignInAccount account= GoogleSignIn.getLastSignedInAccount(this);
        UpdateUI(account);
    }

    private void UpdateUI(GoogleSignInAccount account) {

        if(account!=null) {
            Intent intent = new Intent(loginactivity.this, MainActivity.class);
            startActivity(intent);
        }else

            Toast.makeText(this,"udidntsignin",Toast.LENGTH_LONG).show();


    }




    private void signIn() {
        Intent  signInIntent=mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent,2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2){
            Task<GoogleSignInAccount>task=GoogleSignIn.getSignedInAccountFromIntent(data);
            handlesignInResult(task);
        }
    }

    private void handlesignInResult(Task<GoogleSignInAccount> task) {

        try {
            GoogleSignInAccount account=task.getResult(ApiException.class);
            UpdateUI(account);

        }catch (ApiException e){
            Log.w("signinfail","signin   failed code"+e.getStatusCode());
            UpdateUI(null);

        }
    }
}
