package medicamentosbd; 
import BD.ConexionBD;
import Definiciones.*;
public class MedicamentosBD {   
    public static void main(String[] args) {
        ConexionBD Nueva_Conexion=new ConexionBD();
        Personal p1=new Personal("Angel David Franco Hernandez", Personal.Roles.ENFERMERO, "A-291281"); 
        Administracion a1=new Administracion("C-192", "11-10-2024","12:25:30","Completado");
        Prescripcion pr1=new Prescripcion("P01-10","2024-12-13","2 Veces","Administrar medicamentos via oral");
        Lista l1=new Lista("L01-10","Cada 4hr","20ml",5,"2024-10-10","10:36:02");
  
        a1.formAdm_per(p1);
        p1.formPer_adm(a1);
        pr1.formPres_lis(l1);
        l1.formLis_pres(pr1);
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(pr1.toString());
        System.out.println(l1.toString());
        
        /*INGRESOS DE LOS PASIENTES*/
        Ingreso i1 = new Ingreso(1, "Cuerpo cortado, nauseas y dolor de cabeza", "Infeccion en la vias respiratorias", "2024-09-26 13:20:10", "2024-09-26 13:20:10");
        Ingreso i2 = new Ingreso(2, "Ardor en garganta", "Gripa", "2024-08-01 09:20:10", "2024-08-01 09:05:32");
        Ingreso i3 = new Ingreso(3, "No soporta la luz, dolor de cabeza, malestar en general", "Migraña", "2024-10-30 15:00:10","2024-10-30 14:10:48");
        Ingreso i4 = new Ingreso(4, "Enrojecimiento en la piel", "Alergias", "2024-07-18 18:30:47", "2024-7-18 19:01:18");
        Ingreso i5 = new Ingreso(5, "Salpullido y comezon en la piel ", "Varicela", "2024-10-10 10:00:10", "2024-10-16 9:11:00");
        Ingreso i6 = new Ingreso(6, "Diarrea, fiebre, dolor en el abdomen", "Infeccion estomacal", "2024-09-30 16:50:10", "2024-10-13 13:0:10");
        
        Paciente pa1 = new Paciente(39792411, "Ricardo Moreno", (float) 1.71, (float) 80.200);
        Paciente pa2 = new Paciente(47018329, "Maria Gonzalez", (float) 1.63, (float) 59.300);
        Paciente pa3 = new Paciente(57829375, "Jesus Ochoa", (float) 1.70, (float) 87.150);
        
        pa1.formPac_ing(i1);
        pa1.formPac_ing(i6);
        pa2.formPac_ing(i2);
        pa2.formPac_ing(i3);
        pa3.formPac_ing(i4);
        pa3.formPac_ing(i5);
        
        i1.formIng_pac(pa1);
        i2.formIng_pac(pa2);
        i3.formIng_pac(pa2);
        i4.formIng_pac(pa3);
        i5.formIng_pac(pa3);
        i6.formIng_pac(pa1);
        
        System.out.println("\n\n \t--- Datos de los pacientes y sus ingresos --- ");
        System.out.println(pa1.toString());
        System.out.println(pa2.toString());
        System.out.println(pa3.toString()); 
        
        
    }
}
