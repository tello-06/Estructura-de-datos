// Ejercicio 1: Inventario "TecnoStore" (Shell Sort)
// Objetivo: Registrar productos y ordenarlos por su ID para realizar búsquedas rápidas.
// ¿Qué debes hacer?
// 1. Clase: Crea una clase Producto con: id (int), nombre (String), precio (double) y stock (int).
// 2. Entrada de Datos: Pide al usuario que ingrese los datos de 5 productos por teclado y guárdalos en un arreglo
// Producto[] .
// 3. Ordenamiento: Usa Shell Sort para ordenar los productos de menor a mayor según su id .
// 4. Búsqueda: Pide un id al usuario y búscalo usando Búsqueda Binaria.

import java.util.Scanner;

public class Ejercicio_No1 {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];

        Scanner datos = new Scanner(System.in);

        System.out.println("--- REGISTRO DE PRODUCTOS ---");

        for (int i = 0; i < productos.length; i++) {

            System.out.println("Producto " + (i + 1) + ":");

            System.out.print("Ingrese ID: ");
            int id = datos.nextInt();
            datos.nextLine();

            System.out.print("Ingrese Nombre: ");
            String nombre = datos.nextLine();

            System.out.print("Ingrese Precio: ");
            double precio = datos.nextDouble();

            System.out.print("Ingrese Stock: ");
            int stock = datos.nextInt();

            productos[i] = new Producto(id, nombre, precio, stock);
        }

        int n = productos.length;

        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < n; i++) {

                Producto temp = productos[i];
                int j = i;

                while (j >= gap && productos[j - gap].id > temp.id) {

                    productos[j] = productos[j - gap];
                    j = j - gap;
                }

                productos[j] = temp;
            }
        }

        System.out.println("\n--- INVENTARIO ORDENADO POR ID ---");

        for (int i = 0; i < productos.length; i++) {

            System.out.println(
                    "ID: " + productos[i].id +
                    "| Nombre: " + productos[i].nombre +
                    "| Precio: " + productos[i].precio +
                    "| Stock: " + productos[i].stock);
        }

        System.out.println("\n--- BÚSQUEDA DE PRODUCTO ---");

        System.out.print("Ingrese el ID a buscar: ");
        int buscar = datos.nextInt();

        int inicio = 0;
        int fin = productos.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (productos[medio].id == buscar) {

                System.out.println(">> PRODUCTO ENCONTRADO: "
                        + productos[medio].nombre
                        + " - Precio: $" + productos[medio].precio
                        + " - Stock: " + productos[medio].stock);

                encontrado = true;
                break;
            }

            if (buscar < productos[medio].id) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
