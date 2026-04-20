// 1. El Podio de la Competencia
// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

// Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). 
// Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, 
// adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).

import java.util.Scanner;

public class Ejercicio_No1 {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de corredores: ");
        int n = datos.nextInt();

        double[] tiempos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo del corredor No " + (i + 1) + ": ");
            tiempos[i] = datos.nextDouble();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[min]) {
                    min = j;
                }
            }

            double temp = tiempos[i];
            tiempos[i] = tiempos[min];
            tiempos[min] = temp;
        }

        System.out.println("\nTiempos:");
        for (double t : tiempos) {
            System.out.println(t);
        }

        System.out.println("\nPodio:");
        System.out.println("Corredor con la medalla de Oro: " + tiempos[0]);
        System.out.println("Corredor con la medalla de Plata: " + tiempos[1]);
        System.out.println("Corredor con la medalla de Bronce: " + tiempos[2]);

    }
}