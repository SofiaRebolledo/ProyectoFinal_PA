package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import Vista.VistaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista_Controlador implements ActionListener{
    
    Conexion conectar = new Conexion();
    Usuario user = new Usuario();
    VistaInicial vista = new VistaInicial();

    public Vista_Controlador() {
        conectar.conectar();
        vista.setVisible(true);
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
    
    @Override
    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource()==vista.getjBtnCompEqu()){
//            
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
    
}
