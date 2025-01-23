public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo do-while ***");

        var contador = 1;
        do {
            System.out.println(contador++);
        } while (contador <= 5);
    }
}
