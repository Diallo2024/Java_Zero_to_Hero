public class DetallesInteger {
    public static void main(String[] args) {
        //convertir un entero en una cadena
        int numero = 10;
        String number = Integer.toString(numero);
        System.out.println("number = " + number);

        //Convertir una cadena en un entero
        String unNumero = "123";
        int miNumero = Integer.parseInt(unNumero);
        System.out.println("miNumero = " + miNumero);

    }
}
