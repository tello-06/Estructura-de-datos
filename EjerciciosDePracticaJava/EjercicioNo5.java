//Conversor de unidades
public class EjercicioNo5 {
    public static void main(String[] args) {

        double tazas;
        double mililitros;
        double litros;

        tazas = 3.5;

        mililitros = tazas * 236.588;
        litros = mililitros / 1000;

        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros + " ml");
        System.out.println("Litros: " + litros + " L");
    }
}
