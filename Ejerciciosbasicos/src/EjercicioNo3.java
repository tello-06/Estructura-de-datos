//Sensor de temperatura
public class EjercicioNo3 {
    public static void main(String[] args) {

        double temperaturaactual;
        String sensor;
        int lectura;
        boolean enAlarma;

        temperaturaactual = 75.5;
        sensor = "Sensor Industrial";
        lectura = 12;

        if (temperaturaactual > 80) {
            enAlarma = true;
        } 
        else {
            enAlarma = false;
        }

        // Mostrar información
        System.out.println(" Estado del Sensor ");
        System.out.println("Nombre del sensor: " + sensor);
        System.out.println("Número de lectura: " + lectura);
        System.out.println("Temperatura actual: " + temperaturaactual + " °C");
        System.out.println("En alarma: " + enAlarma);
    }
}