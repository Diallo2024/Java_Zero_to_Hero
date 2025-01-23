import java.util.Scanner;

public class SistemaDesceuntosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de descuentos VIP ***");
        final var NO_PRODUCTOS_DESCEUNTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cauntos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes membresía en la tienda (true/false)? ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCEUNTO && tieneMembresia;

        System.out.println("Tienes acceso al descuento VIP ? " + esElegibleDescuento);

    }
}
