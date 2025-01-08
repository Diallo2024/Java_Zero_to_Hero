public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Juan Arias";
        var edad = 20;
        var salario = 15000.50;

        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println("resultado = " + mensaje);
        var numeroEmpleado = 12;
        //Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);

        // Formateo con text block y println
        mensaje = """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tEdad: %d años
                \tNo.Empleado: %04d
                \tSalario: $%.2f
                """.formatted(nombre, edad, numeroEmpleado, salario);
        System.out.println("mensaje = " + mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tEdad: %d años
                \tNo.Empleado: %04d
                \tSalario: $%.2f
                """, nombre, edad, numeroEmpleado, salario);
    }
}
