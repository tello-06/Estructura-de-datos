public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int contarNodos() {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    public void mostrar() {
    Nodo actual = cabeza;

    while (actual != null) {
        System.out.print(actual.valor);

        if (actual.siguiente != null) {
            System.out.print(" -> ");
        }

        actual = actual.siguiente;
    }
    System.out.println();
}
}