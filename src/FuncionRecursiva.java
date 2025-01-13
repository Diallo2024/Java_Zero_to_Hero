public class FuncionRecursiva {
    // Imprimir del 1 al 10 con la función recursiva
    // Definimos la función
    static void funcionRecursiva (int numero){
        // El caso de la base
        if (numero == 1)
            System.out.print(numero + " ");
        else {
            // El caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
    funcionRecursiva(10);
    }
}
