public class GeneradorEmail {
    public static void main(String[] args) {
        //*** Generador de Email ***
        var nombreUser = "Ubaldo Acosta Soto";
        System.out.println("nombreUser = " + nombreUser);
        var nombreUserNormal = "ubaldo.acosta.soto";
        System.out.println("nombreUserNormal = " + nombreUserNormal);
        var nombreEmpresa = "Global Mentoring";
        var ExtensionDominio = ".com.mx";
        var dominioEmailNormalizado = "@globalmentoring.com.mx";

        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(nombreUserNormal);
        constructorCadenas.append(dominioEmailNormalizado);
        constructorCadenas.toString();
        System.out.println("constructorCadenas = " + constructorCadenas);

        //Otra manera de hacerlo
        System.out.println("*** Generador de Emails ***");
        //Nombre completo del usuario
        var nombreCompleto = " Oury Diallo ";
        System.out.println("nomCompleto = " + nombreCompleto);

        //Procesar o nomralizar el nombre del usuario
        //limpiar los espacios al incio y al final
        var nombreNormalizado = nombreCompleto.strip();
        System.out.println("nombreNormalizado = " + nombreNormalizado);
        //Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        System.out.println(nombreNormalizado);
        //convertir a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        //Datos de la empresa
        var nameEmpresa = " Global mentoring ";
        System.out.println("\nnameEmpresa = " + nameEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("extension del dominio = " + extensionDominio);

        //Limpiar los espacios en blanco y convertirlo en minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".");
        System.out.println("nombreEmpresaNormalizado = " + nombreEmpresaNormalizado);
        nombreEmpresaNormalizado =nombreEmpresaNormalizado.toLowerCase();
        System.out.println("nombreEmpresaNormalizado = " + nombreEmpresaNormalizado);
        var dominioMailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioMailNormalizado = " + dominioMailNormalizado);

        //Creamos el email final
        var emailFinal = nombreNormalizado + dominioMailNormalizado;
        System.out.println("emailFinal = " + emailFinal);




    }
}
