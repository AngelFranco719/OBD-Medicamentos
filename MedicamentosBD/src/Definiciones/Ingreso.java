
package Definiciones;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Ingreso implements Serializable{
    
    @Id
    private int ing_num;
    private String ing_sintomas;
    private String ing_diagnostico;
    private Date ing_fechaSalida;
    private Date ing_fechaEntrada;
    
    @ManyToOne 
        @JoinColumn (name = "pac_ing", nullable = false)
        private Paciente ing_pac;
    
    public Ingreso(){
        this.ing_num = 0;
        this.ing_sintomas = "";
        this.ing_diagnostico = "";
        this.ing_fechaSalida = null;
        this.ing_fechaEntrada = null;
    }
    

    public Ingreso(int i_n, String i_sin, String i_diag, Date i_feSal, Date i_feEnt) {
        this.ing_num = i_n;
        this.ing_sintomas = i_sin;
        this.ing_diagnostico = i_diag;
        this.ing_fechaSalida = i_feSal;
        this.ing_fechaEntrada = i_feEnt;
    }

    @Override
    public String toString() {
        return String.format("\n-----\nIngreso: %d "
                + "\nSintomas: %s "
                + "\nDiagnostico: %s "
                + "\nFecha de Salida: %s "
                + "\nFecha de Entrada: %s"
                + "\nPaciente: %s\n",
                this.ing_num, 
                this.ing_sintomas, 
                this.ing_diagnostico, 
                this.ing_fechaSalida.toString(), 
                this.ing_fechaEntrada.toString(), 
                this.ing_pac.getPac_nombre());
    }
    
    public void formIng_pac(Paciente paci){
        ing_pac=paci;
    }
    
    public void dropIng_pac(Paciente paci){
        // Remover este ingreso del conjunto de ingresos del paciente
        if (paci != null) {
            paci.getPac_ing().remove(this);
        }
        // Establecer el propietario del ingreso (ing_pac) como null
        this.ing_pac = null;
    }

    public int getIng_num() {
        return ing_num;
    }

    public void setIng_num(int ing_num) {
        this.ing_num = ing_num;
    }

    public String getIng_sintomas() {
        return ing_sintomas;
    }

    public void setIng_sintomas(String ing_sintomas) {
        this.ing_sintomas = ing_sintomas;
    }

    public String getIng_diagnostico() {
        return ing_diagnostico;
    }

    public void setIng_diagnostico(String ing_diagnostico) {
        this.ing_diagnostico = ing_diagnostico;
    }

    public Date getIng_fechaSalida() {
        return ing_fechaSalida;
    }

    public void setIng_fechaSalida(Date ing_fechaSalida) {
        this.ing_fechaSalida = ing_fechaSalida;
    }

    public Date getIng_fechaEntrada() {
        return ing_fechaEntrada;
    }

    public void setIng_fechaEntrada(Date ing_fechaEntrada) {
        this.ing_fechaEntrada = ing_fechaEntrada;
    }

    public Paciente getIng_pac() {
        return ing_pac;
    }

    public void setIng_pac(Paciente ing_pac) {
        this.ing_pac = ing_pac;
    }    
    
    
}
