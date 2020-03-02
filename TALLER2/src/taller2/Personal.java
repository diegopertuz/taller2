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
public class Personal {
    protected String tipoDocumento;
    protected String documento;
    protected String Apellidos;
    protected String Nombres;
    protected int edad;
    protected boolean Activo;
    
    public Personal( String tipoDocumento,String documento,String Apellidos,String Nombres,int edad,boolean Activo){
        
    this.tipoDocumento = tipoDocumento;
    this.documento = documento;
    this.Apellidos = Apellidos;
    this.Nombres = Nombres;
    this.edad = edad;
    this.Activo = Activo;
        
    }
    public String mostrarInfo(){
        String info="";
        info = tipoDocumento+"\t"+documento+"\t"+Apellidos+"\t"+Nombres+"\t"+edad+"\t"+Activo;
        return info;
              
    }
    public void setEdad(int edad){
        this.edad = edad;
        
    }
    public void setActivo(boolean activo){
        this.Activo = activo;
        
    }
    
}
