package com.example.operacionebasicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtNumero1;
    EditText txtNumero2;
    TextView txtResultado;
    Button sumar;
    Button restar;
    Button multiplicar;
    Button dividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = (EditText) findViewById(R.id.txtNumber);
        txtNumero2 = (EditText) findViewById(R.id.txtNumber2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        sumar = (Button) findViewById(R.id.sumar);
        restar = (Button) findViewById(R.id.restar);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        dividir = (Button) findViewById(R.id.dividir);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1= Double.valueOf(txtNumero1.getText().toString());
                double num2=Double.valueOf(txtNumero2.getText().toString());
                double suma =num1+num2;
                txtResultado.setText(String.valueOf(suma));
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1= Double.valueOf(txtNumero1.getText().toString());
                double num2= Double.valueOf(txtNumero2.getText().toString());
                double resta= num1-num2;
                txtResultado.setText(String.valueOf(resta));

            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.valueOf(txtNumero1.getText().toString());
                double num2=Double.valueOf(txtNumero2.getText().toString());
                double multiplicacion= num1*num2;
                txtResultado.setText(String.valueOf(multiplicacion));
            }
        });
        dividir .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.valueOf(txtNumero1.getText().toString());
                double num2=Double.valueOf(txtNumero2.getText().toString());
                double divisor=num1/num2;
                txtResultado.setText(String.valueOf(divisor));
            }
        });
    }
}