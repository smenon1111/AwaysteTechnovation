package com.example.pie.AwaysteTechnovation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //private Button disposeButton;
    //private Button donateButton;
    //private Button listButton;
    //private Button infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDisposeButton();
        setupDonateButton();
        setupListButton();
        setupInfoButton();

    }

    private void setupInfoButton() {
        Button infoButton = (Button) findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted", "Are you dumb");
            }
        });

    }

    private void setupListButton() {
        Button listButton = (Button) findViewById(R.id.listButton);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted", "Nowz uz wantz ze fakzes pointez");
                //setContentView(R.layout.list_main);
                Intent intent = List.makeIntent(MainActivity.this);
                startActivity(intent);
            }
        });

    }

    private void setupDonateButton() {
        Button donateButton = (Button) findViewById(R.id.donateButton);
        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted","Uz wantz to givez to ze needyz");
                //setContentView(R.layout.donate_main);
                Intent intent = Donate.makeIntent(MainActivity.this);
                startActivity(intent);
            }
        });

    }

    private void setupDisposeButton() {
        Button disposeButton = (Button)findViewById (R.id.disposeButton);
        disposeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted", "Ze dizpooze buttun haz been prezzed");
                //setContentView(R.layout.dispose_main);
                Intent intent = Dispose.makeIntent(MainActivity.this);
                startActivity(intent);
            }
        });
    }


}
