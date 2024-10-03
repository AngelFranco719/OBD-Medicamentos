package Vistas;

import BD.ConexionBD;
import Controlador.Modelo_Ingreso;
import Controlador.Modelo_Paciente;

public class Vista_Ingreso {
    ConexionBD Conexion_Actual; 
    Modelo_Ingreso Controlador_Ingr; 
    Modelo_Paciente Controlador_Pac; 
    public Vista_Ingreso(ConexionBD Conexion_Actual,Modelo_Paciente Controlador_Pac){
        this.Conexion_Actual=Conexion_Actual; 
        this.Controlador_Pac=Controlador_Pac; 
        this.Controlador_Ingr=new Modelo_Ingreso(this.Conexion_Actual, this.Controlador_Pac);
        Controlador_Ingr.InitializeInstance("I-1281",1, "Cuerpo cortado, nauseas y dolor de cabeza", "Infeccion en la vias respiratorias", "26-09-2024 13:20:10", "26-09-2024 16:02:10");
        Controlador_Ingr.InitializeInstance("I-0128",2, "Ardor en garganta", "Gripa", "01-08-2024 09:10:10", "01-08-2024 09:45:32");
        Controlador_Ingr.InitializeInstance("I-1297",3, "No soporta la luz, dolor de cabeza, malestar en general", "Migraña", "30-10-2024 15:00:10","30-10-2024 16:10:48");
        Controlador_Ingr.InitializeInstance("I-9483",4, "Enrojecimiento en la piel", "Alergias", "18-07-2024 18:30:47", "18-7-2024 19:01:18");
        Controlador_Ingr.InitializeInstance("I-1297",5, "Salpullido y comezon en la piel ", "Varicela", "10-10-2024 10:00:10", "16-10-2024 9:11:00");
        Controlador_Ingr.InitializeInstance("I-9373",6, "Diarrea, fiebre, dolor en el abdomen", "Infeccion estomacal", "30-09-2024 16:50:10", "13-10-2024 13:0:10");
    }
}
