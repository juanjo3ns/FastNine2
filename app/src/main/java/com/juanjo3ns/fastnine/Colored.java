package com.juanjo3ns.fastnine;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by juanjo.3ns on 10/02/2016.
 */
public class Colored extends Fragment {
    SharedPreferences settings;
    public static final String PREFS_NAME = "MyPrefsFile";
    View view;
    Button button1, button2, button3, button4, button5, button6, button7, button8, counter;
    TextView tv2;
    Integer i = 0;
    Handler j;
    int delay, puntos = 0;
    Boolean contar = true, a = true, b = false, c = false, d = false, e = false, f = false, g = false, h = false;
    int no_repeat_pls;
    //int puntos_best;

    public static Colored newInstance() {
        Bundle args = new Bundle();
        Colored fragment = new Colored();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.colored, container, false);
        //settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
        counter = (Button) view.findViewById(R.id.counter1);
        button1 = (Button) view.findViewById(R.id.button4);
        button2 = (Button) view.findViewById(R.id.button5);
        button3 = (Button) view.findViewById(R.id.button6);
        button4 = (Button) view.findViewById(R.id.button7);
        button5 = (Button) view.findViewById(R.id.button8);
        button6 = (Button) view.findViewById(R.id.button9);
        button7 = (Button) view.findViewById(R.id.button10);
        button8 = (Button) view.findViewById(R.id.button11);
        final Random r = new Random();
        final Random r1 = new Random();
        final Random r2 = new Random();
        final Random r3 = new Random();
        final Random r4 = new Random();
        final Random r5 = new Random();
        final Random r6 = new Random();
        final Random r7 = new Random();
        final Random r8 = new Random();

        counter.setBackgroundResource(R.drawable.verde);
        button1.setBackgroundResource(R.drawable.azul);
        button2.setBackgroundResource(R.drawable.azul);
        button3.setBackgroundResource(R.drawable.azul);
        button4.setBackgroundResource(R.drawable.azul);
        button5.setBackgroundResource(R.drawable.azul);
        button6.setBackgroundResource(R.drawable.azul);
        button7.setBackgroundResource(R.drawable.azul);
        button8.setBackgroundResource(R.drawable.azul);
        final int verde = R.drawable.verde;
        final int azul = R.drawable.azul;
        final int naranja = R.drawable.naranja;
        final int rojo = R.drawable.rojo;
        final int amarillo = R.drawable.amarillo;
        final int gris = R.drawable.gris;
        final int azul_claro = R.drawable.azul_claro;
        final int lila = R.drawable.lila;
        Log.d("Color: ", Integer.toString(verde));
        Log.d("Color: ", Integer.toString(azul));
        Log.d("Color: ", Integer.toString(naranja));
        Log.d("Color: ", Integer.toString(rojo));
        Log.d("Color: ", Integer.toString(amarillo));
        Log.d("Color: ", Integer.toString(azul_claro));
        Log.d("Color: ", Integer.toString(gris));
        tv2 = (TextView) view.findViewById(R.id.P1);
        final ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.circularProgressbar);
        final ObjectAnimator animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 100); // see this max value coming back here, we animale towards that value
        //puntos_best= settings.getInt("p", 0);
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                j = new Handler();
                delay = 1600; //milliseconds
                i = 0;
                animation.setDuration(delay); //in milliseconds
                animation.start();
                j.postDelayed(new Runnable() {


                    public void run() {
                        if (a || b || c || d || e || f || g || h) {
                            if (contar) {
                                animation.setDuration(delay); //in milliseconds
                                animation.start();
                                a = false;
                                b = false;
                                c = false;
                                d = false;
                                e = false;
                                f = false;
                                g = false;
                                h = false;
                                no_repeat_pls = 0;


                                if (delay > 500) {
                                    delay = delay - 20;
                                }

                                //ASSIGNACIÓ DE COLORS
                                int i = r.nextInt(8);

                                switch (i) {
                                    case 0:
                                        counter.setBackgroundResource(verde);
                                        counter.setHintTextColor(Color.argb(195, 0, 255, 136));
                                        assigna_colors_pls();
                                        break;
                                    case 1:
                                        counter.setBackgroundResource(azul);
                                        counter.setHintTextColor(Color.argb(156, 0, 115, 255));
                                        assigna_colors_pls();
                                        break;
                                    case 2:
                                        counter.setBackgroundResource(lila);
                                        counter.setHintTextColor(Color.argb(132, 194, 65, 192));
                                        assigna_colors_pls();

                                        break;
                                    case 3:
                                        counter.setBackgroundResource(azul_claro);
                                        counter.setHintTextColor(Color.argb(150, 0, 255, 208));
                                        assigna_colors_pls();
                                        break;
                                    case 4:
                                        counter.setBackgroundResource(gris);
                                        counter.setHintTextColor(Color.argb(148, 143, 143, 143));
                                        assigna_colors_pls();
                                        break;
                                    case 5:
                                        counter.setBackgroundResource(naranja);
                                        counter.setHintTextColor(Color.argb(79, 255, 162, 0));
                                        assigna_colors_pls();
                                        break;
                                    case 6:
                                        counter.setBackgroundResource(rojo);
                                        counter.setHintTextColor(Color.argb(125, 255, 0, 8));
                                        assigna_colors_pls();
                                        break;
                                    case 7:
                                        counter.setBackgroundResource(amarillo);
                                        counter.setHintTextColor(Color.argb(143, 251, 255, 0));
                                        assigna_colors_pls();
                                        break;

                                }

                                button1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        a = true;
                                        int hola = button1.getCurrentHintTextColor();
                                        int adios= counter.getCurrentHintTextColor();
                                        if (button1.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        b = true;
                                        if (button2.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }

                                    }
                                });
                                button3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        c = true;
                                        if (button3.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }

                                    }
                                });
                                button4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        d = true;
                                        if (button4.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }
                                    }
                                });
                                button5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        e = true;
                                        if (button5.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }
                                    }
                                });
                                button6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        f = true;
                                        if (button6.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }

                                    }
                                });
                                button7.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        g = true;
                                        if (button7.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }

                                    }
                                });
                                button8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        no_repeat_pls++;
                                        h = true;
                                        if (button8.getCurrentHintTextColor() == counter.getCurrentHintTextColor()) {
                                            if (no_repeat_pls == 1) {
                                                puntos++;
                                            }
                                        } else {
                                            contar = false;
                                            reiniciarGame1(puntos);
                                        }
                                    }
                                });


                                j.postDelayed(this, delay);


                            }

                            String punts;
                            punts = Integer.toString(puntos);
                            tv2.setText(punts);


                        } else {
                            /*if(puntos>puntos_best) {
                                puntos_best = puntos;
                            }*/
                            reiniciarGame1(puntos);
                        }

                    }
                }, delay);

            }


        });

        return view;
    }

    public void reiniciarGame1(int punts) {

        Intent intent = new Intent(getActivity(), GameOver_General.class);
        //Aquí le quiero pasar de parametro los puntos conseguidoss
        String message = Integer.toString(punts);
        intent.putExtra("p1", "0");
        intent.putExtra("p2", "0");
        intent.putExtra("p3", message);
        intent.putExtra("p4", "0");
        intent.putExtra("modo","colored");
        //onStop();
        startActivity(intent);

    }
    /*
    public int getColored(){
        return puntos_best;
    }
    @Override
    public void onStop() {
        //GUARDAR SCORES
        settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("p", puntos_best);
        editor.commit();

    }*/

    public void assigna_colors_pls() {
        int verde = R.drawable.verde;
        int azul = R.drawable.azul;
        int naranja = R.drawable.naranja;
        int rojo = R.drawable.rojo;
        int amarillo = R.drawable.amarillo;
        int gris = R.drawable.gris;
        int azul_claro = R.drawable.azul_claro;
        int lila = R.drawable.lila;
        Random random2 = new Random();
        int prim = random2.nextInt(8);
        if (prim == 0) {
            button1.setBackgroundResource(verde);
            button1.setHintTextColor(Color.argb(195, 0, 255, 136));
            button2.setBackgroundResource(azul);
            button2.setHintTextColor(Color.argb(156, 0, 115, 255));
            button3.setBackgroundResource(rojo);
            button3.setHintTextColor(Color.argb(125, 255, 0, 8));
            button4.setBackgroundResource(gris);
            button4.setHintTextColor(Color.argb(148, 143, 143, 143));
            button5.setBackgroundResource(naranja);
            button5.setHintTextColor(Color.argb(79, 255, 162, 0));
            button6.setBackgroundResource(amarillo);
            button6.setHintTextColor(Color.argb(143, 251, 255, 0));
            button7.setBackgroundResource(azul_claro);
            button7.setHintTextColor(Color.argb(150, 0, 255, 208));
            button8.setBackgroundResource(lila);
            button8.setHintTextColor(Color.argb(132, 194, 65, 192));
        } else if (prim == 1) {
            button1.setBackgroundResource(lila);
            button1.setHintTextColor(Color.argb(132, 194, 65, 192));
            button2.setBackgroundResource(verde);
            button2.setHintTextColor(Color.argb(195, 0, 255, 136));
            button3.setBackgroundResource(azul);
            button3.setHintTextColor(Color.argb(156, 0, 115, 255));
            button4.setBackgroundResource(rojo);
            button4.setHintTextColor(Color.argb(125, 255, 0, 8));
            button5.setBackgroundResource(gris);
            button5.setHintTextColor(Color.argb(148, 143, 143, 143));
            button6.setBackgroundResource(naranja);
            button6.setHintTextColor(Color.argb(79, 255, 162, 0));
            button7.setBackgroundResource(amarillo);
            button7.setHintTextColor(Color.argb(143, 251, 255, 0));
            button8.setBackgroundResource(azul_claro);
            button8.setHintTextColor(Color.argb(150, 0, 255, 208));
        } else if (prim == 2) {
            button1.setBackgroundResource(azul_claro);
            button1.setHintTextColor(Color.argb(150, 0, 255, 208));
            button2.setBackgroundResource(lila);
            button2.setHintTextColor(Color.argb(132, 194, 65, 192));
            button3.setBackgroundResource(verde);
            button3.setHintTextColor(Color.argb(195, 0, 255, 136));
            button4.setBackgroundResource(azul);
            button4.setHintTextColor(Color.argb(156, 0, 115, 255));
            button5.setBackgroundResource(rojo);
            button5.setHintTextColor(Color.argb(125, 255, 0, 8));
            button6.setBackgroundResource(gris);
            button6.setHintTextColor(Color.argb(148, 143, 143, 143));
            button7.setBackgroundResource(naranja);
            button7.setHintTextColor(Color.argb(79, 255, 162, 0));
            button8.setBackgroundResource(amarillo);
            button8.setHintTextColor(Color.argb(143, 251, 255, 0));
        } else if (prim == 3) {
            button1.setBackgroundResource(amarillo);
            button1.setHintTextColor(Color.argb(143, 251, 255, 0));
            button2.setBackgroundResource(azul_claro);
            button2.setHintTextColor(Color.argb(150, 0, 255, 208));
            button3.setBackgroundResource(lila);
            button3.setHintTextColor(Color.argb(132, 194, 65, 192));
            button4.setBackgroundResource(verde);
            button4.setHintTextColor(Color.argb(195, 0, 255, 136));
            button5.setBackgroundResource(azul);
            button5.setHintTextColor(Color.argb(156, 0, 115, 255));
            button6.setBackgroundResource(rojo);
            button6.setHintTextColor(Color.argb(125, 255, 0, 8));
            button7.setBackgroundResource(gris);
            button7.setHintTextColor(Color.argb(148, 143, 143, 143));
            button8.setBackgroundResource(naranja);
            button8.setHintTextColor(Color.argb(79, 255, 162, 0));
        } else if (prim == 4) {
            button1.setBackgroundResource(naranja);
            button1.setHintTextColor(Color.argb(79, 255, 162, 0));
            button2.setBackgroundResource(amarillo);
            button2.setHintTextColor(Color.argb(143, 251, 255, 0));
            button3.setBackgroundResource(azul_claro);
            button3.setHintTextColor(Color.argb(150, 0, 255, 208));
            button4.setBackgroundResource(lila);
            button4.setHintTextColor(Color.argb(132, 194, 65, 192));
            button5.setBackgroundResource(verde);
            button5.setHintTextColor(Color.argb(195, 0, 255, 136));
            button6.setBackgroundResource(azul);
            button6.setHintTextColor(Color.argb(156, 0, 115, 255));
            button7.setBackgroundResource(rojo);
            button7.setHintTextColor(Color.argb(125, 255, 0, 8));
            button8.setBackgroundResource(gris);
            button8.setHintTextColor(Color.argb(148, 143, 143, 143));
        } else if (prim == 5) {
            button1.setBackgroundResource(azul);
            button1.setHintTextColor(Color.argb(156, 0, 115, 255));
            button2.setBackgroundResource(amarillo);
            button2.setHintTextColor(Color.argb(143, 251, 255, 0));
            button3.setBackgroundResource(rojo);
            button3.setHintTextColor(Color.argb(125, 255, 0, 8));
            button4.setBackgroundResource(naranja);
            button4.setHintTextColor(Color.argb(79, 255, 162, 0));
            button5.setBackgroundResource(verde);
            button5.setHintTextColor(Color.argb(195, 0, 255, 136));
            button6.setBackgroundResource(gris);
            button6.setHintTextColor(Color.argb(148, 143, 143, 143));
            button7.setBackgroundResource(lila);
            button7.setHintTextColor(Color.argb(132, 194, 65, 192));
            button8.setBackgroundResource(azul_claro);
            button8.setHintTextColor(Color.argb(150, 0, 255, 208));
        } else if (prim == 6) {
            button1.setBackgroundResource(gris);
            button1.setHintTextColor(Color.argb(148, 143, 143, 143));
            button2.setBackgroundResource(naranja);
            button2.setHintTextColor(Color.argb(79, 255, 162, 0));
            button3.setBackgroundResource(amarillo);
            button3.setHintTextColor(Color.argb(143, 251, 255, 0));
            button4.setBackgroundResource(azul_claro);
            button4.setHintTextColor(Color.argb(150, 0, 255, 208));
            button5.setBackgroundResource(lila);
            button5.setHintTextColor(Color.argb(132, 194, 65, 192));
            button6.setBackgroundResource(verde);
            button6.setHintTextColor(Color.argb(195, 0, 255, 136));
            button7.setBackgroundResource(azul);
            button7.setHintTextColor(Color.argb(156, 0, 115, 255));
            button8.setBackgroundResource(rojo);
            button8.setHintTextColor(Color.argb(125, 255, 0, 8));
        } else if (prim == 7) {
            button1.setBackgroundResource(rojo);
            button1.setHintTextColor(Color.argb(125, 255, 0, 8));
            button2.setBackgroundResource(gris);
            button2.setHintTextColor(Color.argb(148, 143, 143, 143));
            button3.setBackgroundResource(naranja);
            button3.setHintTextColor(Color.argb(79, 255, 162, 0));
            button4.setBackgroundResource(amarillo);
            button4.setHintTextColor(Color.argb(143, 251, 255, 0));
            button5.setBackgroundResource(azul_claro);
            button5.setHintTextColor(Color.argb(150, 0, 255, 208));
            button6.setBackgroundResource(lila);
            button6.setHintTextColor(Color.argb(132, 194, 65, 192));
            button7.setBackgroundResource(verde);
            button7.setHintTextColor(Color.argb(195, 0, 255, 136));
            button8.setBackgroundResource(azul);
            button8.setHintTextColor(Color.argb(156, 0, 115, 255));
        }
    }
}

