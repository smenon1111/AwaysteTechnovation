package com.example.pie.AwaysteTechnovation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Dispose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispose_main);

        setupBackButton();

    }

    private void setupBackButton() {
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Minted", "Ze bak buttun haz been prezzed");
                //setContentView(R.layout.dispose_main);
                finish();
            }
        });
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, Dispose.class);
    }
}
