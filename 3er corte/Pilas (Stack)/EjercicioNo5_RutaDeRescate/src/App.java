// 5. Ruta de Rescate (Espeleología Geológica)
// Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad" 
// representadas por una baliza que registra los datos del entorno.

// La Clase Estacion (Nodo): Debe contener nombrePunto (String), profundidad (int) y nivelOxigeno (double).
// El Problema: Para salir de la cueva, el equipo debe seguir las estaciones 
// en el orden inverso al que fueron colocadas (de la más profunda a la entrada).
// Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida que se desapila.
// Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, el sistema debe imprimir una alerta 
// de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto.


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        PilaCamiones callejon = new PilaCamiones();

        Scanner datos = new Scanner(System.in);

        // Datos de prueba
        callejon.push(new Camion("ABC-123", "Carlos Pérez", 12.5));
        callejon.push(new Camion("DEF-456", "Ana Torres", 8.3));
        callejon.push(new Camion("GHI-789", "Luis Gómez", 15.7));
        callejon.push(new Camion("JKL-321", "María Díaz", 10.2));

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

                    System.out.println("Camión agregado correctamente.");
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

                    System.out.println("Opción incorrecta, intente de nuevo");
            }
        } while (opcion != 5);
    }
}