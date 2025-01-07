public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //String texto = "Hola Mundo";
        //int posicion = texto.indexOf("Mundo");
        //System.out.println("posicion = " + posicion);
        //int ultimaPosicion = texto.lastIndexOf("o");
        //System.out.println("ultimaPosicion = " + ultimaPosicion);

        //Usando los métodos para sacar una subcadena.
        String texto2 = "Hola mundo bonito";
        int inicio = texto2.indexOf("mundo");
        int fin = texto2.lastIndexOf("o");
        //Recorte
        String recorte = texto2.substring(inicio, fin + 1);
        System.out.println("recorte = " + recorte);
    }
}
