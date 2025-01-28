package sets;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Estructuras de datos
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del conjunto: ");
        conjunto.forEach(System.out::println);

        //Remover elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos Elementos del set: ");
        conjunto.forEach(System.out::println);
    }
}
