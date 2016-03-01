package com.juanjo3ns.fastnine;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by juanjo.3ns on 16/02/2016.
 */
public class Medallas extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    Button o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medallas);
        b1 = (Button) findViewById(R.id.button30);
        b2 = (Button) findViewById(R.id.button31);
        b3 = (Button) findViewById(R.id.button32);
        b4 = (Button) findViewById(R.id.button33);
        b5 = (Button) findViewById(R.id.button34);
        b6 = (Button) findViewById(R.id.button35);
        b7 = (Button) findViewById(R.id.button36);
        b8 = (Button) findViewById(R.id.button37);
        b9 = (Button) findViewById(R.id.button38);
        b10 = (Button) findViewById(R.id.button39);
        b11 = (Button) findViewById(R.id.button40);
        b12 = (Button) findViewById(R.id.button41);

        o1 = (Button) findViewById(R.id.button13);
        o2 = (Button) findViewById(R.id.button14);
        o3 = (Button) findViewById(R.id.button15);
        o4 = (Button) findViewById(R.id.button22);
        o5 = (Button) findViewById(R.id.button23);
        o6 = (Button) findViewById(R.id.button24);
        o7 = (Button) findViewById(R.id.button16);
        o8 = (Button) findViewById(R.id.button17);
        o9 = (Button) findViewById(R.id.button18);
        o10 = (Button) findViewById(R.id.button19);
        o11 = (Button) findViewById(R.id.button20);
        o12 = (Button) findViewById(R.id.button21);

        final int e1 = getIntent().getIntExtra("e1",0);
        final int e2 = getIntent().getIntExtra("e2",0);
        final int e3 = getIntent().getIntExtra("e3",0);
        final int e4 = getIntent().getIntExtra("e4",0);

        if(e1 >= 50){
            b3.setVisibility(View.VISIBLE);
        }
        if(e1 >= 35){
            b2.setVisibility(View.VISIBLE);
        }
        if(e1 >= 20){
            b1.setVisibility(View.VISIBLE);
        }
        if(e2 >= 50){
            b6.setVisibility(View.VISIBLE);
        }
        if(e2 >= 35){
            b5.setVisibility(View.VISIBLE);
        }
        if(e2 >= 20){
            b4.setVisibility(View.VISIBLE);
        }
        if(e3 >= 60){
            b9.setVisibility(View.VISIBLE);
        }
        if(e3 >= 45){
            b8.setVisibility(View.VISIBLE);
        }
        if(e3 >= 30){
            b7.setVisibility(View.VISIBLE);
        }
        if(e4 >= 50){
            b12.setVisibility(View.VISIBLE);
        }
        if(e4 >= 35){
            b11.setVisibility(View.VISIBLE);
        }
        if(e4 >= 20){
            b10.setVisibility(View.VISIBLE);
        }
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1<20){
                    Toast.makeText(Medallas.this,"Score 20 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1 < 35){
                    Toast.makeText(Medallas.this,"Score 35 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1<50){
                    Toast.makeText(Medallas.this,"Score 50 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e2<20){
                    Toast.makeText(Medallas.this,"Score 20 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e2<35){
                    Toast.makeText(Medallas.this,"Score 35 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e2<50){
                    Toast.makeText(Medallas.this,"Score 50 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e3<30){
                    Toast.makeText(Medallas.this,"Score 20 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e3<45){
                    Toast.makeText(Medallas.this,"Score 35 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e3<60){
                    Toast.makeText(Medallas.this,"Score 50 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e4<20){
                    Toast.makeText(Medallas.this,"Score 20 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e4<35){
                    Toast.makeText(Medallas.this,"Score 35 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });
        o12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e4<50){
                    Toast.makeText(Medallas.this,"Score 50 points to obtain this medal",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
