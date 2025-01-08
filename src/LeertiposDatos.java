import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;

public class LeertiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US); // Configurar el formato numérico para usar el punto decimal

        System.out.print("Introduce tu edad: ");
        var edad = consola.nextInt();
        consola.nextLine(); // Limpiar el buffer de entrada
        System.out.println("edad = " + edad);

        //Leer un tipo decimal
        System.out.print("Ingresa tu altura (usa un punto para los decimales): ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        //Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //Conversion de datos
        System.out.print("proporciona un valor entero: ");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        //Tipo flotante
        System.out.print("Ingresa un valor de tipo flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

    }
}
