// 4. Galería de Fotos
// Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente,
//  volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

// La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
// El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero.
//  Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve actual a la siguiente.
// Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria().
//  recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces,
//   marca la actual como favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion;

        GaleriaFotos galeria = new GaleriaFotos();

        do {
            System.out.println("\nGalería de Fotos");
            System.out.println("1. Agregar Foto");
            System.out.println("2. Siguiente");
            System.out.println("3. Anterior");
            System.out.println("4. Marcar/Desmarcar Favorita");
            System.out.println("5. Eliminar Foto Actual");
            System.out.println("6. Mostrar Galería");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Título: ");
                    String titulo = datos.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = datos.nextLine();

                    galeria.agregarFoto(new Foto(titulo, fecha));
                    break;

                case 2:
                    galeria.siguiente();
                    break;

                case 3:
                    galeria.anterior();
                    break;

                case 4:
                    galeria.toggleFavorita();
                    break;

                case 5:
                    galeria.eliminarActual();
                    break;

                case 6:
                    galeria.mostrarGaleria();
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