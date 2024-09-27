package Definiciones;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class Medicamento implements Serializable {

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

    void formMed_comp(Composicion pres){
        this.med_comp.add(pres);
    }
    void dropMed_comp(Composicion pres){
        this.med_comp.remove(pres);
    }
    void formMed_list(Lista adm){
        this.med_list.add(adm);
    }
    void dropMed_list(Lista adm){
        this.med_list.remove(adm);
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
}
