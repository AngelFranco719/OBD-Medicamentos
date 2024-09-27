package Definiciones;
import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Personal implements Serializable{
    @Id
    private String per_nombre; 
    private enum Roles
    {
        MEDICO, ENFERMERO
    };
    private Roles per_rol;
    private String per_cedula;
    @OneToMany
        @JoinColumn(name="pres_per",nullable=false)
        private List<Prescripcion>per_pres=new ArrayList(); 
    @OneToMany
        @JoinColumn(name="adm_per", nullable=false)
        private List<Administracion> per_adm=new ArrayList(); 
    void formPer_pres(Prescripcion pres){
        this.per_pres.add(pres);
    }
    void dropPer_pres(Prescripcion pres){
        this.per_pres.remove(pres);
    }
    void formPer_adm(Administracion adm){
        this.per_adm.add(adm);
    }
    void dropPer_adm(Administracion adm){
        this.per_adm.remove(adm);
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
