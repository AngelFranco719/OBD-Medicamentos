package Definiciones;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
public class PrincipioActivo implements Serializable {

    @Id
    private String act_nombre;
    private String act_descripcion;

    
    @OneToMany
    @JoinColumn(name="comp_act",nullable=false)
    private List<Composicion> act_comp=new ArrayList();

    void formAct_comp(Composicion pres){
        this.act_comp.add(pres);
    }
    void dropAct_comp(Composicion pres){
        this.act_comp.remove(pres);
    }
    
    @Override
    public String toString() {
        return String.format("\n------\n"+
                             "Nombre: %s"+
                             "\nDescripcion: %s",
                         this.act_nombre,
                         this.act_descripcion
                         );
    }
}

