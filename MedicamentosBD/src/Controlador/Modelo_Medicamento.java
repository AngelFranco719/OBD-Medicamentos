package Controlador;
import Definiciones.Medicamento;
import BD.ConexionBD;
import java.util.*;

public class Modelo_Medicamento implements Modelo{
    ConexionBD Conexion_Actual; 
    List<Medicamento>Lista_Medicamentos=new ArrayList();
    public Modelo_Medicamento(ConexionBD Conexion_Actual){
        this.Conexion_Actual=Conexion_Actual; 
    }
    
    @Override
    public void InsertAllToBD(){
        for(Medicamento med : Lista_Medicamentos){
            Conexion_Actual.addPersist(med);
        }
    }
    @Override 
    public void InsertToBD(Object obj){
        try{ 
            Conexion_Actual.addPersist((Medicamento)obj);
        }catch(Exception e){
            System.out.println("Error al Ingresar a la Base de Datos."); 
        }
    }
    public void InitializeInstance(String med_codigo, String med_nombre, int med_cantidad, String med_presentacion, String med_descripcion){
        try{
            Medicamento med=new Medicamento(med_codigo, med_nombre, med_cantidad, med_presentacion, med_descripcion);
            this.Lista_Medicamentos.add(med);
            this.InsertToBD(med);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo.");
        }
    }
    @Override
    public Medicamento getElementByID(String med_codigo){
        Optional<Medicamento> BuscarElemento=this.Lista_Medicamentos.stream()
                .filter(med->med.getMed_codigo().equals(med_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null; 
    }
    
    @Override
    public void AllInstancesToString(){
        for(Medicamento med : Lista_Medicamentos){
            System.out.println(med.toString());
        }
    }
    @Override public void AnInstanceToString(String id){
        Medicamento actual; 
        for(Medicamento med : Lista_Medicamentos){
            if(med.getMed_codigo().equals(id)){
                
            }
        }
    }
}
