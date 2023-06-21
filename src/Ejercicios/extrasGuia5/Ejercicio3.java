package Ejercicios.extrasGuia5;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        Scanner frase = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String fraseIngresada = frase.nextLine();

        System.out.println("La frase ingresada en minúsculas es: " + fraseIngresada.toLowerCase());
        System.out.println("La frase ingresada en mayúsculas es: " + fraseIngresada.toUpperCase());


    }
}