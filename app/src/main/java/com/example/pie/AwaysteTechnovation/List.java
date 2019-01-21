package com.example.pie.AwaysteTechnovation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    private Spinner spinner;
    private EditText txtAddItem;
    private Button btnAddDonate;
    private Button btnAddCompost;
    private Button btnAddRecycle;
    public ListView lstDonate;
    private ListView lstCompost;
    private ListView lstRecycle;
    private ArrayAdapter<String> donateAdapter,compostAdapter,recycleAdapter;
    private ArrayList<String> donateArrayList,compostArrayList,recycleArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);

        txtAddItem= findViewById(R.id.txtAddItem);
        btnAddDonate=findViewById(R.id.btnAddDonate);
        btnAddCompost= findViewById(R.id.btnAddCompost);
        btnAddRecycle= findViewById(R.id.btnAddRecycle);
        lstDonate = (ListView) findViewById(R.id.lstDonate);
        lstCompost=(ListView)findViewById(R.id.lstCompost);
        lstRecycle=(ListView) findViewById(R.id.lstRecycle);

        donateArrayList = new ArrayList<String>();
        donateAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, donateArrayList);

        lstDonate.setAdapter(donateAdapter);

        compostArrayList = new ArrayList<String>();
        compostAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, compostArrayList);
        lstCompost.setAdapter(compostAdapter);

        Log.d("Minted", "Before setOnLongClickListener");

        //lstCompost.setOnItemLongClickListener()
        lstCompost.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                int position = (Integer) v.getTag();
                Log.d("Minted", "onLongClick: I found long click on item"+ position);
                compostAdapter.remove(compostAdapter.getItem(position));
                compostAdapter.notifyDataSetChanged();
                return false;
            }
        });

        Log.d("Minted", "After setOnLongClickListener");

        recycleArrayList = new ArrayList<String>();
        recycleAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, recycleArrayList);
        lstRecycle.setAdapter(recycleAdapter);




        btnAddDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 donateArrayList.add(txtAddItem.getText().toString());
                txtAddItem.setText(null);
                donateAdapter.notifyDataSetChanged();
            }
        });

        btnAddCompost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compostArrayList.add(txtAddItem.getText().toString());
                txtAddItem.setText(null);
                compostAdapter.notifyDataSetChanged();
            }
        });

        btnAddRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                recycleArrayList.add(txtAddItem.getText().toString());
                txtAddItem.setText(null);
                recycleAdapter.notifyDataSetChanged();
            }
        });




//        if ( spinner.getSelectedItem().toString().equals("Donate")  ) {
//
//            arrayList = new ArrayList<String>();
//            adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
//            lstDonate.setAdapter(adapter);
//
//
//            btnAddItem.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    arrayList.add(txtAddItem.getText().toString());
//
//                    adapter.notifyDataSetChanged();
//                }
//            });
//
//
//        }
//        else if ( spinner.getSelectedItem().toString().equals("Compost") ) {
//
//            arrayListCompost = new ArrayList<String>();
//            adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayListCompost);
//            lstCompost.setAdapter(adapter);
//
//
//            btnAddItem.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    arrayListCompost.add(txtAddItem.getText().toString());
//
//                    adapter.notifyDataSetChanged();
//                }
//            });
//
//        }
//        else {
//
//            arrayListRecycle = new ArrayList<String>();
//            adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayListRecycle);
//            lstRecycle.setAdapter(adapter);
//
//            btnAddItem.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    arrayListRecycle.add(txtAddItem.getText().toString());
//
//                    adapter.notifyDataSetChanged();
//                }
//            });
//        }
//        spinner = findViewById(R.id.categorySpinner);
//        ArrayAdapter<CharSequence> adapter1 =ArrayAdapter.createFromResource(this, R.array.Categories, android.R.layout.simple_spinner_item);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter1);

}
    public static Intent makeIntent(Context context) {
        return new Intent(context, List.class);
};}
