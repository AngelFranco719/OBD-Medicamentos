package Controlador;

import BD.ConexionBD;
import Definiciones.Prescripcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Modelo_Prescripcion implements Modelo{
    ConexionBD Conexion_Actual; 
    List<Prescripcion> Lista_Prescripcion=new ArrayList(); 
    Modelo_Paciente Paciente; 
    Modelo_Personal Personal; 
    Modelo_Lista Lista; 
    public Modelo_Prescripcion(ConexionBD Conexion_Actual,Modelo_Paciente Paciente,Modelo_Personal Personal, Modelo_Lista Lista){
        this.Conexion_Actual=Conexion_Actual; 
        this.Paciente=Paciente; 
        this.Personal=Personal; 
        this.Lista=Lista; 
    }
    public void InitializeInstance(String codigo, String Fecha, String usos, String instrucciones){
        try{
            Prescripcion pre=new Prescripcion(codigo, Fecha, usos, instrucciones); 
            Lista_Prescripcion.add(pre);
            this.InsertToBD(pre);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void RelationshipPrescripcion_Paciente(String pres_codigo, String pac_nombre){
        this.getElementByID(pres_codigo).formPres_pac(Paciente.getElementByID(pac_nombre));
    }
    public void RelationshipPrescripcion_Personal(String pres_codigo, String per_nombre){
        this.getElementByID(pres_codigo).formPres_per(Personal.getElementByID(per_nombre));
    }
    public void RelationshipPrescripcion_Lista(String pres_codigo, String lis_codigo){
        this.getElementByID(pres_codigo).formPres_lis(Lista.getElementByID(lis_codigo));
    }
    @Override
    public Prescripcion getElementByID(String pres_codigo){
        Optional<Prescripcion>BuscarElemento=this.Lista_Prescripcion.stream()
                .filter(pres->pres.getPres_codigo().equals(pres_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null;
    }
    @Override
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((Prescripcion)obj);
        }catch(Exception e){
            System.out.println("Error al Ingresar a la Base de Datos.");
        }
    }
    @Override 
    public void InsertAllToBD(){
        for(Prescripcion pre : Lista_Prescripcion){
            Conexion_Actual.addPersist(pre);
        }
    }
    @Override
    public void AllInstancesToString(){
        for(Prescripcion pre : Lista_Prescripcion){
            System.out.println(pre.toString()); 
        }
    }
    @Override
    public void AnInstanceToString(String id){
    
    }
}
