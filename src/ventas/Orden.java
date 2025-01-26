package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int conadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.conadorProductos < Orden.MAX_PRODUCTOS)
        this.productos[this.conadorProductos++] = producto;
        else
            System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        double total = 0;
        for (var i = 0; i < this.conadorProductos; i++){
          var producto = this.productos[i];
          total += producto.getPrecio(); // total = total + producto.getPrecio()
        }
        return total;
    }
}
