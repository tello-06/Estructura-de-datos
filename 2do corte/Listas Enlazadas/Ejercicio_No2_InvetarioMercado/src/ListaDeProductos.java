public class ListaDeProductos {
    Producto cabeza;

    public ListaDeProductos() {
        cabeza = null;
    }

    public void insertarProducto(String nombre, int cantidad, int diasParaVencer) {
        Producto nuevoproducto = new Producto(nombre, cantidad, diasParaVencer);

        if (diasParaVencer < 3) {
            nuevoproducto.siguiente = cabeza;
            cabeza = nuevoproducto;
        } else {
            if (cabeza == null) {
                cabeza = nuevoproducto;
            } else {
                Producto actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoproducto;
            }
        }
    }

    public void imprimirLista() {
        Producto actual = cabeza;

        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre + ", Cantidad: " + actual.cantidad + ", Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }

    public void ProximosAVencer() {
        Producto actual = cabeza;

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Nombre: " + actual.nombre + ", Cantidad: " + actual.cantidad + ", Días para vencer: " + actual.diasParaVencer);
            }
            actual = actual.siguiente;
        }
    }
}
