package com.juanjo3ns.fastnine;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by juanjo.3ns on 08/02/2016.
 */
public class Insane extends Fragment {
    View view;
    Button button1, button2, button3, button4, button5, button6, button7, button8,tv;
    TextView tv2;
    Integer i = 0;
    String contador;
    Handler j;
    int delay, puntos = 0, vel = 0;
    Boolean contar = true, a = true, b = false, c = false, d = false, e = false, f = false, g = false, h = false;
    int no_repeat_pls;
    /*
    Easy easy = new Easy();
    Hard ha = new Hard();
    Colored color = new Colored();
    */
    public static Insane newInstance() {
        Bundle args = new Bundle();
        Insane fragment = new Insane();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.insane, container, false);
        /*
        int ea = easy.getEasy();
        int har = ha.getHard();
        int col = color.getColored();*/
        tv = (Button) view.findViewById(R.id.counter1);
        //if((ea>35)&&(har>35)&&(col>45)){

            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new AlertDialog.Builder(getActivity())
                            .setTitle("WARNING")
                            .setMessage("This level is too fast and the only purpose of the background color of each circle is to confuse. GOOD LUCK")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface arg0, int arg1) {
                                    startGame();

                                }
                            }).create().show();
                }


            });
        //}
        /*else{
            tv.setBackgroundResource(R.drawable.candado);
            tv.setText("");
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "You must earn this one! Get the silver medals in all the other levels to access Insane.", Toast.LENGTH_LONG).show();
                }
            });
        }*/


        return view;

    }

    public void reiniciarGame1(int punts) {

        Intent intent = new Intent(getActivity(), GameOver_General.class);
        //Aquí le quiero pasar de parametro los puntos conseguidoss
        String message = Integer.toString(punts);
        intent.putExtra("p1", "0");
        intent.putExtra("p2", "0");
        intent.putExtra("p3", "0");
        intent.putExtra("p4", message);
        intent.putExtra("modo","insane");
        startActivity(intent);

    }
    public void startGame(){
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
        tv = (Button) view.findViewById(R.id.counter1);
        tv2 = (TextView) view.findViewById(R.id.P1);
        final int verde = R.drawable.verde;
        final int azul = R.drawable.azul;
        final int naranja = R.drawable.naranja;
        final int rojo = R.drawable.rojo;
        final int amarillo = R.drawable.amarillo;
        final int gris = R.drawable.gris;
        final int azul_claro = R.drawable.azul_claro;
        final int lila = R.drawable.lila;
        tv.setBackgroundResource(R.drawable.verde);
        button1.setBackgroundResource(R.drawable.azul);
        button2.setBackgroundResource(R.drawable.azul);
        button3.setBackgroundResource(R.drawable.azul);
        button4.setBackgroundResource(R.drawable.azul);
        button5.setBackgroundResource(R.drawable.azul);
        button6.setBackgroundResource(R.drawable.azul);
        button7.setBackgroundResource(R.drawable.azul);
        button8.setBackgroundResource(R.drawable.azul);
        final ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.circularProgressbar);
        final ObjectAnimator animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 100); // see this max value coming back here, we animale towards that value

        final int numeros[] = {verde, azul, naranja, rojo, amarillo, gris, azul_claro, lila};
        j = new Handler();
        delay = 1350; //milliseconds
        i = 0;
        contador = Integer.toString(i);
        tv.setText(contador);
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
                        vel++;

                        if (delay > 500) {
                            delay = delay - 10;
                        }
                        Random central = new Random();
                        int counter = central.nextInt(10);
                        contador = Integer.toString(counter);
                        tv.setText(contador);

                        //ASSIGNACIÓ DE COLORS


                        int i = r.nextInt(8);

                        if (i == 0) {
                            button1.setText(contador);
                            tv.setBackgroundResource(verde);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[Math.abs(x - q)]);
                            button2.setBackgroundResource(numeros[x]);
                            button3.setBackgroundResource(numeros[q]);
                            button4.setBackgroundResource(numeros[w]);
                            button5.setBackgroundResource(numeros[e]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random asdf = new Random();
                            int i1 = asdf.nextInt(10);
                            String ale1;
                            ale1 = Integer.toString(i1);
                            button1.setText(ale1);

                        }
                        if (i == 1) {
                            button2.setText(contador);
                            tv.setBackgroundResource(azul);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[x]);
                            button2.setBackgroundResource(numeros[Math.abs(w - e)]);
                            button3.setBackgroundResource(numeros[q]);
                            button4.setBackgroundResource(numeros[w]);
                            button5.setBackgroundResource(numeros[e]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random qwer = new Random();
                            int i2 = qwer.nextInt(10);
                            String ale2;
                            ale2 = Integer.toString(i2);
                            button2.setText(ale2);
                        }

                        if (i == 2) {
                            button3.setText(contador);
                            tv.setBackgroundResource(lila);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[q]);
                            button2.setBackgroundResource(numeros[x]);
                            button3.setBackgroundResource(numeros[Math.abs(t - y)]);
                            button4.setBackgroundResource(numeros[w]);
                            button5.setBackgroundResource(numeros[e]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random zxc = new Random();
                            int i3 = zxc.nextInt(10);
                            String ale3;
                            ale3 = Integer.toString(i3);
                            button3.setText(ale3);
                        }

                        if (i == 3) {
                            button4.setText(contador);
                            tv.setBackgroundResource(azul_claro);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[x]);
                            button2.setBackgroundResource(numeros[q]);
                            button3.setBackgroundResource(numeros[w]);
                            button4.setBackgroundResource(numeros[Math.abs(e - r)]);
                            button5.setBackgroundResource(numeros[e]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random qwerty = new Random();
                            int i4 = qwerty.nextInt(10);
                            String ale4;
                            ale4 = Integer.toString(i4);
                            button4.setText(ale4);
                        }
                        if (i == 4) {
                            button5.setText(contador);
                            tv.setBackgroundResource(gris);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[x]);
                            button2.setBackgroundResource(numeros[q]);
                            button3.setBackgroundResource(numeros[w]);
                            button4.setBackgroundResource(numeros[e]);
                            button5.setBackgroundResource(numeros[Math.abs(t - x)]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random poi = new Random();
                            int i5 = poi.nextInt(10);
                            String ale5;
                            ale5 = Integer.toString(i5);
                            button5.setText(ale5);

                        }
                        if (i == 5) {
                            button6.setText(contador);
                            tv.setBackgroundResource(naranja);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[x]);
                            button2.setBackgroundResource(numeros[q]);
                            button3.setBackgroundResource(numeros[w]);
                            button4.setBackgroundResource(numeros[e]);
                            button5.setBackgroundResource(numeros[r]);
                            button6.setBackgroundResource(numeros[Math.abs(w - t)]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random mnb = new Random();
                            int i6 = mnb.nextInt(10);
                            String ale6;
                            ale6 = Integer.toString(i6);
                            button6.setText(ale6);
                        }

                        if (i == 6) {
                            button7.setText(contador);
                            tv.setBackgroundResource(rojo);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[x]);
                            button2.setBackgroundResource(numeros[q]);
                            button3.setBackgroundResource(numeros[w]);
                            button4.setBackgroundResource(numeros[e]);
                            button5.setBackgroundResource(numeros[t]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[Math.abs(w - y)]);
                            button8.setBackgroundResource(numeros[y]);

                        } else {
                            Random ñlkj = new Random();
                            int i7 = ñlkj.nextInt(10);
                            String ale7;
                            ale7 = Integer.toString(i7);
                            button7.setText(ale7);
                        }

                        if (i == 7) {
                            button8.setText(contador);
                            tv.setBackgroundResource(amarillo);
                            int x = r1.nextInt(numeros.length);
                            int q = r2.nextInt(numeros.length);
                            int w = r3.nextInt(numeros.length);
                            int e = r4.nextInt(numeros.length);
                            int r = r5.nextInt(numeros.length);
                            int t = r6.nextInt(numeros.length);
                            int y = r7.nextInt(numeros.length);
                            button1.setBackgroundResource(numeros[x]);
                            button2.setBackgroundResource(numeros[q]);
                            button3.setBackgroundResource(numeros[w]);
                            button4.setBackgroundResource(numeros[e]);
                            button5.setBackgroundResource(numeros[y]);
                            button6.setBackgroundResource(numeros[r]);
                            button7.setBackgroundResource(numeros[t]);
                            button8.setBackgroundResource(numeros[Math.abs(t - r)]);
                            button8.setHintTextColor(Color.argb(143, 251, 255, 0));

                        } else {
                            Random ghj = new Random();
                            int i8 = ghj.nextInt(10);
                            String ale8;
                            ale8 = Integer.toString(i8);
                            button8.setText(ale8);
                        }

                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                no_repeat_pls++;
                                a = true;
                                if (button1.getText().equals(contador)) {
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
                                if (button2.getText().equals(contador)) {
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
                                if (button3.getText().equals(contador)) {
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
                                if (button4.getText().equals(contador)) {
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
                                if (button5.getText().equals(contador)) {
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
                                if (button6.getText().equals(contador)) {
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
                                if (button7.getText().equals(contador)) {
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
                                if (button8.getText().equals(contador)) {
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
                    reiniciarGame1(puntos);
                }

            }
        }, delay);
    }

}
