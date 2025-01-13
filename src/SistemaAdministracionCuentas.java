import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        // Comenzar con la iteración del mnenu
        while (!salir){
            System.out.print("""
                    *** Sistema de administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opción:\s""");
            var opcion = consola.nextInt();
            // Evaluar cada opción
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta. . . \n");
                case 2 -> System.out.println("Eliminando tu cuenta. . . \n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. . .\n");
            }
        }
        System.out.println("Fin del sistema de Administración de Cuentas ");
    }
}
