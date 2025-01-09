public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Imapres ***");

        var contador = 0;
        do {
            // Revisar is no es par
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        }while (contador <= 20);
    }
}
