/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Controladora {
    
    //Instancia de la Controladora de Persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Crear Alumno
    public void createAlumno(Alumno alu){
        controlPersis.createAlumno(alu);
    }
    
    //Eliminar un Alumno
    public void deleteAlumno(int id){
        controlPersis.deleteAlumno(id);
    }
    
    //Buscar y Mostrar un Alumno
    
    public Alumno findAlumno(int id){
        return controlPersis.findAlumno(id);
    }
    
    
    //Buscar y Mostrar todos los Alumnos
    public ArrayList<Alumno> findAlumnosEntities(){
        return controlPersis.findAlumnosEntities();
    }
}
