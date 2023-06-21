package Ejercicios.extrasGuia5;

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
  //      doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().


import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {


        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa un número");
                int num = numero.nextInt();
                int doble = num * 2;
                int triple = num * 3;
                double raiz_cuadrada = Math.sqrt(num);

        System.out.println("La el doble del número ingresado es " + doble);
        System.out.println("El triple del número ingresado es " + triple);
        System.out.println("La raiz cuadrada del número ingresado es " + raiz_cuadrada);

    }
}
