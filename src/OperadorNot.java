import java.sql.SQLOutput;

public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador not ***");
        boolean a = true;
        // operador not ! (invertir el valor logico)
        var resultado = !a;
        System.out.println("resultado = " + resultado);
    }
}
