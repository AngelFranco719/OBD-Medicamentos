package Controlador;

import BD.ConexionBD;
import Definiciones.Administracion;
import Definiciones.Personal;
import Definiciones.Personal.Roles;
import Definiciones.Prescripcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Modelo_Personal extends Controlador<Personal>{
    ConexionBD Conexion_Actual; 
    List<Personal> Lista_Personal=new ArrayList();
    Modelo_Administracion Administracion; 
    Modelo_Prescripcion Prescripcion; 
    public Modelo_Personal(ConexionBD Conexion_Actual, Modelo_Administracion Administracion, Modelo_Prescripcion Prescripcion){
        super(Conexion_Actual); 
        this.Conexion_Actual=Conexion_Actual; 
        this.Administracion=Administracion; 
        this.Prescripcion=Prescripcion; 
    }
    
    public Modelo_Personal(ConexionBD Conexion_Actual){
        super(Conexion_Actual); 
        this.Conexion_Actual=Conexion_Actual; 
         this.selectInstancesFromBD();
    }
    
    public void setModelo_Administracion(Modelo_Administracion Administracion){
        this.Administracion=Administracion; 
    }
    public void setModelo_Prescripcion(Modelo_Prescripcion Prescripcion){
        this.Prescripcion=Prescripcion; 
    }
    
    public void InitializeInstance(String per_nombre, String per_rol, String per_cedula){
        try{
            Roles setRol=Roles.valueOf(per_rol);
            Personal per=new Personal(per_nombre, setRol, per_cedula); 
            Lista_Personal.add(per);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    
    public void RelationshipPersonal_Administracion(String per_nombre, String adm_codigo){
        Personal p=(Personal)this.getElementByID(per_nombre);
        Administracion a=(Administracion)Administracion.getElementByID(adm_codigo);
        p.formPer_adm(a);
        a.formAdm_per(p);
    }
    
    public void RelationShipPersonal_Prescripcion(String per_nombre, String pres_codigo){
        Personal p=(Personal)this.getElementByID(per_nombre);
        Prescripcion pr=(Prescripcion)Prescripcion.getElementByID(pres_codigo);
        p.formPer_pres(pr);
        pr.formPres_per(p);
    }

    
    @Override
    public List<Personal>getLista(){
        System.out.println(this.hashCode()); 
        return this.Lista_Personal;
    }
    @Override
    public String getEntidad(){
        return "Personal";
    }
    @Override
    public Class getClase(){
        return Personal.class;
    }
    @Override
    public Function<Personal, String> getFunction(String Atributo){
        switch(Atributo){
            case "per_nombre":
                return Personal::getPer_nombre;
        }
        return null; 
    }
    @Override 
    public void setLista(List<Personal> Lista){
        this.Lista_Personal=Lista; 
    }

    public void InitializeInstance(String Administracion, String Nombre, String Rol, String Cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
