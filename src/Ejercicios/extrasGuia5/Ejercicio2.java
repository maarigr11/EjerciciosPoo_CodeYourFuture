package Ejercicios.extrasGuia5;

import java.util.Scanner;

public class Ejercicio2 {
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    //pantalla.

    public static void main(String[] args) {


        Scanner nombrePersona = new Scanner(System.in);
        System.out.println("Ingresa tu nombre ");
                String nombre = nombrePersona.next();
        System.out.println("Tu nombre es " + nombre);
    }
}
