// 4. Turnos de Consultorio Médico (Prioridad de Emergencia)
// Gestiona una fila de pacientes donde algunos pueden tener emergencias.
// La Clase Paciente (Nodo): Debe contener nombre (String), edad (int) y nivelUrgencia (1 al 5).
// El Problema: Los pacientes normalmente se agregan al final. Pero si un paciente tiene nivelUrgencia == 5, debe ser movido justo después de la Cabeza.
// Reto: Implementa un método que recorra la lista desde la Cola hacia la Cabeza para encontrar al paciente de mayor edad y mostrar sus datos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner datos = new Scanner(System.in);
        int opcion;

        Consultorio consultorio = new Consultorio();

        do {
            System.out.println("\n Consultorio Médico — Turnos");
            System.out.println("1. Agregar Paciente");
            System.out.println("2. Mostrar Pacientes");
            System.out.println("3. Paciente de Mayor Edad");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine();

                    System.out.print("Edad: ");
                    int edad = datos.nextInt();

                    System.out.print("Nivel de urgencia (1-5): ");
                    int urgencia = datos.nextInt();

                    consultorio.agregarPaciente(new Paciente(nombre, edad, urgencia));
                    break;

                case 2:
                    System.out.println("Lista de pacientes:");
                    consultorio.mostrarPacientes();
                    break;

                case 3:
                    consultorio.pacienteMayorEdad();
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo");
            }

        } while (opcion != 0);

        datos.close();
    }
}
