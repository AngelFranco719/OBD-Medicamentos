package Controlador;
import BD.ConexionBD;
import Definiciones.Administracion;
import java.util.*;
public class Modelo_Administracion implements Modelo{
    ConexionBD Conexion_Actual;
    List<Administracion>Lista_Administracion=new ArrayList(); 
    Modelo_Personal Personal; 
    Modelo_Lista Lista; 
    public Modelo_Administracion(ConexionBD Conexion_Actual, Modelo_Personal Personal, Modelo_Lista Lista){
        this.Conexion_Actual=Conexion_Actual; 
        this.Personal=Personal; 
        this.Lista=Lista; 
    }
    
    public void InitializeInstance(String adm_codigo, String adm_fecha, String adm_registro){
        try{
            Administracion adm=new Administracion(adm_codigo, adm_fecha, adm_registro); 
            Lista_Administracion.add(adm);
            this.InsertToBD(adm);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    
    public void RelationshipAdministracion_Personal(String adm_codigo, String per_codigo){
        this.getElementByID(adm_codigo).formAdm_per(Personal.getElementByID(per_codigo));
    }
    
    public void RelationshipAdministracion_Lista(String adm_codigo, String lis_codigo){
        this.getElementByID(adm_codigo).formAdm_lis(Lista.getElementByID(lis_codigo));
    }
    
    @Override
    public void InsertToBD(Object obj) { // Debe recibir un objeto de tipo Administracion
        try {
            Conexion_Actual.addPersist(obj); // No necesitas hacer el cast
        } catch (Exception e) {
            System.out.println("Error al Ingresar a la Base de Datos");
        }
    }
    
    @Override
    public void InsertAllToBD(){
        for(Administracion adm : Lista_Administracion){
            Conexion_Actual.addPersist(adm);
        }
    }
    
    @Override
    public Administracion getElementByID(String adm_codigo){
        Optional<Administracion> BuscarElemento=this.Lista_Administracion.stream()
                .filter(med -> med.getAdm_codigo().equals(adm_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()){
            return BuscarElemento.get();
        }
        else{
            return null;
        }  
    }
    
    @Override 
    public void AnInstanceToString(String id){
    
    }
    @Override 
    public void AllInstancesToString(){
        for(Administracion adm : Lista_Administracion){
            System.out.println(adm.toString());
        }
    }
}
