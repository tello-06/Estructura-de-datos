// 2. Organización de Biblioteca Dinámica
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante en su posición correcta.
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero) de cada uno.
// Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, 
// el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). 
// Esto permite al estudiante ver cómo los elementos se desplazan para abrir espacio al nuevo valor.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_No2 {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros: ");
        int cantidad = datos.nextInt();

        int ISBN[] = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print(" ingrese el codigo ISBN del libro No " + (i + 1) + ": ");
            ISBN[i] = datos.nextInt();
        }

        for (int i = 1; i < cantidad; i++) {

            int num = ISBN[i];
            int j = i - 1;

            while (j >= 0 && ISBN[j] > num) {
                ISBN[j + 1] = ISBN[j];
                j--;
            }

            ISBN[j + 1] = num;

            System.out.println(Arrays.toString(ISBN));
        }
    }
}
