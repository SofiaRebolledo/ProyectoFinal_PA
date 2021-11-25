package Modelo;

import Modelo.Conexion;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario extends Conexion{
    
    protected String Pasaport;
    protected String Nomb;
    protected String Apell;
    protected String Contras;
    protected String P;
    protected String Corr;
    protected String Cel;
    protected String Fecha;

    public String getPasaport() {
        return Pasaport;
    }

    public void setPasaport(String Pasaport) {
        this.Pasaport = Pasaport;
    }

    public String getNomb() {
        return Nomb;
    }

    public void setNomb(String Nomb) {
        this.Nomb = Nomb;
    }

    public String getApell() {
        return Apell;
    }

    public void setApell(String Apell) {
        this.Apell = Apell;
    }

    public String getContras() {
        return Contras;
    }

    public void setContras(String Contras) {
        this.Contras = Contras;
    }

    public String getP() {
        return P;
    }

    public void setP(String P) {
        this.P = P;
    }

    public String getCorr() {
        return Corr;
    }

    public void setCorr(String Corr) {
        this.Corr = Corr;
    }

    public String getCel() {
        return Cel;
    }

    public void setCel(String Cel) {
        this.Cel = Cel;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public boolean registrarUsuario(String Pasaporte, String Nombre, String Apellido, String Contrasena, String Pais, String Celular, String Correo, Date Fecha_Nacimiento){
        sql = "INSERT INTO Usuario(Pasaporte, Nombre, Apellido, Contrasena, Pais, Celular, Correo, Fecha_Nacimiento)"
                + "VALUES ('"+Pasaporte+"', '"+Nombre+"', '"+Apellido+"', '"+Contrasena+"', '"+Pais+"', '"+Celular+"', '"+Correo+"', Date '"+Fecha_Nacimiento+"');";
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Alguno de tus datos es erroneo, por favor revisa.");
            return false;
        }
        return true;
    }
    
    public boolean ingresar(String Documento, String Contrasena){
        String Contra = "";
        sql = "SELECT Contrasena FROM Usuario WHERE Pasaporte = '"+Documento+"';";
        try {
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Contra = rs.getString("Contrasena");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Contra.equals(Contrasena)){
            return true;
        }
        return false;
    }
    
    public String [] datoGuardado(String Pasaporte){
        String [] Data = new String[7];
        sql = "SELECT * FROM Usuario where Pasaporte = '"+Pasaporte+"';";
        try {
            rs = comando.executeQuery(sql);
            while(rs.next()){
                Data[0] = rs.getString("Nombre");
                Data[1] = rs.getString("Apellido");
                Data[2] = rs.getString("Contrasena");
                Data[3] = rs.getString("Pais");
                Data[4] = rs.getString("Celular");
                Data[5] = rs.getString("Correo");
                Data[6] = rs.getString("Fecha_Nacimiento");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Data;
    }
    
    public void modificarDatos(String Pasaporte, String Dato, String Tipo){
        sql = "UPDATE Usuario SET "+Tipo+"='"+Dato+"' where Pasaporte='"+Pasaporte+"';";
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
