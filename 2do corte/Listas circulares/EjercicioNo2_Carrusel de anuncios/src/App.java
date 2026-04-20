// 2. Carrusel de Anuncios (Pantalla Digital)
// Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el último anuncio, vuelve automáticamente al primero.

// La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), vecesRepetido (int) y categoria (String - ej: "Oferta", "Marca", "Evento").
// El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio que más veces se ha repetido.
// Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas completas por todos los anuncios,
//  incrementando vecesRepetido en cada paso e imprimiendo qué anuncio está en pantalla. 
// Al finalizar, muestra el anuncio más repetido y el tiempo total acumulado en pantalla.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        int opcion;

        CarruselAnuncios carrusel = new CarruselAnuncios();

        do {
            System.out.println("\nCarrusel de Anuncios");
            System.out.println("1. Agregar Anuncio");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Reproducir Anuncios");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("titulo: ");
                    String titulo = datos.nextLine();

                    System.out.print("duracion en segundos: ");
                    int duracion = datos.nextInt();

                    datos.nextLine();
                    System.out.print("Categoría: ");
                    String categoria = datos.nextLine();

                    carrusel.ponerAlFinal(new Anuncio(titulo, duracion, categoria));
                    break;

                case 2:
                    carrusel.mostrar();
                    break;

                case 3:
                    System.out.print("ingrese el numero de ciclos: ");
                    int ciclos = datos.nextInt();

                    carrusel.reproducir(ciclos);
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
