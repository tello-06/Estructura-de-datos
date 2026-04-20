// 5. Spotify Lite (Lista de Reproducción)
// Crea un reproductor de música simplificado que gestione una lista de canciones.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
// El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
// Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato MM:SS.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner datos = new Scanner(System.in);
        ListaDeReproduccion lista = new ListaDeReproduccion();

        int opcion;

        do {
            System.out.println("\n--- SPOTIFY LITE ---");
            System.out.println("1. Agregar canción al final");
            System.out.println("2. Agregar canción a continuación");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Mostrar duración total");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = Integer.parseInt(datos.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = datos.nextLine();

                    System.out.print("Artista: ");
                    String artista = datos.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = Integer.parseInt(datos.nextLine());

                    System.out.print("Género: ");
                    String genero = datos.nextLine();

                    lista.agregarAlFinal(titulo, artista, duracion, genero);
                    System.out.println("Canción agregada");
                    break;

                case 2:
                    System.out.print("Título: ");
                    String titulo2 = datos.nextLine();

                    System.out.print("Artista: ");
                    String artista2 = datos.nextLine();

                    System.out.print("Duración en segundos: ");
                    int duracion2 = Integer.parseInt(datos.nextLine());

                    System.out.print("Género: ");
                    String genero2 = datos.nextLine();

                    lista.agregarAContinuacion(titulo2, artista2, duracion2, genero2);
                    System.out.println("Canción agregada a continuación.");
                    break;

                case 3:
                    lista.imprimirLista();
                    break;

                case 4:
                    lista.mostrarDuracionTotal();
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        datos.close();
    }
}
