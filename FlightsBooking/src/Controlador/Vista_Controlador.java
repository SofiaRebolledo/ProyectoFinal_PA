package Controlador;

import Modelo.Conexion;
import Modelo.ErrorValidacion;
import Modelo.Usuario;
import Vista.VistaInicial;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JOptionPane;

public class Vista_Controlador{
    
    Usuario user = new Usuario();
    VistaInicial vista = new VistaInicial();
    ErrorValidacion control = new ErrorValidacion();

    public Vista_Controlador() {
        user.conectar();
        vista.setVisible(true);
        this.Paneles();
        this.Botones();
    }
    
    public void Paneles(){
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
                    user.RegistrarUsuario(Pasaporte, Nombres, Apellidos, Contrasena, Pais, Celular, Correo, Date.valueOf(FechaNacimiento));
                    System.out.println("Registrado");
                }
            }
        }
    }
    
    public void Salir(){
        System.exit(0);
    }
   
//        if(ae.getSource() == vista.getBotonSalir() || ae.getSource() == vista.getBotonSalir1() ||
//                ae.getSource() == vista.getBotonSalir2() || ae.getSource() == vista.getBotonSalir3()){
//            System.exit(0);
//        }
//        if(ae.getSource()==vista.getjBtnConInv()){
//            
//        }
//        if(ae.getSource()==vista.getjBtnRegEmp()){
//            vista.getjPanEmp().setVisible(true);
//            vista.getjPanPer().setVisible(false);
//            vista.getjPanel1().setVisible(false);
//        }
//        if(ae.getSource()==vista.getjBtnRegPer()){
//            vista.getjPanel1().setVisible(false);
//            vista.getjPanPer().setVisible(true);
//        }
//        if(ae.getSource()==vista.getjBtnGuarPers()){
//            conectar.RegistrarPersona(vista.getjTxtDoc().getText(), vista.getjCmBoxDoc().getSelectedItem().toString(), vista.getjTxtNombres().getText(), vista.getjTxtApellidos().getText(), vista.getjTxtTelPer().getText());
//            conectar.RegistrarTelPer(vista.getjTxtTelPer().getText(),vista.getjTxtDoc().getText());
//            vista.getjPanel1().setVisible(true);
//            vista.getjPanPer().setVisible(false);
//        }
//        if(ae.getSource()==vista.getjBtnGuarEmp()){
//            conectar.RegistrarEmp(vista.getjTxtNIT().getText(), vista.getjTxtRazSoc().getText(), vista.getjTxtDir().getText(), vista.getjTxtTelEmp().getText(), vista.getjTxtEmail().getText());
//            conectar.RegistrarTelEmp(vista.getjTxtTelEmp().getText());
//            vista.getjPanel1().setVisible(true);
//            vista.getjPanEmp().setVisible(false);
//        }
//        if(ae.getSource()==vista.getjBtnSal()){
//            System.exit(0);
//        }
}
