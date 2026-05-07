public class Cartelera {
    private Pelicula cabeza;

    public void agregarPelicula(String titulo, String genero, int duracion) {
        if (titulo.trim().isEmpty()) {
            System.out.println("invalido, el título no puede estar vacío.");
            return;
        }

        if (duracion <= 0) {
            System.out.println("invalido, la duración debe ser mayor que 0");
            return;
        }

        Pelicula nueva = new Pelicula(titulo, genero, duracion);

        if (cabeza == null) {
            cabeza = nueva;
        } else {
            Pelicula actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nueva;
        }

        System.out.println("Pelicula agregada");
    }

    public void buscarPorTitulo(String titulo) {
        Pelicula actual = cabeza;

        while (actual != null) {
            if (actual.titulo.equalsIgnoreCase(titulo)) {
                System.out.println("Película encontrada");
                System.out.println("Título: " + actual.titulo);
                System.out.println("Género: " + actual.genero);
                System.out.println("Duración: " + actual.duracion + " min");
                return;
            }

            actual = actual.siguiente;
        }

        System.out.println("esta pelicula no esta en el cine");
    }

    public void verCartelera() {
        if (cabeza == null) {
            System.out.println("No hay peliculas en cartelera de momento");
            return;
        }

        Pelicula actual = cabeza;
        int total = 0;

        System.out.println("--- Cartelera de hoy ---");

        while (actual != null) {
            System.out.println("[" + actual.titulo + ", " + actual.genero + ", " + actual.duracion + " min]");
            total += actual.duracion;
            actual = actual.siguiente;
        }

        System.out.println("DURACIÓN TOTAL: " + total + " minutos");
    }
}