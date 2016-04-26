/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionprofesores;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author daw1
 */
public class ArchivoProfesores {
    File f;
    
    public ArchivoProfesores(File f) {
        this.f = f;
    }
    
    
    private boolean guardarProfesores(List<Profesor> lista){
    
        return true;
    }
    
     List<Profesor> mostrarProfesores(String departamento){
         try (FileInputStream fileInput = new FileInputStream(f);
                ObjectInputStream file = new ObjectInputStream(fileInput)) {

            System.out.println(Profesor.toString());
            System.out.println(fecha.toString());

        } catch (ClassNotFoundException ex) {
            System.out.println("La clase no existe");
        } catch (IOException ex) {
            System.out.println("Error al abrir el fichero");
        }
     }
    
}
