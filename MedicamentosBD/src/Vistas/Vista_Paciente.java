package Vistas;
import BD.ConexionBD;
import Controlador.Modelo_Ingreso;
import Controlador.Modelo_Paciente;
import Controlador.Modelo_Prescripcion;
public class Vista_Paciente {
    ConexionBD Conexion_Actual; 
    Modelo_Paciente Controlador_Pac; 
    Modelo_Ingreso Controlador_Ing; 
    Modelo_Prescripcion Controlador_Pres; 
    public Vista_Paciente(ConexionBD Conexion_Actual, Modelo_Ingreso Controlador_Ing,Modelo_Prescripcion Controlador_Pres){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Pres=Controlador_Pres; 
        this.Controlador_Ing=Controlador_Ing; 
        this.Controlador_Pac=new Modelo_Paciente(this.Conexion_Actual,this.Controlador_Ing,this.Controlador_Pres);
        Controlador_Pac.InitializeInstance(39792411, "Ricardo Moreno", (float) 1.71, (float) 80.200);
        Controlador_Pac.InitializeInstance(47018329, "Maria Gonzalez", (float) 1.63, (float) 59.300);
        Controlador_Pac.InitializeInstance(57829375, "Jesus Ochoa", (float) 1.70, (float) 87.150);
    }
}
