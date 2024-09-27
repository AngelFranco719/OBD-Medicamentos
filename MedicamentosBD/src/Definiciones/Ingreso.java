
package oodb_med;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Transient
    private SimpleDateFormat formato_fecha=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public Ingreso(){
        this.ing_num = 0;
        this.ing_sintomas = "";
        this.ing_diagnostico = "";
        this.ing_fechaSalida = null;
        this.ing_fechaEntrada = null;
    }
    

    public Ingreso(int i_n, String i_sin, String i_diag, String i_feEnt, String i_feSal) {
        this.ing_num = i_n;
        this.ing_sintomas = i_sin;
        this.ing_diagnostico = i_diag;
        this.ing_fechaEntrada = parseStringToDate(i_feEnt, formato_fecha);
        this.ing_fechaSalida = parseStringToDate(i_feSal, formato_fecha);
    }

    @Override
    public String toString() {
        
        return String.format("\n-----\nIngreso: %d "
                + "\nSintomas: %s "
                + "\nDiagnostico: %s "
                + "\nFecha de Entrada: %s"
                + "\nFecha de Salida: %s "
                + "\nPaciente: %s\n",
                this.ing_num, 
                this.ing_sintomas, 
                this.ing_diagnostico,  
                this.parseDatetoString(ing_fechaSalida, formato_fecha),
                this.parseDatetoString(ing_fechaEntrada, formato_fecha),
                this.ing_pac.getPac_nombre());
    }
    
    private Date parseStringToDate(String fecha, SimpleDateFormat formato){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=formato.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    
    private String parseDatetoString(Date fecha, SimpleDateFormat formato){
        return formato.format(fecha);
    }
    
    public void formIng_pac(Paciente paci){
        ing_pac=paci;
    }
    
    public void dropIng_pac(Paciente paci){
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