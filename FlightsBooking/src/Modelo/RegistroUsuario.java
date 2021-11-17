package Modelo;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroUsuario extends Conexion{
    
    public void RegistrarUsuario(String Pasaporte, String Nombre, String Apellido, String Contrasena, String Pais, BigInteger Celular, String Correo, Date Fecha_Nacimiento){
        sql = "INSERT INTO Usuario(Pasaporte, Nombre, Apellido, Contrasena, Pais, Celular, Correo, Fecha_Nacimiento)"
                + "VALUES ("+Pasaporte+", "+Nombre+", "+Apellido+", "+Contrasena+", "+Pais+", "+Celular+", "+Correo+", "+Fecha_Nacimiento+");";
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
