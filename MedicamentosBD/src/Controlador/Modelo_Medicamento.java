package Controlador;
import Definiciones.Medicamento;
import BD.ConexionBD;
import Definiciones.Composicion;
import Definiciones.Lista;
import java.util.*;
import java.util.function.Function;

public class Modelo_Medicamento extends Controlador<Medicamento>{
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
         this.selectInstancesFromBD();
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
    public void InitializeAndUpdateInstance(String med_codigo, String med_nombre, int med_cantidad, 
            String med_presentacion, String med_descripcion, String com_codigo){
        try{
            Medicamento med=new Medicamento(med_codigo, med_nombre, med_cantidad, med_presentacion, med_descripcion);
            this.RelationshipMedicamento_Composicion(med, com_codigo);
            this.UpdateInstance(med);
            this.Lista_Medicamentos.clear();
            this.selectInstancesFromBD();
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo.");
        }
    }
    
    public void RelationshipMedicamento_Composicion(String med_codigo, String com_codigo){
        Composicion c=(Composicion)Composicion.getElementByID(com_codigo);
        Medicamento m=(Medicamento)this.getElementByID(med_codigo);
        m.formMed_comp(c);
        c.formComp_med(m);
    }
     public void RelationshipMedicamento_Composicion(Medicamento m, String com_codigo){
        Composicion c=(Composicion)Composicion.getElementByID(com_codigo);
        m.formMed_comp(c);
        c.formComp_med(m);
    }
    
    public void RelationshipMedicamento_Lista(String med_codigo, String lis_codigo){
        Medicamento m=(Medicamento)this.getElementByID(med_codigo);
        Lista l=(Lista)Lista.getElementByID(lis_codigo);
        m.formMed_list(l);
        l.formLis_med(m);
    }
    
    public String getIDByNombre(String Nombre){
        for(Medicamento med : this.Lista_Medicamentos){
            if(med.getMed_nombre().equals(Nombre)){
                return med.getID();
            }
        }
        return null; 
    }
    
    @Override
    public List<Medicamento> getLista(){
        return this.Lista_Medicamentos;
    }
    @Override
    public String getEntidad(){
        return "Medicamento";
    }
    @Override
    public Class getClase(){
        return Medicamento.class;
    }
    @Override
    public Function<Medicamento, String> getFunction(String Atributo){
        switch(Atributo){
            case "med_codigo":
                return Medicamento::getMed_codigo;
        }
        return null; 
    }
    @Override 
    public void setLista(List<Medicamento> Lista){
        this.Lista_Medicamentos=Lista; 
    }
    @Override
    public String[] getAttributes(){
        return new String[]{"Código", "Nombre", "Cantidad", "Presentación", "Descripción"};
    }
    @Override
    public List<String> getAllAtributesFromInstance(int index){
        List<String> Atributos=new ArrayList();
        Atributos.add(this.Lista_Medicamentos.get(index).getMed_codigo());
        Atributos.add(this.Lista_Medicamentos.get(index).getMed_nombre());
        Atributos.add(String.valueOf(this.Lista_Medicamentos.get(index).getMed_cantidad()));
        Atributos.add(this.Lista_Medicamentos.get(index).getMed_presentacion());
        Atributos.add(this.Lista_Medicamentos.get(index).getMed_descripcion());
        return Atributos; 
    }
    @Override
    public List<String> getAllAtributesFromInstance(String ID){
        List<String> Atributos=new ArrayList();
        Medicamento Seleccionado=this.getElementByID(ID);
        Atributos.add(Seleccionado.getMed_codigo());
        Atributos.add(Seleccionado.getMed_nombre());
        Atributos.add(String.valueOf(Seleccionado.getMed_cantidad()));
        Atributos.add(Seleccionado.getMed_presentacion());
        Atributos.add(Seleccionado.getMed_descripcion());
        return Atributos; 
    }
}
