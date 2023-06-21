package Ejercicios.Guia8.Servicios;

import Ejercicios.Guia8.Ejercicio2.Circunferencia;

import java.util.Scanner;

public class ServicioCircunferencia {
    double pi = 3.1416;
    Circunferencia c1 = new Circunferencia();
    Scanner valor = new Scanner(System.in);

    public double crearCircunferencia(){
        System.out.println("Ingrese el radio");
        c1.setRadio(valor.nextDouble());

        return c1.getRadio();

    }

    public double area (){

        double radioAlCuadrado = Math.pow(c1.getRadio(), 2);

        return pi * radioAlCuadrado;

    }

    public double perimetro (){

        return 2 * pi * c1.getRadio();

    }


}
