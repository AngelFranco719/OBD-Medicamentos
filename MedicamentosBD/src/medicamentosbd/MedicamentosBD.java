package medicamentosbd; 
import BD.ConexionBD;
import Controlador.*;
import Formularios_Inserts.*;
public class MedicamentosBD {  
    static ConexionBD Conexion_Actual=new ConexionBD(); 
    static Modelo_Administracion M_Adm; 
    static Modelo_Composicion M_Comp; 
    static Modelo_Ingreso M_Ing; 
    static Modelo_Lista M_Lis; 
    static Modelo_Medicamento M_Medicamento; 
    static Modelo_Paciente M_Pac;
    static Modelo_Personal M_Per;
    static Modelo_Prescripcion M_Pres;
    static Modelo_PrincipioActivo M_Pri; 

    
    public static void main(String[] args) {
       InicializarControladores(); 
       Formulario_Insert_Medicamento ventana=new Formulario_Insert_Medicamento(M_Medicamento,M_Comp); 
       ventana.setVisible(true);
    }
    
    public static void InicializarControladores(){
        M_Adm=new Modelo_Administracion(Conexion_Actual); 
        M_Comp=new Modelo_Composicion(Conexion_Actual); 
        M_Ing=new Modelo_Ingreso(Conexion_Actual); 
        M_Lis=new Modelo_Lista(Conexion_Actual);
        M_Medicamento=new Modelo_Medicamento(Conexion_Actual); 
        M_Pac=new Modelo_Paciente(Conexion_Actual); 
        M_Per=new Modelo_Personal(Conexion_Actual);
        M_Pres=new Modelo_Prescripcion(Conexion_Actual); 
        M_Pri=new Modelo_PrincipioActivo(Conexion_Actual); 
        RelacionarControladores(); 
    }
    
    public static void RelacionarControladores(){
        M_Adm.setModelo_Personal(M_Per); M_Adm.setModelo_Lista(M_Lis);
        M_Comp.setModelo_Medicamento(M_Medicamento,M_Pri);
        M_Ing.getModelo_Paciente(M_Pac);
        M_Lis.setModelo_Administracion(M_Adm); M_Lis.setModelo_Medicamento(M_Medicamento); M_Lis.setModelo_Prescripcion(M_Pres);
        M_Medicamento.setModelo_Composicion(M_Comp); M_Medicamento.setModelo_Lista(M_Lis);
        M_Pac.setModelo_Ingreso(M_Ing); M_Pac.setModelo_Prescripcion(M_Pres);
        M_Per.setModelo_Administracion(M_Adm); M_Per.setModelo_Prescripcion(M_Pres);
        M_Pres.setModelo_Lista(M_Lis); M_Pres.setModelo_Paciente(M_Pac); M_Pres.setModelo_Personal(M_Per);
        M_Pri.setModelo_Composicion(M_Comp);
    }
    
    
}
