public class Inmmutabilidad {
    public static void main(String[] args) {
        String original = "Hola Mundo";
        String modificada = original.concat(", Bienvenidos al Curso de java");
        System.out.println("original = " + original);
        System.out.println("modificada = " + modificada);
    }
}
