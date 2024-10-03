package Vistas;

import BD.ConexionBD;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Paciente;
import Controlador.Modelo_Personal;
import Controlador.Modelo_Prescripcion;

public class Vista_Prescripcion {
    ConexionBD Conexion_Actual; 
    Modelo_Prescripcion Controlador_Pres; 
    Modelo_Paciente Controlador_Pac; 
    Modelo_Personal Controlador_Per; 
    Modelo_Lista Controlador_Lis; 
          
    public Vista_Prescripcion(ConexionBD Conexion_Actual,Modelo_Paciente Controlador_Pac, Modelo_Personal Controlador_Per,Modelo_Lista Controlador_Lis){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Pac=Controlador_Pac;
        this.Controlador_Per=Controlador_Per;
        this.Controlador_Lis=Controlador_Lis; 
        this.Controlador_Pres=new Modelo_Prescripcion(this.Conexion_Actual,this.Controlador_Pac,this.Controlador_Per,this.Controlador_Lis=Controlador_Lis);
        Controlador_Pres.InitializeInstance("P01-10","12-10-2024 10:00:00","2 Veces","Administrar medicamentos via oral");
        Controlador_Pres.InitializeInstance("P02-11","13-10-2024 10:00:00","1 Veces","Administrar medicamentos via intramuscular");
        Controlador_Pres.InitializeInstance("P03-12","14-10-2024 10:00:00","3 Veces","Administrar medicamentos via oral");
        Controlador_Pres.InitializeInstance("P04-13","15-10-2024 10:00:00","2 Veces","Administrar medicamentos via intramuscular");
        Controlador_Pres.InitializeInstance("P05-14","16-10-2024 10:00:00","4 Veces","Administrar medicamentos via oral");
        Controlador_Pres.InitializeInstance("P06-15","17-10-2024 10:00:00","1 Veces","Administrar medicamentos via oral");
    }
}
