// 3. Logística de Distribución (Callejón sin Salida)
// Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho.
//  Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. 
// El último camión en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.
// La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
// El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover 
// los camiones físicamente (solo consultando la estructura).
// Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola)
//  y calcule la suma total de cargaToneladas de todos los camiones estacionados.


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        PilaCamiones callejon = new PilaCamiones();

        Scanner datos = new Scanner(System.in);

        // Datos de prueba
        callejon.push(new Camion("ABC-123", "Carlos", 12.5));
        callejon.push(new Camion("DEF-456", "Ana", 8.3));
        callejon.push(new Camion("GHI-789", "Luis", 15.7));
        callejon.push(new Camion("JKL-321", "Maria", 10.2));

        int opcion;

        do {

            System.out.println("\n--- LOGÍSTICA DE DISTRIBUCIÓN ---");
            System.out.println("1. Ver camiones");
            System.out.println("2. Registrar camión");
            System.out.println("3. Calcular carga total");
            System.out.println("4. Retirar camión del tope");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:

                    callejon.imprimir();
                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = datos.nextLine();

                    System.out.print("Conductor: ");
                    String conductor = datos.nextLine();

                    System.out.print("Carga en toneladas: ");
                    double carga = datos.nextDouble();

                    callejon.push(new Camion(placa, conductor, carga));

                    System.out.println("Camión agregado correctamente");
                    break;

                case 3:

                    double total = callejon.calcularCargaTotal();

                    System.out.println("Carga total almacenada: " + total + " toneladas.");
                    break;

                case 4:

                    Camion retirado = callejon.pop();

                    if (retirado != null) {

                        System.out.println("Camión retirado: " + retirado);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 5:

                    System.out.println("fin");
                    break;

                default:

                    System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 5);
    }
}