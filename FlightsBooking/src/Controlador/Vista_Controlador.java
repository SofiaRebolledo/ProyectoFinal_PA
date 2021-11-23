package Controlador;

import Modelo.ErrorValidacion;
import Modelo.Usuario;
import Vista.Admin;
import Vista.VistaInicial;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Vista_Controlador{
    
    protected Usuario user = new Usuario();
    protected VistaInicial vista = new VistaInicial();
    protected Admin admin = new Admin();
    protected ErrorValidacion control = new ErrorValidacion();
    protected String Pasaporte = "";

    public Vista_Controlador() {
        user.conectar();
        vista.setVisible(true);
        this.paneles();
        this.Botones();
    }
    
    public void paneles(){
        vista.getPanelAdministrador().setVisible(false);
        vista.getPanelAyuda().setVisible(false);
        vista.getPanelBusquedaVuelos().setVisible(false);
        vista.getPanelConfirmacionProcesoVuelo().setVisible(false);
        vista.getPanelCuenta().setVisible(false);
        vista.getPanelInicial().setVisible(true);
        vista.getPanelInternoModificarDatos().setVisible(false);
        vista.getPanelMisViajes().setVisible(false);
        vista.getPanelModificarDatos().setVisible(false);
        vista.getPanelMostrarAdministrador().setVisible(false);
        vista.getPanelNotificacion().setVisible(false);
        vista.getPanelPrincipal().setVisible(false);
        vista.getPanelRegistro().setVisible(false);
    }
   
    public void Botones(){
        vista.getBotonSalir().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            Salir();
        }  
        });
        vista.getBotonSalir1().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            Salir();
        }  
        });
        vista.getBotonSalir2().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            Salir();
        }  
        });
        vista.getBotonSalir3().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            Salir();
        }  
        });
        vista.getBotonRegistro().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            abrirRegistro();
        }
        });
        vista.getBotonRegistrar().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            registrarUser();
        }
        });
        vista.getBotonContinuar().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            ingresoUser();
        }
        });
        vista.getBotonMiCuenta().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            miCuenta();
        }
        });
        vista.getBotonModificarDatos().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            vistaModificarDatos();
        }
        });
        vista.getBotonContinuar1().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            confirmaModificarDatos();
        }
        });
        vista.getBotonRegresarModificarDatos().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            modificar();
        }
        });
        vista.getBotonAyuda().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            ayuda();
        }
        });
        vista.getBotonRegresar().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            regresoAyuda();
        }
        });
        vista.getBotonAdministrador().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            vistaAdmin();
        }
        });
        vista.getBotonContinuarAdmi().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            ingresoAdmin();
        }
        });
        vista.getBotonConsultar().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            adminConsultar();
        }
        });
    }
    
    public void abrirRegistro(){
        vista.getPanelInicial().setVisible(false);
        vista.getPanelRegistro().setVisible(true);
    }
    
    public void registrarUser(){
        String Nombres = vista.getNombresRegistro().getText();
        String Apellidos = vista.getApellidosRegistro().getText();
        String Pais = vista.getPaisRegistro().getText();
        String Pasaporte = vista.getPasaporteRegistro().getText();
        String Celular = vista.getCelularRegistro().getText();
        String Correo = vista.getCorreoRegistro().getText();
        String FechaNacimiento = vista.getFechaNacimientoRegistro().getText();
        String Contraseña = vista.getContraseñaRegistro().getText();
        String Contrasena = vista.getContrasenaRegistro().getText();
        if(control.espacioVacio(Nombres)||control.espacioVacio(Apellidos)||control.espacioVacio(Pais)||control.espacioVacio(Celular)
                ||control.espacioVacio(Pasaporte)||control.espacioVacio(Correo)||control.espacioVacio(FechaNacimiento)
                ||control.espacioVacio(Contraseña)||control.espacioVacio(Contrasena)){
            JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
        }
        else{
            if(!Contrasena.equals(Contraseña)){
                JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
            }
            else{
                if(control.converFecha(FechaNacimiento)){
                    if(user.registrarUsuario(Pasaporte, Nombres, Apellidos, Contrasena, Pais, Celular, Correo, Date.valueOf(FechaNacimiento))){
                        vista.getPanelRegistro().setVisible(false);
                        vista.getPanelInicial().setVisible(true);
                        vista.getNombresRegistro().setText("");
                        vista.getApellidosRegistro().setText("");
                        vista.getPaisRegistro().setText("");
                        vista.getPasaporteRegistro().setText("");
                        vista.getCelularRegistro().setText("");
                        vista.getCorreoRegistro().setText("");
                        vista.getFechaNacimientoRegistro().setText("");
                        vista.getContraseñaRegistro().setText("");
                        vista.getContrasenaRegistro().setText("");
                    }
                    else{
                        JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
                }
            }
        }
    }
    
    public void ingresoUser(){
        String Documento = vista.getNoPasaporte().getText();
        String Contrasena = vista.getContraseña().getText();
        if(control.espacioVacio(Documento)||control.espacioVacio(Contrasena)){
            JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
        }
        else{
            if(user.ingresar(Documento, Contrasena)){
                vista.getPanelInicial().setVisible(false);
                vista.getPanelPrincipal().setVisible(true);
                Pasaporte = Documento;
                vista.getNoPasaporte().setText("");
                vista.getContraseña().setText("");
            }else{
                JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
            }
        } 
    }
    
    public void miCuenta(){
        String [] Data = null;
        Data = user.datoGuardado(Pasaporte);
        vista.getLabelNombreCuenta().setText(Data[0]);
        vista.getLabelApellidosCuenta().setText(Data[1]);
        vista.getLabelPasaporteCuenta().setText(Pasaporte);
        vista.getLabelFechaNacimientoCuenta().setText(Data[6]);
        vista.getLabelCorreoCuenta().setText(Data[5]);
        vista.getPanelCuenta().setVisible(true);
    }
    
    public void vistaModificarDatos(){
        vista.getPanelModificarDatos().setVisible(true);
        vista.getPanelCuenta().setVisible(false);
    }
    
    public void confirmaModificarDatos(){
        String Documento = vista.getNoPasaporte1().getText();
        String Contrasena = vista.getContraseña1().getText();
        if(control.espacioVacio(Documento)||control.espacioVacio(Contrasena)){
            JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
        }
        else{
            if(user.ingresar(Documento, Contrasena) && Documento.equals(Pasaporte)){
                vista.getPanelInternoModificarDatos().setVisible(true);
                vista.getNoPasaporte1().setText("");
                vista.getContraseña1().setText("");
            }else{
                JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
            }
        }
    }
    
    public void modificar(){
        String TDato = vista.getjComboBox1().getSelectedItem().toString();
        String NDato = vista.getNuevoDato().getText();
        if(control.espacioVacio(NDato)){
            JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
        }
        else{
            if(TDato.equals("Contraseña")){
                TDato = "Contrasena";
            }
            user.modificarDatos(Pasaporte, NDato, TDato);
            vista.getPanelModificarDatos().setVisible(false);
            vista.getPanelInternoModificarDatos().setVisible(false);
            vista.getPanelPrincipal().setVisible(true);
            vista.getNuevoDato().setText("");
        }
    }
    
    
    public void ayuda(){
        vista.getPanelAyuda().setVisible(true);
        vista.getPanelPrincipal().setVisible(false);
    }
    
    public void regresoAyuda(){
        vista.getPanelPrincipal().setVisible(true);
        vista.getPanelAyuda().setVisible(false);
    }
    
    public void vistaAdmin(){
        vista.getPanelInicial().setVisible(false);
        vista.getPanelAdministrador().setVisible(true);
        vista.getPanelMostrarAdministrador().setVisible(true);
        vista.getPanelOpcionesAdministrador().setVisible(false);
    }
    
    public void ingresoAdmin(){
        String Usuario = vista.getUsuarioAdmi().getText();
        String cont = vista.getContraseñaAdmi().getText();
        if(control.espacioVacio(cont) || control.espacioVacio(Usuario)){
            JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
        }
        else{
            if(user.ingresar(Usuario, cont)){
                if(Usuario.equals("Admin")){
                    vista.getPanelMostrarAdministrador().setVisible(false);
                    vista.getPanelOpcionesAdministrador().setVisible(true);
                    vista.getUsuarioAdmi().setText("");
                    vista.getContraseñaAdmi().setText("");
                }
                else{
                    JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
                }
            }
            else{
                JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
            }
        }
    }
    
    public void adminConsultar(){
        
    }
    
    public void Salir(){
        System.exit(0);
    }
}
