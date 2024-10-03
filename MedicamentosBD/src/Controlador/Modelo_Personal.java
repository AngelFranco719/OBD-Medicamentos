package Controlador;

import BD.ConexionBD;
import Definiciones.Personal;
import Definiciones.Personal.Roles;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Modelo_Personal implements Modelo{
    ConexionBD Conexion_Actual; 
    List<Personal> Lista_Personal=new ArrayList();
    Modelo_Administracion Administracion; 
    Modelo_Prescripcion Prescripcion; 
    public Modelo_Personal(ConexionBD Conexion_Actual, Modelo_Administracion Administracion, Modelo_Prescripcion Prescripcion){
        this.Conexion_Actual=Conexion_Actual; 
        this.Administracion=Administracion; 
        this.Prescripcion=Prescripcion; 
    }
    public void InitializeInstance(String per_nombre, String per_rol, String per_cedula){
        try{
            Roles setRol=Roles.valueOf(per_rol);
            Personal per=new Personal(per_nombre, setRol, per_cedula); 
            Lista_Personal.add(per);
            this.InsertToBD(per);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    
    public void RelationshipPersonal_Administracion(String per_nombre, String adm_codigo){
        this.getElementByID(per_nombre).formPer_adm(Administracion.getElementByID(adm_codigo));
    }
    
    public void RelationShipPersonal_Prescripcion(String per_nombre, String pres_codigo){
        this.getElementByID(per_nombre).formPer_pres(Prescripcion.getElementByID(pres_codigo));
    }

    @Override
    public Personal getElementByID(String id){
        Optional<Personal> BuscarElemento=this.Lista_Personal.stream()
                .filter(per->per.getPer_nombre().equals(id))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null; 
    }
    
    @Override
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((Personal)obj);
        }catch(Exception e){
            System.out.println("Error al Ingresar a la Base de Datos.");
        }
    }
    @Override 
    public void InsertAllToBD(){
        for(Personal per : Lista_Personal){
            Conexion_Actual.addPersist(per);
        }
    }
    @Override
    public void AllInstancesToString(){
        for(Personal per : Lista_Personal){
            System.out.println(per.toString()); 
        }
    }
    @Override
    public void AnInstanceToString(String id){
    
    }
}
