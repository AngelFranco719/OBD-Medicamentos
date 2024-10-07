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
    
    public Medicamento(){
        this.med_codigo="";
        this.med_nombre="";
        this.med_cantidad=0;
        this.med_presentacion=""; 
        this.med_descripcion="";
    }
    
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

    public String getMed_codigo() {
        return med_codigo;
    }

    public void setMed_codigo(String med_codigo) {
        this.med_codigo = med_codigo;
    }

    public String getMed_nombre() {
        return med_nombre;
    }

    public void setMed_nombre(String med_nombre) {
        this.med_nombre = med_nombre;
    }

    public int getMed_cantidad() {
        return med_cantidad;
    }

    public void setMed_cantidad(int med_cantidad) {
        this.med_cantidad = med_cantidad;
    }

    public String getMed_presentacion() {
        return med_presentacion;
    }

    public void setMed_presentacion(String med_presentacion) {
        this.med_presentacion = med_presentacion;
    }

    public String getMed_descripcion() {
        return med_descripcion;
    }

    public void setMed_descripcion(String med_descripcion) {
        this.med_descripcion = med_descripcion;
    }

    public List<Composicion> getMed_comp() {
        return med_comp;
    }

    public void setMed_comp(List<Composicion> med_comp) {
        this.med_comp = med_comp;
    }

    public List<Lista> getMed_list() {
        return med_list;
    }

    public void setMed_list(List<Lista> med_list) {
        this.med_list = med_list;
    }
    
}
