package Ejercicios.extrasGuia5;


//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
  //      dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    //    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
      //  X y el último tiene que ser una O.
        //Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        //especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        //de FDE, que no respete el formato se considera incorrecta.
        //Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        //incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        //siguientes funciones de Java Substring(), Length(), equals().


import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        String cadena = " ";
        String secuenciaEspecial = "&&&&&";
        int correctas = 0, incorrectas = 0;

        boolean continuar = true;

        while (continuar) {

            System.out.println("Ingresa una cadena");
            cadena = frase.nextLine();

            if (cadena.length() == 5){
                if (cadena.substring(0 , 1).equals("X") && cadena.substring(4,5).equals("o")) {
                    correctas = correctas + 1;
                }else if (cadena.equals(secuenciaEspecial)) {
                    continuar = false;

                }else{
                        incorrectas = incorrectas + 1;
                    }

                } else {
                incorrectas = incorrectas + 1;

                }

            }
        System.out.println("La cantidad de incorrectas fue " + incorrectas);
        System.out.println("La cantidad de correctas fue " + correctas);

    }


}
