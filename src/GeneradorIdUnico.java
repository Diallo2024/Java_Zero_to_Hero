import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Systema Generador de ID único ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        // Solicitamos el nombre
        System.out.print("Cual es tu nomnre?: ");
        var nombre = consola.nextLine();

        // Solicitamos el apellido
        System.out.print("Cuales es tu apellido?: ");
        var apellido = consola.nextLine();

        // Año de nacimiento
        System.out.print("Cual es tu año de nacimiento (YYYY)?: ");
        var anioNacimiento = consola.nextLine();

        // Vamos a normalizar los datos de la persona
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
        var anioNacimiento2 = anioNacimiento.trim().substring(2);

        // Generar numero aleatorio entre (1 y 9999)
        var numeroAleatorio = random.nextInt(9999) + 1;

        // Formato de 4 digitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        // Generar ID único
        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        // Imprimir el id unico
        System.out.printf("""
                %nHola %s
                \tTu nuevo identificador (ID) generado por el sistema es:
                \t%s
                \t¡Felicidades!
                """, nombre, idUnico);




    }
}
