public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de asignación compuesto ***");
        var miNumero = 10;
        // +=
        miNumero += 5;
        System.out.println("miNumero = " + miNumero);
        // *=
        miNumero *= 2;
        System.out.println("miNumero = " + miNumero);
        // Asignación de variables multiples
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
