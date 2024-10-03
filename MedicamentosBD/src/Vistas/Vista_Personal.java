package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Personal;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Prescripcion;
public class Vista_Personal {
    ConexionBD Conexion_Actual; 
    Modelo_Personal Controlador_Per; 
    Modelo_Administracion Controlador_Adm;
    Modelo_Prescripcion Controlador_Pres; 
    public Vista_Personal(ConexionBD Conexion_Actual, Modelo_Administracion Administracion,Modelo_Prescripcion Controlador_Pres){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Adm=Administracion; 
        this.Controlador_Pres=Controlador_Pres; 
        this.Controlador_Per=new Modelo_Personal(this.Conexion_Actual,this.Controlador_Adm, this.Controlador_Pres);
        Controlador_Per.InitializeInstance("Angel David Franco Hernandez", "ENFERMERO", "A-291281");
        Controlador_Per.InitializeInstance("Isay Fajardo Reyes", "MEDICO", "FA-192181");
        Controlador_Per.InitializeInstance("Karla Citlaly Gomez Gomez", "MEDICO", "KG-512891");
        Controlador_Per.InitializeInstance("Cristian Enrique Rivas Anzaldo", "ENFERMERO", "RI-12086");
    }
}
