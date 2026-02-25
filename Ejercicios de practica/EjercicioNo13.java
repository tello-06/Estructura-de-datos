//Clasificacion de residuos(no lineal)
public class EjercicioNo13 {

    static class NodoResiduo {
        String nombre;
        NodoResiduo izquierdo;
        NodoResiduo derecho;

        NodoResiduo(String nombre) {
            this.nombre = nombre;
        }
    }

    static void imprimir(NodoResiduo nodo, int nivel) {
        if (nodo == null) return;

        String sangria = "  ".repeat(nivel);
        System.out.println(sangria + "Nivel " + nivel + ": " + nodo.nombre);

        imprimir(nodo.izquierdo, nivel + 1);
        imprimir(nodo.derecho,   nivel + 1);
    }

    public static void main(String[] args) {

        NodoResiduo raiz       = new NodoResiduo("Residuos");
        NodoResiduo organicos  = new NodoResiduo("Orgánicos");
        NodoResiduo inorganicos= new NodoResiduo("Inorgánicos");
        NodoResiduo comida     = new NodoResiduo("Comida");
        NodoResiduo jardin     = new NodoResiduo("Jardín");
        NodoResiduo plastico   = new NodoResiduo("Plástico");
        NodoResiduo papel      = new NodoResiduo("Papel");

        raiz.izquierdo        = organicos;
        raiz.derecho          = inorganicos;
        organicos.izquierdo   = comida;
        organicos.derecho     = jardin;
        inorganicos.izquierdo = plastico;
        inorganicos.derecho   = papel;

        imprimir(raiz, 0);
    }
}
