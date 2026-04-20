public class Ejerciciono2{

    public static void main(String[] args) {

        double preciounidad;
        int cantidadComprada;
        double descuentoPorcentaje;
        double subtotal;
        double valorDescuento;
        double totalPagar;

        preciounidad = 2500.0;
        cantidadComprada = 4;
        descuentoPorcentaje = 10.0;

        subtotal = preciounidad * cantidadComprada;
        valorDescuento = subtotal * (descuentoPorcentaje / 100);
        totalPagar = subtotal - valorDescuento;

        System.out.println(" Valor a pagar ");
        System.out.println("Precio unitario: " + preciounidad);
        System.out.println("Cantidad comprada: " + cantidadComprada);
        System.out.println("Descuento (%): " + descuentoPorcentaje);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento aplicado: " + valorDescuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}