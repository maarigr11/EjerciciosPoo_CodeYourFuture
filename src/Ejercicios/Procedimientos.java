package Ejercicios;
import java.util.Scanner;

public class Procedimientos {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int num1 = numero.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = numero.nextInt();

        esMultiplo(num1, num2);
    }

    //Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
    //que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
    //segundo, sino informe que no lo son.

    public static void esMultiplo(int num1, int num2) {
        if ( num2 % num1 == 0){
            System.out.println("El primer numero es multiplo");
        } else {
            System.out.println("El primer numero no es multiplo del segundo");
        }
    }
}
