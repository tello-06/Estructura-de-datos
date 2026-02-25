//Inventario compartido
public class EjercicioNo7 {
    public static void main(String[] args) {

        int[] stockalmacen = {10, 20, 15, 8, 12};

        int[] stockreportes = stockalmacen;

        stockreportes[1] = stockreportes[1] - 5;

        System.out.println("Stock desde almacén:");
        for (int i = 0; i < stockalmacen.length; i++) {
            System.out.println("Producto " + i + ": " + stockalmacen[i]);
        }

        System.out.println("\nStock desde reportes:");
        for (int i = 0; i < stockreportes.length; i++) {
            System.out.println("Producto " + i + ": " + stockreportes[i]);
        }

        //esto pasa pq los arrays son objetos en java
        // y ambos tienen la misma direccion de memoria
    }
}
