package medicamentosbd; 
import BD.ConexionBD;
import Definiciones.*;
public class MedicamentosBD {   
    public static void main(String[] args) {
        ConexionBD Nueva_Conexion=new ConexionBD();
        /// Objetos de Personal
        Personal p1=new Personal("Angel David Franco Hernandez", Personal.Roles.ENFERMERO, "A-291281"); 
        Personal p2=new Personal("Isay Fajardo Reyes", Personal.Roles.MEDICO, "FA-192181"); 
        Personal p3=new Personal("Karla Citlaly Gomez Gomez", Personal.Roles.MEDICO, "KG-512891");
        Personal p4=new Personal("Cristian Enrique Rivas Anzaldo", Personal.Roles.ENFERMERO, "RI-12086");
        /// Objetos de Administración
        Administracion a1=new Administracion("C-192", "11-10-2024 12:25:30","Completado");
        Administracion a2=new Administracion("A-122", "12-10-2024 05:39:20","Completado");
        Administracion a3=new Administracion("E-674", "13-10-2024 10:00:00","Programado");
        Administracion a4=new Administracion("D-981", "14-10-2024 15:00:00","Programado");
        
        p1.formPer_adm(a1);
        p1.formPer_adm(a2);
        p4.formPer_adm(a3);
        p4.formPer_adm(a4);
        
        Nueva_Conexion.addPersist(p1);
        Nueva_Conexion.addPersist(p2);
        Nueva_Conexion.addPersist(p3);
        Nueva_Conexion.addPersist(p4);
        Nueva_Conexion.addPersist(a1);
        Nueva_Conexion.addPersist(a2);
        Nueva_Conexion.addPersist(a3);
        Nueva_Conexion.addPersist(a4);
        
        //Objetos de Prescripcion
        Prescripcion pr1=new Prescripcion("P01-10","2024-12-13","2 Veces","Administrar medicamentos via oral");
        Nueva_Conexion.addPersist(pr1);
        Prescripcion pr2=new Prescripcion("P02-11","2024-12-14","1 Veces","Administrar medicamentos via intramuscular");
        Nueva_Conexion.addPersist(pr2);
        Prescripcion pr3=new Prescripcion("P03-12","2024-12-15","3 Veces","Administrar medicamentos via oral");
        Nueva_Conexion.addPersist(pr3);
        Prescripcion pr4=new Prescripcion("P04-13","2024-12-16","2 Veces","Administrar medicamentos via intramuscular");
        Nueva_Conexion.addPersist(pr4);
        Prescripcion pr5=new Prescripcion("P05-14","2024-12-17","4 Veces","Administrar medicamentos via oral");
        Nueva_Conexion.addPersist(pr5);
        Prescripcion pr6=new Prescripcion("P06-15","2024-12-18","1 Veces","Administrar medicamentos via oral");
        Nueva_Conexion.addPersist(pr6);
        
        //Objetos de Lista 
        Lista l1=new Lista("L01-10","Cada 4hr","20ml",5,"2024-10-10 10:36:02");
        Nueva_Conexion.addPersist(l1);
        Lista l2=new Lista("L02-11","Cada 6hr","3.5ml",3,"2024-10-11 10:00:02");
        Nueva_Conexion.addPersist(l2);
        Lista l3=new Lista("L03-12","Cada 24hr","500gr",2,"2024-10-12 11:00:02");
        Nueva_Conexion.addPersist(l3);
        Lista l4=new Lista("L04-13","Cada 24hr","5ml",5,"2024-10-13 11:30:02");
        Nueva_Conexion.addPersist(l4);
        Lista l5=new Lista("L05-14","Cada 6hr","200gr",7,"2024-10-14 13:40:02");
        Nueva_Conexion.addPersist(l5);
        Lista l6=new Lista("L06-15","Cada 8hr","15ml",6,"2024-10-15 13:50:02");
        Nueva_Conexion.addPersist(l6);
  
        a1.formAdm_per(p1);
        p1.formPer_adm(a1);
        
        pr1.formPres_lis(l1);
        l1.formLis_pres(pr1);
        pr2.formPres_lis(l2);
        l2.formLis_pres(pr2);
        pr3.formPres_lis(l3);
        l3.formLis_pres(pr3);
        pr4.formPres_lis(l4);
        l4.formLis_pres(pr4);
        pr5.formPres_lis(l5);
        l5.formLis_pres(pr5);
        pr6.formPres_lis(l6);
        l6.formLis_pres(pr6);
        
        
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(pr1.toString());
       /* System.out.println(l1.toString());
        
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
