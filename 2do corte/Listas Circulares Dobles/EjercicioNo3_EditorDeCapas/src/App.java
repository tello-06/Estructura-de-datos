// 3. Editor de Capas (Diseño Gráfico)
// Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior (siguiente) o inferior (anterior) y puede ocultar o mostrar cada capa.
//  La estructura es circular: después de la capa más alta vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. 
// El usuario puede moverse entre capas, alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). mostrarCapas().
//  imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible.
//  Simula: crea 4 capas, activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion;

        EditorCapas editor = new EditorCapas();

        do {
            System.out.println("\nEditor de Capas");
            System.out.println("1. Agregar Capa");
            System.out.println("2. Subir Capa");
            System.out.println("3. Bajar Capa");
            System.out.println("4. Alternar Visibilidad");
            System.out.println("5. Eliminar Capa Activa");
            System.out.println("6. Mostrar Capas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = datos.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    datos.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine();

                    System.out.print("Tipo (fondo/objeto/texto): ");
                    String tipo = datos.nextLine();

                    editor.agregarCapa(new Capa(nombre, true, tipo));

                    if (editor.capaActiva == null) {
                        editor.capaActiva = editor.cabeza;
                    }
                    break;
                case 2:
                    editor.subirCapa();
                    break;

                case 3:
                    editor.bajarCapa();
                    break;

                case 4:
                    editor.toggleVisibilidad();
                    break;

                case 5:
                    editor.eliminarActiva();
                    break;

                case 6:
                    editor.mostrarCapas();
                    break;

                case 0:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo");
            }
        } while (opcion != 0);
    }
}