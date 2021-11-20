package Principal;


import Vistas.VistaInicial;

public class Main {

    public static void main(String[] args) {
        VistaInicial Vista=new VistaInicial();
        Vista.setVisible(true);
        Vista.getPanelInicial().setVisible(false);
        Vista.getPanelRegistro().setVisible(false);
        Vista.getPanelAdministrador().setVisible(false);
        Vista.getPanelPrincipal().setVisible(true);
        Vista.getPanelOpcionesAdministrador().setVisible(false);
        Vista.getPanelMostrarAdministrador().setVisible(false);
        Vista.getPanelAyuda().setVisible(false);
        Vista.getPanelNotificacion().setVisible(false);
        Vista.getPanelCuenta().setVisible(false);
        Vista.getPanelModificarDatos().setVisible(true);
        Vista.getPanelInternoModificarDatos().setVisible(false);
    }
}
