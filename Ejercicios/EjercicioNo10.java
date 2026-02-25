//Copiando configuracion
public class EjercicioNo10 {
    public static void main(String[] args) {

        int[] configuracion = {1920, 1080, 60};

        int[] copia = new int[configuracion.length];

        for (int i = 0; i < configuracion.length; i++) {
            copia[i] = configuracion[i];
        }

        copia[2] = 120; 

        System.out.println("Configuración original:");
        for (int i = 0; i < configuracion.length; i++) {
            System.out.print(configuracion[i] + " ");
        }

        System.out.println("\nConfiguración copia:");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + " ");
        }
    }
}
