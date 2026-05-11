public class PilaCamiones {

    private Camion tope;
    private int tamanio;

    public PilaCamiones() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {

        return tope == null;
    }

    public void push(Camion nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Camion pop() {

        if (estaVacia()) {
            return null;
        }

        Camion aux = tope;
        tope = tope.siguiente;
        aux.siguiente = null;
        tamanio--;

        return aux;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("La pila está vacia");
            return;
        }

        Camion actual = tope;

        System.out.println("--- CAMIONES EN EL CALLEJÓN ---");

        while (actual != null) {

            System.out.println(actual);
            actual = actual.siguiente;
        }
    }

    public double calcularCargaTotal() {

        double suma = 0;

        Camion actual = tope;

        while (actual != null) {

            suma += actual.cargaToneladas;
            actual = actual.siguiente;
        }

        return suma;
    }
}