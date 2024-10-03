package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_Medicamento;
public class Vista_Composicion {
    ConexionBD Conexion_Actual; 
    Modelo_Composicion Controlador_Comp; 
    Modelo_Medicamento Controlador_Med; 
    public Vista_Composicion(ConexionBD Conexion_Actual, Modelo_Medicamento Controlador_Med){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Med=Controlador_Med; 
        this.Controlador_Comp=new Modelo_Composicion(this.Conexion_Actual, Controlador_Med);
        Controlador_Comp.InitializeInstance("C-01",109);
        Controlador_Comp.InitializeInstance("C-02",201);
        Controlador_Comp.InitializeInstance("C-03",150);
    }
}
