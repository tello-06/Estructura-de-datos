//Notas de un curso
public class EjercicioNo9 {
    public static void main(String[] args) {

        double[] notasprofesor = {4.0, 2.5, 3.8, 4.5};

        double[] notascoordinador = notasprofesor;

        notascoordinador[1] = 3.0;

        System.out.println("Notas según el profesor:");
        for (int i = 0; i < notasprofesor.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notasprofesor[i]);
        }

        System.out.println("\nNotas según el coordinador:");
        for (int i = 0; i < notascoordinador.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notascoordinador[i]);
        }
    }
} 
