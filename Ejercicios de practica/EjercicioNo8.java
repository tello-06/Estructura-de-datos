//Historial de mensajes
public class EjercicioNo8 {
    public static void main(String[] args) {

        String ultimomensaje = "Hola";
        String copiatexto = ultimomensaje;

        copiatexto = "¿Cómo estas?";

        // Mostramos ambas variables
        System.out.println("Último mensaje: " + ultimomensaje);
        System.out.println("Copia texto: " + copiatexto);

        //los strings en java no pueden cambiar
        //simplemente se asigna en otra direccion de memoria la nueva variable
    }
}
