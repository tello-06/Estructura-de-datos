import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_No3 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("--- REGISTRO DE NOTAS ---");

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Ingrese nota del Estudiante " + (i + 1) + ": ");
            notas[i] = datos.nextDouble();
        }

        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        System.out.println("\n--- INFORME ACADÉMICO ---");

        System.out.println("La nota más ALTA del grupo es: " + mayor);
        System.out.println("La nota más BAJA del grupo es: " + menor);

        for (int i = 0; i < notas.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < notas.length; j++) {

                if (notas[j] < notas[min]) {
                    min = j;
                }
            }

            double temp = notas[i];
            notas[i] = notas[min];
            notas[min] = temp;
        }

        System.out.println("\n--- LISTA DE NOTAS ORDENADA ---");

        System.out.println(Arrays.toString(notas));
    }
}