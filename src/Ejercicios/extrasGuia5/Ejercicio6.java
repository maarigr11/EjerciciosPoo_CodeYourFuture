package Ejercicios.extrasGuia5;

import java.util.Scanner;

//Crear un programa que dado un numero determine si es par o impar.
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es par o impar");
        int num = numero.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número es impar");
        }
    }

}
