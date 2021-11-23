package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    protected String driver = "com.mysql.cj.jdbc.Driver";
    protected String URL_bd = "jdbc:mysql://localhost:3306/flightsbooking?zeroDateTimeBehavior=convertToNull";
    protected String usuario = "root";
    protected String clave = "";
    protected Connection con = null;
    protected Statement comando = null;
    protected ResultSet registros = null;
    protected String sql;
    protected ResultSet rs;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getURL_bd() {
        return URL_bd;
    }

    public void setURL_bd(String URL_bd) {
        this.URL_bd = URL_bd;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getComando() {
        return comando;
    }

    public void setComando(Statement comando) {
        this.comando = comando;
    }

    public ResultSet getRegistros() {
        return registros;
    }

    public void setRegistros(ResultSet registros) {
        this.registros = registros;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
    

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
}
