package com.example.pie.AwaysteTechnovation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ExpandedList extends AppCompatActivity {

    private EditText txtAddItem2;
    private Button btnAddDonate2;
    public ListView lstDonate;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expanded_list_main);

        txtAddItem2= findViewById(R.id.txtAddItem2);
        btnAddDonate2= findViewById(R.id.btnAddDonate2);
        lstDonate= findViewById(R.id.lstDonate);
        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);

        lstDonate.setAdapter(adapter);


        btnAddDonate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.add(txtAddItem2.getText().toString());

                adapter.notifyDataSetChanged();
            }
        });


    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, ExpandedList.class);
    }

}
