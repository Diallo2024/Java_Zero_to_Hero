public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");

        // Operadores unarios incremento/decremento
        // Pre-incremento
        int a = 3, b = -2, resultado;
        var c = true;
        // Operador +
        resultado = +a;
        System.out.println("Resultado +a = " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("resultado = " + resultado);

        // Pre-incremento
        resultado = ++a;
        System.out.println("resultado pre-incremento = " + resultado);
        // Post incremento
        resultado = a++;
        System.out.println("resultado post-incremento = " + resultado);
        System.out.println("a = " + a);
    }
}
