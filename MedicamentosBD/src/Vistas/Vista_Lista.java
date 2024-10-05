package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Medicamento;
import Controlador.Modelo_Prescripcion;
public class Vista_Lista extends Vista{
    ConexionBD Conexion_Actual; 
    Modelo_Lista Controlador_Lis; 
    Modelo_Prescripcion Controlador_Pre; 
    Modelo_Medicamento Controlador_Med; 
    Modelo_Administracion Controlador_Adm; 
    public Vista_Lista(ConexionBD Conexion_Actual,Modelo_Lista Lista,Modelo_Prescripcion Controlador_Pre,Modelo_Medicamento Controlador_Med,Modelo_Administracion Controlador_Adm){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Adm=Controlador_Adm; 
        this.Controlador_Med=Controlador_Med; 
        this.Controlador_Pre=Controlador_Pre; 
        this.Controlador_Lis=Lista;
        /// Inicialización de Objetos
        Controlador_Lis.InitializeInstance("L01-10","Cada 4hr","20ml",5,"10-10-2024 10:36:02");
        Controlador_Lis.InitializeInstance("L02-11","Cada 6hr","3.5ml",3,"11-10-2024 10:00:02");
        Controlador_Lis.InitializeInstance("L03-12","Cada 24hr","500gr",2,"12-10-2024 11:00:02");
        Controlador_Lis.InitializeInstance("L04-13","Cada 24hr","5ml",5,"13-10-2024 11:30:02");
        Controlador_Lis.InitializeInstance("L05-14","Cada 6hr","200gr",7,"14-10-2024 13:40:02");
        Controlador_Lis.InitializeInstance("L06-15","Cada 8hr","15ml",6,"15-10-2024 13:50:02");
        
    }
    
    @Override
    public Modelo_Lista getControlador(){
        return this.Controlador_Lis;
    }
    
    public void InicializarRelaciones(){
        /// Relacion Lis-Med
        Controlador_Lis.RelationshipLista_Medicamento("L01-10", "I-2190");
        Controlador_Lis.RelationshipLista_Medicamento("L01-10", "P-0182");
        Controlador_Lis.RelationshipLista_Medicamento("L02-11", "A-0091");
        Controlador_Lis.RelationshipLista_Medicamento("L02-11", "N-1917");
        Controlador_Lis.RelationshipLista_Medicamento("L03-12", "I-2190");
        Controlador_Lis.RelationshipLista_Medicamento("L03-12", "A-0091");
        Controlador_Lis.RelationshipLista_Medicamento("L04-13", "N-1917");
        Controlador_Lis.RelationshipLista_Medicamento("L04-13", "A-0091");
        ///Relacion Lis-Pres
        Controlador_Lis.RelationshipLista_Prescripcion("L01-10", "P01-10");
        Controlador_Lis.RelationshipLista_Prescripcion("L02-11", "P02-11");
        Controlador_Lis.RelationshipLista_Prescripcion("L03-12", "P03-12");
        Controlador_Lis.RelationshipLista_Prescripcion("L04-13", "P04-13");
    }
}
