package persona;

public class PruebaPersonaEncapsulada {
    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objeto persona.Persona ***");
        var objeto1 = new Persona("Sam", "Altman");

        //Lectura individual de los parámetros del objeto persona.
        objeto1.getNombre();
        objeto1.getApellido();

        objeto1.mostrarPersona();

        System.out.println();
        // Segundo objeto
        var objeto2 = new Persona("Juana", "Gomez");
        objeto2.mostrarPersona();
    }
}
