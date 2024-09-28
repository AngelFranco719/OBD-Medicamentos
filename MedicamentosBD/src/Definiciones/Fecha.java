package Definiciones;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Fecha {
    protected SimpleDateFormat Formato_Fecha=new SimpleDateFormat("dd-mm-yyyy"); 
    protected SimpleDateFormat Formato_Hora=new SimpleDateFormat("hh:mm:ss"); 
    public Date parseStringToDate(String fecha){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=Formato_Fecha.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    public Date parseStringToHour(String fecha){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=Formato_Hora.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    public String parseDatetoString(Date fecha){
        return Formato_Fecha.format(fecha);
    }
    public String parseHourtoString(Date fecha){
        return Formato_Hora.format(fecha);
    }
}
