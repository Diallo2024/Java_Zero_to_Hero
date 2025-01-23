package aritmetica;

public class Aritmetica {
    int operando1;
    int operando2;

    // Constructor vacio
    public Aritmetica(){
    }

    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this: " + this);
    }

   public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

   public void restar(){
        var resrultado = operando1 - operando2;
        System.out.println("Resrultado: " + resrultado);
    }
}
