package Modelo;

import java.sql.Date;

public class ErrorValidacion {
    
    
    public boolean espacioVacio(String Dato){
        if(Dato.equals("")||Dato==null){
            return true;
        }
        return false;
    }
    
    public boolean converFecha(String Fecha){
        try{
            Date date=Date.valueOf(Fecha);
        }
        catch (Exception ex){
            return false;
        }
        return true;
    }
}
