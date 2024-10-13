package Controlador;
import BD.ConexionBD;
import Definiciones.Administracion;
import Definiciones.Lista;
import Definiciones.Personal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
public class Modelo_Administracion extends Controlador<Administracion>{
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
        this.Lista_Administracion=this.Conexion_Actual.SelectAllFrom("Administracion", this.getClase());
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
    private void RelationshipAdministracion_Personal(Administracion Instancia, String per_nombre){
        Personal p=(Personal)Personal.getElementByID(per_nombre);
        Instancia.formAdm_per(p);
        p.formPer_adm(Instancia);
    }
    
    public void RelationshipAdministracion_Lista(String adm_codigo, String lis_codigo){
        Administracion a=(Administracion)this.getElementByID(adm_codigo);
        Lista l=(Lista)Lista.getElementByID(lis_codigo);
        a.formAdm_lis(l);
        l.dropLis_adm(a);
    }
     public void RelationshipAdministracion_Lista(Administracion Instancia, String lis_codigo){
        Lista l=(Lista)Lista.getElementByID(lis_codigo);
        Instancia.formAdm_lis(l);
        l.formLis_adm(Instancia);
    }
    @Override 
    public List<Administracion> getLista(){
        return this.Lista_Administracion;
    }
    @Override 
    public void setLista(List<Administracion> Lista){
        this.Lista_Administracion=Lista; 
    }
    @Override
    public String getEntidad(){
        return "Administracion";
    }
    @Override
    public Class getClase(){
        return Administracion.class;
    }
    @Override
    public Function<Administracion, String> getFunction(String Atributo){
        switch(Atributo){
            case "adm_codigo":
                return Administracion::getAdm_codigo; 
            case "adm_fecha":
                return Administracion::getAdm_fecha; 
        }
        return null; 
    }
    @Override
    public String[] getAttributes(){
        return new String[]{"Código", "Fecha", "Registro", "Personal", "Lista"};
    }
    @Override
    public List<String> getAllAtributesFromInstance(int index){
        List<String> Atributos=new ArrayList();
        Atributos.add(this.Lista_Administracion.get(index).getAdm_codigo());
        Atributos.add(this.Lista_Administracion.get(index).getAdm_fecha());
        Atributos.add(this.Lista_Administracion.get(index).getAdm_registro());
        Atributos.add(this.Lista_Administracion.get(index).getAdm_per());
        Atributos.add(this.Lista_Administracion.get(index).getAdm_lis());
        return Atributos; 
    }
     @Override
    public List<String> getAllAtributesFromInstance(String ID){
        List<String> Atributos=new ArrayList();
        Administracion seleccionado=this.getElementByID(ID);
        Atributos.add(seleccionado.getAdm_codigo());
        Atributos.add(seleccionado.getAdm_fecha());
        Atributos.add(seleccionado.getAdm_registro());
        Atributos.add(seleccionado.getAdm_per());
        Atributos.add(seleccionado.getAdm_lis());
        return Atributos; 
    }
    
    public void ActualizarInstancia(String adm_codigo, String adm_fecha, String adm_registro, String per_nombre, String lis_codigo){
        Administracion nuevaInstancia=new Administracion(adm_codigo, adm_fecha, adm_registro); 
        this.RelationshipAdministracion_Personal(nuevaInstancia, per_nombre);
        this.RelationshipAdministracion_Lista(nuevaInstancia, lis_codigo);
        this.UpdateInstance(nuevaInstancia);
    }
}
