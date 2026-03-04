// Control de Acceso gimnasio

// Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. 
// La lista está ordenada de menor a mayor.

// El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". 
// Si no está, se le niega la entrada.
// Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.

import java.util.Scanner;

public class EjercicioNo4 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        int[] codigos = {100, 200, 300, 400, 500, 600, 700};

        System.out.print("Ingrese su código de acceso: ");
        int codigo = datos.nextInt();

        int inicio = 0;
        int fin = codigos.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (codigos[medio] == codigo) {
                encontrado = true;
                break;
            } else if (codigo < codigos[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (encontrado) {
            System.out.println("Acceso permitido, pago al dia");
        } else {
            System.out.println("Acceso denegado, pago atrasado");
        }
    }
}
