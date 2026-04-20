import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
        double[] precios = new double[5];
        Scanner datos = new Scanner(System.in);
        double total = 0;
        double masalta = precios[0];

        for(int i=1; i<=5; i++){
            System.out.print("Ingrese el precio " + i + ": ");
            precios[i] = datos.nextDouble();
        }

        

        for (double precio : precios) {
            total += precio;
            if (precio > masalta){
                masalta = precio;
            } 
        }

        System.out.println("Total sin descuento:" + total);
        System.out.println("El precio mas alto fue de : $" + masalta);
        
        if (total > 20000){
            System.out.println("Tienes un descuento de 2000");
            total -=2000;
        }

        System.out.println("El total a pagar es de: "+ total);

    }
}
