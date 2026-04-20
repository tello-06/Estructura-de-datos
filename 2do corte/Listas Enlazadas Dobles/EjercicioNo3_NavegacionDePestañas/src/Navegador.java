public class Navegador {
    Pestana cabeza;
    Pestana cola;

    public void abrirPestana(Pestana nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void cerrarPestanaActual(String url) {
        Pestana actual = cabeza;

        while (actual != null) {
            if (actual.url.equals(url)) {

                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                } else if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    cabeza.anterior = null;
                } else if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

                System.out.println("Se cerro la pestaña: " + actual.tituloPagina);
                return;
            }

            actual = actual.siguiente;
        }

        System.out.println("No se encontró la pestaña");
    }

    public void mostrarPestanas() {
        Pestana temp = cabeza;

        while (temp != null) {
            System.out.println(temp.tituloPagina + ", " + temp.url + ", " + temp.horaApertura);
            temp = temp.siguiente;
        }
    }
}
