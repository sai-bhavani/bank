package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SinginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
    }

    public void select(View view) {
        EditText emailview=(EditText)findViewById(R.id.login_email);
        EditText passwordview=(EditText)findViewById(R.id.login_password);

        String email=emailview.getText().toString().trim();
        String password=passwordview.getText().toString();
        if (email.length()==0){
            emailview.setError("email required");
            return;
        }
        if(password.length()==0){
            passwordview.setError("passwword required");
            return;
        }


        Intent select_intent;
        select_intent=new Intent(SinginActivity.this,selectActivity.class);
        startActivity(select_intent);
    }
}
