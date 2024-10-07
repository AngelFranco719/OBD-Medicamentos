package Definiciones;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Administracion extends Modelo implements Serializable{
    @Id
    private String adm_codigo;
    private Date adm_fecha;
    private String adm_registro;
    @ManyToOne
    @JoinColumn(name="per_adm",nullable=false)
    private Personal adm_per; 
    @JoinColumn(name="lis_adm",nullable=false)
    private Lista adm_lis;
    
    public Administracion(String adm_codigo, String adm_fecha, String adm_registro){
        this.adm_codigo=adm_codigo;
        this.adm_fecha=this.parseStringToDate(adm_fecha);
        this.adm_registro=adm_registro; 
    }
    public Administracion(){
    }
    
    public void formAdm_per(Personal per){
        this.adm_per=per;
    }
    public void dropAdm_per(){
        this.adm_per=null;
    }
    public void formAdm_lis(Lista lis){
        this.adm_lis=lis;
    }
    public void dropAdm_lis(){
        this.adm_lis=null;
    }
    
    public String getAdm_codigo(){
        return this.adm_codigo;
    }
   
    
    @Override
    public String getID(){
        return this.adm_codigo;
    }
    
    @Override
    public String toString(){
        Administracion adm=new Administracion(); 
        return String.format(
                "\n-----\n"+
                "Codigo: %s"
                +"\nFecha: %s"
                +"\nRegistro: %s"
                +"\nPersonal a Cargo: %s"
                +"\nMedicamento Suministrado: %s"
                , 
                this.adm_codigo,
                this.parseDatetoString(adm_fecha),
                this.adm_registro,
                this.adm_per.getPer_nombre(),
                this.adm_lis);
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false; 
        Administracion comparado=(Administracion)obj;
        return this.adm_codigo.equals(comparado.adm_codigo);
    }
    
    
}
