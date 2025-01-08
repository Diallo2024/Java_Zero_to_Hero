import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro de un rango ***");
        var consola = new Scanner(System.in);
        // Definir los límites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un valor entre 0 y 5: ");
        //var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        var dato = Integer.parseInt(consola.nextLine());
        // Verificar si el dato esta dentro de rengo
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango = " + estaDentroRango);

    }
}
