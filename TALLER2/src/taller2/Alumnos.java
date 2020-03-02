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
public class Alumnos extends Personal{
    
    private String codigo;
    private String facultad;
    private String programa;
    private int semestre;
   
    public Alumnos(String tipoDocumento,String documento,String Apellidos,String Nombres,int edad,boolean Activo,String codigo,String facultad, String programa,int semestre){
       super(tipoDocumento,documento,Apellidos,Nombres,edad,Activo);
        
        this.codigo = codigo;
        this.facultad = facultad;
        this.programa = programa;
        this.semestre = semestre;
        
    }
    public String mostrar(){
        String Info="";
        Info = codigo+"\t"+facultad+"\t"+programa+"\t"+semestre+"\t"+tipoDocumento+"\t"+documento+"\t"+Apellidos+"\t"+Nombres+"\t"+edad+"\t"+Activo;
        return Info;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
        
    }
    public void setFcaultad(String facultad){
        this.facultad = facultad;
        
    }
    public void setPrograma(String Programa){
        this.programa = Programa;
    }
    public void setSemestre(int Semestre){
        this.semestre = Semestre;
    }
    
    
}
