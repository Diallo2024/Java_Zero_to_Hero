package prueba;

import aritmetica.Aritmetica;

public class pruebaAritmetica {
    public static void main(String[] args) {
        var aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(15);
        aritmetica1.setOperando2(10);
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println(); // Añadimos un salto de linea

        // Segundo obejto
        System.out.println();
        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
    }
}
