public class PilaMedicamentos {

    private Medicamento tope;
    private int tamanio;

    public PilaMedicamentos() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {

        return tope == null;
    }

    public void push(Medicamento nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Medicamento pop() {

        if (estaVacia()) {

            return null;
        }

        Medicamento aux = tope;

        tope = tope.siguiente;

        aux.siguiente = null;

        tamanio--;

        return aux;
    }

    public Medicamento peek() {

        return tope;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("La pila está vacia");
            return;
        }

        Medicamento actual = tope;

        System.out.println("--- MEDICAMENTOS EN EL DISPENSADOR ---");

        while (actual != null) {

            System.out.println(actual);
            actual = actual.siguiente;
        }
    }

    // MÉTODO DEL RETO
    public void validarDespacho() {

        while (!estaVacia() && tope.diasParaVencer < 10) {

            Medicamento retirado = pop();

            System.out.println("Medicamento retirado por vencimiento próximo: " + retirado.nombre);
        }

        if (estaVacia()) {

            System.out.println("No quedan medicamentos seguros para enviar");

        } else {

            System.out.println("Medicamento seguro listo para envio:");
            System.out.println(tope);
        }
    }
}