// 3. Editor de Capas (Diseño Gráfico)
// Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior (siguiente) o inferior (anterior) y puede ocultar o mostrar cada capa.
//  La estructura es circular: después de la capa más alta vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. 
// El usuario puede moverse entre capas, alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). mostrarCapas().
//  imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible.
//  Simula: crea 4 capas, activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final.

public class App {
    public static void main(String[] args) throws Exception {
        EditorCapas editor = new EditorCapas();

        editor.agregarCapa(new Capa("Fondo", true, "fondo"));
        editor.agregarCapa(new Capa("Personaje", true, "objeto"));
        editor.agregarCapa(new Capa("Texto", true, "texto"));
        editor.agregarCapa(new Capa("Sombras", true, "objeto"));

        editor.capaActiva = editor.cabeza.siguiente;

        System.out.println("=== Estado inicial ===");
        editor.mostrarCapas();

        System.out.println("\n=== Subir una capa ===");
        editor.subirCapa();

        System.out.println("\n=== Ocultar capa activa ===");
        editor.toggleVisibilidad();

        System.out.println("\n=== Eliminar capa activa ===");
        editor.eliminarActiva();

        System.out.println("\n=== Estado final ===");
        editor.mostrarCapas();
    }
}
