package com.juanjo3ns.fastnine;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by juanjo.3ns on 10/02/2016.
 */
public class GameOver_General extends AppCompatActivity {
    SharedPreferences settings;
    public static final String PREFS_NAME = "MyPrefsFile";

    Context context;
    Button button_flechaatras, button_medalla;
    TextView easy_Act, hard_Act, colored_Act, insane_Act, easy_b, hard_b, colored_b, insane_b;
    int tab = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover_general);
        settings = getSharedPreferences(PREFS_NAME, 0);

        easy_Act = (TextView) findViewById(R.id.easy_actual);
        hard_Act = (TextView) findViewById(R.id.hard_actual);
        colored_Act = (TextView) findViewById(R.id.colored_actual);
        insane_Act = (TextView) findViewById(R.id.insane_actual);
        easy_b = (TextView) findViewById(R.id.easy_best);
        hard_b = (TextView) findViewById(R.id.hard_best);
        colored_b = (TextView) findViewById(R.id.colored_best);
        insane_b = (TextView) findViewById(R.id.insane_best);
        final String a = settings.getString("p", "0");
        final String b = settings.getString("p1", "0");
        final String c = settings.getString("p2", "0");
        final String d = settings.getString("p3", "0");
        easy_b.setText(a);
        hard_b.setText(b);
        colored_b.setText(c);
        insane_b.setText(d);
        final String p1 = getIntent().getStringExtra("p1");
        final String p2 = getIntent().getStringExtra("p2");
        final String p3 = getIntent().getStringExtra("p3");
        final String p4 = getIntent().getStringExtra("p4");
        final String modo = getIntent().getStringExtra("modo");
        easy_Act.setText(p1);
        hard_Act.setText(p2);
        colored_Act.setText(p3);
        insane_Act.setText(p4);

        if (modo.equals("easy")) {
            tab = 0;
        } else if (modo.equals("hard")) {
            tab = 1;
        } else if (modo.equals("colored")) {
            tab = 2;
        } else if (modo.equals("insane")) {
            tab = 3;
        }

        if (Integer.parseInt(easy_Act.getText().toString()) > Integer.parseInt(a)) {
            easy_b.setText(p1);
        }
        if (Integer.parseInt(hard_Act.getText().toString()) > Integer.parseInt(b)) {
            hard_b.setText(p2);
        }
        if (Integer.parseInt(colored_Act.getText().toString()) > Integer.parseInt(c)) {
            colored_b.setText(p3);
        }
        if (Integer.parseInt(insane_Act.getText().toString()) > Integer.parseInt(d)) {
            insane_b.setText(p4);
        }

        button_flechaatras = (Button) findViewById(R.id.button_flechaatras);
        button_flechaatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameOver_General.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("num_tab", tab);
                startActivity(intent);

            }
        });
        button_medalla = (Button) findViewById(R.id.medalla);
        button_medalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameOver_General.this, Medallas.class);
                if (Integer.parseInt(easy_Act.getText().toString()) > Integer.parseInt(a)) {
                    intent.putExtra("e1", Integer.parseInt(p1));
                } else {
                    intent.putExtra("e1", Integer.parseInt(a));
                }
                if (Integer.parseInt(hard_Act.getText().toString()) > Integer.parseInt(b)) {
                    intent.putExtra("e2", Integer.parseInt(p2));
                } else {
                    intent.putExtra("e2", Integer.parseInt(b));
                }
                if (Integer.parseInt(colored_Act.getText().toString()) > Integer.parseInt(c)) {
                    intent.putExtra("e3", Integer.parseInt(p3));
                } else {
                    intent.putExtra("e3", Integer.parseInt(c));
                }
                if (Integer.parseInt(insane_Act.getText().toString()) > Integer.parseInt(d)) {
                    intent.putExtra("e4", Integer.parseInt(p4));
                } else {
                    intent.putExtra("e4", Integer.parseInt(d));
                }

                startActivity(intent);

            }
        });


    }



    @Override
    protected void onStop() {
        super.onStop();
        //GUARDAR SCORES
        settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("p", easy_b.getText().toString());
        editor.putString("p1", hard_b.getText().toString());
        editor.putString("p2", colored_b.getText().toString());
        editor.putString("p3", insane_b.getText().toString());
        editor.commit();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        returnGame(tab);
    }

    public void returnGame(int tab) {
        Intent intent = new Intent(GameOver_General.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("num_tab", tab);
        startActivity(intent);
    }
}
