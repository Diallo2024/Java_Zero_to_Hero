public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";

        //Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace("Hola", "Bienvenidos al");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir en mayuculas
        var mayusculas = nuevaCadena.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //Convertir en minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Elimianr espacios al inicio y al final
        var cadena4 = "Hola Mundo";
        System.out.println("  cadena4 con espacios =   " + cadena4);
        System.out.println("cadena4 sin espacios= " + cadena4.trim());


    }
}
