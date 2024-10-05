package Controlador;
import BD.ConexionBD;
import Definiciones.Administracion;
import Definiciones.Lista;
import Definiciones.Personal;
import java.util.*;
public class Modelo_Administracion extends Controlador{
    ConexionBD Conexion_Actual;
    List<Administracion>Lista_Administracion=new ArrayList(); 
    Modelo_Personal Personal; 
    Modelo_Lista Lista; 
    public Modelo_Administracion(ConexionBD Conexion_Actual,Modelo_Personal Personal, Modelo_Lista Lista){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Personal=Personal; 
        this.Lista=Lista; 
    }
    public Modelo_Administracion(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
    }
    
     public void setModelo_Personal(Modelo_Personal Personal){
        this.Personal=Personal;
    }
    public void setModelo_Lista(Modelo_Lista Lista){
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
    public void RelationshipAdministracion_Personal(String adm_codigo, String per_nombre){
        Administracion a=(Administracion)this.getElementByID(adm_codigo);
        Personal p=(Personal)Personal.getElementByID(per_nombre);
        a.formAdm_per(p);
        p.formPer_adm(a);
    }
    
    public void RelationshipAdministracion_Lista(String adm_codigo, String lis_codigo){
        Administracion a=(Administracion)this.getElementByID(adm_codigo);
        Lista l=(Lista)Lista.getElementByID(lis_codigo);
        a.formAdm_lis(l);
        l.dropLis_adm(a);
    }
    @Override 
    public List<Administracion> getLista(){
        return this.Lista_Administracion;
    }
}
