package Definiciones;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class Composicion extends Modelo implements Serializable {

    @Id
    private String comp_codigo; 
    private int comp_cantidad;

    @ManyToOne
    @JoinColumn(name = "med_comp", nullable = false)
    private List<Medicamento>comp_med=new ArrayList();

    @ManyToOne
    @JoinColumn(name = "act_comp", nullable = false)
    private List<PrincipioActivo> comp_act=new ArrayList();

    public Composicion(String comp_codigo,int comp_cantidad){
        this.comp_cantidad=comp_cantidad;
        this.comp_codigo=comp_codigo; 
    }

    public Composicion() {
        this.comp_cantidad=0;
        this.comp_codigo="";
    }
        
    public void formComp_med(Medicamento med){
        this.comp_med.add(med);
    }
    public void dropComp_med(Medicamento med){
        this.comp_med.remove(med);
    }
    public void formComp_act(PrincipioActivo act){
        this.comp_act.add(act);
    }
    public void dropComp_act(PrincipioActivo act){
        this.comp_act.remove(act);
    }
    
    public String getComp_codigo(){
        return this.comp_codigo;
    }
    
    public String getComp_cantidad(){
        return Integer.toString(comp_cantidad);
    }
    
    public List<Medicamento> getComp_med(){
        return this.comp_med;
    }
    
    public void setComp_codigo(String comp_codigo){
       this.comp_codigo=comp_codigo; 
    }
    public void setComp_cantidad(int comp_cantidad){
        this.comp_cantidad=comp_cantidad; 
    }
    
    @Override
    public String getID(){
        return this.comp_codigo;
    }
    
    
    @Override
    public String toString() {
        return String.format(
                "\n-----\n" +
                "Cantidad: %d" +
                "\nID Medicamentos: %s" +
                "\nID Principio Activo Asociado: %s",
                this.comp_cantidad,
                this.comp_med,
                this.comp_act
        );
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false; 
        Composicion comparado=(Composicion)obj;
        return this.comp_codigo.equals(comparado.comp_codigo);
    }
}
