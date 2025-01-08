import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo Área y Perímetro Rectangulo ***");
       var consola = new Scanner(System.in);

        System.out.print("Base rectángulo: ");
        var baseRectangulo = Integer.parseInt(consola.nextLine());

        System.out.print("Altura rectángulo: ");
        var alturaRectangulo = Integer.parseInt(consola.nextLine());

        // Realizamos el cálculo del área
        var areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println(" El área del rectangulo es: " + areaRectangulo);

        // Realizamos el cálculo del perímetro
        var perimetro = 2 * (baseRectangulo + alturaRectangulo);
        System.out.println(" El perímetro del rectángulo es: " + perimetro);

    }
}
