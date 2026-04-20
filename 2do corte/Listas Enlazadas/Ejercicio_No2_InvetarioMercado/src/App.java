// 2. Inventario de Alimentos (Control de Caducidad)
// Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.

// La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
// El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
// Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner datos = new Scanner(System.in);
        ListaDeProductos lista = new ListaDeProductos();

        int opcion;

        do {
            System.out.println("\n--- INVENTARIO DE ALIMENTOS ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Mostrar próximos a vencer");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = datos.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = datos.nextInt();

                    System.out.print("Días para vencer: ");
                    int dias = datos.nextInt();

                    lista.insertarProducto(nombre, cantidad, dias);
                    System.out.println("Producto agregado.");
                    break;

                case 2:
                    lista.imprimirLista();
                    break;

                case 3:
                    lista.ProximosAVencer();
                    break;
                
                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
