package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SinginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
    }

    public void select(View view) {
        Intent select_intent;
        select_intent=new Intent(SinginActivity.this,selectActivity.class);
        startActivity(select_intent);
    }
}
