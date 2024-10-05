package Vistas;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Lista;
import BD.ConexionBD;
import Controlador.Modelo_Personal;

public class Vista_Administracion extends Vista{
    ConexionBD Conexion_Actual; 
    Modelo_Administracion Controlador_Adm; 
    Modelo_Lista Controlador_Lis; 
    Modelo_Personal Controlador_Per; 
    public Vista_Administracion(ConexionBD Conexion_Actual, Modelo_Administracion Administracion,Modelo_Lista Controlador_Lis, Modelo_Personal Controlador_Per){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Lis=Controlador_Lis; 
        this.Controlador_Per=Controlador_Per; 
        this.Controlador_Adm=Administracion;
        /// Iniciar Objetos
        Controlador_Adm.InitializeInstance("C-192", "11-10-2024 12:25:30","Completado");
        Controlador_Adm.InitializeInstance("A-122", "12-10-2024 05:39:20","Completado");
        Controlador_Adm.InitializeInstance("E-674", "13-10-2024 10:00:00","Programado");
        Controlador_Adm.InitializeInstance("D-981", "14-10-2024 15:00:00","Programado");
        
        ;
    }
    
    @Override
    public Modelo_Administracion getControlador(){
        return this.Controlador_Adm;
    }
    
    public void InicializarRelaciones(){
         /// Iniciar Relaciones Adm-Per
        Controlador_Adm.RelationshipAdministracion_Personal("C-192", "Angel David Franco Hernandez");
        Controlador_Adm.RelationshipAdministracion_Personal("A-122", "Angel David Franco Hernandez");
        Controlador_Adm.RelationshipAdministracion_Personal("E-674", "Cristian Enrique Rivas Anzaldo");
        Controlador_Adm.RelationshipAdministracion_Personal("D-981", "Cristian Enrique Rivas Anzaldo");
//        /// Iniciar Relaciones Adm-Lis
        Controlador_Adm.RelationshipAdministracion_Lista("C-192", "L01-10");
        Controlador_Adm.RelationshipAdministracion_Lista("A-122", "L02-11");
        Controlador_Adm.RelationshipAdministracion_Lista("D-981", "L03-12");
        Controlador_Adm.RelationshipAdministracion_Lista("E-674", "L04-13");
        Controlador_Adm.InsertAllToBD();
    }
}
