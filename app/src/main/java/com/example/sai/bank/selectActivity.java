package com.example.sai.bank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        ArrayList arrayList=new ArrayList();
        arrayList.add("HDFC");
        arrayList.add("SBI");
        arrayList.add("SBH");
        arrayList.add("AXIS BANK");
        arrayList.add("ICICI");
        arrayList.add("ANDHRA BANK");
        sa=(Spinner)findViewById(R.id.spinner2);

        ArrayList arrayList1=new ArrayList();
        arrayList1.add("kukatpally");
        arrayList1.add("lingampally");
        arrayList1.add("suchitra");
        arrayList1.add("ecil");
        arrayList1.add("banjara hills");
        arrayList1.add("madhapur");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sn.setAdapter(arrayAdapter);
        sa.setAdapter(arrayAdapter);
    }
}
