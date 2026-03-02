//Contador de estudiantes

public class Contador_de_estudiantes {

    public static void main(String[] args) {
        
        double[] notas = {3.5, 5.0, 2.8, 5.0, 4.3, 5.0, 3.9, 4.9, 3.1, 4.5, 5.0, 2.5};

        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 5.0) {
                contador++;
            }
        }

        System.out.println(contador + "  Estudiantes tienen 5.0 en su nota");

    }

}
