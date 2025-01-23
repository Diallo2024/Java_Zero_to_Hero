public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("cadena original = " + cadena);

        //Reemplazo de la cadena "Mundi" por "a todos".
        var nuevaCadena = cadena.replace("Mundo", "A Todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Reemplazar "Hola" por "Saludos".
        var reemplazo = cadena.replace("Hola", "Saludos");
        System.out.println("reemplazo = " + reemplazo);
    }
}
