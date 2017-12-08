package com.example.asociacionfortin.neuroby;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ayuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);




        Button buttonConocenos = (Button) findViewById(R.id.buttonConocenos);
        buttonConocenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ayuda.this, Conocenos.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
