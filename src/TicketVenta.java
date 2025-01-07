import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación Ticket de venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátano: ");
        var precioPlatano = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var desceuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calculo del subtotal (sin impestos)
        var subTotal = precioLeche + precioPan + precioLechuga +precioPlatano;

        // Aplicar descuento
        var descuento = subTotal * (desceuentoPorcentaje/100.0);

        // Subtotal con descuento
        var subTotalConDescuento = subTotal - descuento;

        // Calculo con impuesto (16%)
        var impuesto = subTotalConDescuento * 0.16;

        // Calculo total de la compra (con impuestos)
        var costototalCompra = subTotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                \t-----------------
                \tSubtotal: $%.2f
                \tDescuento: $%.2f (%d%%)
                \tImpuestos: (16%%): $%.2f
                \tCosto total de la compra: $%.2f
                
                """, subTotal, descuento, desceuentoPorcentaje, impuesto, costototalCompra);
    }
}
