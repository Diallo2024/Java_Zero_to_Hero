public class Constructor {
    // Definir los parámetros
    int operando1;
    int operando2;

    // Definimos nuestro constructor
    public Constructor(int operando1, int operando2){
        System.out.println("Ejecutando el constructor");
       this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Definir los métodos
    void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    //Añadir nuestro método main
    public static void main(String[] args) {
        System.out.println("*** El Constructor ***");
        var constructor1 = new Constructor(10, 15);
        constructor1.operando1 = 10;
        constructor1.operando2 = 15;
        constructor1.sumar();
        constructor1.restar();
        System.out.println("Drieccion de memoria odj1: " + constructor1);

        // Creamos un segundo objeto
        System.out.println();
        var constructor2 = new Constructor(10, 16);
        constructor2.sumar();
        System.out.println("Dir. Memoria const2: " + constructor2);

    }

}
