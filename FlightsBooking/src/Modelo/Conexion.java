package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String driver = "com.mysql.cj.jdbc.Driver";
    String URL_bd = "jdbc:mysql://localhost:3306/actividadpracticabd?zeroDateTimeBehavior=convertToNull";
    String usuario = "root";
    String clave = "";
    Connection con = null;
    Statement comando = null;
    ResultSet registros = null;
    String sql;
    ResultSet rs;

    public void conectar() {
        try {
            con = DriverManager.getConnection(URL_bd, usuario, clave);
            if (con != null) {
                System.out.println("Conexión exitosa");
                comando = con.createStatement();
            } else {
                System.out.println("Conexión NO exitosa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistrarTelPer(String Telefono, String Documento) {
        sql = "SELECT Codigo FROM Persona WHERE Documento = "+Documento+";";
        try {
            rs = comando.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                sql = rs.getString("Codigo");
            }
            sql = "INSERT INTO telefonopersona(Telefono, Cod_Persona) "
                    + "VALUES ('"+Telefono+"',"+sql+");";
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistrarPersona(String Documento, String TipoDocumento, String Nombres, String Apellidos, String Telefono) {
        
        sql = "INSERT INTO persona(Codigo, Documento, TipoDocumento, Nombres, Apellidos, NroTelefono) "
                + "VALUES (null, '"+Documento+"', '"+TipoDocumento+"', '"+Nombres+"', '"+Apellidos+"', '"+Telefono+"');";
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistrarTelEmp(String Telefono) {
        sql = "SELECT NIT FROM empresa WHERE Telefono = "+Telefono+";";
        try {
            rs = comando.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                sql = rs.getString("NIT");
            }
            sql = "INSERT INTO telefonoempresa(Telefono, Cod_Empresa) "
                    + "VALUES ('"+Telefono+"',"+sql+");";
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RegistrarEmp(String NIT, String RazSoc, String Direccion, String Telefono, String Email) {
        
        sql = "INSERT INTO empresa(NIT, RazonSocial, Direccion, Telefono, Email) "
                + "VALUES ('"+NIT+"', '"+RazSoc+"', '"+Direccion+"', '"+Telefono+"', '"+Email+"');";
        try {
            comando.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
