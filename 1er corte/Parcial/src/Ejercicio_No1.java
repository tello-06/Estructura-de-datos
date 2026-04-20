
import java.util.Scanner;

public class Ejercicio_No1 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int[] pesos = new int[7];

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Ingrese el peso No " + (i + 1) + ": ");
            pesos[i] = datos.nextInt();
        }

        int n = pesos.length;

        //ordenamiento short shell
        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                int temp = pesos[i];
                int j = i;

                while (j >= gap && pesos[j - gap] < temp) {
                    pesos[j] = pesos[j - gap];
                    j -= gap;
                }

                pesos[j] = temp;
            }
        }

        System.out.println("\nPesos ordenados de mayor a menor: ");
        System.out.print("[");
        for (int i = 0; i < pesos.length; i++) {
            System.out.print(pesos[i]);
            if (i < pesos.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("\nIngrese el peso a buscar: ");
        int buscar = datos.nextInt();

        boolean encontrado = false;

        //Busqueda lineal
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] == buscar) {
                System.out.println("Peso encontrado en la posicion: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Peso no encontrado.");
        }
        
        System.out.println("\nEl peso máximo levantado fue: " + pesos[0]);
    }
}