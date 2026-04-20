import java.util.Scanner;

public class Ejercicio_No2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int[] puntajes = new int[6];
        double suma = 0;

        System.out.println("--- INGRESO DE PUNTAJES ---");

        for (int i = 0; i < puntajes.length; i++) {

            System.out.print("Puntaje del Intento " + (i + 1) + ": ");
            puntajes[i] = datos.nextInt();

            suma += puntajes[i];
        }

        for (int i = 1; i < puntajes.length; i++) {

            int clave = puntajes[i];
            int j = i - 1;

            while (j >= 0 && puntajes[j] < clave) {

                puntajes[j + 1] = puntajes[j];
                j--;
            }

            puntajes[j + 1] = clave;
        }

        System.out.println("\n--- TABLA DE RESULTADOS (De mayor a menor) ---");

        for (int i = 0; i < puntajes.length; i++) {

            System.out.println((i + 1) + "° Lugar: " + puntajes[i]);
        }

        double promedio = suma / puntajes.length;

        System.out.println("\nEl promedio total de los puntajes fue: " + promedio);

        System.out.println("\n--- BÚSQUEDA LINEAL ---");

        System.out.print("Ingrese el puntaje que desea buscar: ");
        int buscar = datos.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < puntajes.length; i++) {

            if (puntajes[i] == buscar) {

                System.out.println(">> El puntaje " + buscar
                        + " se encuentra en el "
                        + (i + 1) + "° lugar de la tabla.");

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Puntaje no encontrado.");
        }
    }
}
