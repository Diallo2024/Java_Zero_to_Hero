public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4, 5); // varargs
    }

     static void imprimirNumeros(int ... numeros) {
        for (var i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
