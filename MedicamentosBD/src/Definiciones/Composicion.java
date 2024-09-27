package Definiciones;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class Composicion implements Serializable {

    @Id
    private int comp_cantidad;

    @ManyToOne
    @JoinColumn(name = "med_comp", nullable = false)
    private List<Medicamento>comp_med=new ArrayList();

    @ManyToOne
    @JoinColumn(name = "act_comp", nullable = false)
    private List<PrincipioActivo> comp_act=new ArrayList();

    void formComp_med(Medicamento med){
        this.comp_med.add(med);
    }
    void dropComp_med(Medicamento med){
        this.comp_med.remove(med);
    }
    void formComp_act(PrincipioActivo act){
        this.comp_act.add(act);
    }
    void dropComp_act(PrincipioActivo act){
        this.comp_act.remove(act);
    }
    
    @Override
    public String toString() {
        return String.format(
                "\n-----\n" +
                "Cantidad: %d" +
                "\nID Medicamentos: %s" +
                "\nID Principio Activo Asociado: %s",
                this.comp_cantidad,
                this.comp_med,
                this.comp_act
        );
    }
}
