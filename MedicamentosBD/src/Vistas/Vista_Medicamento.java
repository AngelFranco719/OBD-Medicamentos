package Vistas;

import BD.ConexionBD;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Medicamento;

public class Vista_Medicamento {
    ConexionBD Conexion_Actual; 
    Modelo_Medicamento Controlador_Med; 
    Modelo_Composicion Controlador_Comp; 
    Modelo_Lista Controlador_Lis; 
    public Vista_Medicamento(ConexionBD Conexion_Actual, Modelo_Composicion Controlador_Comp,Modelo_Lista Controlador_Lis){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Med=Controlador_Med;
        this.Controlador_Comp=Controlador_Comp; 
        this.Controlador_Med=new Modelo_Medicamento(this.Conexion_Actual, this.Controlador_Comp, this.Controlador_Lis);
        Controlador_Med.InitializeInstance("I-2190","Dolorac",12,"Pastillas","Para dolores de cabeza y corporales");
        Controlador_Med.InitializeInstance("P-0182","Tempra", 500, "Bebible", "Para dolores de estómago");
        Controlador_Med.InitializeInstance("A-0091","Excedrin", 100, "Tabletas", "Para aliviar el dolor y reducir la fiebre");
        Controlador_Med.InitializeInstance("N-1917","Flanax", 250, "Pastillas", "Para dolores articulares y musculares");
        Controlador_Med.InitializeInstance("D-9137","Dolotren", 50, "Gel", "Para inflamaciones y dolores localizados");
    }
}
