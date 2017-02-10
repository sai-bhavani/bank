package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SingnupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singnup);
    }

    public void signup(View view) {
        Intent signup_intent1;
        signup_intent1=new Intent(SingnupActivity.this,homeActivity.class);
         startActivity(signup_intent1);
    }

}
