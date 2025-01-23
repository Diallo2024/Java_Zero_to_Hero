import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        // Suma Diagonal Matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);

        // Definimos la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        // Solicitamos los valores
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Valor [" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // Suma diagonal de la matriz
        System.out.println();
        var sumaDiagonal = 0;
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                if (ren == col)
                    sumaDiagonal+= matriz[ren][col];
            }
        }
        // Imprimimos nuestra sumaDiagonal
        System.out.println("La suma Diagonal de la Matriz es: " + sumaDiagonal);

    }
}
