package medicamentosbd; 
import BD.ConexionBD;
import Controlador.*;
import Vistas.*;
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
    static Vista_Administracion Administracion;
    static Vista_Composicion Composicion;
    static Vista_Ingreso Ingreso;
    static Vista_Lista Lista;
    static Vista_Medicamento Medicamento;
    static Vista_Paciente Paciente;
    static Vista_Personal Personal;
    static Vista_Prescripcion Prescripcion;
    static Vista_PrincipioActivo Principio;
    
    public static void main(String[] args) {
       InicializarControladores();
       InicializarVistas(); 
       InicializarRelaciones(); 
       Composicion.ImprimirInstancias();
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
    
    public static void InicializarRelaciones(){
        Administracion.InicializarRelaciones();
        Ingreso.inicializarRelaciones();
        Composicion.InicializarRelaciones();
        Lista.InicializarRelaciones();
        Medicamento.InicializarRelaciones();
        Paciente.InicializarRelaciones();
        Personal.InicializarRelaciones();
        Prescripcion.InicializarRelacion();
        Principio.InicializarRelacion();
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
    
    public static void InicializarVistas(){
        Administracion=new Vista_Administracion(Conexion_Actual, M_Adm,M_Lis, M_Per);
        Composicion=new Vista_Composicion(Conexion_Actual,M_Comp,M_Medicamento);
        Ingreso=new Vista_Ingreso(Conexion_Actual,M_Ing,M_Pac);
        Lista=new Vista_Lista(Conexion_Actual,M_Lis ,M_Pres,M_Medicamento,M_Adm);
        Medicamento=new Vista_Medicamento(Conexion_Actual,M_Medicamento,M_Comp,M_Lis);
        Paciente=new Vista_Paciente(Conexion_Actual,M_Pac,M_Ing,M_Pres);
        Personal=new Vista_Personal(Conexion_Actual,M_Per,M_Adm,M_Pres);
        Prescripcion=new Vista_Prescripcion(Conexion_Actual,M_Pres,M_Pac,M_Per,M_Lis);
        Principio=new Vista_PrincipioActivo(Conexion_Actual,M_Pri,M_Comp);
    }
    
}
