package persona;

public class PruebaPersonaEncapsulada {
    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objeto persona.Persona ***");
        System.out.println("Varialble Stática: "
                + Persona.getContadorPersonas());
        var objeto1 = new Persona("Sam", "Altman");
        System.out.println(objeto1); //Aqui atomaticamente se manda a llamar el método toString()
        // El contador aumenta después de crear obejtos
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        // Segundo objeto
        var objeto2 = new Persona("Elena", "Gomez");
        System.out.println(objeto2);
        System.out.println("Vaiale estática: " + Persona.getContadorPersonas());
    }
}
