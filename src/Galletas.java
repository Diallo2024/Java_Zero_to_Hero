public class Galletas {
    // Definimos nuestra clase
    String sabor;
    int tamaño;

    void mostrarGalleta(){
        System.out.println("el sabor de mi galleta es: " + sabor);
        System.out.println("El tamaño de mi galleta es: " + tamaño);
    }


    // Ahora definimos main
    public static void main(String[] args) {
        System.out.println("*** Mis galletas ***");
        var galleta1 = new Galletas();
        galleta1.sabor = "Chocolate";
        galleta1.tamaño = 5;
        galleta1.mostrarGalleta();

        System.out.println();

        var galleta2 = new Galletas();
        galleta2.sabor = "vainilla";
        galleta2.tamaño = 4;
        galleta2.mostrarGalleta();
    }
}
