package com.example.asociacionfortin.neuroby;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Toshiba on 20/12/2017.
 */

public class AlgebraUno extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_algebra, container, false);





        int num1 = R.id.buttonTrigonometria;
     /*   int num2 = R.id.buttonExploFisica;
        int num3 = R.id.buttonEstudios;
        int num4 = R.id.buttonDiagnostico;
        int num5 = R.id.buttonPronostico;
        int num6 = R.id.buttonIndTerapeutica;
        int num = R.id.buttonInfo;

        */


        Button buttonTrigonometria = (Button) rootView.findViewById(num1);
     /*   Button buttonExploFisica = (Button) rootView.findViewById(num2);
        Button buttonEstudios = (Button) rootView.findViewById(num3);
        Button buttonDiagnostico = (Button) rootView.findViewById(num4);
        Button buttonPronostico = (Button) rootView.findViewById(num5);
        Button buttonIndTerapeutica = (Button) rootView.findViewById(num6);
        Button buttonInfo = (Button) rootView.findViewById(num);


        */




        buttonTrigonometria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), Trigonometria.class);
                startActivity(intent);
            }
        });

        /*

        buttonExploFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), ExploracionFisica.class);
                startActivity(intent);
            }
        });

        buttonEstudios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), EstudiosLaboratoriosOtros.class);
                startActivity(intent);
            }
        });

        buttonDiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), Diagnostico.class);
                startActivity(intent);
            }
        });

        buttonPronostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), Pronostico.class);
                startActivity(intent);
            }
        });


        */




        return rootView;
    }

}
