package Controlador;

import BD.ConexionBD;
import Definiciones.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Modelo_Paciente implements Modelo{
    ConexionBD Conexion_Actual; 
    List<Paciente> Lista_Paciente=new ArrayList(); 
    Modelo_Ingreso Ingreso; 
    Modelo_Prescripcion Prescripcion; 
    public Modelo_Paciente(ConexionBD Conexion_Actual, Modelo_Ingreso Ingreso, Modelo_Prescripcion Prescripcion){
        this.Conexion_Actual=Conexion_Actual; 
        this.Ingreso=Ingreso; 
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
        this.getElementByID(pac_codigo).formPac_pre(Prescripcion.getElementByID(pres_codigo));
    }
    public void RelationshipPaciente_Ingreso(String pac_codigo, String ing_codigo){
        this.getElementByID(pac_codigo).formPac_ing(Ingreso.getElementByID(ing_codigo));
    }
    
    @Override
    public Paciente getElementByID(String pac_nombre){
        Optional<Paciente> BuscarElemento=this.Lista_Paciente.stream()
                .filter(pac->pac.getPac_nombre().equals(pac_nombre))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null; 
    }
    
    @Override
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((Paciente)obj);
        }catch(Exception e){
            System.out.println("Error al Ingresar a la Base de Datos.");
        }
    }
    @Override 
    public void InsertAllToBD(){
        for(Paciente pac : Lista_Paciente){
            Conexion_Actual.addPersist(pac);
        }
    }
    @Override
    public void AllInstancesToString(){
        for(Paciente pac : Lista_Paciente){
            System.out.println(pac.toString()); 
        }
    }
    @Override
    public void AnInstanceToString(String id){
    
    }
}
