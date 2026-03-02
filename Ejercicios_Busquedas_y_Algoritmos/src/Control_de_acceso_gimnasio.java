//Control de Acceso gimnasio

import java.util.Scanner;

public class Control_de_acceso_gimnasio {

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

        datos.close();

    }

}
