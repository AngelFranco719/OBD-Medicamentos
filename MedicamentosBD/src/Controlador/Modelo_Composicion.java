package Controlador;
import BD.ConexionBD;
import Definiciones.Composicion;
import java.util.*;
public class Modelo_Composicion implements Modelo{
    List<Composicion> Lista_Composicion=new ArrayList(); 
    Modelo_Medicamento Medicamento;
    Modelo_PrincipioActivo Activo; 
    ConexionBD  Conexion_Actual; 
    public Modelo_Composicion(ConexionBD Conexion_Actual, Modelo_Medicamento Medicamento){
        this.Conexion_Actual=Conexion_Actual; 
        this.Medicamento=Medicamento; 
    }
    public void InitializeInstance(String comp_codigo,int comp_cantidad){
        try{
            Composicion comp=new Composicion(comp_codigo, comp_cantidad); 
            Lista_Composicion.add(comp);
            this.InsertToBD(comp);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }   
    }
    public void RelationshipComposicion_Medicamento(String comp_codigo, String med_codigo){
        this.getElementByID(comp_codigo).formComp_med(Medicamento.getElementByID(med_codigo));
    }
    public void RelationshipComposicion_Activo(String comp_codigo, String act_codigo){
        this.getElementByID(comp_codigo).formComp_act(Activo.getElementByID(act_codigo));
    }
    @Override
    public void InsertAllToBD(){
        for(Composicion comp : Lista_Composicion){
            Conexion_Actual.addPersist(comp);
        }
    }
    @Override
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((Composicion)obj);
        }catch(Exception e){
            System.out.println("Error al ingresar a la Base de Datos");
        }
    }
    @Override
    public Composicion getElementByID(String comp_codigo){
        Optional<Composicion> BuscarElemento=this.Lista_Composicion.stream()
                .filter(comp->comp.getComp_codigo().equals(comp_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null; 
    }
    
    @Override
    public void AnInstanceToString(String id){
    
    }
    
    @Override
    public void AllInstancesToString(){
        for(Composicion com : Lista_Composicion){
            System.out.println(com.toString());
        }
    }
}
