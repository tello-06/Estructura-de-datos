// 4. Galería de Fotos
// Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente,
//  volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

// La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
// El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero.
//  Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve actual a la siguiente.
// Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria().
//  recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces,
//   marca la actual como favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.

public class App {
    public static void main(String[] args) throws Exception {
        GaleriaFotos galeria = new GaleriaFotos();

        galeria.agregarFoto(new Foto("Foto 1", "2026-01-01"));
        galeria.agregarFoto(new Foto("Foto 2", "2026-01-02"));
        galeria.agregarFoto(new Foto("Foto 3", "2026-01-03"));
        galeria.agregarFoto(new Foto("Foto 4", "2026-01-04"));
        galeria.agregarFoto(new Foto("Foto 5", "2026-01-05"));

        System.out.println("Estado inicial");
        galeria.mostrarGaleria();

        System.out.println("\nAvanzar 2 veces: ");
        galeria.siguiente();
        galeria.siguiente();

        System.out.println("\nMarcar como favorita: ");
        galeria.toggleFavorita();

        System.out.println("\nRetroceder 1 vez: ");
        galeria.anterior();

        System.out.println("\nEliminar actual: ");
        galeria.eliminarActual();

        System.out.println("\nEstado final: ");
        galeria.mostrarGaleria();
    }
    }
}
