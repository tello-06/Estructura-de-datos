//Reto2

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        int[] listanegra = {50,120,450,800,999};
        
        int[] intentos = new int[8];

        double maximo = intentos[0];

        System.out.println("Ingrese los 8 IDS de acceso: ");

        for (int i=1; i<intentos.length; i++){
            System.out.print("ID No "+i+":");
            intentos[i] = datos.nextInt();
        }

        for (int i = 1; i < listanegra.length; i++) {
            if (listanegra[i] > maximo) {
                maximo = listanegra[i];
            }
        }

        System.out.println("El atacante tiene el ID: " + maximo);

        int inicio = 0;
        int fin = listanegra.length-1;
        boolean encontrar = false;

        while (inicio <= fin){
            int medio = (inicio + fin)/2;
            
            if (listanegra[medio] ==  maximo){
                encontrar = true;
                break;

            }

            else if(maximo < listanegra[medio]){
                fin = medio-1;
            }

            else{
                inicio = medio+1;
            }
        }

        if(encontrar==false){
            System.out.println("El atacante " + maximo + " ya se encuentra en la lista negra");
        }

        else{
            System.out.println("Nuevo atacante detectado procediendo a bloquear");
        }
    }
}
