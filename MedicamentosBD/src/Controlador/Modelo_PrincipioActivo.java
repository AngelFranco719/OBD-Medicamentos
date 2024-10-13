package Controlador;

import BD.ConexionBD;
import Definiciones.Composicion;
import Definiciones.PrincipioActivo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Modelo_PrincipioActivo extends Controlador<PrincipioActivo>{
    ConexionBD Conexion_Actual; 
    List<PrincipioActivo> Lista_Activo=new ArrayList(); 
    Modelo_Composicion Composicion; 
    public Modelo_PrincipioActivo(ConexionBD Conexion_Actual, Modelo_Composicion Composicion){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Composicion=Composicion; 
    }
    public Modelo_PrincipioActivo(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
         this.selectInstancesFromBD();
    }
    public void setModelo_Composicion(Modelo_Composicion Composicion){
        this.Composicion=Composicion; 
    }
    public void InitializeInstance(String pri_codigo, String pri_nombre, String pri_descripcion){
        try{
            PrincipioActivo lis=new PrincipioActivo(pri_codigo, pri_nombre, pri_descripcion); 
            Lista_Activo.add(lis);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void InitializeAndUpdateInstance(String pri_codigo, String pri_nombre, String pri_descripcion, String comp_codigo){
        try{
            PrincipioActivo lis=new PrincipioActivo(pri_codigo, pri_nombre, pri_descripcion); 
            this.RelationshipPrincipio_Composicion(pri_codigo, comp_codigo);
            this.UpdateInstance(lis);
            this.Lista_Activo.clear();
            this.selectInstancesFromBD();
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
   
    
    public void RelationshipPrincipio_Composicion(String pri_codigo, String comp_codigo){
        PrincipioActivo a=(PrincipioActivo)this.getElementByID(pri_codigo);
        Composicion c=(Composicion)(Composicion.getElementByID(comp_codigo));
        a.formAct_comp(c);
        c.formComp_act(a);
    }
    
    @Override
    public List<PrincipioActivo>getLista(){
        return this.Lista_Activo;
    }
    @Override
    public String getEntidad(){
        return "PrincipioActivo";
    }
    @Override
    public Class getClase(){
        return PrincipioActivo.class;
    }
    @Override
    public Function<PrincipioActivo, String> getFunction(String Atributo){
        switch(Atributo){
            case "pri_codigo":
                return PrincipioActivo::getAct_codigo;
        }
        return null; 
    }
    @Override 
    public void setLista(List<PrincipioActivo> Lista){
        this.Lista_Activo=Lista; 
    }
     @Override
    public String[] getAttributes(){
        return new String[]{"Código", "Nombre", "Descripción"};
    }
    @Override
    public List<String> getAllAtributesFromInstance(int index){
        List<String> Atributos=new ArrayList();
        Atributos.add(this.Lista_Activo.get(index).getAct_codigo());
        Atributos.add(this.Lista_Activo.get(index).getAct_nombre());
        Atributos.add(this.Lista_Activo.get(index).getAct_descripcion());
        return Atributos; 
    }
    @Override
    public List<String> getAllAtributesFromInstance(String ID){
        List<String> Atributos=new ArrayList();
        PrincipioActivo Seleccionado=this.getElementByID(ID);
        Atributos.add(Seleccionado.getAct_codigo());
        Atributos.add(Seleccionado.getAct_nombre());
        Atributos.add(Seleccionado.getAct_descripcion());
        return Atributos; 
    }
}
