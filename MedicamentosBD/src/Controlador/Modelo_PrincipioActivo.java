package Controlador;

import BD.ConexionBD;
import Definiciones.Composicion;
import Definiciones.PrincipioActivo;
import java.util.ArrayList;
import java.util.List;

public class Modelo_PrincipioActivo extends Controlador{
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
    }
    public void setModelo_Composicion(Modelo_Composicion Composicion){
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
        PrincipioActivo a=(PrincipioActivo)this.getElementByID(pri_codigo);
        Composicion c=(Composicion)(Composicion.getElementByID(comp_codigo));
        a.formAct_comp(c);
        c.formComp_act(a);
    }
    
    @Override
    public List<PrincipioActivo>getLista(){
        return this.Lista_Activo;
    }
}
