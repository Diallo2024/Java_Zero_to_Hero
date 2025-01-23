public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objeto Persona ***");
        var objeto1 = new Persona();
        objeto1.nombre = "Jorge";
        objeto1.apellido = "Davila";
        objeto1.mostrarPersona();

        System.out.println();
        // Segundo objeto
        var objeto2 = new Persona();
        objeto2.nombre = "Julian";
        objeto2.apellido = "Gutierrez";
        objeto2.mostrarPersona();
    }
}
