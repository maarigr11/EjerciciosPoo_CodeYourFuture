package Ejercicios.Guía6POO.AppMascota;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    //Constructor
    public Usuario() {

    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
}
