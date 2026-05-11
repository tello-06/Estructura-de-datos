public class PilaPiezas {
    private Pieza tope;
    private int tamanio;

    public PilaPiezas() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(Pieza nueva) {
        nueva.siguiente = tope;
        tope = nueva;
        tamanio++;
    }

    public Pieza pop() {
        if (estaVacia()) {
            return null;
        }

        Pieza aux = tope;
        tope = tope.siguiente;
        aux.siguiente = null;
        tamanio--;

        return aux;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La pila esta vacia");
            return;
        }

        Pieza actual = tope;

        System.out.println("--- PILA DE PIEZAS ---");

        while (actual != null) {
            System.out.println(actual);
            actual = actual.siguiente;
        }
    }

    public void limpiarHastaDefecto() {

        if (estaVacia()) {
            System.out.println("La pila está vacia");
            return;
        }

        while (!estaVacia()) {

            if (tope.esDefectuosa) {
                System.out.println("Se encontró la pieza defectuosa: " + tope.nombrePieza);
                break;
            }

            Pieza retirada = pop();

            System.out.println("Pieza buena descartada: " + retirada.nombrePieza);
        }

        if (estaVacia()) {
            System.out.println("No hay piezas defectuosas");
        }
    }
}