public class ClaseConstructor {
    String sabor;
    int tamaño;

    // El constructor para crear una galleta y tamaño
    public ClaseConstructor(String saborInicial, int tamañoInicial){
        this.sabor = saborInicial;
        this.tamaño = tamañoInicial;
    }
    void mostrarInfo(){
        System.out.println("Sabor: " + sabor + ", Tamaño " + tamaño);
    }

    public static void main(String[] args) {
        // Creamos galletas usando el constructor
        var galleta1 = new ClaseConstructor("Chocolate", 3);
        var galleta2 = new ClaseConstructor("Vainilla", 2);
        
        //Mostrar la información en consola
        galleta1.mostrarInfo();
        galleta2.mostrarInfo();
    }
}
