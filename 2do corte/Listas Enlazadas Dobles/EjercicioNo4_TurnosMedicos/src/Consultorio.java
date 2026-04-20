public class Consultorio {
    Paciente cabeza;
    Paciente cola;

    public void agregarPaciente(Paciente nuevo) {

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            return;
        }

        if (nuevo.nivelUrgencia == 5) {
            nuevo.siguiente = cabeza.siguiente;

            if (cabeza.siguiente != null) {
                cabeza.siguiente.anterior = nuevo;
            }

            cabeza.siguiente = nuevo;
            nuevo.anterior = cabeza;

            if (cola == cabeza) {
                cola = nuevo;
            }

        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    public void mostrarPacientes() {
        Paciente temp = cabeza;

        while (temp != null) {
            System.out.println(temp.nombre + ", Edad: " + temp.edad + ", Urgencia: " + temp.nivelUrgencia);
            temp = temp.siguiente;
        }
    }

    public void pacienteMayorEdad() {
        if (cola == null) {
            System.out.println("No hay pacientes");
            return;
        }

        Paciente actual = cola;
        Paciente mayor = cola;

        while (actual != null) {
            if (actual.edad > mayor.edad) {
                mayor = actual;
            }
            actual = actual.anterior;
        }

        System.out.println("Paciente de mayor edad:");
        System.out.println(mayor.nombre + ", Edad: " + mayor.edad + ", Urgencia: " + mayor.nivelUrgencia);
    }
}
