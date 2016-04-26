/*
Crea una clase Profesor que almacene su nif, su nombre, la departamento y su edad.
Incluye un método toString() que concatene todos los atributos y lo muestre por pantalla. 
 */
package gestionprofesores;

import java.io.Serializable;

/**
 *
 * @author daw1
 */
public class Profesor implements Serializable{
    private String nif;
    private String nombre;
    private String departamento;
    private int edad;

    public Profesor(String nif, String nombre, String departamento, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        
        return "NIF: "+nif+" Nombre: "+nombre+" Departamento: "+departamento+" Edad: "+edad; 
    }
    

}
