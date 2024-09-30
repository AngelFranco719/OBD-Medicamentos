package Definiciones;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Fecha {
    protected SimpleDateFormat Formato_Fecha=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss"); 
    public Date parseStringToDate(String fecha){
        Date nuevaFecha=new Date();
        try{
            nuevaFecha=Formato_Fecha.parse(fecha);
        }catch(Exception e){
            System.out.println("Error al Convertir:"+e.toString()); 
        }
        return nuevaFecha;
    }
    public String parseDatetoString(Date fecha){
        return Formato_Fecha.format(fecha);
    }
}
