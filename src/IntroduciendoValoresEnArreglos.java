import java.util.Scanner;

public class IntroduciendoValoresEnArreglos {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporciona los datos del array: ");
        var datoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos dinámicamente el array
        var enteros = new int[datoArreglo];

        // Ahora solicitamos los valores del array
        for (var i = 0; i < datoArreglo; i++){
            System.out.print("Proporciona entero[" + i + " = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // Vamos a imprimir cada uno de los valores del array
        System.out.println("\nImpresión del array: ");
        for (var i = 0; i < datoArreglo; i++)
            System.out.println("enteros[" + i + "] = " + enteros[i]);
    }
}
