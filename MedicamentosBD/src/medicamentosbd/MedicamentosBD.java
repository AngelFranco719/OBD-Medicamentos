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
        
        Nueva_Conexion.addPersist(m1);
        Nueva_Conexion.addPersist(m2);
        Nueva_Conexion.addPersist(m3);
        Nueva_Conexion.addPersist(m4);
        Nueva_Conexion.addPersist(m5);
        //Objetos PincipioActivo
        PrincipioActivo pa1 = new PrincipioActivo("D5009", "Ibuprofeno", "Antiinflamatorio no esteroideo");
        PrincipioActivo pa2 = new PrincipioActivo("D5010", "Paracetamol", "Analgésico y antipirético");
        PrincipioActivo pa3 = new PrincipioActivo("D5011", "Aspirina", "Antiinflamatorio y analgésico");
        PrincipioActivo pa4 = new PrincipioActivo("D5012", "Naproxeno", "Antiinflamatorio no esteroideo");
        PrincipioActivo pa5 = new PrincipioActivo("D5013", "Diclofenaco", "Antiinflamatorio y analgésico");
        Nueva_Conexion.addPersist(pa1); 
        Nueva_Conexion.addPersist(pa2);
        Nueva_Conexion.addPersist(pa3);
        Nueva_Conexion.addPersist(pa4);
        Nueva_Conexion.addPersist(pa5);
        
        //Objetos Composicion
        Composicion c1 = new Composicion("C-01",109);
        c1.formComp_med(m1);
        c1.formComp_act(pa1);
        m1.formMed_comp(c1);
        pa1.formAct_comp(c1);
        Composicion c2=new Composicion("C-02",201);
        c2.formComp_med(m2);
        c2.formComp_act(pa2);
        m2.formMed_comp(c2);
        pa2.formAct_comp(c2);
        Composicion c3=new Composicion("C-03",150);
        c2.formComp_med(m3);
        c2.formComp_act(pa3);
        m3.formMed_comp(c3);
        pa3.formAct_comp(c3);
        
        Nueva_Conexion.addPersist(c1);
        Nueva_Conexion.addPersist(c2);
        Nueva_Conexion.addPersist(c3);
        
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
    }
}
