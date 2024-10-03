package Controlador;
import BD.ConexionBD;
import Definiciones.Lista;
import java.util.*;
public class Modelo_Lista implements Modelo{
    ConexionBD Conexion_Actual; 
    List<Lista> Lista_Listas=new ArrayList(); 
    Modelo_Prescripcion Prescripcion; 
    Modelo_Medicamento Medicamento;
    Modelo_Administracion Administracion; 
    public Modelo_Lista(ConexionBD Conexion_Actual, Modelo_Prescripcion Prescripcion, Modelo_Medicamento Medicamento, Modelo_Administracion Administracion){
        this.Conexion_Actual=Conexion_Actual; 
        this.Prescripcion=Prescripcion; 
        this.Medicamento=Medicamento; 
        this.Administracion=Administracion; 
    }
    public void InitializeInstance(String codigo, String intervalo, String dosis, int dias, String fecha_hora_inicio){
        try{
            Lista lis=new Lista(codigo, intervalo, dosis, dias, fecha_hora_inicio); 
            Lista_Listas.add(lis);
            this.InsertToBD(lis);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void RelationshipLista_Prescripcion(String lis_codigo, String pres_codigo){
        this.getElementByID(lis_codigo).formLis_pres(Prescripcion.getElementByID(pres_codigo));
    }
    public void RelationshipLista_Medicamento(String lis_codigo, String med_codigo){
        this.getElementByID(lis_codigo).formLis_med(Medicamento.getElementByID(med_codigo));
    }
    public void RelationshipLista_Administracion(String lis_codigo, String adm_codigo){
        this.getElementByID(lis_codigo).formLis_adm(Administracion.getElementByID(adm_codigo));
    }
    
    @Override
    public Lista getElementByID(String lis_codigo){
        Optional<Lista> BuscarElemento=this.Lista_Listas.stream()
                .filter(lis->lis.getLis_codigo().equals(lis_codigo))
                .findFirst();
        if(BuscarElemento.isPresent()) return BuscarElemento.get();
        else return null; 
    }
    @Override
    public void InsertToBD(Object obj){
        try{
            Conexion_Actual.addPersist((Lista)obj);
        }catch(Exception e){
            System.out.println("Error al Ingresar a la Base de Datos.");
        }
    }
    @Override 
    public void InsertAllToBD(){
        for(Lista lis : Lista_Listas){
            Conexion_Actual.addPersist(lis);
        }
    }
    @Override
    public void AllInstancesToString(){
        for(Lista lis : Lista_Listas){
            System.out.println(lis.toString()); 
        }
    }
    @Override
    public void AnInstanceToString(String id){
    
    }
}
