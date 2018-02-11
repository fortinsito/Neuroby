package com.example.asociacionfortin.neuroby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trigonometria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometria);


        Button buttonTrigonometriaTemaUnoUno = (Button) findViewById(R.id.buttonTrigonometriaTemaUnoUno);
        buttonTrigonometriaTemaUnoUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trigonometria.this, TrigonometriaUnoUno.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonTrigonometriaTemaUnoDos = (Button) findViewById(R.id.buttonTrigonometriaTemaUnoDos);
        buttonTrigonometriaTemaUnoDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trigonometria.this, TrigonometriaUnoDos.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonTrigonometriaTemaUnoTres = (Button) findViewById(R.id.buttonTrigonometriaTemaUnoTres);
        buttonTrigonometriaTemaUnoTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trigonometria.this, TrigonometriaUnoTres.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonTrigonometriaTemaUnoCuatro = (Button) findViewById(R.id.buttonTrigonometriaTemaUnoCuatro);
        buttonTrigonometriaTemaUnoCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trigonometria.this, TrigonometriaUnoCuatro.class);
                startActivityForResult(intent, 0);
            }
        });



    }
}
