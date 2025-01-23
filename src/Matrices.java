public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz
        //int[][] matriz = new int[2][3];
        var matriz = new int[2][3];

        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Acceso a los valores de la matriz
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 2 [0][1] = " + matriz[0][1]);
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);

    }
}
