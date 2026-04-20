public class ListaDeReproduccion {
    Cancion cabeza;
    Cancion actual;

    public ListaDeReproduccion() {
        cabeza = null;
        actual = null;
    }

    public void agregarAlFinal(String titulo, String artista, int duracionSegundos, String genero) {
        Cancion nuevaCancion = new Cancion(titulo, artista, duracionSegundos, genero);

        if (cabeza == null) {
            cabeza = nuevaCancion;
            actual = nuevaCancion;
        } else {
            Cancion auxiliar = cabeza;
            while (auxiliar.siguiente != null) {
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente = nuevaCancion;
        }
    }

    public void agregarAContinuacion(String titulo, String artista, int duracionSegundos, String genero) {
        if (actual == null) {
            System.out.println("No hay canción actual.");
            return;
        }

        Cancion nuevaCancion = new Cancion(titulo, artista, duracionSegundos, genero);

        nuevaCancion.siguiente = actual.siguiente;
        actual.siguiente = nuevaCancion;
    }

    public void imprimirLista() {
        Cancion auxiliar = cabeza;

        while (auxiliar != null) {
            System.out.println("Título: " + auxiliar.titulo + ", Artista: " + auxiliar.artista + ", Duración: " + auxiliar.duracionSegundos + " seg" + ", Género: " + auxiliar.genero);
            auxiliar = auxiliar.siguiente;
        }
    }

    public void mostrarDuracionTotal() {
        Cancion auxiliar = cabeza;
        int totalSegundos = 0;

        while (auxiliar != null) {
            totalSegundos += auxiliar.duracionSegundos;
            auxiliar = auxiliar.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        String tiempoFormateado = String.format("%02d:%02d", minutos, segundos);

        System.out.println("Duración total de la lista: " + tiempoFormateado);
    }
}
