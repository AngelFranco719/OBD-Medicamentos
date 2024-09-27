package Definiciones;
import java.io.Serializable;
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
    
    void formAdm_per(Personal per){
        this.adm_per=per;
    }
    void dropAdm_per(){
        this.adm_per=null;
    }
    void formAdm_lis(Lista lis){
        this.adm_lis=lis;
    }
    void dropAdm_lis(){
        this.adm_lis=null;
    }
    @Override
    public String toString(){
        return String.format(
                "\n-----\n"+
                "Código: %s"
                +"\nFecha: %s"
                +"\nHora: %s"
                +"\nRegistro: %s"
                +"\nPersonal a Cargo: %s"
                +"\nMedicamento Suministrado: %s"
                , 
                this.adm_codigo,
                this.adm_fecha,
                this.adm_hora,
                this.adm_registro,
                this.adm_per,
                this.adm_lis);
    }
}
