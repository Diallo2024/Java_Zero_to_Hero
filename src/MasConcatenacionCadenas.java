public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        //Medtodo Concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);

        //Metodo StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var rresultado = stringBuffer.toString();
        System.out.println("rresultado String Buffer= " + rresultado);

        //Join
        resultado = String.join(" ", cadena1, cadena2, "A Dios!");
        System.out.println("resultado join= " + rresultado);

    }
}
