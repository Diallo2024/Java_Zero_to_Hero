package prueba;

import aritmetica.Aritmetica;

public class pruebaAritmetica {
    public static void main(String[] args) {
        var aritmetica1 = new Aritmetica();
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println(); // Añadimos un salto de linea

        // Segundo obejto
        System.out.println();
        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
    }
}
