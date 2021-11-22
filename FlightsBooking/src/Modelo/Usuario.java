package Modelo;

import Modelo.Conexion;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario extends Conexion{
    
    public void registrarUsuario(String Pasaporte, String Nombre, String Apellido, String Contrasena, String Pais, String Celular, String Correo, Date Fecha_Nacimiento){
        sql = "INSERT INTO Usuario(Pasaporte, Nombre, Apellido, Contrasena, Pais, Celular, Correo, Fecha_Nacimiento)"
                + "VALUES ('"+Pasaporte+"', '"+Nombre+"', '"+Apellido+"', '"+Contrasena+"', '"+Pais+"', '"+Celular+"', '"+Correo+"', Date '"+Fecha_Nacimiento+"');";
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    public void modificarDatos(String Pasaporte, String Dato, int Tipo){
        System.out.println(Tipo);
        sql = "";
        if(Tipo == 0){
            sql = "UPDATE Usuario SET Nombre=? where Pasaporte='"+Pasaporte;
        }
        if(Tipo == 1){
            sql = "UPDATE Usuario SET Apellido=? where Pasaporte='"+Pasaporte;
        }
        if(Tipo == 2){
            sql = "UPDATE Usuario SET Correo=? where Pasaporte='"+Pasaporte;
        }
        if(Tipo == 3){
            sql = "UPDATE Usuario SET Celular=? where Pasaporte='"+Pasaporte;
        }
//        try {
//            PreparedStatement comand = con.prepareStatement(sql);
//            comand.setString(1, Dato);
//            comand.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
