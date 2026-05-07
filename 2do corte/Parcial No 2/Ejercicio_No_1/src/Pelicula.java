public class Pelicula {
    String titulo;
    String genero;
    int duracion;
    Pelicula siguiente;

    public Pelicula(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.siguiente = null;
    }
}





































// objetivo: gesionar una lista de peliculas con listas circulares dobles
// ¿que debes hacer? 
// 1. estructura(3 archivos): participante.java (nodo), Ruleta.java(logica) y App.java(Menu). 
// 2. Menu interactivo: implemente un switch con: 
// a. inscribir participante: insertar al final con nombre y numero de boleto (manteniendo circularidad doble). 
// b. Girar(siguiente): avanzar al nodo siguiente y mostrar quien esta en turno 
// c. Retroceder (anterior): moverse al nodo anterior y mostrar quien esta en turno
// d. ver todos: listar todos los participantes, debe evidenciarse el ciclo
// por ejemplo: ana <-> Maria <-> (Vuelve a Ana). 
// 3. validacion: no permitir titulos vacios ni duraciones menores o iguales a 0. 

// ejemplo de consola:
// [Girar >>] turno actual: Luis(Boleto #47)
// --- Todos los participantes ---
// ana <-> Luis <-> Maria <-> (Vuelve a Ana)