public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterar los valores
        var numero = 1;
        while (numero <= MAXIMO){
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numer) -> " + acumuladorSuma + " " + numero);

            // Realizar la suma acumulativa
            acumuladorSuma += numero++; // acumuladorSuma = acumuladorSuma + nuemro

            // Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("La suma de los primeros " + MAXIMO + " números es igual a: " + acumuladorSuma);
    }
}
