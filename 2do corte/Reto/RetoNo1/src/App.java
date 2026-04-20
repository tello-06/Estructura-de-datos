import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion;

        ListaEnlazada lista = new ListaEnlazada();

        do {
            System.out.println("\n Lista Enlazada - Menú");
            System.out.println("1. Agregar Nodo");
            System.out.println("2. Mostrar Nodos");
            System.out.println("3. Contar Nodos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un valor: ");
                    int valor = datos.nextInt();
                    lista.agregar(valor);
                    break;

                case 2:
                    System.out.println("Lista:");
                    lista.mostrar();
                    break;

                case 3:
                    int cantidad = lista.contarNodos();
                    System.out.println("Cantidad de nodos: " + cantidad);
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo");
            }

        } while (opcion != 0);
    }
}