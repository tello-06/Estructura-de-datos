//Sensor de temperatura

public class Sensor_de_Temperatura {

    public static void main(String[] args) {
        
        double[] temperaturas = {45.2, 47.8, 49.5, 42.5, 48.6, 46.9};

        double maxima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
            }
        }

        System.out.println("La temperatura maxima fue de: " + maxima + " grados");

    }

}
