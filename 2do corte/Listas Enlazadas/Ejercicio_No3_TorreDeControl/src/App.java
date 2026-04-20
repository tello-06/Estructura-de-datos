// 3. Torre de Control (Aterrizajes de Emergencia)
// Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

// La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String), combustibleRestante (int) y pasajeros (int).
// El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
// Reto: Implementar el método reportarEmergencia(String numeroVuelo) que busque un vuelo en la cola y lo mueva al principio.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner datos = new Scanner(System.in);
        ColaDeVuelos cola = new ColaDeVuelos();

        int opcion;

        do {
            System.out.println("\n--- TORRE DE CONTROL ---");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Reportar emergencia");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Número de vuelo: ");
                    String numero = datos.nextLine();

                    System.out.print("Aerolínea: ");
                    String aerolinea = datos.nextLine();

                    System.out.print("Combustible restante: ");
                    int combustible = datos.nextInt();

                    System.out.print("Pasajeros: ");
                    int pasajeros = datos.nextInt();

                    cola.insertarVuelo(numero, aerolinea, combustible, pasajeros);
                    System.out.println("Vuelo agregado.");
                    break;

                case 2:
                    cola.imprimirCola();
                    break;

                case 3:
                    System.out.print("Ingrese número de vuelo: ");
                    String buscar = datos.nextLine();

                    cola.reportarEmergencia(buscar);
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
