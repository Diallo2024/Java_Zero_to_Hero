import java.util.Scanner;

public class MatricesDos {
    public static void main(String[] args) {
        // Introducir valores en una matriz
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los renglones: ");
        var renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        var columnas  = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        // Solicitar valores
        for (var ren = 0; ren < renglones; ren++){
           for (var col = 0; col < columnas; col++){
               System.out.print("valor[" + ren + "][" + col + "] = ");
               matriz[ren][col] = Integer.parseInt(consola.nextLine());
           }
        }
        // Iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }

    }
}
