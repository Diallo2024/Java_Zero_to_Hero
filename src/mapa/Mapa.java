package mapa;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        persona.put("edad", "31"); // No se permiten duplicados
        System.out.println("Valores del mapa: ");
        persona.remove("apellido");
        persona.entrySet().forEach(System.out::println);

        persona.put("edad", "35"); // Modificar el valor de una llave existente

        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar los elementos del mapa por separado
        System.out.println("\nIterando el mapa (llave, valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", valor: " + valor);
        });
    }
}
