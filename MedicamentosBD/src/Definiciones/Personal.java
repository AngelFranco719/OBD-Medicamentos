package Definiciones;
import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Personal implements Serializable{
    @Id
    private String per_nombre; 
    public enum Roles
    {
        MEDICO, ENFERMERO
    };
    public Roles per_rol;
    private String per_cedula;
    @OneToMany
        @JoinColumn(name="pres_per",nullable=false)
        private List<Prescripcion>per_pres=new ArrayList(); 
    @OneToMany
        @JoinColumn(name="adm_per", nullable=false)
        private List<Administracion> per_adm=new ArrayList(); 
    public Personal(){
        
    }
    
    public Personal(String per_nombre, Roles per_rol, String per_cedula){
        this.per_nombre=per_nombre;
        this.per_rol=per_rol;
        this.per_cedula=per_cedula;
    }
    
    public void formPer_pres(Prescripcion pres){
        this.per_pres.add(pres);
    }
    public void dropPer_pres(Prescripcion pres){
        this.per_pres.remove(pres);
    }
    public void formPer_adm(Administracion adm){
        this.per_adm.add(adm);
    }
    public void dropPer_adm(Administracion adm){
        this.per_adm.remove(adm);
    }
    
    public String getPer_nombre(){
        return this.per_nombre;
    }
    public void setPer_nombre(String nombre){
        this.per_nombre=nombre;
    }
    
    @Override
    public String toString(){
        return String.format("\n------\n"+
                             "Nombre: %s"+
                             "\nRol: %s"+
                             "\nCedula: %s"+
                             "\nCantidad de Prescripciones: %s"+
                             "\nCantidad de Administraciones: %s",
                         this.per_nombre,
                         this.per_rol,
                         this.per_cedula,
                         this.per_pres.size(),
                         this.per_adm.size()
                         );
    } 
}
