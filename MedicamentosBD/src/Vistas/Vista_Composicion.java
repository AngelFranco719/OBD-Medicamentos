package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_Medicamento;
public class Vista_Composicion extends Vista{
    ConexionBD Conexion_Actual; 
    Modelo_Composicion Controlador_Comp; 
    Modelo_Medicamento Controlador_Med; 
    public Vista_Composicion(ConexionBD Conexion_Actual,Modelo_Composicion Composicion ,Modelo_Medicamento Controlador_Med){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Med=Controlador_Med; 
        this.Controlador_Comp=Composicion;
        /// Inicializar Objetos.
        Controlador_Comp.InitializeInstance("C-01",109);
        Controlador_Comp.InitializeInstance("C-02",201);
        Controlador_Comp.InitializeInstance("C-03",150);
    }
    @Override
    public Modelo_Composicion getControlador(){
        return this.Controlador_Comp;
    }
    public void InicializarRelaciones(){
//        /// Relacion Comp-Med
        Controlador_Comp.RelationshipComposicion_Medicamento("C-01", "I-2190");
        Controlador_Comp.RelationshipComposicion_Medicamento("C-01", "P-0182");
        Controlador_Comp.RelationshipComposicion_Medicamento("C-01", "A-0091");
        Controlador_Comp.RelationshipComposicion_Medicamento("C-02", "N-1917");
        Controlador_Comp.RelationshipComposicion_Medicamento("C-02", "D-9137");
        Controlador_Comp.RelationshipComposicion_Medicamento("C-02", "I-2190");
        // Relacion Comp-Act
        Controlador_Comp.RelationshipComposicion_Activo("C-01", "D5009");
        Controlador_Comp.RelationshipComposicion_Activo("C-02", "D5010");
        Controlador_Comp.RelationshipComposicion_Activo("C-03", "D5011");
        Controlador_Comp.InsertAllToBD();
    }

}
