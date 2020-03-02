/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author CBN
 */
public class Docente extends Personal{
    
    protected String profesion;
    protected String asignatura;

    public Docente(String profesion, String asignatura, String tipoDocumento, String documento, String Apellidos, String Nombres, int edad, boolean Activo) {
        super(tipoDocumento, documento, Apellidos, Nombres, edad, Activo);
        this.profesion = profesion;
        this.asignatura = asignatura;
    }
    
    public void setAsignatura( String asignatura){
        this.asignatura = asignatura;
    }
    
}
