package Ejercicios;

public class Funciones {

    //Retorno de la funcion. puede ser VOID que no devuelve nada, o el tipo dato.
    //siempre deben tener un nombre

    public static void main(String[] args) {

       int resultado = suma(8,7);
        System.out.println(resultado);
        saludoPersonalizado("Mari");


    }

    public static int suma (int a, int b) { //Static hace que no tenga que ser instanciado por un objeto.

        int resultado = a + b;
        return resultado;
    }

    public static void saludoPersonalizado (String nombre){

        System.out.println("Hola " + nombre + " espero estes teniendo un lindo día");
    }
}
