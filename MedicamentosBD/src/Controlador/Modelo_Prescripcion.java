package Controlador;

import BD.ConexionBD;
import Definiciones.Lista;
import Definiciones.Paciente;
import Definiciones.Personal;
import Definiciones.Prescripcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Modelo_Prescripcion extends Controlador<Prescripcion>{
    ConexionBD Conexion_Actual; 
    List<Prescripcion> Lista_Prescripcion=new ArrayList(); 
    Modelo_Paciente Paciente; 
    Modelo_Personal Personal; 
    Modelo_Lista Lista; 
    public Modelo_Prescripcion(ConexionBD Conexion_Actual,Modelo_Paciente Paciente,Modelo_Personal Personal, Modelo_Lista Lista){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Paciente=Paciente; 
        this.Personal=Personal; 
        this.Lista=Lista; 
    }
    public Modelo_Prescripcion(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
         this.selectInstancesFromBD();
    }
    public void setModelo_Paciente(Modelo_Paciente Paciente){
        this.Paciente=Paciente; 
    }
    public void setModelo_Personal(Modelo_Personal Personal){
        this.Personal=Personal;
    }
    public void setModelo_Lista(Modelo_Lista Lista){
        this.Lista=Lista;
    }
    public void InitializeInstance(String codigo, String Fecha, String usos, String instrucciones){
        try{
            Prescripcion pre=new Prescripcion(codigo, Fecha, usos, instrucciones); 
            Lista_Prescripcion.add(pre);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void InitializeAndUpdateInstance(String codigo, String Fecha, String usos, String instrucciones,
            String pac_nombre, String per_nombre, String lis_codigo){
        try{
            Prescripcion pre=new Prescripcion(codigo, Fecha, usos, instrucciones); 
            this.RelationshipPrescripcion_Paciente(pre, pac_nombre);
            this.RelationshipPrescripcion_Personal(pre, per_nombre);
            this.RelationshipPrescripcion_Lista(pre, lis_codigo);
            this.UpdateInstance(pre);
            Lista_Prescripcion.clear(); 
            this.selectInstancesFromBD();
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo"+e.toString());
        }
    }
    public void RelationshipPrescripcion_Paciente(String pres_codigo, String pac_nombre){
        Prescripcion p=(Prescripcion)this.getElementByID(pres_codigo);
        Paciente pa=(Paciente)(Paciente.getElementByID(pac_nombre));
        p.formPres_pac(pa);
        pa.formPac_pre(p);
    }
    public void RelationshipPrescripcion_Paciente(Prescripcion p, String pac_nombre){
        Paciente pa=(Paciente)(Paciente.getElementByID(pac_nombre));
        p.formPres_pac(pa);
        pa.formPac_pre(p);
    }
    public void RelationshipPrescripcion_Personal(String pres_codigo, String per_nombre){
        Prescripcion p=(Prescripcion)this.getElementByID(pres_codigo);
        Personal per=(Personal)(Personal.getElementByID(per_nombre));
        p.formPres_per(per);
        per.formPer_pres(p);
    }
    public void RelationshipPrescripcion_Personal(Prescripcion p, String per_nombre){
        Personal per=(Personal)(Personal.getElementByID(per_nombre));
        p.formPres_per(per);
        per.formPer_pres(p);
    }
    public void RelationshipPrescripcion_Lista(String pres_codigo, String lis_codigo){
        Prescripcion p=(Prescripcion)this.getElementByID(pres_codigo);
        Lista l=(Lista)(Lista.getElementByID(lis_codigo));
        p.formPres_lis(l);
        l.formLis_pres(p);
    }
    public void RelationshipPrescripcion_Lista(Prescripcion p, String lis_codigo){
        Lista l=(Lista)(Lista.getElementByID(lis_codigo));
        p.formPres_lis(l);
        l.formLis_pres(p);
    }

    @Override 
    public List<Prescripcion>getLista(){
        return this.Lista_Prescripcion;
    }
    @Override
    public String getEntidad(){
        return "Prescripcion";
    }
    @Override
    public Class getClase(){
        return Prescripcion.class;
    }
    @Override
    public Function<Prescripcion, String> getFunction(String Atributo){
        switch(Atributo){
            case "pres_codigo":
                return Prescripcion::getPres_codigo;
        }
        return null; 
    }
    @Override 
    public void setLista(List<Prescripcion> Lista){
        this.Lista_Prescripcion=Lista; 
    }
     @Override
    public String[] getAttributes(){
        return new String[]{"Código", "Fecha", "Usos", "Instrucciones", "Paciente", "Personal"};
    }
    @Override
    public List<String> getAllAtributesFromInstance(int index){
        List<String> Atributos=new ArrayList();
        Atributos.add(this.Lista_Prescripcion.get(index).getPres_codigo());
        Atributos.add(this.Lista_Prescripcion.get(index).getPres_fecha());
        Atributos.add(this.Lista_Prescripcion.get(index).getPres_usos());
        Atributos.add(this.Lista_Prescripcion.get(index).getPres_instrucciones());
        Atributos.add(this.Lista_Prescripcion.get(index).getPres_pac());
        Atributos.add(this.Lista_Prescripcion.get(index).getPres_per());
        return Atributos; 
    }
    @Override
    public List<String> getAllAtributesFromInstance(String ID){
        List<String> Atributos=new ArrayList();
        Prescripcion Seleccionado=this.getElementByID(ID);
        Atributos.add(Seleccionado.getPres_codigo());
        Atributos.add(Seleccionado.getPres_fecha());
        Atributos.add(Seleccionado.getPres_usos());
        Atributos.add(Seleccionado.getPres_instrucciones());
        Atributos.add(Seleccionado.getPres_pac());
        Atributos.add(Seleccionado.getPres_per());
        return Atributos; 
    }
}
