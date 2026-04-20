// 4. Gestión de Mesas en Restaurante (Lista de Espera Circular)
// Un restaurante popular tiene un sistema de lista de espera. Cuando una mesa se libera, el siguiente grupo en espera ocupa el turno y pasa al final del ciclo por si quiere pedir la carta nuevamente (para clientes VIP).

// La Clase Grupo (Nodo): Debe contener nombreReserva (String), numeroDPersonas (int), esVip (boolean) y minutosEsperando (int).
// El Problema: Los grupos normales se atienden y salen de la lista. Los grupos VIP, al ser atendidos, vuelven al final de la lista circular para una segunda ronda de atención. 
// El sistema debe atender un grupo por turno.
// Reto: Implementa el método atenderSiguiente() que tome el grupo de la cabeza, muestre su información, y si esVip == true, lo reinserté al final; si no, lo elimine.
//  Muestra el estado de la lista después de cada atención. Llama al método 6 veces para simular la dinámica del restaurante.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        int opcion;

        ListaEsperaRestaurante lista = new ListaEsperaRestaurante();

        do {
            System.out.println("\nLista de Espera Restaurante");
            System.out.println("1. Agregar Grupo");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Atender Siguiente");
            System.out.println("4. Recrear 6 turnos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Nombre reserva: ");
                    String nombre = datos.nextLine();

                    System.out.print("Número de personas: ");
                    int personas = datos.nextInt();

                    System.out.print("¿Es VIP? (true/false): ");
                    boolean vip = datos.nextBoolean();

                    System.out.print("Minutos esperando: ");
                    int minutos = datos.nextInt();

                    lista.agregarGrupo(new Grupo(nombre, personas, vip, minutos));
                    break;

                case 2:
                    lista.mostrar();
                    break;

                case 3:
                    lista.atenderSiguiente();
                    break;

                case 4:
                    for (int i = 0; i < 6; i++) {
                        lista.atenderSiguiente();
                    }
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("opcion no valida, intente de nuevo");
            }
        } while (opcion != 0);
    }
}
