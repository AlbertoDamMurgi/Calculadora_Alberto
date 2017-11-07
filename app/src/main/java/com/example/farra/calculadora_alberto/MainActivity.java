package com.example.farra.calculadora_alberto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String cadena="";
    private boolean coma=true;
    private double operando1=0,operando2=0;
    private String operacion;
    private boolean realizarop=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultado = (TextView) findViewById(R.id.tv_resultado);
        Button btn_decimal = (Button) findViewById(R.id.btn_decimal);
        Button btn_cero = (Button) findViewById(R.id.btn_cero);
        Button btn_uno = (Button) findViewById(R.id.btn_uno);
        Button btn_dos = (Button) findViewById(R.id.btn_dos);
        Button btn_tres = (Button) findViewById(R.id.btn_tres);
        Button btn_cuatro = (Button) findViewById(R.id.btn_cuatro);
        Button btn_cinco = (Button) findViewById(R.id.btn_cinco);
        Button btn_seis = (Button) findViewById(R.id.btn_seis);
        Button btn_siete = (Button) findViewById(R.id.btn_siete);
        Button btn_ocho = (Button) findViewById(R.id.btn_ocho);
        Button btn_nueve = (Button) findViewById(R.id.btn_nueve);

        Button btn_inverso = (Button) findViewById(R.id.btn_inverso);
        Button btn_igual = (Button) findViewById(R.id.btn_igual);
        Button btn_sumar = (Button) findViewById(R.id.btn_sumar);
        Button btn_restar = (Button) findViewById(R.id.btn_restar);
        Button btn_multi = (Button) findViewById(R.id.btn_multi);
        Button btn_div = (Button) findViewById(R.id.btn_div);
        Button btn_del = (Button) findViewById(R.id.btn_deshacer);
        Button btn_borrar = (Button) findViewById(R.id.btn_borrar);



        btn_igual.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                switch (operacion){

                    case "suma":
                        if(!resultado.getText().toString().equals("")){

                            operando2=Double.parseDouble(resultado.getText().toString());
                            operando2=operando1+operando2;
                            resultado.setText(String.valueOf(operando2));
                            realizarop=true;
                        }

                        break;
                    case "resta":

                        if(!resultado.getText().toString().equals("")){

                            operando2=Double.parseDouble(resultado.getText().toString());
                            operando2=operando1-operando2;
                            resultado.setText(String.valueOf(operando2));
                            realizarop=true;
                        }


                        break;

                    case "multi":
                        if(!resultado.getText().toString().equals("")){

                            operando2=Double.parseDouble(resultado.getText().toString());
                            operando2=operando1*operando2;
                            resultado.setText(String.valueOf(operando2));
                            realizarop=true;
                        }
                        break;

                    case "div":

                        if(!resultado.getText().toString().equals("")){

                            operando2=Double.parseDouble(resultado.getText().toString());
                            operando2=operando1/operando2;
                            resultado.setText(String.valueOf(operando2));
                            realizarop=true;

                        }


                        break;


                        default:

                            break;

                }

            }


        });


        btn_div.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(realizarop&&!resultado.getText().toString().equals("")){

                    operacion="div";
                    operando1=Double.parseDouble(resultado.getText().toString());
                    resultado.setText("");



                }

                realizarop=false;

            }

        });

        btn_restar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(realizarop&&!resultado.getText().toString().equals("")){

                    operacion="resta";
                    operando1=Double.parseDouble(resultado.getText().toString());
                    resultado.setText("");



                }

                realizarop=false;

            }

        });


        btn_multi.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(realizarop&&!resultado.getText().toString().equals("")){

                    operacion="multi";
                    operando1=Double.parseDouble(resultado.getText().toString());
                    resultado.setText("");



                }

                realizarop=false;

            }

        });





        btn_sumar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(realizarop&&!resultado.getText().toString().equals("")){

                    operacion="suma";
                    operando1=Double.parseDouble(resultado.getText().toString());
                    resultado.setText("");



                }

                realizarop=false;

            }

        });


        btn_inverso.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                double aux =0;

                cadena=resultado.getText().toString();

                aux=Double.parseDouble(cadena);

               aux=aux*-1;

                cadena = String.valueOf(aux);
                resultado.setText(cadena);
            }


        });




        btn_del.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                char[] c ;
                StringBuilder aux= new StringBuilder();

                cadena=resultado.getText().toString();

                if(cadena.endsWith(".")) coma=true;

                c=cadena.toCharArray();

                for (int i = 0; i < c.length; i++) {
                    if(i==cadena.length()-1) continue;
                   aux.append(c[i]);
                }

                resultado.setText(aux.toString());
            }


        });

        btn_borrar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {



                operando1=0;
                operando2=0;
                coma=true;

                resultado.setText("");

            }


        });





        btn_decimal.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if (coma) {

                    cadena = resultado.getText().toString();

                    if (cadena.equals("")) {
                        cadena = "0.";
                        resultado.setText(cadena);
                    } else {
                        if(!cadena.contains(".")) {
                            cadena += ".";
                            resultado.setText(cadena);
                        }
                    }
                }
                coma=false;
            }


        });






        btn_cero.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();
                if(!cadena.equals("0")&&!cadena.equals("")) {
                    cadena += "0";
                    resultado.setText(cadena);
                }
            }

        });

        btn_uno.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                    cadena += "1";
                    resultado.setText(cadena);
                }


        });


        btn_dos.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "2";
                resultado.setText(cadena);
            }


        });


        btn_tres.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "3";
                resultado.setText(cadena);
            }


        });



        btn_cuatro.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "4";
                resultado.setText(cadena);
            }


        });



        btn_cinco.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "5";
                resultado.setText(cadena);
            }


        });


        btn_seis.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "6";
                resultado.setText(cadena);
            }


        });


        btn_siete.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "7";
                resultado.setText(cadena);
            }


        });


        btn_ocho.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "8";
                resultado.setText(cadena);
            }


        });


        btn_nueve.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                cadena=resultado.getText().toString();

                cadena += "9";
                resultado.setText(cadena);
            }


        });









    }
}
