public class Reproductor {
    Cancion cabeza;
    Cancion cola;
    Cancion actual;

    public void agregarCancion(Cancion nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void mostrarActual() {
        if (actual != null) {
            System.out.println("Reproduciendo:");
            System.out.println(actual.titulo + ", " + actual.artista + ", " + actual.duracion + "s");
        } else {
            System.out.println("No hay canciones");
        }
    }

    public void saltarAdelante() {
        if (actual == null) {
            System.out.println("No hay canciones");
            return;
        }

        if (actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println("Ya estás en la última canción");
        }
    }

    public void saltarAtras() {
        if (actual == null) {
            System.out.println("No hay canciones");
            return;
        }

        if (actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println("Ya estás en la primera canción");
        }
    }

    public void mostrarLista() {
        Cancion temp = cabeza;

        while (temp != null) {
            System.out.println(temp.titulo + ", " + temp.artista + ", " + temp.duracion + "s");
            temp = temp.siguiente;
        }
    }
}
