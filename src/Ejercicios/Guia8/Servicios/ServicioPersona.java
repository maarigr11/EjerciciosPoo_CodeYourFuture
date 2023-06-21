package Ejercicios.Guia8.Servicios;

import Ejercicios.Guia8.Ejercicio7.Persona;

import java.util.Scanner;

public class ServicioPersona {

Persona p1 = new Persona();
Scanner leer = new Scanner(System.in);

public Persona crearPersona () {
    System.out.println("Ingresa tu nombre");
    p1.setNombre(leer.nextLine());
    System.out.println("Ingresa tu edad");
    p1.setEdad(leer.nextInt());
    System.out.println("Ingresa tu sexo");
    p1.setSexo(leer.next());
    if (p1.getSexo().equals("M") != p1.getSexo().equals("F") || p1.getSexo().equals("O")){

    } else {
        System.out.println("El sexo introducido no es correcto");
    }

    System.out.println("Ingresa tu altura");
    p1.setAltura(leer.nextDouble());
    System.out.println("Ingresa tu peso");
    p1.setPeso(leer.nextDouble());
    return p1;
}


public double calcularIMC(){
    double imc = p1.getPeso() / Math.pow(p1.getAltura(), 2);
    int resultado = 0;

    if (imc < 20){
        resultado = -1;
    } else if (imc > 20 && imc <= 25){
        resultado = 0;
    } else {
        resultado = 1;
    }

    return resultado;
}

public boolean esMayorDeEdad(){

    if (p1.getEdad() > 18){
        return true;
    } else {
        return false;
    }
};

}
