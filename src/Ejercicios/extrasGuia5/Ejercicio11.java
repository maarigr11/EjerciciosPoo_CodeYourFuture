package Ejercicios.extrasGuia5;
import java.util.Scanner;
//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
  //      pantalla el siguiente menú:

    //    MENU
      //  1. Sumar
       // 2. Restar
       // 3. Multiplicar
       // 4. Dividir
       // 5. Salir
       // Elija opción:

       // El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
        //y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
       // Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
        //directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
       // desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
        //programa, caso contrario se vuelve a mostrar el menú.

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        Scanner frase = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = numero.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = numero.nextInt();


        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elegí una opción");


        int opcion;
        do {
            System.out.println("Elegí una opción");
            opcion = numero.nextInt();
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("la suma es " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("la resta es " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("la multiplicación es " + multiplicacion);
                    break;
                case 4:
                    int division = num1 / num2;
                    System.out.println("la división es " + division);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String respuesta = frase.next();
                    respuesta = respuesta.toUpperCase();
                    if (respuesta.equals("S")) {
                        System.out.println("Adiós");
                        break;
                    } else if (respuesta.equals("N")) {
                        opcion = 0;
                        System.out.println("MENU");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Salir");
                        System.out.println("Elegí una opción");
                        break;
                    } else {
                        System.out.println("La letra ingresada no es correcta");
                        break;
                    }
            }
        } while (opcion != 5);
    }
}