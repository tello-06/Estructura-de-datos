// 4. Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada 
// en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y aplicar el método nombre1.compareToIgnoreCase(nombre2). 
// Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.

import java.util.Scanner;

public class Ejercicio_No4 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = datos.nextInt();
        datos.nextLine();

        String[] nombres = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del estudiante: "+ (i+1) + ": ");
            nombres[i] = datos.nextLine();
        }

        for (int i = 1; i < cantidad; i++) {

            String nom = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(nom) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }

            nombres[j + 1] = nom;
        }

        System.out.println("\narray ordenado:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}