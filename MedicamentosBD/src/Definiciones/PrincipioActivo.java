package Definiciones;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class PrincipioActivo extends Modelo implements Serializable {

    @Id
    private String pri_codigo;
    private String pri_nombre;
    private String pri_descripcion;
    @OneToMany
    @JoinColumn(name="comp_act",nullable=false)
    private List<Composicion> act_comp=new ArrayList();

    public PrincipioActivo(String pri_codigo, String pri_nombre, String pri_descripcion){
        this.pri_codigo=pri_codigo;
        this.pri_nombre=pri_nombre;
        this.pri_descripcion=pri_descripcion;
    }
    public PrincipioActivo(){
    }
    
    public void formAct_comp(Composicion pres){
        this.act_comp.add(pres);
    }
    public void dropAct_comp(Composicion pres){
        this.act_comp.remove(pres);
    }
    public String getAct_codigo(){
        return this.pri_codigo;
    }
    public String getAct_nombre(){
        return this.pri_nombre;
    }
    public String getAct_descripcion(){
        return this.pri_descripcion;
    }
    
    @Override
    public String getID(){
        return this.pri_codigo;
    }
    
    @Override
    public String toString() {
        return String.format("\n------\n"+
                     "Codigo: %s" +
                     "\nNombre: %s" +
                     "\nDescripcion: %s" +
                     "\nComposicion: %s",
                     this.pri_codigo,
                     this.pri_nombre,
                     this.pri_descripcion,
                     this.act_comp.toString());
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false; 
        PrincipioActivo comparado=(PrincipioActivo)obj;
        return this.pri_codigo.equals(comparado.pri_codigo);
    }
}

