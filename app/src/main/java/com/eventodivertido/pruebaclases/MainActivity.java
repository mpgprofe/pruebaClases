package com.eventodivertido.pruebaclases;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButtonAzul:
                        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.azul));
                        ((ConstraintLayout) findViewById(R.id.fondo)).setBackgroundColor(getResources().getColor(R.color.azul));
                        break;
                    case R.id.radioButtonVerde:
                        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.verde));
                        ((ConstraintLayout) findViewById(R.id.fondo)).setBackgroundColor(getResources().getColor(R.color.verde));
                        break;
                    case R.id.radioButtonRojo:
                        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.rojo));
                        break;

                }
            }
        });
    }
}
