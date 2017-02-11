package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }

    public void home(View view) {
        Intent home_intent;
        home_intent=new Intent(SuccessActivity.this,selectActivity.class);
        startActivity(home_intent);
    }
}
