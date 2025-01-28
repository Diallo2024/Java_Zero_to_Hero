package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List <String> milista = new ArrayList <>(); // Asi especificamos el tipo de dato que queremos almacenar
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Viernes");
        milista.add("Sábado");
        milista.add("Domingo");

       // for (Object elemento: milista){
         //   System.out.println("Día de la semana: " + elemento);
       // }

        // Funciones lambda (funcion anonima de un codgio compactp)
       // milista.forEach( elemento -> {
        //    System.out.println("Elemento: " + elemento);
       // });

        milista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Juan", "Pedro", "Maria", "Elena");
        System.out.println("\nLista de Nombres: ");
        nombres.forEach(System.out::println);
    }
}
