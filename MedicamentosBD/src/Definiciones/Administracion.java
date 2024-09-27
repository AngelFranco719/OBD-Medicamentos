package Definiciones;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Administracion implements Serializable{
    @Id
    private String adm_codigo;
    private Date adm_fecha;
    private Date adm_hora;
    private String adm_registro;
    @ManyToOne
    @JoinColumn(name="per_adm",nullable=false)
    private Personal adm_per; 
    @JoinColumn(name="lis_adm",nullable=false)
    private Lista adm_lis;
    
    @Transient
    private SimpleDateFormat formato_fecha=new SimpleDateFormat("yyyy-mm-dd");
    @Transient
    private SimpleDateFormat formato_hora=new SimpleDateFormat("hh:mm:ss");
    
    public Administracion(String adm_codigo, String adm_fecha, String adm_hora, String adm_registro){
        this.adm_codigo=adm_codigo;
        this.adm_fecha=this.parseStringToDate(adm_fecha, formato_fecha);
        this.adm_hora=this.parseStringToDate(adm_hora, formato_hora);
        this.adm_registro=adm_registro; 
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
    
    private Date parseStringToDate(String fecha, SimpleDateFormat formato){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=formato.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    
    private String parseDatetoString(Date fecha, SimpleDateFormat formato){
        return formato.format(fecha);
    }
    
    @Override
    public String toString(){
        return String.format(
                "\n-----\n"+
                "Codigo: %s"
                +"\nFecha: %s"
                +"\nHora: %s"
                +"\nRegistro: %s"
                +"\nPersonal a Cargo: %s"
                +"\nMedicamento Suministrado: %s"
                , 
                this.adm_codigo,
                this.parseDatetoString(adm_fecha, formato_fecha),
                this.parseDatetoString(adm_hora, formato_hora),
                this.adm_registro,
                this.adm_per.getPer_nombre(),
                this.adm_lis);
    }
}
