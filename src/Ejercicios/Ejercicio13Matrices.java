package Ejercicios;
//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
       // define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

import java.util.Scanner;

public class Ejercicio13Matrices {
// EJERCICIO 13 Y 14 JUNTOS
    //Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo

    public static void main(String[] args) {

        String [] equipo;
        equipo = new String[4];

        for (int i = 0; i < 4; i++) {
            Scanner nombre = new Scanner(System.in);
            System.out.println("Ingresa un nombre");
            equipo[i] = nombre.next();
            System.out.print( "El nombre del integrante " + i + " del equipo es [" + equipo[i] + "]");

        }

    }

}
