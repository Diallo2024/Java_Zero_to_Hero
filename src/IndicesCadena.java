public class IndicesCadena {
    public static void main(String[] args) {
        //Manejo de indices de cadena
        var cadena1 = "Hola Mundo";

        //Recuperar el primer caracter
        char primercaracter = cadena1.charAt(0);
        System.out.println("primercaracter = " + primercaracter);
        //Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        //Imprimir la letra M
        var sextoCaracter = cadena1.charAt(5);
        System.out.println("sextoCaracter = " + sextoCaracter);
    }
}
