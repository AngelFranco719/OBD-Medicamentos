package Controlador;

import BD.ConexionBD;
import Definiciones.PrincipioActivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Modelo_PrincipioActivo implements Modelo{
    ConexionBD Conexion_Actual; 
    List<PrincipioActivo> Lista_Activo=new ArrayList(); 
    Modelo_Composicion Composicion; 
    public Modelo_PrincipioActivo(ConexionBD Conexion_Actual, Modelo_Composicion Composicion){
        this.Conexion_Actual=Conexion_Actual; 
        this.Composicion=Composicion; 
    }
    public void InitializeInstance(String pri_codigo, String pri_nombre, String pri_descripcion){
        try{
            PrincipioActivo lis=new PrincipioActivo(pri_codigo, pri_nombre, pri_descripcion); 
            Lista_Activo.add(lis);
            this.InsertToBD(lis);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    
    public void RelationshipPrincipio_Composicion(String pri_codigo, String comp_codigo){
        this.getElementByID(pri_codigo).formAct_comp(Composicion.getElementByID(comp_codigo));
    }
    
    @Override
    public PrincipioActivo getElementByID(String act_codigo){
        Optional<PrincipioActivo>BuscarElemento=this.Lista_Activo.stream()
                .filter(act->act.getAct_codigo().equals(act_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null;
    }
    @Override
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((PrincipioActivo)obj);
        }catch(Exception e){
            System.out.println("Error al Ingresar a la Base de Datos.");
        }
    }
    @Override 
    public void InsertAllToBD(){
        for(PrincipioActivo act : Lista_Activo){
            Conexion_Actual.addPersist(act);
        }
    }
    @Override
    public void AllInstancesToString(){
        for(PrincipioActivo act : Lista_Activo){
            System.out.println(act.toString()); 
        }
    }
    @Override
    public void AnInstanceToString(String id){
    
    }
}
