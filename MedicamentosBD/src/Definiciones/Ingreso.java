
package Definiciones;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Ingreso extends Modelo implements Serializable{
    
    @Id
    private String ing_codigo; 
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
    

    public Ingreso(String i_codigo,int i_n, String i_sin, String i_diag, String i_feEnt, String i_feSal) {
        this.ing_codigo=i_codigo; 
        this.ing_num = i_n;
        this.ing_sintomas = i_sin;
        this.ing_diagnostico = i_diag;
        this.ing_fechaEntrada = parseStringToOnlyDate(i_feEnt);
        this.ing_fechaSalida = parseStringToOnlyDate(i_feSal);
    }

    @Override
    public String getID(){
        return this.ing_codigo;
    }
    
    @Override
    public String toString() {
        
        return String.format("\n-----\n"+
                "Codigo: %s"
                + "Ingreso: %d "
                + "\nSintomas: %s "
                + "\nDiagnostico: %s "
                + "\nFecha de Entrada: %s"
                + "\nFecha de Salida: %s ",
                //+ "\nPaciente: %s\n",
                this.ing_codigo,
                this.ing_num, 
                this.ing_sintomas, 
                this.ing_diagnostico,  
                this.parseDatetoString(ing_fechaSalida),
                this.parseDatetoString(ing_fechaEntrada));
                ///this.ing_pac.getPac_nombre());
                
    }
    
    public void formIng_pac(Paciente paci){
        ing_pac=paci;
    }
    
    public void dropIng_pac(Paciente paci){
        this.ing_pac = null;
    }

    public String getIng_codigo(){
        return this.ing_codigo;
    }
    
    public String getIng_num() {
        return Integer.toString(ing_num);
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

    public String getIng_fechaSalida() {
        return this.parseDatetoString(ing_fechaSalida);
    }

    public void setIng_fechaSalida(String ing_fechaSalida) {
        this.ing_fechaSalida = this.parseStringToDate(ing_fechaSalida);
    }

    public String getIng_fechaEntrada() {
        return this.parseDatetoString(ing_fechaEntrada);
    }

    public void setIng_fechaEntrada(String ing_fechaEntrada) {
        this.ing_fechaEntrada = this.parseStringToDate(ing_fechaEntrada);
    }

    public String getIng_pac() {
        return ing_pac.getPac_nombre();
    }

    public void setIng_pac(Paciente ing_pac) {
        this.ing_pac = ing_pac;
    }    
    
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false; 
        return false; 
    }
    
}