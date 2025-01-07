public class Cadenas {
    public static void main(String[] args) {
        System.out.println("**** Manejo de cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        var cadena4 = """
                Esto es una cadena
                multilínea
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
