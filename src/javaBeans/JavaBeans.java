package javaBeans;

public class JavaBeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellido("Martinez");
        System.out.println("person = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Nombre: " + persona.getApellido());
    }
}

