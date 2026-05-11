// 2. Control de Calidad (Línea de Ensamblaje)
// Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa.
//  Un sensor de visión artificial inspecciona cada pieza después de ser colocada.

// La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
// El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
// Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar
//  la primera que tenga esDefectuosa = true. El método debe imprimir el nombre de 
// todas las piezas "buenas" que tuvieron que ser retiradas  y descartadas antes de llegar a la pieza fallida.


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        PilaPiezas linea = new PilaPiezas();
        Scanner datos = new Scanner(System.in);

        // Datos de prueba
        linea.push(new Pieza("Motor", "M001", false));
        linea.push(new Pieza("Pistón", "P002", false));
        linea.push(new Pieza("Válvula", "V003", false));
        linea.push(new Pieza("Tornillo", "T005", false));

        int opcion;

        do {

            System.out.println("\n--- CONTROL DE CALIDAD ---");
            System.out.println("1. Ver pila");
            System.out.println("2. Agregar pieza");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:

                    linea.imprimir();
                    break;

                case 2:

                    System.out.print("Nombre de la pieza: ");
                    String nombre = datos.nextLine();

                    System.out.print("Número de serie: ");
                    String serie = datos.nextLine();

                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defecto = datos.nextBoolean();

                    linea.push(new Pieza(nombre, serie, defecto));

                    System.out.println("Pieza agregada correctamente.");
                    break;

                case 3:

                    linea.limpiarHastaDefecto();
                    break;

                case 4:

                    System.out.println("fin");
                    break;

                default:

                    System.out.println("Opcion incorrecta, intente de nuevo");
            }
        } while (opcion != 4);
    }
}