package Controlador;

import BD.ConexionBD;
import Definiciones.Ingreso;
import Definiciones.Paciente;
import Definiciones.Prescripcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Modelo_Paciente extends Controlador{
    ConexionBD Conexion_Actual; 
    List<Paciente> Lista_Paciente=new ArrayList(); 
    Modelo_Ingreso Ingreso; 
    Modelo_Prescripcion Prescripcion; 
    public Modelo_Paciente(ConexionBD Conexion_Actual, Modelo_Ingreso Ingreso, Modelo_Prescripcion Prescripcion){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Ingreso=Ingreso; 
        this.Prescripcion=Prescripcion; 
    }
    
    public Modelo_Paciente(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual;  
    }
    
    public void setModelo_Ingreso(Modelo_Ingreso Ingreso){
        this.Ingreso=Ingreso; 
    }
    public void setModelo_Prescripcion(Modelo_Prescripcion Prescripcion){
        this.Prescripcion=Prescripcion;
    }
    
    public void InitializeInstance(int p_nss, String p_nomb, float p_estat, float p_peso){
        try{
            Paciente pac=new Paciente(p_nss, p_nomb, p_estat, p_peso); 
            Lista_Paciente.add(pac);
            this.InsertToBD(pac);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void RelationshipPaciente_Prescripcion(String pac_codigo, String pres_codigo){
        Paciente p=(Paciente)this.getElementByID(pac_codigo);
        Prescripcion pr=(Prescripcion)Prescripcion.getElementByID(pres_codigo);
        p.formPac_pre(pr);
        pr.formPres_pac(p);
    }
    public void RelationshipPaciente_Ingreso(String pac_nombre, String ing_codigo){
        Paciente p=(Paciente)this.getElementByID(pac_nombre);
        Ingreso i=(Ingreso)(Ingreso.getElementByID(ing_codigo));
        p.formPac_ing(i);
        i.formIng_pac(p);
    }
    
    @Override
    public List<Paciente> getLista(){
        return this.Lista_Paciente;
    }
}
