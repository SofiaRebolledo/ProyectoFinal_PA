package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import Vistas.VistaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Vista_Controlador implements ActionListener{
    
    Conexion conectar = new Conexion();
    Usuario user = new Usuario();
    VistaInicial vista = new VistaInicial();

    public Vista_Controlador() {
        conectar.conectar();
//        user.ModificarDatos("PSR7205E", "Juan", 0);
//        vista.setVisible(true);
//        vista.getjPanEmp().setVisible(false);
//        vista.getjPanPer().setVisible(false);
//        vista.getjBtnCompEqu().addActionListener(this);
//        vista.getjBtnConInv().addActionListener(this);
//        vista.getjBtnRegEmp().addActionListener(this);
//        vista.getjBtnRegPer().addActionListener(this);
//        vista.getjBtnSal().addActionListener(this);
//        vista.getjBtnGuarPers().addActionListener(this);
//        vista.getjBtnGuarEmp().addActionListener(this);
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
