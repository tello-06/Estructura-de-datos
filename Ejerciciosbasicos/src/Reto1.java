import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
        double[] precios = new double[5];
        Scanner datos = new Scanner(System.in);
        int total = 0;
        double masalta = precios[0];
        double masbaja = precios[0];

        for(int i=1; i<=5; i++){
            System.out.print("Ingrese el precio " + i + ": ");
            precios[i] = datos.nextInt();
            total += precios[i];
        }

        

        for (int i = 0; i < precios.length; i++) {
            total += precios[i];
            if (precios[i] > masalta){
                masalta = precios[i];
            } 
            if (precios[i] < masbaja){
                masbaja = precios[i];
            } 
        }

        System.out.println("El precio mas alto fue de : $" + masalta);




    }
}
