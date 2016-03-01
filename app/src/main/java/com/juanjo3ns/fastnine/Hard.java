package com.juanjo3ns.fastnine;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by juanjo.3ns on 08/02/2016.
 */
public class Hard extends Fragment {
    SharedPreferences settings;
    public static final String PREFS_NAME = "MyPrefsFile";
    View view;

    Button button1, button2, button3, button4, button5, button6, button7, button8;
    TextView tv, tv2;
    Integer i = 0;
    String contador;
    Handler j;
    int delay, puntos = 0;
    Boolean  contar = true, a = true, b = false, c = false, d = false, e = false, f = false, g = false, h = false;
    int no_repeat_pls;
    //int puntos_best;

    public static Hard newInstance() {
        Bundle args = new Bundle();
        Hard fragment = new Hard();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.hard, container, false);
        //settings = getActivity().getSharedPreferences(PREFS_NAME, 0);
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
        tv = (TextView) view.findViewById(R.id.counter1);
        tv2 = (TextView) view.findViewById(R.id.P1);
        final ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.circularProgressbar);
        final ObjectAnimator animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 100); // see this max value coming back here, we animale towards that value
        //puntos_best= settings.getInt("p", 0);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                j = new Handler();
                delay = 1900; //milliseconds
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
                                if (i == 9) {
                                    i = -1;

                                }
                                i++;
                                if (delay > 500) {
                                    delay = delay - 25;
                                }
                                contador = Integer.toString(i);
                                tv.setText(contador);


                                int i = r.nextInt(8 - 0);

                                if (i == 0) {
                                    button1.setText(contador);
                                } else {
                                    int i1 = r1.nextInt(10 - 0);
                                    String ale1;
                                    ale1 = Integer.toString(i1);
                                    button1.setText(ale1);

                                }
                                if (i == 1) {
                                    button2.setText(contador);
                                } else {
                                    int i2 = r2.nextInt(10 - 0);
                                    String ale2;
                                    ale2 = Integer.toString(i2);
                                    button2.setText(ale2);
                                }

                                if (i == 2) {
                                    button3.setText(contador);
                                } else {
                                    int i3 = r3.nextInt(10 - 0);
                                    String ale3;
                                    ale3 = Integer.toString(i3);
                                    button3.setText(ale3);
                                }

                                if (i == 3) {
                                    button4.setText(contador);
                                } else {
                                    int i4 = r4.nextInt(10 - 0);
                                    String ale4;
                                    ale4 = Integer.toString(i4);
                                    button4.setText(ale4);
                                }
                                if (i == 4) {
                                    button5.setText(contador);
                                } else {
                                    int i5 = r5.nextInt(10 - 0);
                                    String ale5;
                                    ale5 = Integer.toString(i5);
                                    button5.setText(ale5);

                                }
                                if (i == 5) {
                                    button6.setText(contador);
                                } else {
                                    int i6 = r6.nextInt(10 - 0);
                                    String ale6;
                                    ale6 = Integer.toString(i6);
                                    button6.setText(ale6);
                                }

                                if (i == 6) {
                                    button7.setText(contador);
                                } else {
                                    int i7 = r7.nextInt(10 - 0);
                                    String ale7;
                                    ale7 = Integer.toString(i7);
                                    button7.setText(ale7);
                                }

                                if (i == 7) {
                                    button8.setText(contador);
                                } else {
                                    int i8 = r8.nextInt(10 - 0);
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
        intent.putExtra("p2", message);
        intent.putExtra("p3", "0");
        intent.putExtra("p4", "0");
        intent.putExtra("modo","hard");
        //onStop();
        startActivity(intent);

    }
    /*
    public int getHard(){
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
}
