package Controlador;
import BD.ConexionBD;
import Definiciones.Modelo;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class Controlador<T> {
    ConexionBD Conexion_Actual; 
    public abstract List<T> getLista(); 
    public abstract void setLista(List<T> Lista); 
    public abstract String getEntidad(); 
    public abstract Class getClase(); 
    public abstract Function<T, String> getFunction(String Atributo);  
    public abstract String[] getAttributes(); 
    public abstract List<String> getAllAtributesFromInstance(int index);
    public abstract List<String> getAllAtributesFromInstance(String ID);

    public Controlador(ConexionBD Conexion_Actual){
        this.Conexion_Actual=Conexion_Actual; 
    }
    public void InsertToBD(String ID) {  
        T Instancia=this.getElementByID(ID);
        try {
            Conexion_Actual.addPersist(Instancia); 
        } catch (Exception e) {
            System.out.println("Error al Ingresar a la Base de Datos");
        }
    }
    
    public List<String> getListAttribute(String Atributo){
        List<String>Resultado=new ArrayList(); 
        Function<T,String>Getter=this.getFunction(Atributo);
        for(T instancia : this.getLista()){
            Resultado.add(Getter.apply(instancia));
        }
        return Resultado; 
    }
    
    public void selectInstancesFromBD(){
        List<T> Nueva_Lista = Conexion_Actual.SelectAllFrom(getEntidad(), getClase());
        this.setLista(Nueva_Lista);
    }
    
    public void UpdateInstance(T Instancia){
        Conexion_Actual.UpdateInstance(Instancia);
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
    
    public void DeleteAnInstance(String ID_Instancia){
        T Instancia=this.getElementByID(ID_Instancia);
        Conexion_Actual.DeleteInstance(Instancia);
        this.getLista().clear();
        this.selectInstancesFromBD();
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
    public int getListCount(){
        return this.getLista().size();
    }
}
 
