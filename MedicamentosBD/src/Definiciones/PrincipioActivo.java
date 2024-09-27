package Definiciones;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class PrincipioActivo implements Serializable {

    @Id
    private String pri_codigo;
    private String pri_nombre;
    private String pri_descripcion;
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
                             "Código: %s"+
                             "\nNombre: %s"+
                             "\nDescripcion: %s"+
                             "\nComposicion: %s",
                         this.pri_codigo,
                         this.pri_nombre,
                         this.pri_descripcion
                         );
    }
}

