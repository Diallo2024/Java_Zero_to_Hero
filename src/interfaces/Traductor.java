package interfaces;

public interface Traductor {
    // public y astract
    void traducir();

    // Metodos con implementacion por default
    default void iniciarTradurctor(){
        System.out.println("Iniciando traductor . . .");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a Ingles");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
    }
}
