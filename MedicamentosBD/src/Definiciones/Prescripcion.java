package Definiciones;
import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Prescripcion extends Fecha implements Serializable {
    private static final long serialVersionUID =1L;
    
    @Id
    private String pres_codigo;
    private Date pres_fecha;
    private String pres_usos;
    private String pres_instrucciones;
    
    @ManyToOne
        @JoinColumn(name="pac_pres",nullable=false)
        private Paciente pres_pac;
        
    @ManyToOne
        @JoinColumn(name="per_pres",nullable=false)
        private Personal pres_per;
        
    @OneToMany
        @JoinColumn(name="lis_pres",nullable=false)
        private List<Lista> pres_lis=new ArrayList<Lista>();
       
   public Prescripcion (){
   }
   
   public Prescripcion(String codigo, String Fecha, String usos, String instrucciones){
       pres_codigo=codigo;
       pres_fecha=this.parseStringToDate(Fecha);
       pres_usos=usos;
       pres_instrucciones=instrucciones;
       
       
   }
   
   @Override
    public String toString(){
        return String.format("\n-----\nCodigo: %s"
        + "\nFecha: %s"
        +"\nUsos: %s"
        +"\nInstrucciones: %s",
        this.pres_codigo,
        this.parseDatetoString(pres_fecha),
        this.pres_usos,
        this.pres_instrucciones,
        this.getPres_pac(),
        this.getPres_per(),
        this.getPres_lis());
    }
    
    public void formPres_pac(Paciente p1) {
        pres_pac = p1;
    }
    public void dropPres_pac(Paciente p1) {
        pres_pac = p1;
    }
    
    public void formPres_per(Personal per1) {
        pres_per = per1;
    }

    public Paciente getPres_pac() {
        return pres_pac;
    }

    public Personal getPres_per() {
        return pres_per;
    }
    public void dropPres_per(Personal per1) {
        pres_per = per1;
    }
    
    
     public void formPres_lis(Lista l1)
    {
        getPres_lis().add(l1);
    }
     
     public void dropPres_lis(Lista l1)
    {
        getPres_lis().remove(l1);
    }
    

    public String getPres_codigo() {
        return pres_codigo;
    }

    public Date getPres_fecha() {
        
        return pres_fecha;
    }

    public String getPres_usos() {
        return pres_usos;
    }

    public String getPres_instrucciones() {
        return pres_instrucciones;
    }

    public void setPres_codigo(String pres_codigo) {
        this.pres_codigo = pres_codigo;
    }

    public void setPres_fecha(Date pres_fecha) {
        this.pres_fecha = pres_fecha;
    }

    public void setPres_usos(String pres_usos) {
        this.pres_usos = pres_usos;
    }

    public void setPres_instrucciones(String pres_instrucciones) {
        this.pres_instrucciones = pres_instrucciones;
    }
    public List<Lista> getPres_lis() {
        return pres_lis;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false; 
        Prescripcion comparado=(Prescripcion)obj;
        return this.pres_codigo.equals(comparado.pres_codigo);
    }
}    
    
    

    
   
    
