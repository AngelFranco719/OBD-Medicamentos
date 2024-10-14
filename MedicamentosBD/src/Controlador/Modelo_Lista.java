package Controlador;
import BD.ConexionBD;
import Definiciones.Administracion;
import Definiciones.Lista;
import Definiciones.Medicamento;
import Definiciones.Prescripcion;
import java.util.*;
import java.util.function.Function;
public class Modelo_Lista extends Controlador<Lista>{
    ConexionBD Conexion_Actual; 
    List<Lista> Lista_Listas=new ArrayList(); 
    Modelo_Prescripcion Prescripcion; 
    Modelo_Medicamento Medicamento;
    Modelo_Administracion Administracion; 
    public Modelo_Lista(ConexionBD Conexion_Actual, Modelo_Prescripcion Prescripcion, Modelo_Medicamento Medicamento, Modelo_Administracion Administracion){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
        this.Prescripcion=Prescripcion; 
        this.Medicamento=Medicamento; 
        this.Administracion=Administracion; 
    }
     public Modelo_Lista(ConexionBD Conexion_Actual){
        super(Conexion_Actual);
        this.Conexion_Actual=Conexion_Actual; 
         this.selectInstancesFromBD();
    }
     public void setModelo_Prescripcion(Modelo_Prescripcion Prescripcion){
         this.Prescripcion=Prescripcion; 
     }
     public void setModelo_Medicamento(Modelo_Medicamento Medicamento){
         this.Medicamento=Medicamento; 
     }
     public void setModelo_Administracion(Modelo_Administracion Administracion){
          this.Administracion=Administracion; 
     }
    public void InitializeInstance(String codigo, String intervalo, String dosis, int dias, String fecha_hora_inicio){
        try{
            Lista lis=new Lista(codigo, intervalo, dosis, dias, fecha_hora_inicio); 
            Lista_Listas.add(lis);
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void InitializeAndUpdateInstance(String codigo, String intervalo, String dosis,
            int dias, String fecha_hora_inicio, String pres_codigo, String med_codigo, String adm_codigo){
        try{
            Lista lis=new Lista(codigo, intervalo, dosis, dias, fecha_hora_inicio); 
            this.RelationshipLista_Administracion(lis, adm_codigo);
            this.RelationshipLista_Medicamento(lis, med_codigo);
            this.RelationshipLista_Prescripcion(lis, pres_codigo);
            this.UpdateInstance(lis);
            this.Lista_Listas.clear();
            this.selectInstancesFromBD();
        }catch(Exception e){
            System.out.println("Error al Ingresar al Modelo");
        }
    }
    public void RelationshipLista_Prescripcion(String lis_codigo, String pres_codigo){
        Lista l=(Lista)this.getElementByID(lis_codigo);
        Prescripcion p=(Prescripcion)Prescripcion.getElementByID(pres_codigo);
        l.formLis_pres(p);
        p.formPres_lis(l);
    }
    public void RelationshipLista_Prescripcion(Lista l, String pres_codigo){
        Prescripcion p=(Prescripcion)Prescripcion.getElementByID(pres_codigo);
        l.formLis_pres(p);
        p.formPres_lis(l);
    }
    public void RelationshipLista_Medicamento(String lis_codigo, String med_codigo){
        Lista l=(Lista)this.getElementByID(lis_codigo);
        Medicamento m=(Medicamento)(Medicamento.getElementByID(med_codigo));
        l.formLis_med(m);
        m.formMed_list(l);
    }
    public void RelationshipLista_Medicamento(Lista l, String med_codigo){
        Medicamento m=(Medicamento)(Medicamento.getElementByID(med_codigo));
        l.formLis_med(m);
        m.formMed_list(l);
    }
    public void RelationshipLista_Administracion(String lis_codigo, String adm_codigo){
        Lista l=(Lista)this.getElementByID(lis_codigo);
        Administracion a=(Administracion)(Administracion.getElementByID(adm_codigo));
        l.formLis_adm(a);
        a.formAdm_lis(l);
    }
    public void RelationshipLista_Administracion(Lista l, String adm_codigo){
        Administracion a=(Administracion)(Administracion.getElementByID(adm_codigo));
        l.formLis_adm(a);
        a.formAdm_lis(l);
    }

    @Override
    public List<Lista>getLista(){
        return this.Lista_Listas;
    }
    @Override
    public String getEntidad(){
        return "Lista";
    }
    @Override
    public Class getClase(){
        return Lista.class;
    }
    @Override
    public Function<Lista, String> getFunction(String Atributo){
        switch(Atributo){
            case "lis_codigo":
                return Lista::getLis_codigo;
        }
        return null; 
    }
    @Override 
    public void setLista(List<Lista> Lista){
        this.Lista_Listas=Lista; 
    }
    @Override
    public String[] getAttributes(){
        return new String[]{"Código", "Intervalo", "Dósis", "Días", "Fecha", "Prescripcion", "Medicamento"};
    }
    @Override
    public List<String> getAllAtributesFromInstance(int index){
        List<String> Atributos=new ArrayList();
        Atributos.add(this.Lista_Listas.get(index).getLis_codigo());
        Atributos.add(this.Lista_Listas.get(index).getLis_intervalo());
        Atributos.add(this.Lista_Listas.get(index).getLis_dosis());
        Atributos.add(String.valueOf(this.Lista_Listas.get(index).getLis_dias()));
        Atributos.add(this.Lista_Listas.get(index).getLis_fecha_hora_inicio());
        Atributos.add(this.Lista_Listas.get(index).getLis_pres());
        Atributos.add(this.Lista_Listas.get(index).getLis_med());
        return Atributos; 
    }
    @Override
    public List<String> getAllAtributesFromInstance(String ID){
        List<String> Atributos=new ArrayList();
        Lista Seleccionado=this.getElementByID(ID);
        Atributos.add(Seleccionado.getLis_codigo());
        Atributos.add(Seleccionado.getLis_intervalo());
        Atributos.add(Seleccionado.getLis_dosis());
        Atributos.add(String.valueOf(Seleccionado.getLis_dias()));
        Atributos.add(Seleccionado.getLis_fecha_hora_inicio());
        Atributos.add(Seleccionado.getLis_pres());
        Atributos.add(Seleccionado.getLis_med());
        return Atributos; 
    }
}
