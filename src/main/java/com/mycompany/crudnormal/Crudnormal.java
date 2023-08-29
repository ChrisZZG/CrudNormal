/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudnormal;

import Logica.Alumno;
import Logica.Controladora;
import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author crist
 */
public class Crudnormal {

    public static void main(String[] args) {
        
        //Creo una instancia de la Controladora y la Ejecuto "UNA SOLA VEZ"para que se creen las tablas en la
        //Base de Datos, luego la comento y no la vuelvo a usar.
        //ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //Instancia de la Controladora
        Controladora control = new Controladora();
        
        //Crear el Alumno en la Base de Datos
        //Alumno alu1 = new Alumno(2, "Juan", "Paz", new Date());
        
        //control.createAlumno(alu1);
        
        //Eliminar un Alumno
        //control.deleteAlumno(1);
        
        
        //Mostrar un alumno a partir del ID
        System.out.println("Buscar y Mostrar un Alumno por el ID");
        Alumno alusearch = control.findAlumno(2);
        System.out.println("------------");
        System.out.println("Nombre: " + alusearch.getNombre());
        System.out.println("Apellido: " + alusearch.getApellido());
        System.out.println("--------------");
        
        
        //Mostrar todos los Alumnos de la base de datos
        System.out.println("------------------");
        System.out.println("Buscar y Mostrar todos los Alumnos de la Base de Datos");
        
        ArrayList<Alumno> arrayAlu = control.findAlumnosEntities();
        
        for(Alumno alumno:arrayAlu){
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNac());
            System.out.println("-------------------");
        }
    }
}
