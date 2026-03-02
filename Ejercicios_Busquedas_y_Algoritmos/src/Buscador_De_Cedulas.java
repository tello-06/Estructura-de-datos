//Ejercicio de buscador de cedulas
import java.util.Scanner;

public class Buscador_De_Cedulas {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        int[] cedulas = {1001, 1020, 1050, 1100, 1200, 1300, 1400, 1500, 1600, 1700};

        System.out.print("Ingrese la cédula a buscar: ");
        int cedulaBuscada = datos.nextInt();

        int inicio = 0;
        int fin = cedulas.length - 1;
        int posicion = -1;

        // Búsqueda Binaria
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                posicion = medio;
                break;
            } else if (cedulaBuscada < cedulas[medio]) {
                fin = medio - 1; 
            } else {
                inicio = medio + 1; 
            }
        }

        if (posicion != -1) {
            System.out.println("Cliente encontrado en la posición: " + posicion);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        datos.close();

    }

}
