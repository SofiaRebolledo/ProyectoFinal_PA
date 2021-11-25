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
    
    public boolean verificarRango(int Mayor, int Menor, int Dato){
        if(Dato>=Menor && Dato<=Mayor){
            return true;
        }
        return false;
    }
    
    public boolean datoNumerico(String Dato){
        try{
            Integer.parseInt(Dato);
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }
}
