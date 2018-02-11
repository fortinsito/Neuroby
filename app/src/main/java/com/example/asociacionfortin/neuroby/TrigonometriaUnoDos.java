package com.example.asociacionfortin.neuroby;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrigonometriaUnoDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometria_uno_dos);




        Button buttonInfo = (Button) findViewById(R.id.buttonInfo);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TrigonometriaUnoDos.this);

                builder.setTitle("Referencia");
                builder.setMessage(R.string.referencia_trigonometria_uno_dos);

                builder.setPositiveButton(R.string.actionPositive, null);

                Dialog dialog = builder.create();
                dialog.show();
            }
        });




    }
}
