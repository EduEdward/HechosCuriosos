package com.eduardomartinez.hechoscuriosos;

import java.util.Random;

/**
 * Created by 21532283 on 28/09/2016.
 */
public class ListaHechos {
    String [] arrayHC ={"Las hormigas se estiran cuando se despiertan por la mañana.",
            "Las avestruces pueden correr más rápido que los caballos.",
            "Las medallas de oro de los juegos olímpicos están hechas de plata.",
            "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.",
            "Toma unos 8 minutos en llegar la luz del sol a la tierra.",
            "Algunas plantas de bambú pueden crecer hasta un metro al día.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar de 2 a 3 metros por encima del agua.",
            "De media se tarda 66 días en tomar un nuevo hábito.",
            "Los mamuts seguían caminando sobre la tierra en la época en que se construyeron las grandes pirámides."};

    public String getHechoAleatorio(){
        String hecho = " ";
        Random randomGenerator = new Random(); //Construye un generador aleatorio
        int randomNumber = randomGenerator.nextInt(arrayHC.length); //lo limita a diez
        hecho=arrayHC[randomNumber];
        return hecho;
    }
}
