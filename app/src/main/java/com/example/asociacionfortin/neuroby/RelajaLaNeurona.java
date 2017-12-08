package com.example.asociacionfortin.neuroby;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RelajaLaNeurona extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relaja_la_neurona);



        Button buttonInfo = (Button) findViewById(R.id.buttonInfo);




        Button buttonMemes = (Button) findViewById(R.id.buttonMemes);

        buttonMemes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelajaLaNeurona.this, Memes.class);
                startActivityForResult(intent, 0);
            }
        });










        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RelajaLaNeurona.this);

                builder.setTitle("Descripción");
                builder.setMessage(R.string.text_descripcion_relaja);

                builder.setPositiveButton(R.string.actionPositive, null);

                Dialog dialog = builder.create();
                dialog.show();
            }
        });





    }
}
