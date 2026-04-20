// 2. Carrusel de Imágenes (Galería Interactiva)
// Simula el comportamiento de una galería de fotos en una aplicación móvil.

// La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion (String).
// El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". 
// Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
// Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego 
// toda la lista hacia atrás para mostrar todas las fotos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion;
        Galeria galeria = new Galeria();
        Fotografia fotoActual = null;

        do {
            System.out.println("\nGalería de Imágenes - Menu");
            System.out.println("1. Agregar Foto");
            System.out.println("2. Siguiente Foto");
            System.out.println("3. Foto Anterior");
            System.out.println("4. Reproducir Galería");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();
                    System.out.print("Nombre del archivo: ");
                    String nombre = datos.nextLine();

                    System.out.print("Tamaño en MB: ");
                    double tamano = datos.nextDouble();

                    datos.nextLine();
                    System.out.print("Resolución: ");
                    String resolucion = datos.nextLine();

                    Fotografia nueva = new Fotografia(nombre, tamano, resolucion);
                    galeria.agregarFoto(nueva);

                    if (fotoActual == null) {
                        fotoActual = nueva;
                    }

                    break;

                case 2:
                    if (fotoActual != null) {
                        fotoActual = galeria.siguiente(fotoActual);
                        System.out.println("Foto actual: " + fotoActual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos.");
                    }
                    break;

                case 3:
                    if (fotoActual != null) {
                        fotoActual = galeria.anterior(fotoActual);
                        System.out.println("Foto actual: " + fotoActual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos.");
                    }
                    break;

                case 4:
                    galeria.reproducirGaleria();
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opcion invalida, intente de nuevo");
                    
            }
        } while (opcion != 0);
    }
}