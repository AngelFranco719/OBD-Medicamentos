package Definiciones;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;
@Entity
public class Medicamento extends Modelo implements Serializable {

    @Id
    private String med_codigo;
    private String med_nombre;
    private int med_cantidad;
    private String med_presentacion;
    private String med_descripcion;

    @OneToMany
    @JoinColumn(name="comp_med",nullable=false)
    private List<Composicion>med_comp=new ArrayList();

    @OneToMany
    @JoinColumn(name="list_med",nullable=false)
    private List<Lista>med_list=new ArrayList();
    
    public Medicamento(String med_codigo, String med_nombre, int med_cantidad, String med_presentacion, String med_descripcion){
        this.med_codigo=med_codigo;
        this.med_nombre=med_nombre;
        this.med_cantidad=med_cantidad;
        this.med_presentacion=med_presentacion; 
        this.med_descripcion=med_descripcion; 
    }
    
    public void formMed_comp(Composicion pres){
        this.med_comp.add(pres);
    }
    public void dropMed_comp(Composicion pres){
        this.med_comp.remove(pres);
    }
    public void formMed_list(Lista adm){
        this.med_list.add(adm);
    }
    public void dropMed_list(Lista adm){
        this.med_list.remove(adm);
    }
    
    public String getMed_codigo(){
        return this.med_codigo; 
    }
    
    @Override
    public String getID(){
        return this.med_codigo;
    }
    
    @Override
    public String toString() {
        return String.format("\n------\n"+
                             "Nombre: %s"+
                             "\nPresentacion: %s"+
                             "\nCantidad: %s"+
                             "\nDescripcion: %s",
                         this.med_nombre,
                         this.med_presentacion,
                         this.med_cantidad,
                         this.med_descripcion
                         );
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false; 
        Medicamento comparado=(Medicamento)obj;
        return this.med_codigo.equals(comparado.med_codigo);
    }
}
