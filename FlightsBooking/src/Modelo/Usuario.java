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
