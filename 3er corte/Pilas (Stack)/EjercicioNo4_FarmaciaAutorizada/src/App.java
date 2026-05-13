// 4. Farmacia Automatizada (Dispensador Tubo LIFO)
// En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. 
// El personal introduce las cajas por la parte superior y las retira de la misma forma 
// (el último lote en llegar es el primero en ser despachado).

// La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
// El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
// Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer,
//  debe ser retirado automáticamente y el sistema debe revisar el siguiente.
//  El proceso se repite hasta que el tope sea un medicamento seguro o la pila quede vacía.


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        PilaMedicamentos dispensador = new PilaMedicamentos();

        Scanner datos = new Scanner(System.in);

        // Datos de prueba
        dispensador.push(new Medicamento("Ibuprofeno", "LOT-001", 25));
        dispensador.push(new Medicamento("Paracetamol", "LOT-002", 5));
        dispensador.push(new Medicamento("Vitamina C", "LOT-003", 15));

        int opcion;

        do {

            System.out.println("\n--- FARMACIA AUTOMATIZADA ---");
            System.out.println("1. Ver medicamentos");
            System.out.println("2. Agregar medicamento");
            System.out.println("3. Validar despacho");
            System.out.println("4. Retirar medicamento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = datos.nextInt();
            datos.nextLine();

            switch (opcion) {

                case 1:

                    dispensador.imprimir();
                    break;

                case 2:

                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine();

                    System.out.print("Lote: ");
                    String lote = datos.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = datos.nextInt();

                    dispensador.push(new Medicamento(nombre, lote, dias));

                    System.out.println("Medicamento agregado correctamente.");
                    break;

                case 3:

                    dispensador.validarDespacho();
                    break;

                case 4:

                    Medicamento retirado = dispensador.pop();

                    if (retirado != null) {

                        System.out.println("Medicamento retirado:");
                        System.out.println(retirado);

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
