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
public class Administrativo extends Personal{
    
    private String cargo;
    private String fechaContrato;
    
    public Administrativo(String tipoDocumento, String documento, String Apellidos, String Nombres, int edad, boolean Activo) {
        super(tipoDocumento, documento, Apellidos, Nombres, edad, Activo);
        
        this.cargo = cargo;
        this.fechaContrato = fechaContrato;
        
    }
   public String mostrar(){
       String Info = "";
       Info = tipoDocumento+"\t"+documento+"\t"+Apellidos+"\t"+Nombres+"\t"+edad+"\t"+Activo+"\t"+cargo+"\t"+fechaContrato;
       return Info;        
   }
   public void setCargo(String cargo){
       this.cargo = cargo;
   }
    
    
}
