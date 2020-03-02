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
public class Catedratico extends Docente{
    
    private String fechainicio;
    private String fechafin;

    public Catedratico(String profesion, String asignatura, String tipoDocumento, String documento, String Apellidos, String Nombres, int edad, boolean Activo) {
        super(profesion, asignatura, tipoDocumento, documento, Apellidos, Nombres, edad, Activo);
    }

   
    public String mostrar(){
        String Info = "";
        Info = tipoDocumento+"\t"+documento+"\t"+Apellidos+"\t"+Nombres+"\t"+edad+"\t"+Activo+"\t"+fechainicio+"\t"+fechafin;
        return Info;
    }
    
    
    
}
