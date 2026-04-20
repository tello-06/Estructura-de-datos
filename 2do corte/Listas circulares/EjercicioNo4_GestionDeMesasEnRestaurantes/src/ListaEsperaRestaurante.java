public class ListaEsperaRestaurante {
    Grupo cabeza;
    Grupo cola;

    public void agregarGrupo(Grupo nuevo) {
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return;
        }

        Grupo actual = cabeza;
        do {
            System.out.println(actual.nombreReserva + ", Personas: " + actual.numeroPersonas + " , VIP: " + actual.esVip + ", Espera: " + actual.minutosEsperando + " min");
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void atenderSiguiente() {
        if (cabeza == null) {
            System.out.println("No hay grupos en espera.");
            return;
        }

        Grupo atendido = cabeza;

        System.out.println("\nAtendiendo grupo:");
        System.out.println(atendido.nombreReserva + ", Personas: " + atendido.numeroPersonas + ", VIP: " + atendido.esVip);

        if (cabeza == cola) {
            if (atendido.esVip) {
                System.out.println("Grupo VIP vuelve al final");
            } else {
                cabeza = null;
                cola = null;
                System.out.println("La lista esta vacia");
                return;
            }
        } else {
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;

            if (atendido.esVip) {
                cola.siguiente = atendido;
                atendido.siguiente = cabeza;
                cola = atendido;
                System.out.println("El grupo VIP vuelve al final");
            } else {
                System.out.println("El grupo atendido y retirado");
            }
        }

        System.out.println("\nEstado actual de la lista:");
        mostrar();
    }
}
