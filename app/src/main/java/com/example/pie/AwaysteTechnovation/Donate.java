package com.example.pie.AwaysteTechnovation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Donate extends AppCompatActivity {

    private Button disposeButton;
    private Button donateButton;
    private Button listButton;
    private Button infoButton;
    private Button yesButton;
    private Button noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate_main);

        disposeButton = findViewById (R.id.disposeButton);
        donateButton = findViewById(R.id.donateButton);
        listButton = findViewById(R.id.listButton);
        infoButton = findViewById(R.id.infoButton);
        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);


        disposeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Minted", "Ze dizpooze buttun haz been prezzed");
                //setContentView(R.layout.dispose_main);
                //Intent intent = Dispose.makeIntent(Donate.this.getParent());
                Intent intent = Dispose.makeIntent(Donate.this);
                startActivity(intent);
                //finish();
                }
        });

        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Minted","Uz wantz to givez to ze needyz");
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Minted", "Nowz uz wantz ze fakzes pointez");
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Minted", "Are you dumb");
            }
        });

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted","Good you have some common sense...");
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted", "I see you're still dumb...");
            }
        });
    }


    public static Intent makeIntent(Context context) {
        return new Intent(context, Donate.class);
    }
}
