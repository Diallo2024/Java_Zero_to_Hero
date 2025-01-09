import java.util.Locale;

public class MetodosString {
    public static void main(String[] args) {
        String mensaje = "Bienvenido a Java";

        //Obtener la longitud de la cadena
        int longitud = mensaje.length();
        System.out.println("mensaje = " + mensaje);
        System.out.println("longitud = " + longitud);

        //Convertir a mayusculas
        String mayusculas = mensaje.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir en subcadena
        String subcadena = mensaje.substring(11);
        System.out.println("subcadena = " + subcadena);

        //Reemplazar caracteres
        String reemplazada = mensaje.replace("Java", "el curso");
        System.out.println("reemplazada = " + reemplazada);

    }
}
