public class TiendaLinea {
    public static void main(String[] args) {
        // Detalle del producto
        System.out.println("*** Tienda en Linea (Detalle producto) ***");
        String nombreProducto = "Macbook pro";
        double precioProducto = 1000.50;
        int cantidadDisponible = 20;
        boolean disponibleVenta = true;

        //Imprimir el detalle del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        //Modic¡ficar los valores
        nombreProducto = "mLaptop HP";
        precioProducto = 900.5;
        cantidadDisponible = 15;
        disponibleVenta = false;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);


    }
}
