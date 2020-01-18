package com.example.memoria_kartyajatek;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int amerikai_taxi_kartya101, busz_kartya102, cruise_kartya103, ford_auto_kartya104, ikarus_kartya105, kamion_kartya106, /*repulo_kartya107, tank_kartya108, traktor_kartya109, vitorlas_kartya110, yacht_kartya111,katonai_helikopter_kartya112,*/
            amerikai_taxi_kartya201, busz_kartya202, cruise_kartya203, ford_auto_kartya204, ikarus_kartya205, kamion_kartya206; /*repulo_kartya207, tank_kartya208, traktor_kartya209, vitorlas_kartya210, yacht_kartya211,katonai_helikopter_kartya212;*/

    int elsoKartya, masodikKartya;
    int elsoKatt, masodikKatt;
    int kartyaszam = 1;

    int fordulo = 1;
    int jatekosPontok = 0, gepPontok = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        kartyakElejeBetoltes();

        Collections.shuffle(Arrays.asList(cardsArray));

        tv_p2.setTextColor(Color.GRAY); //inaktív állapot

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_23, theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_24, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_33, theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                tomes(iv_34, theCard);
            }
        });
    }

    private void init() {
        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);
        iv_11 = (ImageView)findViewById(R.id.iv_11);
        iv_12 = (ImageView)findViewById(R.id.iv_12);
        iv_13 = (ImageView)findViewById(R.id.iv_13);
        iv_14 = (ImageView)findViewById(R.id.iv_14);
        iv_21 = (ImageView)findViewById(R.id.iv_21);
        iv_22 = (ImageView)findViewById(R.id.iv_22);
        iv_23 = (ImageView)findViewById(R.id.iv_23);
        iv_24 = (ImageView)findViewById(R.id.iv_24);
        iv_31 = (ImageView)findViewById(R.id.iv_31);
        iv_32 = (ImageView)findViewById(R.id.iv_32);
        iv_33 = (ImageView)findViewById(R.id.iv_33);
        iv_34 = (ImageView)findViewById(R.id.iv_34);
    }

    private void kartyakElejeBetoltes() {
        amerikai_taxi_kartya101 = R.drawable.amerikai_taxi_kartya101;
        busz_kartya102 = R.drawable.busz_kartya102;
        cruise_kartya103 = R.drawable.cruise_kartya103;
        ford_auto_kartya104 = R.drawable.ford_auto_kartya104;
        ikarus_kartya105 = R.drawable.ikarus_kartya105;
        kamion_kartya106 = R.drawable.kamion_kartya106;

        amerikai_taxi_kartya201=R.drawable.amerikai_taxi_kartya101;
        busz_kartya202=R.drawable.busz_kartya102;
        cruise_kartya203=R.drawable.cruise_kartya103;
        ford_auto_kartya204=R.drawable.ford_auto_kartya104;
        ikarus_kartya205=R.drawable.ikarus_kartya105;
        kamion_kartya206=R.drawable.kamion_kartya106;
        //katonai_helikopter_kartya112 = R.drawable.katonai_helikopter_kartya112;
        /*katonai_helikopter_kartya212=R.drawable.katonai_helikopter_kartya112;
        repulo_kartya202 = R.drawable.repulo_kartya107;
        tank_kartya208 = R.drawable.tank_kartya108;
        traktor_kartya209 = R.drawable.traktor_kartya109;
        vitorlas_kartya210 = R.drawable.vitorlas_kartya110;
        yacht_kartya211 = R.drawable.yacht_kartya111;*/
    }

    private void tomes(ImageView iv, int kartya) {
        if (cardsArray[kartya] == 101) {
            iv.setImageResource(amerikai_taxi_kartya101);
        } else if (cardsArray[kartya] == 102) {
            iv.setImageResource(busz_kartya102);
        } else if (cardsArray[kartya] == 103) {
            iv.setImageResource(cruise_kartya103);
        } else if (cardsArray[kartya] == 104) {
            iv.setImageResource(ford_auto_kartya104);
        } else if (cardsArray[kartya] == 105) {
            iv.setImageResource(ikarus_kartya105);
        } else if (cardsArray[kartya] == 106) {
            iv.setImageResource(kamion_kartya106);
        } /*else if (cardsArray[kartya] == 107) {
            iv.setImageResource(repulo_kartya107);
        } else if (cardsArray[kartya] == 108) {
            iv.setImageResource(tank_kartya108);
        } else if (cardsArray[kartya] == 109) {
            iv.setImageResource(traktor_kartya109);
        } else if (cardsArray[kartya] == 110) {
            iv.setImageResource(vitorlas_kartya110);
        } else if (cardsArray[kartya] == 111) {
            iv.setImageResource(yacht_kartya111);
        }*/

        else if (cardsArray[kartya] == 201) {
            iv.setImageResource(amerikai_taxi_kartya201);
        } else if (cardsArray[kartya] == 202) {
            iv.setImageResource(busz_kartya202);
        } else if (cardsArray[kartya] == 203) {
            iv.setImageResource(cruise_kartya203);
        } else if (cardsArray[kartya] == 204) {
            iv.setImageResource(ford_auto_kartya204);
        } else if (cardsArray[kartya] == 205) {
            iv.setImageResource(ikarus_kartya205);
        } else if (cardsArray[kartya] == 206) {
            iv.setImageResource(kamion_kartya206);
        } /*else if (cardsArray[kartya] == 207) {
            iv.setImageResource(repulo_kartya207);
        } else if (cardsArray[kartya] == 206) {
            iv.setImageResource(kamion_kartya206);
        }*/

        if (kartyaszam == 1) {
            elsoKartya = cardsArray[kartya];
            if (elsoKartya > 200) {
                elsoKartya = elsoKartya - 100;
            }
            kartyaszam = 2;
            elsoKatt = kartya;

            iv.setEnabled(false);
        } else if (kartyaszam == 2) {
            masodikKartya = cardsArray[kartya];
            if (masodikKartya > 200) {
                masodikKartya = masodikKartya - 100;
            }
            kartyaszam = 1;
            masodikKatt = kartya;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    szamitas(); //ellenőrzi,hogy egyenlő-e
                }
            }, 1000);
        }
    }

    private void szamitas() {
        if (elsoKartya == masodikKartya) {
            if (elsoKatt == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (elsoKatt == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (masodikKatt == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (masodikKatt == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (fordulo == 1) {
                jatekosPontok++;
                tv_p1.setText("P1: " + jatekosPontok);
            } else if (fordulo == 2) {
                gepPontok++;
                tv_p2.setText("P2: " + gepPontok);
            }
        }else {
            iv_11.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_12.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_13.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_14.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_21.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_22.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_23.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_24.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_31.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_32.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_33.setImageResource(R.drawable.gyumolcsos_hatoldal);
            iv_34.setImageResource(R.drawable.gyumolcsos_hatoldal);

            if(fordulo==1){
                fordulo=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if(fordulo==2){
                fordulo=1;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.GRAY);
            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        jatekVege();
    }

    private void jatekVege(){
        if(iv_11.getVisibility()==View.INVISIBLE &&
                iv_12.getVisibility()==View.INVISIBLE &&
                iv_13.getVisibility()==View.INVISIBLE &&
                iv_14.getVisibility()==View.INVISIBLE &&
                iv_21.getVisibility()==View.INVISIBLE &&
                iv_22.getVisibility()==View.INVISIBLE &&
                iv_23.getVisibility()==View.INVISIBLE &&
                iv_24.getVisibility()==View.INVISIBLE &&
                iv_31.getVisibility()==View.INVISIBLE &&
                iv_32.getVisibility()==View.INVISIBLE &&
                iv_33.getVisibility()==View.INVISIBLE &&
                iv_34.getVisibility()==View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("Játék vége!\nP1: "+jatekosPontok+"\nP2: "+gepPontok)
                    .setCancelable(false)
                    .setPositiveButton("Újra játszás", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Kilépés", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog=alertDialogBuilder.create();
            alertDialog.show();

        }
    }
}
