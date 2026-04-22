public class GaleriaFotos {
    Foto cabeza;
    Foto cola;
    Foto actual;

    public void agregarFoto(Foto nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;

            nueva.siguiente = nueva;
            nueva.anterior = nueva;

            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;

            cola = nueva;
        }
    }

    public void siguiente() {
        if (actual == null) return;
        actual = actual.siguiente;
    }

    public void anterior() {
        if (actual == null) return;
        actual = actual.anterior;
    }

    public void toggleFavorita() {
        if (actual == null) return;
        actual.esFavorita = !actual.esFavorita;
    }

    public void eliminarActual() {
        if (actual == null) return;

        System.out.println("Eliminando: " + actual.titulo);

        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
            actual = null;
            return;
        }

        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;

        if (actual == cabeza) {
            cabeza = actual.siguiente;
        }

        if (actual == cola) {
            cola = actual.anterior;
        }

        actual = actual.siguiente;
    }

    public void mostrarGaleria() {
        if (cabeza == null) {
            System.out.println("Galería vacía");
            return;
        }

        Foto temp = cabeza;

        do {
            String activa = (temp == actual) ? "[▶] " : "    ";
            String fav = temp.esFavorita ? "[★] " : "";

            System.out.println(activa + fav + temp.titulo + " | " + temp.fecha);

            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}
