//Lista de pasajeros(lineal)
public class EjercicioNo11 {
    public static void main(String[] args) {

        String[] pasajeros = new String[6];

        pasajeros[0] = "Andres";
        pasajeros[1] = "Carlos";
        pasajeros[2] = null;           
        pasajeros[3] = "Javier";
        pasajeros[4] = "Yohan";
        pasajeros[5] = null;           

        int ocupados = 0;

        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null) {
                System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);
                ocupados++;
            } else {
                System.out.println("Asiento " + (i + 1) + ": LIBRE");
            }
        }

        System.out.println("\nAsientos ocupados: " + ocupados + " de " + pasajeros.length);
    }
}
