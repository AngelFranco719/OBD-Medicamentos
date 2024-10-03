package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Medicamento;
import Controlador.Modelo_Prescripcion;
public class Vista_Lista {
    ConexionBD Conexion_Actual; 
    Modelo_Lista Controlador_Lis; 
    Modelo_Prescripcion Controlador_Pre; 
    Modelo_Medicamento Controlador_Med; 
    Modelo_Administracion Controlador_Adm; 
    public Vista_Lista(ConexionBD Conexion_Actual,Modelo_Prescripcion Controlador_Pre,Modelo_Medicamento Controlador_Med,Modelo_Administracion Controlador_Adm){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Adm=Controlador_Adm; 
        this.Controlador_Med=Controlador_Med; 
        this.Controlador_Pre=Controlador_Pre; 
        this.Controlador_Lis=new Modelo_Lista(this.Conexion_Actual, this.Controlador_Pre,this.Controlador_Med, this.Controlador_Adm);
        Controlador_Lis.InitializeInstance("L01-10","Cada 4hr","20ml",5,"10-10-2024 10:36:02");
        Controlador_Lis.InitializeInstance("L02-11","Cada 6hr","3.5ml",3,"11-10-2024 10:00:02");
        Controlador_Lis.InitializeInstance("L03-12","Cada 24hr","500gr",2,"12-10-2024 11:00:02");
        Controlador_Lis.InitializeInstance("L04-13","Cada 24hr","5ml",5,"13-10-2024 11:30:02");
        Controlador_Lis.InitializeInstance("L05-14","Cada 6hr","200gr",7,"14-10-2024 13:40:02");
        Controlador_Lis.InitializeInstance("L06-15","Cada 8hr","15ml",6,"15-10-2024 13:50:02");
    }
}
