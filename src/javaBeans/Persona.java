package javaBeans;

import java.io.Serializable;

class Persona implements Serializable { // Implementando el método Serializable
     private String nombre;
     private String apellido;

     public Persona(){} // Constaructor vacío

     public String getNombre() { // método getter
         return nombre;
     }

     public void setNombre(String nombre) { // método setter
         this.nombre = nombre;
     }

     public String getApellido() {
         return apellido;
     }

     public void setApellido(String apellido) {
         this.apellido = apellido;
     }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
