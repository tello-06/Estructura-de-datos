import java.util.ArrayList;

public class PlanificadorCPU {
    Proceso cabeza;
    Proceso cola;

    public void agregarProceso(Proceso nuevo) {
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
            System.out.println("No hay procesos");
            return;
        }

        Proceso actual = cabeza;
        do {
            System.out.println(actual.nombre + ", PID: " + actual.pid +", Tiempo: " + actual.tiempoRestante + ", Prioridad: " + actual.prioridad);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos para ejecutar");
            return;
        }

        ArrayList<String> ordenFinalizacion = new ArrayList<>();
        Proceso actual = cabeza;
        Proceso anterior = cola;

        System.out.println("\nEjecución Round Robin");

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre +", (PID: " + actual.pid + ")");

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante <= 0) {
                System.out.println("Proceso terminado: " + actual.nombre);
                ordenFinalizacion.add(actual.nombre);

                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                    break;
                } else {
                    anterior.siguiente = actual.siguiente;

                    if (actual == cabeza) {
                        cabeza = actual.siguiente;
                        cola.siguiente = cabeza;
                    }

                    if (actual == cola) {
                        cola = anterior;
                    }

                    actual = actual.siguiente;
                }
            } else {
                System.out.println("Tiempo restante: " + actual.tiempoRestante);
                anterior = actual;
                actual = actual.siguiente;
            }
        }
        System.out.println("\nOrden de finalización:");
        for (String nombre : ordenFinalizacion) {
            System.out.println(nombre);
        }
    }
}
