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

        int[] ISBN = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el codigo ISBN del libro No " + (i + 1) + ": ");
            int num = datos.nextInt();

            // posición donde se insertará (desde la derecha)
            int pos = cantidad - 1 - i;

            ISBN[pos] = num;

            int j = pos;

            // ordenar hacia la derecha
            while (j < cantidad - 1 && ISBN[j] > ISBN[j + 1]) {

                int temp = ISBN[j];
                ISBN[j] = ISBN[j + 1];
                ISBN[j + 1] = temp;

                j++;
            }

            System.out.println(Arrays.toString(ISBN));
        }

        System.out.println(" La estanteria quedo organizada asi:");
        System.out.println(Arrays.toString(ISBN));
    }
}