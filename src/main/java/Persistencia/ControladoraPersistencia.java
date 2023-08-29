/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController  aluJpa = new AlumnoJpaController();
    
    //Crear un Alumno
    public void createAlumno(Alumno alu){
        aluJpa.create(alu);
    }
    
    //Eliminar un Alumno
    public void deleteAlumno(int id){
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Buscar y Mostrar un Alumno
    public Alumno findAlumno(int id){
        return aluJpa.findAlumno(id);
    }
    
    //Buscar y Mostrar todos los Alumnos
    public ArrayList<Alumno> findAlumnosEntities(){
        List<Alumno> listaAlu = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> arrayAlu = new ArrayList<Alumno> (listaAlu);
        return arrayAlu;
    }
    
    
    
}
