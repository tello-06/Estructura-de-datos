// Ejercicio de buscador de cedulas

// Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

// El Problema: Un cliente llega a la ventanilla y da su número. 
// El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
// Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados
//  este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

import java.util.Scanner;

public class EjercicioNo2 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        int[] cedulas = {1001, 1020, 1050, 1100, 1200, 1300, 1400, 1500, 1600, 1700};

        System.out.print("Ingrese la cédula a buscar: ");
        int cedulaBuscada = datos.nextInt();

        int inicio = 0;
        int fin = cedulas.length - 1;
        int posicion = -1;

        // Búsqueda Binaria
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                posicion = medio;
                break;
            } else if (cedulaBuscada < cedulas[medio]) {
                fin = medio - 1; 
            } else {
                inicio = medio + 1; 
            }
        }

        if (posicion != -1) {
            System.out.println("Cliente encontrado en la posición: " + posicion);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

}
