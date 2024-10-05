package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Personal;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Prescripcion;
public class Vista_Personal extends Vista{
    ConexionBD Conexion_Actual; 
    Modelo_Personal Controlador_Per; 
    Modelo_Administracion Controlador_Adm;
    Modelo_Prescripcion Controlador_Pres; 
    public Vista_Personal(ConexionBD Conexion_Actual ,Modelo_Personal Personal,Modelo_Administracion Administracion,Modelo_Prescripcion Controlador_Pres){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Adm=Administracion; 
        this.Controlador_Pres=Controlador_Pres; 
        this.Controlador_Per=Personal;
        /// Inicializar Objetos
        Controlador_Per.InitializeInstance("Angel David Franco Hernandez", "ENFERMERO", "A-291281");
        Controlador_Per.InitializeInstance("Isay Fajardo Reyes", "MEDICO", "FA-192181");
        Controlador_Per.InitializeInstance("Karla Citlaly Gomez Gomez", "MEDICO", "KG-512891");
        Controlador_Per.InitializeInstance("Cristian Enrique Rivas Anzaldo", "ENFERMERO", "RI-12086");
    }
    
    @Override
    public Modelo_Personal getControlador(){
        return this.Controlador_Per;
    }
    
    public void InicializarRelaciones(){
        /// Relacion Per-Pres
        Controlador_Per.RelationShipPersonal_Prescripcion("Isay Fajardo Reyes","P01-10");
        Controlador_Per.RelationShipPersonal_Prescripcion( "Isay Fajardo Reyes","P02-11");
        Controlador_Per.RelationShipPersonal_Prescripcion( "Karla Citlaly Gomez Gomez","P03-12");
        Controlador_Per.RelationShipPersonal_Prescripcion( "Karla Citlaly Gomez Gomez","P04-13");
    }
}
