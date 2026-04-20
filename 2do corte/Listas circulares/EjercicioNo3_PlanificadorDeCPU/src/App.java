// Planificador de CPU (Algoritmo Round Robin)
// Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador entre varios procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo llamado quantum. 
// Si no termina, espera su siguiente turno.

// La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y prioridad (int - del 1 al 3).
// El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, descuenta el quantum del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0,
//  el proceso termina y se elimina de la lista.
// Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en cada turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. 
// El ciclo debe terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los procesos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        int opcion;

        PlanificadorCPU planificador = new PlanificadorCPU();

        do {
            System.out.println("\nPlanificador CPU (Round Robin)");
            System.out.println("1. Agregar Proceso");
            System.out.println("2. Mostrar Procesos");
            System.out.println("3. Ejecutar");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine();

                    System.out.print("PID: ");
                    int pid = datos.nextInt();

                    System.out.print("Tiempo restante: ");
                    int tiempo = datos.nextInt();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = datos.nextInt();

                    planificador.agregarProceso(new Proceso(nombre, pid, tiempo, prioridad));
                    break;

                case 2:
                    planificador.mostrar();
                    break;

                case 3:
                    System.out.print("Quantum: ");
                    int quantum = datos.nextInt();

                    planificador.ejecutar(quantum);
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opcion no válida, intente de nuevo");
            }

        } while (opcion != 0);

        datos.close();
    }
}
