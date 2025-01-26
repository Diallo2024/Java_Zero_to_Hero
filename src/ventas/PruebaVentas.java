package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa", 30.00);
        System.out.println(producto1);

        var producto2 = new Producto("Zapatos", 50.00);
        System.out.println(producto2);
    }
}
