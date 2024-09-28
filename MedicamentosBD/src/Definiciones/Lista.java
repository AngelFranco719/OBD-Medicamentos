package Definiciones;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Lista extends Fecha implements Serializable {
    private static final long serialVersionUID = 1L;
    
@Id
private String lis_codigo;
private String lis_intervalo;
private String lis_dosis;
private int lis_dias;
private Date lis_fecha_inicio;
private Date lis_hora_inicio;

    @ManyToOne
        @JoinColumn(name="pres_lis",nullable=false)
        private Prescripcion lis_pres=new Prescripcion();
    
    @ManyToOne
        @JoinColumn(name="med_lis",nullable=false)
        private Medicamento lis_med=new Medicamento();
    
    @OneToMany
        @JoinColumn(name="adm_lis",nullable=false)
        private List<Administracion> lis_adm=new ArrayList<Administracion>();
    

    public String getLis_intervalo() {
        return lis_intervalo;
    }

    public void setLis_intervalo(String lis_intervalo) {
        this.lis_intervalo = lis_intervalo;
    }

    public Prescripcion getLis_pres() {
        return lis_pres;
    }

    public void setLis_pres(Prescripcion lis_pres) {
        this.lis_pres = lis_pres;
    }

    public Medicamento getLis_med() {
        return lis_med;
    }

    public void setLis_med(Medicamento lis_med) {
        this.lis_med = lis_med;
    }

    public List<Administracion> getLis_adm() {
        return lis_adm;
    }

    public void setLis_adm(List<Administracion> lis_adm) {
        this.lis_adm = lis_adm;
    }
        
    public Lista (){

    }
    
    
    public Lista (String codigo, String intervalo, String dosis, int dias, String fecha_inicio, String hora_inicio){
        lis_codigo =codigo;
        lis_intervalo = intervalo;
        lis_dosis = dosis;
        lis_dias = dias;
        lis_fecha_inicio = this.parseStringToDate(fecha_inicio);
        lis_hora_inicio = this.parseStringToHour(hora_inicio);
    }
  
    
     @Override
    public String toString(){
        
        return String.format("\n-----\nCodigo: %s"
        + "\nIntervalo: %s"
        +"\nDosis: %s"
        +"\nDias: %d"
        +"\nFecha Inicio: %s"
        +"\nHora Inicio: %s"
        +"\nFecha de Administracion: %s"
        +"\nMedico: %s"
        +"\nID Prescripcion: %s",
        this.lis_codigo,
        this.lis_intervalo,
        this.lis_dosis,
        this.lis_dias,
        this.parseDatetoString(this.lis_fecha_inicio), 
        this.parseHourtoString(this.lis_hora_inicio),
        this.getLis_adm(), 
        this.getLis_med(), 
        this.getLis_pres().getPres_codigo()
        );
    }
    
    public String getLis_codigo() {
        return lis_codigo;
    }

    public void setLis_codigo(String lis_codigo) {
        this.lis_codigo = lis_codigo;
    }

    public String getLis_dosis() {
        return lis_dosis;
    }

    public void setLis_dosis(String lis_dosis) {
        this.lis_dosis = lis_dosis;
    }

    public int getLis_dias() {
        return lis_dias;
    }

    public void setLis_dias(int lis_dias) {
        this.lis_dias = lis_dias;
    }

    public Date getLis_fecha_inicio() {
        return lis_fecha_inicio;
    }

    public void setLis_fecha_inicio(Date lis_fecha_inicio) {
        this.lis_fecha_inicio = lis_fecha_inicio;
    }

    public Date getLis_hora_inicio() {
        return lis_hora_inicio;
    }

    public void setLis_hora_inicio(Date lis_hora_inicio) {
        this.lis_hora_inicio = lis_hora_inicio;
    }



}
