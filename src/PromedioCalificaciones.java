import java.util.Scanner;

public class PromedioCalificaciones {
        public static void main(String[] args) {
            System.out.println("*** Promedio de Calificaciones ***");
            var consola = new Scanner(System.in);
            System.out.println("Cuantas calificaciones deseas agregar?");
            var totalCalificaciones = Integer.parseInt(consola.nextLine());

            // Ahora vamos a generar el array
            var calificiones = new int[totalCalificaciones]; // aquí precisamos que el array sera del tamaño de las calificacions

            // Ahora solicitamos los valores de las calificaciones
            for (var i = 0; i < totalCalificaciones; i++){
                System.out.println("calificaciones[" + i + "] = ");
                calificiones[i] = Integer.parseInt(consola.nextLine());
            }
            // Vamos a sacar el promedio de las calificaciones
            var sumaCalificaciones = 0;
            for (var i = 0; i < totalCalificaciones; i++){
                sumaCalificaciones += calificiones[i];
                // sumaPromedio = sumaPromedio + calificaciones[i]
            }
            var promedio = sumaCalificaciones / totalCalificaciones;
            System.out.println("\nEl pormedio de las calificaciones es: " + promedio);
        }
    }



