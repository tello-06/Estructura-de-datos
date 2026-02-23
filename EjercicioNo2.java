public class EjercicioNo2 {
    public static void main(String[] args) {

        double preciounidad;
        int cantidadcomprada;
        double descuentoporcentaje;
        double subtotal;
        double valordescuento;
        double totalpagar;

        preciounidad = 2500.0;
        cantidadcomprada = 4;
        descuentoporcentaje = 10.0;

        subtotal = preciounidad * cantidadcomprada;
        valordescuento = subtotal * (descuentoporcentaje / 100);
        totalpagar = subtotal - valordescuento;

        System.out.println("=== Calculadora de Tienda ===");
        System.out.println("Precio unitario: " + preciounidad);
        System.out.println("Cantidad comprada: " + cantidadcomprada);
        System.out.println("Descuento (%): " + descuentoporcentaje);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento aplicado: " + valordescuento);
        System.out.println("Total a pagar: " + totalpagar);
    }
}
