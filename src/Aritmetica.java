public class Aritmetica {
    int operando1;
    int operando2;

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    void restar(){
        var resrultado = operando1 - operando2;
        System.out.println("Resrultado: " + resrultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Arritmético ***");
        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1 = 10;
        aritmetica1.operando2 = 15;
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println(); // Añadimos un salto de linea
        
        // Segundo obejto
        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 25;
        aritmetica2.operando2 = 35;
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}
