package com.example.sai.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;

public class selectActivity extends AppCompatActivity {
 Spinner sa;
    Spinner sn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        sn=(Spinner)findViewById(R.id.spinner);

        sn.setPrompt("select");
        ArrayList arrayList=new ArrayList();
        arrayList.add("Select");
        arrayList.add("HDFC");
        arrayList.add("SBI");
        arrayList.add("SBH");
        arrayList.add("AXIS BANK");
        arrayList.add("ICICI");
        arrayList.add("ANDHRA BANK");

        sa=(Spinner)findViewById(R.id.spinner2);
        sa.setPrompt("select");
        ArrayList arrayList1=new ArrayList();
        arrayList1.add("Select");
        arrayList1.add("Kukatpally");
        arrayList1.add("Lingampally");
        arrayList1.add("Suchitra");
        arrayList1.add("Ecil");
        arrayList1.add("Banjara hills");
        arrayList1.add("Madhapur");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sn.setAdapter(arrayAdapter);

        ArrayAdapter arrayAdapter1=new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayList1);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sa.setAdapter(arrayAdapter1);
    }


    public void success(View view) {
        Intent success1;
        success1=new Intent(selectActivity.this,date_time_Activity.class);
        startActivity(success1);
    }

    public void out(View view) {
        Intent out;
    out=new Intent(selectActivity.this,homeActivity.class);
        startActivity(out);
    }
}
