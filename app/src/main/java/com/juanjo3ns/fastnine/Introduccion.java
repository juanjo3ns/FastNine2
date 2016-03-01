package com.juanjo3ns.fastnine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * Created by juanjo.3ns on 09/02/2016.
 */
public class Introduccion extends AppCompatActivity {
    Button buttonplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduccion);


        buttonplay = (Button) findViewById(R.id.button_play);
        buttonplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Introduccion.this,MainActivity.class));
            }
        });

    }
}
