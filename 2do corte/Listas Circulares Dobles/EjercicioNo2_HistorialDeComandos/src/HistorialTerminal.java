public class HistorialTerminal {
    Comando cabeza;
    Comando cola;
    Comando cursor;

    public void agregarComando(Comando nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;

            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;

        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;

            cola = nuevo;
        }

        cursor = nuevo;
    }

    public void arriba() {
        if (cursor == null) {
            System.out.println("No hay comandos.");
            return;
        }

        cursor = cursor.anterior;
        mostrarCursor();
    }

    public void abajo() {
        if (cursor == null) {
            System.out.println("No hay comandos.");
            return;
        }

        cursor = cursor.siguiente;
        mostrarCursor();
    }

    public void mostrarCursor() {
        if (cursor != null) {
            System.out.println("Cursor en:");
            System.out.println(cursor.texto + ", " + cursor.directorio + ", Exitoso: " + cursor.exitoso);
        }
    }

    public void eliminarActual() {
        if (cursor == null) {
            System.out.println("No hay comandos.");
            return;
        }

        System.out.println("Eliminando: " + cursor.texto);

        if (cursor == cabeza && cursor == cola) {
            cabeza = null;
            cola = null;
            cursor = null;
            return;
        }

        cursor.anterior.siguiente = cursor.siguiente;
        cursor.siguiente.anterior = cursor.anterior;

        if (cursor == cabeza) {
            cabeza = cursor.siguiente;
        }

        if (cursor == cola) {
            cola = cursor.anterior;
        }

        cursor = cursor.siguiente;
    }

    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío.");
            return;
        }

        Comando actual = cabeza;

        do {
            if (actual == cursor) {
                System.out.println(">> " + actual.texto + ", " + actual.directorio);
            } else {
                System.out.println(actual.texto + ", " + actual.directorio);
            }

            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}