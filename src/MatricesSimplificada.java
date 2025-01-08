public class MatricesSimplificada {
    public static void main(String[] args) {
        // Definir una matriz de manera mucho más simplificada
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };
        // Recooremos la matriz
        // 1. ciclo mas externo para recorrer los renglones
        for (var ren = 0; ren < matriz.length; ren++){

            //2. ciclo mas interno para recorrer las columnas
            for (var col = 0; col < matriz.length; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
