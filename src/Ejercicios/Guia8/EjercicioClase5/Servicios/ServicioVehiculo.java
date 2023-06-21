package Ejercicios.Guia8.EjercicioClase5.Servicios;

import Ejercicios.Guia8.EjercicioClase5.Vehiculo;

public class ServicioVehiculo{

    double metrosRecorridos;



    public double moverse (int segundos, String tipo){

        if (tipo.equals("automovil")){
            metrosRecorridos = 3 * segundos;
        } else if ( tipo.equals("moto")){
            metrosRecorridos = 2 * segundos;
        } else if (tipo.equals("bici")){
            metrosRecorridos = 1 * segundos;
        } else {
            System.out.println("El vehiculo ingresado no es válido");
        }
        return metrosRecorridos;
    }

    public double frenar (String tipo){

        if ( tipo.equals("bici")){
            return metrosRecorridos;
        } else {
            return metrosRecorridos += 2;
        }

    }



}
