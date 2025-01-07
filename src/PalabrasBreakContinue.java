public class PalabrasBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y continue ***");

        //Ejemplo break, imprimir solo el primer número par
        System.out.println("Palabra Break: ");
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }
        }

        // Ejemplo con continue. Imprimir solo números pares, ignorar impares
        System.out.println("\npalabra continue: ");
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 1) { // nuemro impar
                continue; // Saltamos a la siguiente iteración
            }
            System.out.print(numero + " "); // numeros pares
        }
    }
}
