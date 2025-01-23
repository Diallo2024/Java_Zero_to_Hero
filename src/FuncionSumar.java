public class FuncionSumar {
    // Definir la función de sumar
    static int sumar (int a, int b){
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
    int arg1 = 5, arg2 = 7;
    var resultado_funcion = sumar(arg1, arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);
        resultado_funcion = sumar(15, 20);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }
}
