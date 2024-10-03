package Vistas;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Lista;
import BD.ConexionBD;
import Controlador.Modelo_Personal;

public class Vista_Administracion {
    ConexionBD Conexion_Actual; 
    Modelo_Administracion Controlador_Adm; 
    Modelo_Lista Controlador_Lis; 
    Modelo_Personal Controlador_Per; 
    public Vista_Administracion(ConexionBD Conexion_Actual, Modelo_Lista Controlador_Lis, Modelo_Personal Controlador_Per){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Lis=Controlador_Lis; 
        this.Controlador_Per=Controlador_Per; 
        this.Controlador_Adm=new Modelo_Administracion(this.Conexion_Actual,this.Controlador_Per ,this.Controlador_Lis);
        Controlador_Adm.InitializeInstance("C-192", "11-10-2024 12:25:30","Completado");
        Controlador_Adm.InitializeInstance("A-122", "12-10-2024 05:39:20","Completado");
        Controlador_Adm.InitializeInstance("E-674", "13-10-2024 10:00:00","Programado");
        Controlador_Adm.InitializeInstance("D-981", "14-10-2024 15:00:00","Programado");
    }
}
