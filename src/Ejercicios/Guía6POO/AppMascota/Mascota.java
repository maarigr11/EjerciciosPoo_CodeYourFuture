package Ejercicios.Guía6POO.AppMascota;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Mascota {

    private String nombre;
    private String raza;
    private String tipo;
    //loro, perro, gato, etc
    private String apodo;
    private String color;
    private int edad;
    private boolean cola;

    private int energia;

    // Constructor vacío
    public Mascota() {
        energia = 1000;
    }

    //Constructor con parámetros. Podemos crear la cantidad de constructores que necesitemos.

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Pajaro")) {
            this.tipo = tipo;
        }
        energia = 1000;
    }

    public Mascota(String nombre, String raza, String tipo, String apodo, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.apodo = apodo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        energia = 1000;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipo() {
        return tipo;
    }

    public String getApodo() {
        return apodo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }


    public int pasear(int energiaGastada) {
        //energia = energia - energiaGastada;

        energia -= energiaGastada;
        return energia;

    }
// sobrecarga de método

    public int pasear(int energiaGastada, int vueltas) {
        //energia = energia - energiaGastada;

        for (int i = 0; i < vueltas; i++) {
            energia -= energiaGastada;
        }

        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tipo='" + tipo + '\'' +
                ", apodo='" + apodo + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", cola=" + cola +
                ", energia=" + energia +
                '}';
    }
}
