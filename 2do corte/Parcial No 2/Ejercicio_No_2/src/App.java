import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        Ruleta ruleta = new Ruleta();

        int opcion;

        do {

            System.out.println("\n1. Inscribir participante");
            System.out.println("2. Girar siguiente");
            System.out.println("3. Retroceder anterior");
            System.out.println("4. Ver todos");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine();

                    System.out.print("Número de boleto: ");
                    int boleto = datos.nextInt();

                    ruleta.inscribir(nombre, boleto);

                    break;

                case 2:

                    ruleta.girar();

                    break;

                case 3:

                    ruleta.retroceder();

                    break;

                case 4:

                    ruleta.verTodos();

                    break;

                case 5:

                    System.out.println("fin");

                    break;

                default:

                    System.out.println("opcion invalido, intente de nuevo");
            }

        } while (opcion != 5);
    }
}