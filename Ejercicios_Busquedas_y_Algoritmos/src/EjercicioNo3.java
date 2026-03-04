// Sensor de temperatura

// Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

// El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada 
// para asegurarse de que la máquina no se recalentó.
// Algoritmo a usar: Búsqueda Lineal de Máximo. 
// Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.

public class EjercicioNo3 {

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
