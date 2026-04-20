import java.util.Scanner;

public class Ejercicio_No2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        Producto[] productos = new Producto[5];

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1));

            System.out.print("SKU: ");
            int sku = datos.nextInt();
            datos.nextLine();

            System.out.print("Nombre: ");
            String nombre = datos.nextLine();

            System.out.print("Stock: ");
            int stock = datos.nextInt();

            productos[i] = new Producto(sku, nombre, stock);
        }

        for (int i = 1; i < productos.length; i++) {
            Producto temp = productos[i];
            int j = i - 1;

            // insertion sort
            while (j >= 0 && productos[j].sku > temp.sku) {
                productos[j + 1] = productos[j];
                j--;
            }

            productos[j + 1] = temp;
        }

        System.out.println("\nProductos por ordenados por sku: ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Sku " + productos[i].sku + ": " + productos[i].nombre);
        }

        System.out.print("\nIngrese el sku que quiere buscar: ");
        int buscar = datos.nextInt();

        int inicio = 0;
        int fin = productos.length - 1;
        boolean encontrado = false;

        // busqueda binaria
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (productos[medio].sku == buscar) {
                System.out.println("Producto encontrado:");
                System.out.println("Nombre: " + productos[medio].nombre);
                System.out.println("Stock: " + productos[medio].stock);
                encontrado = true;
                break;
            } else if (productos[medio].sku < buscar) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }

        int totalStock = 0;

        //suma de las unidades totales del stock
        for (int i = 0; i < productos.length; i++) {
            totalStock += productos[i].stock;
        }

        System.out.println("\nEl total de unidades en stock es de: " + totalStock);
    }
}