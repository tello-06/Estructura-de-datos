import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Cartelera cartelera = new Cartelera();

        int opcion;

        do {
            System.out.println("\n1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Ver cartelera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el título: ");
                    String titulo = datos.nextLine();

                    System.out.print("Digite el género: ");
                    String genero = datos.nextLine();

                    System.out.print("Digite la duración en minutos: ");
                    int duracion = datos.nextInt();
                    datos.nextLine();

                    cartelera.agregarPelicula(titulo, genero, duracion);
                    break;

                case 2:
                    System.out.print("Digite el título a buscar: ");
                    String tituloBuscar = datos.nextLine();

                    cartelera.buscarPorTitulo(tituloBuscar);
                    break;

                case 3:
                    cartelera.verCartelera();
                    break;

                case 4:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("opcion invalida, intente de nuevo");
            }

        } while (opcion != 4);
    }
}