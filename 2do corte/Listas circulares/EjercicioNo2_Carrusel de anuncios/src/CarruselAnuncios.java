public class CarruselAnuncios {
    Anuncio cabeza;
    Anuncio cola;

    public CarruselAnuncios() {
        cabeza = null;
        cola = null;
    }

    public void ponerAlFinal(Anuncio nuevo) {
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
            System.out.println("no hay anuncios");
            return;
        }

        Anuncio actual = cabeza;
        do {
            System.out.println(actual.titulo + ", " + actual.categoria + ", Duración: " + actual.duracionSegundos + "s, Repetido: " + actual.vecesRepetido);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("no hay anuncios que reproducir");
            return;
        }

        int tiempoTotal = 0;
        Anuncio actual = cabeza;
        Anuncio masRepetido = cabeza;

        for (int i = 0; i < ciclos; i++) {
            System.out.println("\n Ciclo " + (i + 1));

            do {
                actual.vecesRepetido++;
                tiempoTotal += actual.duracionSegundos;

                System.out.println("Mostrando: " + actual.titulo + " (" + actual.categoria + ")");

                if (actual.vecesRepetido > masRepetido.vecesRepetido) {
                    masRepetido = actual;
                }

                actual = actual.siguiente;

            } while (actual != cabeza);
        }

        System.out.println("\nAnuncio más repetido:");
        System.out.println(masRepetido.titulo + ", veces: " + masRepetido.vecesRepetido);

        System.out.println("tiempo total en pantalla: " + tiempoTotal + " segundos");
    }
}
