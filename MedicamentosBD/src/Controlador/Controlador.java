package Controlador;
import BD.ConexionBD;
import Definiciones.Modelo;
import java.util.*;

public abstract class Controlador<T> {
    ConexionBD Conexion_Actual; 
    public abstract List<T> getLista(); 
    public Controlador(ConexionBD Conexion_Actual){
        this.Conexion_Actual=Conexion_Actual; 
    }
    public void InsertToBD(T obj) {       
        try {
            Conexion_Actual.addPersist(obj); 
        } catch (Exception e) {
            System.out.println("Error al Ingresar a la Base de Datos");
        }
    }
    
    public void InsertAllToBD(){
        for(T instance : this.getLista()){
            try{
                Conexion_Actual.addPersist(instance);
            }catch(Exception e){
                System.out.println("Error al Ingresar a la Base de Datos"); 
            }
        }
    }
    public void AllInstancesToString(){
        for(T instancia : this.getLista()){
            System.out.println(instancia.toString());
        }
    }
    public void AnInstanceToString(String id){
        List<T> Lista=this.getLista();
        for(T instance : Lista){
            Modelo n_m=(Modelo)instance; 
            if(n_m.getID().equals(id)){
                System.out.println(instance.toString());
            }
        }
    }
    public T getElementByID(String id){
        List<T>Lista=this.getLista();
        for(T instance : Lista){
            Modelo m=(Modelo) instance;
            if(m.getID().equals(id)){
                return instance; 
            }
        }
        return null;
    }
    
}
