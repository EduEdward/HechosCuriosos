package com.eduardomartinez.hechoscuriosos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListaHechos listaHechos = new ListaHechos();
    TextView labelHC;
    RelativeLayout rl;
    Button botonMostrarHC;
    /*String [] arrayHC = {"Las hormigas se estiran cuando se despiertan por la mañana.",
            "Las avestruces pueden correr más rápido que los caballos.",
            "Las medallas de oro de los juegos olímpicos están hechas de plata.",
            "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.",
            "Toma unos 8 minutos en llegar la luz del sol a la tierra.",
            "Algunas plantas de bambú pueden crecer hasta un metro al día.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar de 2 a 3 metros por encima del agua.",
            "De media se tarda 66 días en tomar un nuevo hábito.",
            "Los mamuts seguían caminando sobre la tierra en la época en que se construyeron las grandes pirámides."};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        rl = (RelativeLayout)findViewById(R.id.rl);
        labelHC = (TextView)findViewById(R.id.HechoCuriososTextView);
        botonMostrarHC = (Button)findViewById(R.id.button);
        /*View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mostrarHechoCurioso(labelHC);

                //aqui se escribe el codigo del boton
                //String hecho = "¿Los trabajos mas demandados en 2010 no existian en 2004?";

                //Random randomGenerator = new Random(); //Construye un generador aleatorio
                //int randomNumber = randomGenerator.nextInt(10); //lo limita a diez
                //hecho = arrayHC[randomNumber];

                //labelHC.setText(hecho);
                //label

            }
        };
        Button botonMostrarHC = (Button)findViewById(R.id.button);
        botonMostrarHC.setOnClickListener(listener);*/
    }

    public void mostrarHechoCurioso(View view) {
        labelHC.setText(listaHechos.getHechoAleatorio());
        cambiarColorFondo(rl, botonMostrarHC);
    }


    private void cambiarColorFondo(RelativeLayout rela, Button botonMostrarHC) {
        ColoresFondo cf = new ColoresFondo();
        int c = cf.getColor();
        rl.setBackgroundColor(c);
        botonMostrarHC.setTextColor(c);


    }

}
