public class Ruleta {

    private Participante cabeza;
    private Participante actual;

    public void inscribir(String nombre, int boleto) {

        if (nombre.trim().isEmpty()) {
            System.out.println("invalido, el nombre no puede estar vacio.");
            return;
        }

        if (boleto <= 0) {
            System.out.println("invalido, el boleto debe ser mayor que 0.");
            return;
        }

        Participante nuevo = new Participante(nombre, boleto);

        if (cabeza == null) {

            cabeza = nuevo;
            actual = nuevo;

            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;

        } else {

            Participante ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }

        System.out.println("participante inscrito");
    }

    public void girar() {

        if (actual == null) {
            System.out.println("no hay participantes");
            return;
        }

        actual = actual.siguiente;

        System.out.println("(Girar) turno actual: "
                + actual.nombre
                + " (Boleto #" + actual.boleto + ")");
    }

    public void retroceder() {

        if (actual == null) {
            System.out.println("no hay participantes");
            return;
        }

        actual = actual.anterior;

        System.out.println("(Retroceder) turno actual: "
                + actual.nombre
                + " (Boleto #" + actual.boleto + ")");
    }

    public void verTodos() {

        if (cabeza == null) {
            System.out.println("no hay participantes");
            return;
        }

        System.out.println("--- Todos los participantes ---");

        Participante temp = cabeza;

        do {

            System.out.print(temp.nombre);

            temp = temp.siguiente;

            if (temp != cabeza) {
                System.out.print(" <-> ");
            }

        } while (temp != cabeza);

        System.out.println(" <-> (Vuelve a " + cabeza.nombre + ")");
    }
}