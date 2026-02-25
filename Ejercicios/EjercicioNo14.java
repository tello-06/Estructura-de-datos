//Arbol de empleados(no lineal)

import java.util.LinkedList;
import java.util.Queue;

public class EjercicioNo14 {
    static class NodoEmpleado {
        String cargo;
        NodoEmpleado izquierdo;
        NodoEmpleado derecho;

        NodoEmpleado(String cargo) {
            this.cargo = cargo;
        }
    }

    static void imprimirPorNiveles(NodoEmpleado raiz) {
        if (raiz == null) return;

        Queue<NodoEmpleado> cola = new LinkedList<>();
        cola.add(raiz);
        int nivel = 0;

        while (!cola.isEmpty()) {
            int nodosPorNivel = cola.size(); // 
            System.out.print("Nivel " + nivel + ": ");

            for (int i = 0; i < nodosPorNivel; i++) {
                NodoEmpleado actual = cola.poll();
                System.out.print(actual.cargo);
                if (i < nodosPorNivel - 1) System.out.print(", ");

                if (actual.izquierdo != null) cola.add(actual.izquierdo);
                if (actual.derecho   != null) cola.add(actual.derecho);
            }

            System.out.println();
            nivel++;
        }
    }

    public static void main(String[] args) {

        NodoEmpleado gerente     = new NodoEmpleado("Gerente");
        NodoEmpleado sup1        = new NodoEmpleado("Supervisor1");
        NodoEmpleado sup2        = new NodoEmpleado("Supervisor2");
        NodoEmpleado analista1   = new NodoEmpleado("Analista1");
        NodoEmpleado analista2   = new NodoEmpleado("Analista2");

        gerente.izquierdo = sup1;
        gerente.derecho   = sup2;
        sup1.izquierdo    = analista1;
        sup1.derecho      = analista2;

        imprimirPorNiveles(gerente);
    }
}
