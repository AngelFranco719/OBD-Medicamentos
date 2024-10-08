package Controlador;
import BD.ConexionBD;
import Definiciones.Ingreso;
import Definiciones.Paciente;
import java.util.*;
import java.util.function.Function;
public class Modelo_Ingreso extends Controlador<Ingreso>{
    ConexionBD Conexion_Actual; 
    List<Ingreso> Lista_Ingreso=new ArrayList(); 
    Modelo_Paciente Paciente; 
    public Modelo_Ingreso(ConexionBD Conexion_Actual, Modelo_Paciente Paciente){
        super(Conexion_Actual); 
        this.Conexion_Actual=Conexion_Actual; 
        this.Paciente=Paciente; 
    }
    public Modelo_Ingreso(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.selectInstancesFromBD();
    }
    public void getModelo_Paciente(Modelo_Paciente Paciente){
        this.Paciente=Paciente; 
    }
    public void InitializeInstance(String ing_codigo,int i_n, String i_sin, String i_diag, String i_feEnt, String i_feSal){
        try{
            Ingreso ing=new Ingreso(ing_codigo,i_n,i_sin,i_diag,i_feEnt,i_feSal); 
            Lista_Ingreso.add(ing);
        }catch(Exception e){
            System.out.println("Error al ingresar el dato al Modelo.");
        }
    }
    
    public void RelationshipIngreso_Paciente(String ing_codigo, String pac_nombre){
       Ingreso i= (Ingreso)this.getElementByID(ing_codigo);
       Paciente p=(Paciente)Paciente.getElementByID(pac_nombre);
       i.formIng_pac(p);
       p.formPac_ing(i);
    }
    @Override
    public List<Ingreso> getLista(){
        return this.Lista_Ingreso;
    }
    @Override
    public String getEntidad(){
        return "Ingreso";
    }
    @Override
    public Class getClase(){
        return Ingreso.class;
    }
    @Override
    public Function<Ingreso, String> getFunction(String Atributo){
        switch(Atributo){
            case "ing_codigo":
                return Ingreso::getIng_codigo;
        }
        return null; 
    }
    @Override 
    public void setLista(List<Ingreso> Lista){
        this.Lista_Ingreso=Lista; 
    }
}
