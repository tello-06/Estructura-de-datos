// 5. El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. 
// El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. 
// El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_No5 {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        int arr[] = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            arr[i] = datos.nextInt();
        }

        int seleccion[] = arr.clone();
        int insercion[] = arr.clone();

        int swaps = 0;
        int movimientos = 0;

        // Selection Sort
        for (int i = 0; i < seleccion.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < seleccion.length; j++) {
                if (seleccion[j] < seleccion[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = seleccion[i];
                seleccion[i] = seleccion[min];
                seleccion[min] = temp;
                swaps++;
            }
        }

        // Insertion Sort
        for (int i = 1; i < insercion.length; i++) {

            int key = insercion[i];
            int j = i - 1;

            while (j >= 0 && insercion[j] > key) {
                insercion[j + 1] = insercion[j];
                j--;
                movimientos++;
            }

            insercion[j + 1] = key;
        }

        System.out.println("\nResultado Selection Sort: " + Arrays.toString(seleccion));
        System.out.println("Swaps realizados: " + swaps);

        System.out.println("\nResultado Insertion Sort: " + Arrays.toString(insercion));
        System.out.println("Movimientos realizados: " + movimientos);

    }
}
