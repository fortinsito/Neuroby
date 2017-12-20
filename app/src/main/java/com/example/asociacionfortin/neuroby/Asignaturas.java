package com.example.asociacionfortin.neuroby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Asignaturas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asignaturas);




        Button buttonCalculo = (Button) findViewById(R.id.buttonCalculo);
        buttonCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Asignaturas.this, Calculo.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonAlgebra = (Button) findViewById(R.id.buttonAlgebra);
        buttonAlgebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Asignaturas.this, Algebra.class);
                startActivityForResult(intent, 0);
            }
        });




    }





}
