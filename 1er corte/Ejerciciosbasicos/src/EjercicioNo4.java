//Placa de un vehiculo
public class EjercicioNo4 {
    public static void main(String[] args) {

        String placa;
        int aniofabricacion;
        int cilindraje;
        double precio;
        char inicialcolor;
        boolean soat;

        placa = "ELO189";
        aniofabricacion = 2022;
        cilindraje = 1600;
        precio = 85000000.0;
        inicialcolor = 'B'; 
        soat = true;

        System.out.println(" Info del Vehículo ");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + aniofabricacion);
        System.out.println("Cilindraje (cc): " + cilindraje);
        System.out.println("Precio de compra: " + precio);
        System.out.println("Inicial del color: " + inicialcolor);
        System.out.println("SOAT vigente: " + soat);
    }
}
