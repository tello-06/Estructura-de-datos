//Ejercicio Cajero de Supermercado
import java.util.Scanner;

public class Cajero_De_Supermercado {
    public static void main(String[] args){

        Scanner datos = new Scanner(System.in);

        int[] productos = {45012, 770123, 99887, 12345, 55667, 89012, 33445};

        System.out.print("Ingrese el código de barras a buscar: ");
        int codigo = datos.nextInt();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == codigo) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Producto encontrado en la posición: " + posicion);
        } else {
            System.out.println("Producto no encontrado en la estantería");
        }

        datos.close();

    }
}
