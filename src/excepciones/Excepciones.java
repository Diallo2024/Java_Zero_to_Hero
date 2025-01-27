package excepciones;

public class Excepciones {
    // Hay dos tipos de excepciones: en tiempo compilación y de ejecución
    public static void main(String[] args) {
        int valor1 = 10, valor2 = 0;
        try{
            var resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado); // Esta operacion genera una excepción en tiempo de ejecución
        }catch (Exception e){
            System.out.println("Ocurrió un error: " + e);
        }
    }
}
