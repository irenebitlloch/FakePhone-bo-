package com.example.irenebitlloch.fakephone1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boto0;
    Button boto1;
    Button boto2;
    Button boto3;
    Button boto4;
    Button boto5;
    Button boto6;
    Button boto7;
    Button boto8;
    Button boto9;
    Button botoTruca;
    Button botoEsborra;
    String Telefon;
    EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boto0 = (Button) findViewById(R.id.boto0);
        Button boto1 = (Button) findViewById(R.id.boto1);
        Button boto2 = (Button) findViewById(R.id.boto2);
        Button boto3 = (Button) findViewById(R.id.boto3);
        Button boto4 = (Button) findViewById(R.id.boto4);
        Button boto5 = (Button) findViewById(R.id.boto5);
        Button boto6 = (Button) findViewById(R.id.boto6);
        Button boto7 = (Button) findViewById(R.id.boto7);
        Button boto8 = (Button) findViewById(R.id.boto8);
        Button boto9 = (Button) findViewById(R.id.boto9);
        Button botoEsborra = (Button) findViewById(R.id.botoEsborra);
        Button botoTruca = (Button) findViewById(R.id.botoTruca);
        final EditText numero = (EditText) findViewById(R.id.numero);

        Telefon = "";

        boto0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 0;
                numero.setText(Telefon);

            }
        });

        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 1;
                numero.setText(Telefon);

            }
        });

        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 2;
                numero.setText(Telefon);

            }
        });

        boto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 3;
                numero.setText(Telefon);

            }
        });

        boto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 4;
                numero.setText(Telefon);

            }
        });

        boto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 5;
                numero.setText(Telefon);

            }
        });

        boto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 6;
                numero.setText(Telefon);

            }
        });

        boto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 7;
                numero.setText(Telefon);

            }
        });

        boto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 8;
                numero.setText(Telefon);

            }
        });

        boto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = Telefon + 9;
                numero.setText(Telefon);

            }
        });

        botoEsborra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Telefon = "";
                numero.setText(Telefon);

            }
        });

        botoTruca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Trucant a " + Telefon, Toast.LENGTH_SHORT).show();

            }
        });




    }




}
