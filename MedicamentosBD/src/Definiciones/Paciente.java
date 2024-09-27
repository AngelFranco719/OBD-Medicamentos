
package Definiciones;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Paciente implements Serializable{
    @Id
    private int pac_nss;
    private String pac_nombre;
    private float pac_estatura;
    private float pac_peso;
    
    @OneToMany
        @JoinColumn (name = "ing_pac", nullable = false)
        private List<Ingreso> pac_ing=new ArrayList<Ingreso>();
    @OneToMany
        @JoinColumn (name = "pres_pac", nullable = false)
        private List<Prescripcion> pac_pres = new ArrayList<Prescripcion>();
    
    public Paciente() {
        this.pac_nss = 0;
        this.pac_nombre = " ";
        this.pac_estatura = 0;
        this.pac_peso = 0;
    }

    public Paciente(int p_nss, String p_nomb, float p_estat, float p_peso) {
        pac_nss = p_nss;
        pac_nombre = p_nomb;
        pac_estatura = p_estat;
        pac_peso = p_peso;
    }
    
    @Override
    public String toString(){
        return String.format("\n-----\nNSS: %d "
                + "\nNombre: %s "
                + "\nEstatura: %.2f "
                + "\nPeso: %.2f "
                + "\nIngresos : %s\n",this.pac_nss,this.pac_nombre,this.pac_estatura,this.pac_peso,this.getPac_ing());
    }
    
    public void printIngresos(){
        System.out.println("Cantidad de Ingresos: "+getPac_ing().size());
        for(int i=0; i<getPac_ing().size(); i++){
            System.out.println(getPac_ing().get(i));
        }
    }
    
    public void formPac_ing(Ingreso ingre1){
         getPac_ing().add(ingre1);
    }
    
    public void dropPac_ing(Ingreso ingre1){
         getPac_ing().remove(ingre1);
    }
    
    public void formPac_pre(Prescripcion pres){
        getPac_pres().add(pres);
    }
    
    public void dropPac_pre(Prescripcion pres){
         getPac_pres().remove(pres);
    }
    
    public int getPac_nss() {
        return pac_nss;
    }

    public void setPac_nss(int pac_nss) {
        this.pac_nss = pac_nss;
    }

    public String getPac_nombre() {
        return pac_nombre;
    }

    public void setPac_nombre(String pac_nombre) {
        this.pac_nombre = pac_nombre;
    }

    public float getPac_estatura() {
        return pac_estatura;
    }

    public void setPac_estatura(float pac_estatura) {
        this.pac_estatura = pac_estatura;
    }

    public float getPac_peso() {
        return pac_peso;
    }

    public void setPac_peso(float pac_peso) {
        this.pac_peso = pac_peso;
    }

    public List<Ingreso> getPac_ing() {
        return pac_ing;
    }

    public void setPac_ing(List<Ingreso> pac_ing) {
        this.pac_ing = pac_ing;
    }

    public List<Prescripcion> getPac_pres() {
        return pac_pres;
    }

    public void setPac_pres(List<Prescripcion> pac_pres) {
        this.pac_pres = pac_pres;
    }

       
}
