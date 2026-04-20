public class ColaDeVuelos {
    Vuelo cabeza;

    public ColaDeVuelos() {
        cabeza = null;
    }

    public void insertarVuelo(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        Vuelo nuevoVuelo = new Vuelo(numeroVuelo, aerolinea, combustibleRestante, pasajeros);

        if (combustibleRestante < 10) {
            nuevoVuelo.siguiente = cabeza;
            cabeza = nuevoVuelo;
        } else {
            if (cabeza == null) {
                cabeza = nuevoVuelo;
            } else {
                Vuelo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoVuelo;
            }
        }
    }

    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.numeroVuelo.equals(numeroVuelo)) {
            return;
        }

        Vuelo anterior = cabeza;
        Vuelo actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.numeroVuelo.equals(numeroVuelo)) {

                anterior.siguiente = actual.siguiente;

                actual.siguiente = cabeza;
                cabeza = actual;

                System.out.println("Vuelo " + numeroVuelo + " movido a prioridad de emergencia.");
                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        System.out.println("Vuelo no encontrado.");
    }

    public void imprimirCola() {
        Vuelo actual = cabeza;

        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo + ", Aerolínea: " + actual.aerolinea + ", Combustible: " + actual.combustibleRestante + ", Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }
}
