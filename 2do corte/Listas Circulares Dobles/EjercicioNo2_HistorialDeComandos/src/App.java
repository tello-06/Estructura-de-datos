// 2. Historial de Comandos de Terminal
// Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior; flecha abajo avanza al más reciente.
//  El historial es circular: después del más antiguo vuelve al más nuevo.

// La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio (String — el path desde donde se ejecutó).
// El Problema: El historial mantiene un puntero cursor al comando que se está consultando. 
// Navegar con "arriba" mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente).
//  El usuario puede eliminar el comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
// Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual().
//  Simula: agrega 5 comandos, navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo con el cursor marcado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion;

        HistorialTerminal historial = new HistorialTerminal();

        do {
            System.out.println("\nHistorial de Comandos");
            System.out.println("1. Agregar Comando");
            System.out.println("2. Flecha Arriba");
            System.out.println("3. Flecha Abajo");
            System.out.println("4. Mostrar Cursor");
            System.out.println("5. Eliminar Actual");
            System.out.println("6. Mostrar Historial");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();
                    System.out.print("Texto: ");
                    String texto = datos.nextLine();

                    System.out.print("Exitoso (true/false): ");
                    boolean exitoso = datos.nextBoolean();

                    datos.nextLine();
                    System.out.print("Directorio: ");
                    String dir = datos.nextLine();

                    historial.agregarComando(new Comando(texto, exitoso, dir));
                    break;

                case 2:
                    historial.arriba();
                    break;

                case 3:
                    historial.abajo();
                    break;

                case 4:
                    historial.mostrarCursor();
                    break;

                case 5:
                    historial.eliminarActual();
                    break;

                case 6:
                    historial.mostrarHistorial();
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo");
            }
        } while (opcion != 0);
    }
}