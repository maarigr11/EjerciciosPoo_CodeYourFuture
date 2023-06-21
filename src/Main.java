import Ejercicios.Guia8.Ejercicio1.Libro;
import Ejercicios.Guia8.Ejercicio2.Circunferencia;
import Ejercicios.Guia8.EjercicioClase5.Servicios.ServicioFiguraGeometrica;
import Ejercicios.Guia8.EjercicioClase5.Servicios.ServicioVehiculo;
import Ejercicios.Guia8.EjercicioClase5.Vehiculo;
import Ejercicios.Guia8.Servicios.ServicioCircunferencia;
import Ejercicios.Guia8.Servicios.ServicioPersona;

public class Main {
    public static void main(String[] args) {

        int imcBajo = 0;
        int imcBien = 0;
        int imcAlto = 0;
        int mayorEdad = 0;
        int menorEdad = 0;


        ServicioPersona p1 = new ServicioPersona();
        p1.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();

        ServicioPersona p2 = new ServicioPersona();
        p2.crearPersona();
        p2.calcularIMC();
        p2.esMayorDeEdad();

        ServicioPersona p3 = new ServicioPersona();
        p3.crearPersona();
        p3.calcularIMC();
        p3.esMayorDeEdad();

        ServicioPersona p4 = new ServicioPersona();
        p4.crearPersona();
        p4.calcularIMC();
        p4.esMayorDeEdad();

        if (p1.esMayorDeEdad() == true){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }

        if (p2.esMayorDeEdad() == true){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }

        if (p3.esMayorDeEdad() == true){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }

        if (p4.esMayorDeEdad() == true){
            mayorEdad ++;
        } else {
            menorEdad ++;
        }


        /*float imcs[] = new float [4];
        boolean mayores[] = new boolean[4];

        imcs[0] = persona1.calcularIMC();
        imcs[1] = persona2.calcularIMC();
        imcs[2] = persona3.calcularIMC();
        imcs[3] = persona4.calcularIMC();

        mayores[0]=persona1.esMayorDeEdad();
        mayores[1]=persona2.esMayorDeEdad();
        mayores[2]=persona3.esMayorDeEdad();
        mayores[3]=persona4.esMayorDeEdad();

        int cantMayores=0;
        int imcBajo=0;
        int imcMedio=0;
        int imcAlto=0;

        for (int i = 0; i < mayores.length; i++) {
            if(mayores[i]==true){
                cantMayores++;
            }

            if(imcs[i]==(-1)){
                imcBajo++;
            }
            else if(imcs[i]==0){
                imcMedio++;
            }
            else{
                imcAlto++;
            }
        } */

    }
    }


























//Mascota m1 = new Mascota();
//m1.nombre = "Mora";
//m1.apodo = "Panchi";
//m1.cola = true;
//m1.edad = 6;
//m1.raza= "Golden Retriever";
//m1.color = "Dorado";
//m1.tipo = "Perro";

// System.out.println("Mi perra se llama " + m1.nombre );

       /* Mascota m1 = new Mascota("Mora", "Golden", "Perro", "Panchi", "dorado", 6, true);

        m1.setNombre("Morita");
        m1.pasear(100);
       // System.out.println("El nombre de mi perra es " + m1.getNombre());
        System.out.println(m1.toString());

        ServicioMascota sm = new ServicioMascota();
        Mascota m2 = sm.crearMascota();

        System.out.println(m2.toString());

       // m1 = null; Cada vez que haya algo que dejemos de utilizar, debemos eliminar el espacio de memoria de lo que ya no vamos a utilizar más.
*/