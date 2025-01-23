package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

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

    // Definimos el método Get del atributo 1
    public int getOperando1(){
        return this.operando1;
    }

    // Definimos el método Set del atributo 1
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    // Definimos el método Get del atributo 2
    public int getOperando2(){
        return this.operando2;
    }

    // Definimos el método Set del atributo 2
    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }

}
