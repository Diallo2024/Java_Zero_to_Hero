import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un Triangulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el número de filas: ");
        var nuemroFilas = consola.nextInt();

        // Iteramos sobre cada fila del triángulo
        for (var fila = 1; fila <= nuemroFilas; fila++){
            var espaciosBlanco = " ".repeat(nuemroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }

    }
}
