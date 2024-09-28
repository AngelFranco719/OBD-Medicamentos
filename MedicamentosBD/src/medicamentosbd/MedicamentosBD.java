package medicamentosbd; 
import BD.ConexionBD;
import Definiciones.*;
public class MedicamentosBD {   
    public static void main(String[] args) {
        ConexionBD Nueva_Conexion=new ConexionBD();
        Personal p1=new Personal("Angel David Franco Hernandez", Personal.Roles.ENFERMERO, "A-291281"); 
        Administracion a1=new Administracion("C-192", "11-10-2024","12:25:30","Completado");
        a1.formAdm_per(p1);
        p1.formPer_adm(a1);
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        PrincipioActivo ac1=new PrincipioActivo("AC-2901","Paracetamol","Principio Activo muy relevante");
        System.out.println(ac1.hashCode());
        
    }
}
