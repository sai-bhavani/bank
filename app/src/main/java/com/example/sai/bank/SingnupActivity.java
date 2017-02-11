package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SingnupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singnup);
    }

    public void signup(View view) {
        EditText textView6=(EditText)findViewById(R.id.textView6);
        EditText textView=(EditText)findViewById(R.id.textView);
        EditText textView5=(EditText)findViewById(R.id.textView5);
        EditText textView4=(EditText)findViewById(R.id.textView4);

        String email=textView5.getText().toString().trim();
        String Name=textView.getText().toString().trim();
        String password=textView6.getText().toString();
        String mobileno=textView4.getText().toString();
        if (email.length()==0) {
            textView5.setError("email required");
            return;
        }
        if (password.length()==0) {
            textView6.setError("password required");
            return;
        } if (mobileno.length()==0) {
            textView4.setError("Mobileno required");
            return;
        } if (Name.length()==0) {
            textView.setError("Name required");
            return;
        }

        Intent signup_intent1;
        signup_intent1=new Intent(SingnupActivity.this,homeActivity.class);
         startActivity(signup_intent1);
    }

}
