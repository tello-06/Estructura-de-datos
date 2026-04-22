public class EditorCapas {
    Capa cabeza;
    Capa cola;
    Capa capaActiva;

    public void agregarCapa(Capa nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;

            nueva.siguiente = nueva;
            nueva.anterior = nueva;

        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;

            cola = nueva;
        }
    }

    public void subirCapa() {
        if (capaActiva == null) return;

        capaActiva = capaActiva.siguiente;
    }

    public void bajarCapa() {
        if (capaActiva == null) return;

        capaActiva = capaActiva.anterior;
    }

    public void toggleVisibilidad() {
        if (capaActiva == null) return;

        capaActiva.visible = !capaActiva.visible;
    }

    public void eliminarActiva() {
        if (capaActiva == null) return;

        System.out.println("Eliminando capa: " + capaActiva.nombre);

        if (capaActiva == cabeza && capaActiva == cola) {
            cabeza = null;
            cola = null;
            capaActiva = null;
            return;
        }

        capaActiva.anterior.siguiente = capaActiva.siguiente;
        capaActiva.siguiente.anterior = capaActiva.anterior;

        if (capaActiva == cabeza) {
            cabeza = capaActiva.siguiente;
        }

        if (capaActiva == cola) {
            cola = capaActiva.anterior;
        }

        capaActiva = capaActiva.siguiente;
    }

    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }

        Capa actual = cabeza;

        do {
            String activo = (actual == capaActiva) ? "[✓] " : "[ ] ";
            String estado = actual.visible ? "Visible" : "Oculta";

            System.out.println(activo + actual.nombre + ", " + actual.tipo + ", " + estado);

            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
