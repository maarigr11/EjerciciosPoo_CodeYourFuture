package Ejercicios.extrasGuia5;


//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
      //  Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner grados = new Scanner (System.in);
        System.out.println("Ingresa la cantidad de grados Celsius a Fahrenheit");
        int gradosC = grados.nextInt();
        int gradosF = centigradosAFahrenheit(gradosC);
        System.out.println(gradosC + "°C equivalen a " + gradosF + "°F");

    }

    public static int centigradosAFahrenheit (int gradosC) {

     int gradosF= 0;
     gradosF = 32+ (9 * gradosC / 5);
        return gradosF;
    }
}
