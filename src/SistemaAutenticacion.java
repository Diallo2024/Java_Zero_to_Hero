import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        final var USUARIO_VALIDO = "admin";
        final var   PASSWORD_VALIDO = "1234";

        var consola = new Scanner(System.in);

        System.out.print("Cual es tu usuario? ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("Cual es tu password? ");
        var passwordIngresado = consola.nextLine();

        var sonDatosCorrectos = usuarioIngresado.equals(USUARIO_VALIDO) && passwordIngresado.equals(PASSWORD_VALIDO);

        System.out.println("Datos son correcto: " + sonDatosCorrectos);
    }
}
