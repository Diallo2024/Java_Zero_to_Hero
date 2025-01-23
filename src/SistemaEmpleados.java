import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");
        var consola = new Scanner(System.in);

        //Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false)?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Imprimi los datos a consola
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años ");
        //System.out.println("\tSalario: $ %.2f".formatted + salarioEmpleado);
        System.out.printf("\tSalario: $ %.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de Departamento: " + esJefeDepartamento);


    }
}
