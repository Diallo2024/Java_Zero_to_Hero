package excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if (denominador == 0)
            throw new RuntimeException("Division entre Zero");
            return numerador / denominador;
    }
}
