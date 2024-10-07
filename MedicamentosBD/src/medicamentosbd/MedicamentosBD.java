package medicamentosbd; 
import BD.ConexionBD;
import Definiciones.*;
public class MedicamentosBD {   
    public static void main(String[] args) {
        ConexionBD Nueva_Conexion=new ConexionBD();
        ///Objetos medicamentos
        Medicamento m1 = new Medicamento("I-2190","Dolorac",12,"Pastillas","Para dolores de cabeza y corporales");
        Medicamento m2 = new Medicamento("P-0182","Tempra", 500, "Bebible", "Para dolores de estómago");
        Medicamento m3 = new Medicamento("A-0091","Excedrin", 100, "Tabletas", "Para aliviar el dolor y reducir la fiebre");
        Medicamento m4 = new Medicamento("N-1917","Flanax", 250, "Pastillas", "Para dolores articulares y musculares");
        Medicamento m5 = new Medicamento("D-9137","Dolotren", 50, "Gel", "Para inflamaciones y dolores localizados");     
        
        //Objetos PincipioActivo
        PrincipioActivo pa1 = new PrincipioActivo("D5009", "Ibuprofeno", "Antiinflamatorio no esteroideo");
        PrincipioActivo pa2 = new PrincipioActivo("D5010", "Paracetamol", "Analgésico y antipirético");
        PrincipioActivo pa3 = new PrincipioActivo("D5011", "Aspirina", "Antiinflamatorio y analgésico");
        PrincipioActivo pa4 = new PrincipioActivo("D5012", "Naproxeno", "Antiinflamatorio no esteroideo");
        PrincipioActivo pa5 = new PrincipioActivo("D5013", "Diclofenaco", "Antiinflamatorio y analgésico");
        
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
        
        //Objetos de Prescripcion
        Prescripcion pr1=new Prescripcion("P01-10","12-10-2024 10:00:00","2 Veces","Administrar medicamentos via oral");
        Prescripcion pr2=new Prescripcion("P02-11","12-10-2024 10:00:00","1 Veces","Administrar medicamentos via intramuscular");
        Prescripcion pr3=new Prescripcion("P03-12","14-10-2024 10:00:00","3 Veces","Administrar medicamentos via oral");
        Prescripcion pr4=new Prescripcion("P04-13","13-10-2024 10:00:00","2 Veces","Administrar medicamentos via intramuscular");
        Prescripcion pr5=new Prescripcion("P05-14","17-10-2024 10:00:00","4 Veces","Administrar medicamentos via oral");
        Prescripcion pr6=new Prescripcion("P06-15","17-10-2024 10:00:00","1 Veces","Administrar medicamentos via oral");
         
        //Objetos de Lista 
        Lista l1=new Lista("L01-10","Cada 4hr","20ml",5,"10-10-2024 10:36:02");
        Lista l2=new Lista("L02-11","Cada 6hr","3.5ml",3,"11-10-2024 10:00:02");
        Lista l3=new Lista("L03-12","Cada 24hr","500gr",2,"12-10-2024 11:00:02");
        Lista l4=new Lista("L04-13","Cada 24hr","5ml",5,"13-10-2024 11:30:02");
        Lista l5=new Lista("L05-14","Cada 6hr","200gr",7,"14-10-2024 13:40:02");
        Lista l6=new Lista("L06-15","Cada 8hr","15ml",6,"15-10-2024 13:50:02");
        
       //INGRESOS
        Ingreso i1 = new Ingreso(1, "Cuerpo cortado, nauseas y dolor de cabeza", "Infeccion en la vias respiratorias", "26-09-2024 13:20:10", "26-09-2024 16:02:10");
        Ingreso i2 = new Ingreso(2, "Ardor en garganta", "Gripa", "01-08-2024 09:10:10", "01-08-2024 09:45:32");
        Ingreso i3 = new Ingreso(3, "No soporta la luz, dolor de cabeza, malestar en general", "Migraña", "30-10-2024 15:00:10","30-10-2024 16:10:48");
        Ingreso i4 = new Ingreso(4, "Enrojecimiento en la piel", "Alergias", "18-07-2024 18:30:47", "18-7-2024 19:01:18");
        Ingreso i5 = new Ingreso(5, "Salpullido y comezon en la piel ", "Varicela", "10-10-2024 10:00:10", "16-10-2024 9:11:00");
        Ingreso i6 = new Ingreso(6, "Diarrea, fiebre, dolor en el abdomen", "Infeccion estomacal", "30-09-2024 16:50:10", "13-10-2024 13:0:10");
        
        //PACIENTES 
        Paciente pac1 = new Paciente(1, "Ricardo Moreno", (float) 1.71, (float) 80.200);
        Paciente pac2 = new Paciente(2, "Maria Gonzalez", (float) 1.63, (float) 59.370);
        Paciente pac3 = new Paciente(3, "Jesus Ochoa", (float) 1.70, (float) 87.150);
        Paciente pac4 = new Paciente(4, "Kevin Benitez", (float) 1.69, (float) 57.150);
        Paciente pac5 = new Paciente(5, "Diego Ibarrra", (float) 1.78, (float) 70.300);
        
        //Objetos Composicion
        Composicion c1 = new Composicion("C-01",109);        
        Composicion c2=new Composicion("C-02",201);
        Composicion c3=new Composicion("C-03",150);
              
            
               
        //RELACIONES
        
        //PACIENTE - INGRESO
        pac1.formPac_ing(i1);
        pac1.formPac_ing(i6);
        pac2.formPac_ing(i2);
        pac2.formPac_ing(i3);
        pac3.formPac_ing(i4);
        pac3.formPac_ing(i5);
        pac4.formPac_ing(i1);
        pac5.formPac_ing(i3);
        //INGRESO - PACIENTE
        i1.formIng_pac(pac1);
        i2.formIng_pac(pac2);
        i3.formIng_pac(pac2);
        i4.formIng_pac(pac3);
        i5.formIng_pac(pac3);
        i6.formIng_pac(pac1); 
        i1.formIng_pac(pac4);
        i3.formIng_pac(pac5);
        
        //PACIENTE - PRESCRIPCION
        pac1.formPac_pre(pr1);
        pac2.formPac_pre(pr2);
        pac3.formPac_pre(pr3);
        pac1.formPac_pre(pr4);
        pac2.formPac_pre(pr5);
        pac3.formPac_pre(pr6);
        pac4.formPac_pre(pr1);
        pac5.formPac_pre(pr6);
        //PRESCRIPCION - PACIENTE
        pr1.formPres_pac(pac1);
        pr2.formPres_pac(pac2);
        pr3.formPres_pac(pac3);
        pr4.formPres_pac(pac1);
        pr5.formPres_pac(pac2);
        pr6.formPres_pac(pac3);
        pr1.formPres_pac(pac4);
        pr6.formPres_pac(pac5);
        
        //PRESCRIPCION - PERSONAL
        pr1.formPres_per(p2);
        pr2.formPres_per(p1);
        pr3.formPres_per(p3);
        pr4.formPres_per(p4);
        pr5.formPres_per(p1);
        pr6.formPres_per(p3);
        //PERSONAL - PRESCRIPCION
        p2.formPer_pres(pr1);
        p1.formPer_pres(pr2);
        p3.formPer_pres(pr3);
        p4.formPer_pres(pr4);
        p1.formPer_pres(pr5);
        p3.formPer_pres(pr6);
        
        //PRESCRIPCION - LISTA
        pr1.formPres_lis(l1);        
        pr2.formPres_lis(l2);
        pr3.formPres_lis(l3);
        pr4.formPres_lis(l4);
        pr5.formPres_lis(l5);
        pr6.formPres_lis(l6);
        //LISTA - PRESCRIPCION
        l1.formLis_pres(pr1);
        l2.formLis_pres(pr2);
        l3.formLis_pres(pr3);        
        l4.formLis_pres(pr4);        
        l5.formLis_pres(pr5);
        l6.formLis_pres(pr6);
        
        //LISTA - ADMINISTRACION
        l1.formLis_adm(a1);
        l1.formLis_adm(a2);
        l2.formLis_adm(a3);
        l2.formLis_adm(a4);
        l3.formLis_adm(a3);
        l3.formLis_adm(a2);
        l4.formLis_adm(a4);
        l5.formLis_adm(a3);
        l6.formLis_adm(a1);
        //AMDINISTRACION - LISTA
        a1.formAdm_lis(l1);
        a2.formAdm_lis(l1);
        a3.formAdm_lis(l2);
        a4.formAdm_lis(l2);
        a3.formAdm_lis(l3);
        a2.formAdm_lis(l3);
        a4.formAdm_lis(l4);
        a3.formAdm_lis(l5);
        a1.formAdm_lis(l6);
        
        //LISTA - MEDICAMENTO
        l1.formLis_med(m1);
        l1.formLis_med(m2);
        l2.formLis_med(m3);
        l2.formLis_med(m4);
        l3.formLis_med(m5);
        l3.formLis_med(m4);
        l4.formLis_med(m3);
        l4.formLis_med(m2);
        l5.formLis_med(m1);
        l5.formLis_med(m2);
        l6.formLis_med(m3);
        l6.formLis_med(m4);
        //MEDICAMENTO - LISTA
        m1.formMed_list(l1);
        m2.formMed_list(l1);
        m3.formMed_list(l2);
        m4.formMed_list(l2);
        m5.formMed_list(l3);
        m4.formMed_list(l3);
        m3.formMed_list(l4);
        m2.formMed_list(l4);
        m1.formMed_list(l5);
        m2.formMed_list(l5);
        m3.formMed_list(l6);
        m4.formMed_list(l6);
        
        //MEDICAMENTO - COMPOSICION
        m1.formMed_comp(c1);
        m2.formMed_comp(c2);
        m3.formMed_comp(c3);
        //COMPOSICION - MEDICAMENTO
        c1.formComp_med(m1);
        c2.formComp_med(m3);
        c2.formComp_med(m2);
        
        //PERSONAL - ADMINISTRACIÓN
        p1.formPer_adm(a1);
        p1.formPer_adm(a2);
        p2.formPer_adm(a2);
        p3.formPer_adm(a3);
        p4.formPer_adm(a4);
        //ADMINISTRACION - PERSONAL
        a1.formAdm_per(p1);
        a2.formAdm_per(p1);
        a2.formAdm_per(p2);
        a3.formAdm_per(p3);
        a4.formAdm_per(p4);
        
        //PRINCIPIO_ACTIVO - COMPOSICION
        pa1.formAct_comp(c1);
        pa2.formAct_comp(c2);
        pa3.formAct_comp(c3);      
        //COMPOSICION - PRINCIPIO_ACTIVO    
        c1.formComp_act(pa1);
        c2.formComp_act(pa3);
        c3.formComp_act(pa2);
        
        
        
        
        //PERSISTENTES
        //PACIENTES
        Nueva_Conexion.addPersist(pac1);
        Nueva_Conexion.addPersist(pac2);
        Nueva_Conexion.addPersist(pac3);
        Nueva_Conexion.addPersist(pac4);
        Nueva_Conexion.addPersist(pac5);
        //INGRESOS
        Nueva_Conexion.addPersist(i1);
        Nueva_Conexion.addPersist(i2);
        Nueva_Conexion.addPersist(i3);
        Nueva_Conexion.addPersist(i4);        
        Nueva_Conexion.addPersist(i5);
        Nueva_Conexion.addPersist(i6);
        //PRESCRIPCION
        Nueva_Conexion.addPersist(pr1);
        Nueva_Conexion.addPersist(pr2);
        Nueva_Conexion.addPersist(pr3);
        Nueva_Conexion.addPersist(pr4);
        Nueva_Conexion.addPersist(pr5);
        Nueva_Conexion.addPersist(pr6);
        //PERSONAL
        Nueva_Conexion.addPersist(p1);
        Nueva_Conexion.addPersist(p2);
        Nueva_Conexion.addPersist(p3);
        Nueva_Conexion.addPersist(p4);
        //LISTA
        Nueva_Conexion.addPersist(l1);
        Nueva_Conexion.addPersist(l2);
        Nueva_Conexion.addPersist(l3);
        Nueva_Conexion.addPersist(l4);
        Nueva_Conexion.addPersist(l5);
        Nueva_Conexion.addPersist(l6);
        //ADMINISTRACION
        Nueva_Conexion.addPersist(a1);
        Nueva_Conexion.addPersist(a2);
        Nueva_Conexion.addPersist(a3);
        Nueva_Conexion.addPersist(a4);
        //MEDICAMENTO
        Nueva_Conexion.addPersist(m1);
        Nueva_Conexion.addPersist(m2);
        Nueva_Conexion.addPersist(m3);
        Nueva_Conexion.addPersist(m4);
        Nueva_Conexion.addPersist(m5);
        //COMPOSICION
        Nueva_Conexion.addPersist(c1);
        Nueva_Conexion.addPersist(c2);
        Nueva_Conexion.addPersist(c3);
        //PRINCIPIOACTIV
        Nueva_Conexion.addPersist(pa1);
        Nueva_Conexion.addPersist(pa2);
        Nueva_Conexion.addPersist(pa3);
        Nueva_Conexion.addPersist(pa4);
        Nueva_Conexion.addPersist(pa5);       
        
        
        System.out.println(pac1.toString());
        System.out.println(pac2.toString());
        System.out.println(pac3.toString());
        System.out.println(pac4.toString());
        System.out.println(pac5.toString());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());
        System.out.println(pr4.toString());
        System.out.println(pr5.toString());
        System.out.println(pr6.toString());
       
    }
}
