import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Receta de cocina ***");
        var consola = new Scanner(System.in);

        //Nombre de la receta
        System.out.print("Ingresa el nombre de la Receta: ");
        var nombreReceta = consola.nextLine();

        //Ingredientes principales
        System.out.print("Ingresa los Ingredientes: ");
        var ingredientes = consola.nextLine();

        //Tiempo de preparación
        System.out.print("Ingresa el Tiempo de preparación en minutos: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // dificultad
        System.out.print("Ingresa la dificultad (Fácil, Medio, Alta): ");
        var dificultad = consola.nextLine();

        //Imprimir los valores de la receta.
        System.out.println("\n---Receta de Cocina ---");
        System.out.println("\tNombre receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos ");
        System.out.println("\tDificultad : " + dificultad);

    }
}
