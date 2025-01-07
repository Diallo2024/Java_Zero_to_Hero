public class ImmutabilidadCadenas {
    public static void main(String[] args) {
        //Immutabilidad de cadenas
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Hasta luego";
        System.out.println("cadena1 modificado= " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
