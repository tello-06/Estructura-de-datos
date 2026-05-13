public class PilaEstaciones {

    private Estacion tope;
    private int tamanio;

    public PilaEstaciones() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {

        return tope == null;
    }

    public void push(Estacion nueva) {

        nueva.siguiente = tope;
        tope = nueva;
        tamanio++;
    }

    public Estacion pop() {

        if (estaVacia()) {

            return null;
        }

        Estacion aux = tope;

        tope = tope.siguiente;

        aux.siguiente = null;

        tamanio--;

        return aux;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("No hay estaciones registradas");
            return;
        }

        Estacion actual = tope;

        System.out.println("--- ESTACIONES DE SEGURIDAD ---");

        while (actual != null) {

            System.out.println(actual);
            actual = actual.siguiente;
        }
    }

    // MÉTODO DEL RETO
    public void retrocederASuperficie() {

        if (estaVacia()) {

            System.out.println("No hay estaciones registradas");
            return;
        }

        System.out.println("EMPEZANDO RETORNO A LA SUPERFICIE...");

        while (!estaVacia()) {

            Estacion actual = pop();

            System.out.println("Pasando por estación: " + actual.nombrePunto);

            if (actual.nivelOxigeno < 18) {

                System.out.println("ALERTA: Uso de Tanque de Emergencia Requerido");
            }
        }
        System.out.println("El equipo ha salido de la cueva");
    }
}