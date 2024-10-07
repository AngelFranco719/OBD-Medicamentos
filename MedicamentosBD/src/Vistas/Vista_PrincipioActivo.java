package Vistas;

import BD.ConexionBD;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_PrincipioActivo;

public class Vista_PrincipioActivo extends Vista{
    ConexionBD Conexion_Actual; 
    Modelo_PrincipioActivo Controlador_Act; 
    Modelo_Composicion Controlador_Comp; 
    public Vista_PrincipioActivo(ConexionBD Conexion_Actual,Modelo_PrincipioActivo Activo,Modelo_Composicion Controlador_Comp){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Comp=Controlador_Comp;
        this.Controlador_Act=Activo;
        // Inicializacion Objetos
        Controlador_Act.InitializeInstance("D5009", "Ibuprofeno", "Antiinflamatorio no esteroideo");
        Controlador_Act.InitializeInstance("D5010", "Paracetamol", "Analgésico y antipirético");
        Controlador_Act.InitializeInstance("D5011", "Aspirina", "Antiinflamatorio y analgésico");
        Controlador_Act.InitializeInstance("D5012", "Naproxeno", "Antiinflamatorio no esteroideo");
        Controlador_Act.InitializeInstance("D5013", "Diclofenaco", "Antiinflamatorio y analgésico");
    }
    
    @Override
    public Modelo_PrincipioActivo getControlador(){
        return this.Controlador_Act;
    }
    
    public void InicializarRelacion(){
        Controlador_Act.InsertAllToBD();
    }
}
