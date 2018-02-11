package com.example.asociacionfortin.neuroby;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrigonometriaUnoTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometria_uno_tres);





        Button buttonInfo = (Button) findViewById(R.id.buttonInfo);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TrigonometriaUnoTres.this);

                builder.setTitle("Referencia");
                builder.setMessage(R.string.referencia_trigonometria_baldor);

                builder.setPositiveButton(R.string.actionPositive, null);

                Dialog dialog = builder.create();
                dialog.show();
            }
        });






    }
}
