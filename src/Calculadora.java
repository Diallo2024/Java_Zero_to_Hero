import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       var consola = new Scanner(System.in);
       double operando1 = 0, operando2 = 0, resultado;
       var salir = false;

       // Ciclo para la aplicación de calculadora
        while (!salir) {
            System.out.print("""
                    *** Calculadora en Java ***
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge un aopción: \s""");
            var opcion = consola.nextInt();

            if (opcion >=1 && opcion <= 4) {
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch (opcion){
                case 1 -> { // Suma
                    resultado = operando1 + operando2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n", resultado);
                }
                case 2 -> { // Resta
                    resultado = operando1 - operando2;
                    System.out.printf("El resultado de la resta es: %.2f%n%n", resultado);
                }
                case 3 -> { // Multiplicación
                    resultado = operando1 * operando2;
                    System.out.printf("el resultado de la multiplicación es: %.2f%n%n", resultado);
                }
                case 4 -> { // División
                    if (operando2 != 0) {
                        resultado = operando1 / operando2;
                        System.out.printf("El resultado de la división es: %.2f%n%n", resultado);
                    }
                    else
                        System.out.println("Error: División entre cero.\n");
                }
                case 5 -> { // Salir
                    System.out.println("Saliendo del programa de calculadora!");
                    salir = true;
                }
                default -> System.out.println("La opción est inválida, " + "selecciona otra opción ...\n");
            }
        }
    }
}
