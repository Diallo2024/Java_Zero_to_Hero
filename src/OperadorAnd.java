public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador and ***");
        boolean a = true, b = false;
        var resultado = a && b;
        System.out.println("resultado a && b = false: " + resultado);
        boolean c = true, d = true;
        var resultado2 = a && b;
        System.out.println("resultado2 a && b = true: " + resultado2);
    }
}
