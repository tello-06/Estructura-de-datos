//Historial de ventas(lineal)
public class EjercicioNo12 {
    public static void main(String[] args) {

        double[] ventas = {150.50, 320.00, 89.99, 450.75, 210.30, 99.00, 375.20};

        double total = 0;
        double masalta = ventas[0];
        double masbaja = ventas[0];

        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
            if (ventas[i] > masalta){
                masalta = ventas[i];
            } 
            if (ventas[i] < masbaja){
                masbaja = ventas[i];
            } 
        }

        System.out.println("Venta más alta : $" + masalta);
        System.out.println("Venta más baja : $" + masbaja);
        System.out.printf("Total del día  : $%.2f%n", total);
    }
}
