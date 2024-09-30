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
        
        
    }
}
