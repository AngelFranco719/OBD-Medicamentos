package Controlador;
import Definiciones.Medicamento;
import BD.ConexionBD;
import Definiciones.Composicion;
import Definiciones.Lista;
import java.util.*;

public class Modelo_Medicamento extends Controlador{
    ConexionBD Conexion_Actual; 
    List<Medicamento>Lista_Medicamentos=new ArrayList();
    Modelo_Composicion Composicion; 
    Modelo_Lista Lista; 
    public Modelo_Medicamento(ConexionBD Conexion_Actual, Modelo_Composicion Composicion, Modelo_Lista Lista){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Composicion=Composicion; 
        this.Lista=Lista; 
    }
    public Modelo_Medicamento(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
    }
    public void setModelo_Composicion(Modelo_Composicion Composicion){
        this.Composicion=Composicion; 
    }
    public void setModelo_Lista(Modelo_Lista Lista){
        this.Lista=Lista; 
    }

    public void InitializeInstance(String med_codigo, String med_nombre, int med_cantidad, String med_presentacion, String med_descripcion){
        try{
            Medicamento med=new Medicamento(med_codigo, med_nombre, med_cantidad, med_presentacion, med_descripcion);
            this.Lista_Medicamentos.add(med);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo.");
        }
    }
    
    public void RelationshipMedicamento_Composicion(String med_codigo, String com_codigo){
        Composicion c=(Composicion)Composicion.getElementByID(com_codigo);
        Medicamento m=(Medicamento)Composicion.getElementByID(med_codigo);
        m.formMed_comp(c);
        c.formComp_med(m);
    }
    
    public void RelationshipMedicamento_Lista(String med_codigo, String lis_codigo){
        Medicamento m=(Medicamento)this.getElementByID(med_codigo);
        Lista l=(Lista)Lista.getElementByID(lis_codigo);
        m.formMed_list(l);
        l.formLis_med(m);
    }
    
    @Override
    public List<Medicamento> getLista(){
        return this.Lista_Medicamentos;
    }
}
