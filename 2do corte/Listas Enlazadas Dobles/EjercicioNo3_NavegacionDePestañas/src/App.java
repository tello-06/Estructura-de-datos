// 3. Navegación de Pestañas de Navegador
// Imagina un navegador donde puedes moverte entre pestañas abiertas.

// La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura (String).
// El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco debe pasar a la pestaña anterior.
// Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, 
// la elimine de la lista y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        int opcion;

        Navegador navegador = new Navegador();

        do {
            System.out.println("\nNavegador - Gestión de Pestañas:");
            System.out.println("1. Abrir Pestaña");
            System.out.println("2. Cerrar Pestaña");
            System.out.println("3. Mostrar Pestañas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Título: ");
                    String titulo = datos.nextLine();

                    System.out.print("URL: ");
                    String url = datos.nextLine();

                    System.out.print("Hora de apertura: ");
                    String hora = datos.nextLine();

                    navegador.abrirPestana(new Pestana(titulo, url, hora));
                    break;

                case 2:
                    datos.nextLine();
                    System.out.print("Ingrese URL de la pestaña que se quiere cerrar: ");
                    String urlCerrar = datos.nextLine();

                    navegador.cerrarPestanaActual(urlCerrar);
                    break;

                case 3:
                    System.out.println("Pestañas abiertas:");
                    navegador.mostrarPestanas();
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
