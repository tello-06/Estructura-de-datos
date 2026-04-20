//Regustro de temperaturas semanales(lineal)
public class EjercicioNo15 {
    public static void main(String[] args) {

        String[] dias  = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        double[] temps = {28.5, 30.0, 27.3, 31.2, 29.8, 33.1, 26.4};

        double suma = 0;
        for (double t : temps) suma += t;
        double promedio = suma / temps.length;

        System.out.println("Promedio semanal: " + promedio + "°C\n");

        System.out.println("Días por encima del promedio:");
        for (int i = 0; i < temps.length; i++) {
            String estado = "";
            if (temps[i] > promedio) {
                estado = " (sobre el promedio)";
            }
            System.out.println("  " + dias[i] + ": " + temps[i] + "°C" + estado);
        }
    }
}
