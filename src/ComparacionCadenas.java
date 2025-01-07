public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparacion de cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        //comparacion de cadena1 con cadena3 en referencia
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);
        //Comparar el contendio usaremos el método iguals
        System.out.print("cadena1 es igual en contendio a cadena3: ");
        System.out.println(cadena1.equals(cadena3));


    }
}
