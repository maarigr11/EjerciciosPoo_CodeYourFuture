import java.util.Scanner;

public class VectorMatriz {

    public static void main(String[] args) {

//declarar un arreglo en una dimensión
        int[] vector;

        //crear en memoria (contruir/dimesionar) con el valor por defecto, 0 para enteros.
        vector = new int[2];

//los dos pasos en una linea
        int [] producto = new int[3];

//DECLARACIÓN Y CREACIÓN DE UNA MATRIZ
        //TIPO [][] NOMBRE = NEW TIPO [FILAS] [COLUMNAS];

        int [][] matriz = {{4,8,6}, {2,1,7}};

        System.out.println("ingrese los valores del vector de tamaño" + vector.length+":");
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < vector.length ; i++) {
            System.out.println("v´"+i+"]=");
            // acceder al valor i del vector
            vector[i] = leer.nextInt();

            //Multiplica vector por matriz
            int sum;
            //..para cada columna de la matriz..//
            for (int j = 0; j < matriz[0].length ; j++) {
                sum = 0;
                //..recorro el vector y lo multiplico
                for (i = 0; i < vector.length; i++) {
                    sum += vector[i] * matriz[i][j];

                }

            }
        }

    }





}
