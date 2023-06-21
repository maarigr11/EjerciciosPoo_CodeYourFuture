package Ejercicios.Guia8.EjercicioClase5;
/*Crear una clase "Vehículo" con atributos como "marca"
            "modelo"
            "año" y "tipo" (En tipo, vamos a indicar si es un
    automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:*/

public class Vehiculo {

    private String marca;
    private String modelo;
    private String tipo;
    private int anio;


    public Vehiculo(String marca, String modelo, String tipo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
