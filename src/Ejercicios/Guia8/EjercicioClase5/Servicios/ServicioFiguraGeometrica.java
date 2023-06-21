package Ejercicios.Guia8.EjercicioClase5.Servicios;

import Ejercicios.Guia8.EjercicioClase5.FiguraGeometrica;

import java.util.Scanner;

public class ServicioFiguraGeometrica {
Scanner leer = new Scanner(System.in);

    FiguraGeometrica f1 = new FiguraGeometrica();

    public void crearFigura(String nombre) {

        Scanner leer = new Scanner(System.in);

        double area = 0;
        double perimetro = 0;

        switch (nombre) {
            case "cuadrado":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                perimetro = f1.getLado() * 4;
                area = f1.getLado() * f1.getLado();
                break;
            case "rectangulo":
                System.out.println("Ingrese la base:");
                f1.setBase(leer.nextInt());
                System.out.println("Ingrese la altura:");
                f1.setAltura(leer.nextInt());
                perimetro = (f1.getBase() * 2) + (f1.getAltura() * 2);
                area = f1.getBase() * f1.getAltura();
                break;
            case "triangulo":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                System.out.println("Ingrese la altura:");
                f1.setAltura(leer.nextInt());
                perimetro = f1.getLado() * 3;
                area = (f1.getLado() * f1.getAltura()) / 2;
                break;
            case "circulo":
                System.out.println("Ingrese el radio:");
                f1.setRadio(leer.nextDouble());
                perimetro = 2 * Math.PI * f1.getRadio();
                area = Math.PI * Math.pow(f1.getRadio(),2);
                break;
            case "hexagono":

                break;
            case "pentagono":

                break;
            case "rombo":

                break;
            default:
                throw new AssertionError();
        }

        System.out.println("El area del " + nombre + " es " + area);
        System.out.println("El perimetro del " + nombre + " es " + perimetro);

    }


}
