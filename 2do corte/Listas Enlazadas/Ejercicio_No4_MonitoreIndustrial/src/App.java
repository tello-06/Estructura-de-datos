// 4. Monitoreo Industrial (Sensores en Tiempo Real)
// Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

// La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y hora (String).
// El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
// Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner datos = new Scanner(System.in);
        ListaDeLecturas lista = new ListaDeLecturas();

        int opcion;

        do {
            System.out.println("\n--- MONITOREO INDUSTRIAL ---");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lecturas");
            System.out.println("3. Mostrar temperatura máxima");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = Integer.parseInt(datos.nextLine());

            switch (opcion) {

                case 1:
                    System.out.print("ID del Sensor: ");
                    int id = Integer.parseInt(datos.nextLine());

                    System.out.print("Temperatura: ");
                    double temp = Double.parseDouble(datos.nextLine());

                    System.out.print("Presión: ");
                    double presion = Double.parseDouble(datos.nextLine());

                    System.out.print("Hora: ");
                    String hora = datos.nextLine();

                    lista.insertarLectura(id, temp, presion, hora);
                    System.out.println("Lectura agregada.");
                    break;

                case 2:
                    lista.imprimirLecturas();
                    break;

                case 3:
                    lista.MostrarTemperaturaMaxima();
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}
