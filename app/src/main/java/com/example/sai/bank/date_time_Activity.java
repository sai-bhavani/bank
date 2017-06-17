package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class date_time_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_);
    }

    public void time(View view) {
        Intent time;
        time=new Intent(date_time_Activity.this,dateActivity.class);
        startActivity(time);
    }
}
