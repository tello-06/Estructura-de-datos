// 5. Reproductor de Música Premium
// Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String) y duracion (int).
// El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente sin tener que recorrer toda la lista desde el principio.
// Reto: Implementa un método saltarAtras() que retroceda una posición y saltarAdelante() que avance una. 
// Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de error.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        int opcion;

        Reproductor reproductor = new Reproductor();

        do {
            System.out.println("\nReproductor de Música");
            System.out.println("1. Agregar Canción");
            System.out.println("2 .Mostrar Lista");
            System.out.println("3. Mostrar Actual");
            System.out.println("4. Siguiente Canción");
            System.out.println("5. Canción Anterior");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Título: ");
                    String titulo = datos.nextLine();

                    System.out.print("Artista: ");
                    String artista = datos.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = datos.nextInt();

                    reproductor.agregarCancion(new Cancion(titulo, artista, duracion));
                    break;

                case 2:
                    System.out.println("Lista de canciones:");
                    reproductor.mostrarLista();
                    break;

                case 3:
                    reproductor.mostrarActual();
                    break;

                case 4:
                    reproductor.saltarAdelante();
                    break;

                case 5:
                    reproductor.saltarAtras();
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
