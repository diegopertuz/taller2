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
public class Planta extends Docente{
    
    private String fechaContrato;
    private int cantProyectos;

    public Planta(String profesion, String asignatura, String tipoDocumento, String documento, String Apellidos, String Nombres, int edad, boolean Activo) {
        super(profesion, asignatura, tipoDocumento, documento, Apellidos, Nombres, edad, Activo);
        
        this.fechaContrato = fechaContrato;
        this.cantProyectos = cantProyectos;
    }
public String mostrar(){
    String info="";
    info = tipoDocumento+"\t"+documento+"\t"+Apellidos+"\t"+Nombres+"\t"+edad+"\t"+Activo+"\t"+fechaContrato+"\t"+cantProyectos;
    return info;
}
public void setCantProyectos(){
    
}
    
    
    
}
