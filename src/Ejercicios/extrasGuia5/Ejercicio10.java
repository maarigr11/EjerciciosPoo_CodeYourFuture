package Ejercicios.extrasGuia5;

import java.util.Scanner;
// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
       // números al usuario hasta que la suma de los números introducidos supere el límite inicial.


public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num = numero.nextInt();
        int resultadoSuma = hastaLimite(num);
        System.out.println("Fin, la suma de los números ingresados es: " + resultadoSuma + " y el número ingresado inicialmente fue " + num);

    }

    public static int hastaLimite(int num) {
        int suma = 0;

        for (int i = 0; suma <= num ; i++) {
            System.out.println("Ingresa otro numero hasta llegar al valor del primer numero ingresado");
            Scanner numero = new Scanner(System.in);
            int num2 = numero.nextInt();
            suma = suma + num2;
        }
        return suma;
    }


}
