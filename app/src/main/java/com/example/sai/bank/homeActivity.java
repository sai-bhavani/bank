package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void signup(View view) {
        Intent signup_intent;

        signup_intent=new Intent(homeActivity.this,SingnupActivity.class);
        startActivity(signup_intent);
    }

    public void signin(View view) {
        Intent signin_intent;
        signin_intent=new Intent(homeActivity.this,SinginActivity.class);
        startActivity(signin_intent);
    }
}

