package Controlador;
import BD.ConexionBD;
import Definiciones.Composicion;
import Definiciones.Medicamento;
import Definiciones.PrincipioActivo;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
public class Modelo_Composicion extends Controlador<Composicion>{
    List<Composicion> Lista_Composicion=new ArrayList(); 
    Modelo_Medicamento Medicamento;
    Modelo_PrincipioActivo Activo; 
    ConexionBD  Conexion_Actual; 
    public Modelo_Composicion(ConexionBD Conexion_Actual, Modelo_Medicamento Medicamento, Modelo_PrincipioActivo Activo){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Medicamento=Medicamento; 
        this.Activo=Activo; 
        this.selectInstancesFromBD();
    }
    public Modelo_Composicion(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.selectInstancesFromBD();
    }
    
    public void setModelo_Medicamento(Modelo_Medicamento Medicamento,Modelo_PrincipioActivo act){
        this.Medicamento=Medicamento; 
        this.Activo=act; 
    }
    
    public void InitializeInstance(String comp_codigo,int comp_cantidad){
        try{
            Composicion comp=new Composicion(comp_codigo, comp_cantidad); 
            Lista_Composicion.add(comp);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }   
    }
   public void RelationshipComposicion_Medicamento(String comp_codigo, String med_codigo){
        Composicion p=(Composicion)this.getElementByID(comp_codigo);
        Medicamento m=(Medicamento)Medicamento.getElementByID(med_codigo);
        p.formComp_med(m);
        m.formMed_comp(p);
    }
    public void RelationshipComposicion_Activo(String comp_codigo, String act_codigo){
        Composicion p=(Composicion)this.getElementByID(comp_codigo);
        PrincipioActivo a=(PrincipioActivo)Activo.getElementByID(act_codigo);
        p.formComp_act(a);
        a.formAct_comp(p);
    }
    @Override
    public List<Composicion> getLista(){
        return this.Lista_Composicion;
    }
    @Override
    public String getEntidad(){
        return "Composicion";
    }
    @Override
    public Class getClase(){
        return Composicion.class;
    }
    @Override
    public Function<Composicion, String> getFunction(String Atributo){
        switch(Atributo){
            case "comp_codigo":
                return Composicion::getComp_codigo; 
        }
        return null; 
    }
    @Override 
    public void setLista(List<Composicion> Lista){
        this.Lista_Composicion=Lista; 
    }
 
}
