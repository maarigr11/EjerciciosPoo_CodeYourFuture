package Ejercicios.Guía6POO.AppMascota.servicios;

import Ejercicios.Guía6POO.AppMascota.Mascota;

import java.util.Scanner;

public class ServicioMascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //Esto no es muy buena practica

    public Mascota crearMascota(){
        System.out.println("Introduci el nombre");
        String nombre = leer.next();
        System.out.println("Introduci el tipo");
        String tipo = leer.next();
        System.out.println("Introduci el apodo");
        String apodo = leer.next();

        return new Mascota(nombre,apodo,tipo); //Siempre debemos retornar los datos sino no los va a mostrar.
//Devuelvo el nacimiento de una mascota con tales características, producto de lo que introduzco por teclado


    }


}
