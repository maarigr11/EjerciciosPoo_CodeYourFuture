package Ejercicios.extrasGuia5;

//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
  //      pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    //    la función equals() en Java.

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String fraseIngresada = frase.nextLine();
        String palabra = "eureka";

        if (fraseIngresada.equals(palabra)) {

            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
