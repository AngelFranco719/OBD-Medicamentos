package Definiciones;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Modelo {
    protected SimpleDateFormat Formato_Fecha=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); 
    protected SimpleDateFormat Formato_SoloFecha=new SimpleDateFormat("dd-MM-yyyy");
    public abstract String getID(); 
    public Date parseStringToDate(String fecha){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=Formato_Fecha.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    public Date parseStringToOnlyDate(String fecha){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=Formato_SoloFecha.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    public String parseDatetoString(Date fecha){
        return Formato_Fecha.format(fecha);
    }
}
