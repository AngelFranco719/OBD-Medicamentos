package Controlador;
import BD.ConexionBD;
import Definiciones.Ingreso;
import java.util.*;
public class Modelo_Ingreso implements Modelo{
    ConexionBD Conexion_Actual; 
    List<Ingreso> Lista_Ingreso=new ArrayList(); 
    public Modelo_Ingreso(ConexionBD Conexion_Actual){
        this.Conexion_Actual=Conexion_Actual; 
    }
    public void InitializeInstance(String ing_codigo,int i_n, String i_sin, String i_diag, String i_feEnt, String i_feSal){
        try{
            Ingreso ing=new Ingreso(ing_codigo,i_n,i_sin,i_diag,i_feEnt,i_feSal); 
            Lista_Ingreso.add(ing);
            this.InsertToBD(ing);
        }catch(Exception e){
            System.out.println("Error al ingresar el dato al Modelo.");
        }
    }
    public Ingreso getElementByID(String ing_codigo){
        Optional<Ingreso> BuscarElemento=this.Lista_Ingreso.stream()
                .filter(ing->ing.getIng_codigo().equals(ing_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null; 
    }
    
    @Override 
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((Ingreso)obj);
        }catch(Exception e){
            System.out.println("Error al ingresar a la Base de Datos."); 
        } 
    }
    @Override
    public void InsertAllToBD(){
        for(Ingreso ing : Lista_Ingreso){
            Conexion_Actual.addPersist(ing);
        }
    }
    @Override
    public void AllInstancesToString(){
        for(Ingreso ing : Lista_Ingreso){
            System.out.println(ing.toString());
        }
    }
    @Override
    public void AnInstanceToString(String id){
    }
}
