public class Galeria {
    Fotografia cabeza;
    Fotografia cola;

    public void agregarFoto(Fotografia nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public Fotografia siguiente(Fotografia actual) {
        if (actual != null && actual.siguiente != null) {
            return actual.siguiente;
        }
        return actual;
    }

    public Fotografia anterior(Fotografia actual) {
        if (actual != null && actual.anterior != null) {
            return actual.anterior;
        }
        return actual;
    }

    public void reproducirGaleria() {
        Fotografia temp = cabeza;

        System.out.println("\nRecorrido hacia adelante:");
        while (temp != null) {
            System.out.println(temp.nombreArchivo + " - " + temp.tamanoMB + "MB - " + temp.resolucion);
            temp = temp.siguiente;
        }

        temp = cola;

        System.out.println("\nRecorrido hacia atrás:");
        while (temp != null) {
            System.out.println(temp.nombreArchivo + " - " + temp.tamanoMB + "MB - " + temp.resolucion);
            temp = temp.anterior;
        }
    }
}