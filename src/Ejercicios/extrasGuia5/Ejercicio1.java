package Ejercicios.extrasGuia5;
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
  //      dos. El programa deberá después mostrar el resultado de la suma
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num1 = numero.nextInt();
        System.out.println("Ingresa otro número");
        int num2 = numero.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma de los dos números ingresados es " + suma);

    }
}
