package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List <String> milista = new ArrayList <>(); // Asi especificamos el tipo de dato que queremos almacenar en la lista
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Viernes");
        milista.add("Sábado");
        milista.add("Domingo");

        for (Object elemento: milista){
            System.out.println("Día de la semana: " + elemento);
        }
    }
}
