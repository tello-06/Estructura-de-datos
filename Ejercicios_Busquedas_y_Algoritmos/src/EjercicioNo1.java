// Ejercicio Cajero de Supermercado

// Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

// El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
// Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico.

import java.util.Scanner;

public class EjercicioNo1 {
    public static void main(String[] args){

        Scanner datos = new Scanner(System.in);

        int[] productos = {45012, 770123, 99887, 12345, 55667, 89012, 33445};

        System.out.print("Ingrese el código de barras a buscar: ");
        int codigo = datos.nextInt();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == codigo) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Producto encontrado en la posición: " + posicion);
        } else {
            System.out.println("Producto no encontrado en la estantería");
        }
    }
}
