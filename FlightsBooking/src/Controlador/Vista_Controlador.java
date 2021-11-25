package Controlador;

import Modelo.Aeropuerto;
import Modelo.Ciudad;
import Modelo.Conexion;
import Modelo.ErrorValidacion;
import Modelo.Pais;
import Modelo.Usuario;
import Modelo.Vuelo;
import Vista.Admin;
import Vista.VistaInicial;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista_Controlador{
    
    protected Usuario user = new Usuario();
    protected Conexion conectar = user;
    protected Pais pais = new Pais();
    protected Ciudad ciudad = new Ciudad();
    protected Aeropuerto aer = new Aeropuerto();
    protected Vuelo vuelo = null;
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
        vista.getPanelModificarDatos().setVisible(false);
        vista.getPanelMostrarAdministrador().setVisible(false);
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
            adminVistaConsultar();
        }
        });
        admin.getBtnConsultar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                adminConsultar();
            }
        });
        vista.getBotonAgregar().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            adminVistaAdd();
        }
        });
        admin.getAdminSalirConsul().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                admin.setVisible(false);
            }
        });
        admin.getAdminSalirAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                admin.setVisible(false);
            }
        });
        admin.getBtnSelectTabla().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                adminSelAddTable();
            }
        });
        admin.getAdminBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                adminAgregar();
            }
        });
        vista.getBtnBuscarVuelos().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            genVuelo();
        }
        });
        vista.getBotonComprar().addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)  
        {  
            comprarVuelo();
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
        String sql = "SELECT * FROM Aeropuerto;";
        ArrayList<Aeropuerto> Lista = new ArrayList<Aeropuerto>();
        try {
            conectar.setRs(conectar.getComando().executeQuery(sql));
            while(conectar.getRs().next()){
                aer.setId_Nom_Aeropuerto(conectar.getRs().getString("id_Nom_Aeropuerto"));
                aer.setSiglas(conectar.getRs().getString("Siglas"));
                aer.setCiudad(conectar.getRs().getString("Ciudad"));
                Lista.add(aer);
                aer = new Aeropuerto();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql = "SELECT COUNT(*) FROM Aeropuerto;";
        try {
        conectar.setRs(conectar.getComando().executeQuery(sql));
            while(conectar.getRs().next()){
                Lista.add(aer);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int x=0; x<Lista.size();x++){
            vista.getjComboDESDE().addItem(Lista.get(x).getId_Nom_Aeropuerto());
            vista.getjComboHACIA().addItem(Lista.get(x).getId_Nom_Aeropuerto());
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
    
    public void adminVistaConsultar(){
        admin.setVisible(true);
        admin.getPanelAgregar().setVisible(false);
        admin.getPanelConsultas().setVisible(true);
        admin.getPanelConsulUsuarios().setVisible(false);
        admin.getPanelConsulPais().setVisible(false);
        admin.getPanelConsulCiudad().setVisible(false);
        admin.getPanelConsulAer().setVisible(false);
        admin.getPanelConsulVuelo().setVisible(false);
    }
    
    public void adminConsultar(){
        String opc = admin.getOpcConsul().getSelectedItem().toString();
        String sql = "SELECT * FROM "+opc+";";
        if(opc.equals("Usuario")){
            ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
            try {
                conectar.setRs(conectar.getComando().executeQuery(sql));
                while(conectar.getRs().next()){
                    user.setPasaport(conectar.getRs().getString("Pasaporte"));
                    user.setNomb(conectar.getRs().getString("Nombre"));
                    user.setApell(conectar.getRs().getString("Apellido"));
                    user.setContras(conectar.getRs().getString("Contrasena"));
                    user.setP(conectar.getRs().getString("Pais"));
                    user.setCel(conectar.getRs().getString("Celular"));
                    user.setCorr(conectar.getRs().getString("Correo"));
                    user.setFecha(conectar.getRs().getString("Fecha_Nacimiento"));
                    Usuarios.add(user);
                    user = new Usuario();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            sql = "SELECT COUNT(*) FROM "+opc+";";
            try {
            conectar.setRs(conectar.getComando().executeQuery(sql));
                while(conectar.getRs().next()){
                    Usuarios.add(user);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel model = (DefaultTableModel) admin.getTablaConsul().getModel();
            Object[] row = new Object[8];
            for(int x=0; x<Usuarios.size();x++){
                row[0] = Usuarios.get(x).getPasaport();
                row[1] = Usuarios.get(x).getNomb();
                row[2] = Usuarios.get(x).getApell();
                row[3] = Usuarios.get(x).getContras();
                row[4] = Usuarios.get(x).getP();
                row[5] = Usuarios.get(x).getCel();
                row[6] = Usuarios.get(x).getCorr();
                row[7] = Usuarios.get(x).getFecha();
                model.addRow(row);
            }
            admin.getPanelConsulUsuarios().setVisible(true);
            admin.getPanelConsulCiudad().setVisible(false);
            admin.getPanelConsulPais().setVisible(false);
            admin.getPanelConsulAer().setVisible(false);
            admin.getPanelConsulVuelo().setVisible(false);
        }
        else{
            if(opc.equals("Pais")){
                ArrayList<Pais> Lista = new ArrayList<Pais>();
                try {
                    conectar.setRs(conectar.getComando().executeQuery(sql));
                    while(conectar.getRs().next()){
                        pais.setId_Pais(conectar.getRs().getInt("id_Cod_Pais"));
                        pais.setNombre(conectar.getRs().getString("Nombre"));
                        Lista.add(pais);
                        pais = new Pais();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
                sql = "SELECT COUNT(*) FROM "+opc+";";
                try {
                conectar.setRs(conectar.getComando().executeQuery(sql));
                    while(conectar.getRs().next()){
                        Lista.add(pais);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel model = (DefaultTableModel) admin.getTablaConsulPais().getModel();
                Object[] row = new Object[2];
                for(int x=0; x<Lista.size();x++){
                    row[0] = Lista.get(x).getId_Pais();
                    row[1] = Lista.get(x).getNombre();
                    model.addRow(row);
                }
                admin.getPanelConsulPais().setVisible(true);
                admin.getPanelConsulUsuarios().setVisible(false);
                admin.getPanelConsulCiudad().setVisible(false);
                admin.getPanelConsulAer().setVisible(false);
                admin.getPanelConsulVuelo().setVisible(false);
            }
            else{
                if(opc.equals("Ciudad")){
                    ArrayList<Ciudad> Lista = new ArrayList<Ciudad>();
                    try {
                        conectar.setRs(conectar.getComando().executeQuery(sql));
                        while(conectar.getRs().next()){
                            ciudad.setId_Nom_Ciudad(conectar.getRs().getString("id_Nom_Ciudad"));
                            ciudad.setPais(conectar.getRs().getString("Pais"));
                            Lista.add(ciudad);
                            ciudad = new Ciudad();
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    sql = "SELECT COUNT(*) FROM "+opc+";";
                    try {
                    conectar.setRs(conectar.getComando().executeQuery(sql));
                        while(conectar.getRs().next()){
                            Lista.add(ciudad);
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    DefaultTableModel model = (DefaultTableModel) admin.getTablaConsulCiudad().getModel();
                    Object[] row = new Object[2];
                    for(int x=0; x<Lista.size();x++){
                        row[0] = Lista.get(x).getId_Nom_Ciudad();
                        row[1] = Lista.get(x).getPais();
                        model.addRow(row);
                    }
                    admin.getPanelConsulCiudad().setVisible(true);
                    admin.getPanelConsulUsuarios().setVisible(false);
                    admin.getPanelConsulPais().setVisible(false);
                    admin.getPanelConsulAer().setVisible(false);
                    admin.getPanelConsulVuelo().setVisible(false);
                }
                else{
                    if(opc.equals("Aeropuerto")){
                        ArrayList<Aeropuerto> Lista = new ArrayList<Aeropuerto>();
                        try {
                            conectar.setRs(conectar.getComando().executeQuery(sql));
                            while(conectar.getRs().next()){
                                aer.setId_Nom_Aeropuerto(conectar.getRs().getString("id_Nom_Aeropuerto"));
                                aer.setSiglas(conectar.getRs().getString("Siglas"));
                                aer.setCiudad(conectar.getRs().getString("Ciudad"));
                                Lista.add(aer);
                                aer = new Aeropuerto();
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        sql = "SELECT COUNT(*) FROM "+opc+";";
                        try {
                        conectar.setRs(conectar.getComando().executeQuery(sql));
                            while(conectar.getRs().next()){
                                Lista.add(aer);
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        DefaultTableModel model = (DefaultTableModel) admin.getTablaConsulAer().getModel();
                        Object[] row = new Object[3];
                        for(int x=0; x<Lista.size();x++){
                            row[0] = Lista.get(x).getId_Nom_Aeropuerto();
                            row[1] = Lista.get(x).getSiglas();
                            row[2] = Lista.get(x).getCiudad();
                            model.addRow(row);
                        }
                        admin.getPanelConsulAer().setVisible(true);
                        admin.getPanelConsulCiudad().setVisible(false);
                        admin.getPanelConsulUsuarios().setVisible(false);
                        admin.getPanelConsulPais().setVisible(false);
                        admin.getPanelConsulVuelo().setVisible(false);
                    }
                    else{
                        if(opc.equals("Vuelo")){
                            ArrayList<Vuelo> Lista = new ArrayList<Vuelo>();
                            try {
                                conectar.setRs(conectar.getComando().executeQuery(sql));
                                while(conectar.getRs().next()){
                                    Lista.add(vuelo);
                                    vuelo = new Vuelo(conectar.getRs().getString("id_Vuelo"),conectar.getRs().getString("id_Usuario"),
                                    conectar.getRs().getString("Aeropuerto_Origen"),conectar.getRs().getString("Aeropuerto_Destino"),
                                    conectar.getRs().getTime("Hora_Partida"),conectar.getRs().getTime("Hora_Llegada"),conectar.getRs().getInt("Distancia"),
                                    conectar.getRs().getTime("Duracion"), conectar.getRs().getInt("Costo"));
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            sql = "SELECT COUNT(*) FROM "+opc+";";
                            try {
                            conectar.setRs(conectar.getComando().executeQuery(sql));
                                while(conectar.getRs().next()){
                                    Lista.add(vuelo);
                                }

                            } catch (SQLException ex) {
                                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            DefaultTableModel model = (DefaultTableModel) admin.getTablaConsulVuelo().getModel();
                            Object[] row = new Object[9];
                            for(int x=0; x<Lista.size();x++){
                                row[0] = Lista.get(x).getId_Vuelo();
                                row[1] = Lista.get(x).getId_Usuario();
                                row[2] = Lista.get(x).getAeropuerto_Origen();
                                row[3] = Lista.get(x).getAeropuerto_Destino();
                                row[4] = Lista.get(x).getHora_Partida();
                                row[5] = Lista.get(x).getHora_Llegada();
                                row[6] = Lista.get(x).getDistancia();
                                row[7] = Lista.get(x).getDuracion();
                                row[8] = Lista.get(x).getCosto();
                                model.addRow(row);
                            }
                            admin.getPanelConsulVuelo().setVisible(true);
                            admin.getPanelConsulAer().setVisible(false);
                            admin.getPanelConsulCiudad().setVisible(false);
                            admin.getPanelConsulUsuarios().setVisible(false);
                            admin.getPanelConsulPais().setVisible(false);
                        }
                    }
                }
            }
        }
        
    }
    
    public void adminVistaAdd(){
        admin.setVisible(true);
        admin.getPanelConsultas().setVisible(false);
        admin.getPanelAgregar().setVisible(true);
        admin.getAdminPanelAddAeropuerto().setVisible(false);
        admin.getAdminPanelAddCiu().setVisible(false);
        admin.getAdminPanelAddPais().setVisible(false);
        admin.getAdminPanelAddUsuario().setVisible(false);
        admin.getAdminPanelAddVuelo().setVisible(false);
    }
    
    public void adminSelAddTable(){
        String Tabla = admin.getAdminSelTablaAgregar().getSelectedItem().toString();
        if(Tabla.equals("Usuario")){
            admin.getAdminPanelAddUsuario().setVisible(true);
            admin.getAdminPanelAddPais().setVisible(false);
            admin.getAdminPanelAddCiu().setVisible(false);
            admin.getAdminPanelAddAeropuerto().setVisible(false);
            admin.getAdminPanelAddVuelo().setVisible(false);
        }
        if(Tabla.equals("Pais")){
            admin.getAdminPanelAddUsuario().setVisible(false);
            admin.getAdminPanelAddPais().setVisible(true);
            admin.getAdminPanelAddCiu().setVisible(false);
            admin.getAdminPanelAddAeropuerto().setVisible(false);
            admin.getAdminPanelAddVuelo().setVisible(false);
        }
        if(Tabla.equals("Ciudad")){
            admin.getAdminPanelAddUsuario().setVisible(false);
            admin.getAdminPanelAddPais().setVisible(false);
            admin.getAdminPanelAddCiu().setVisible(true);
            admin.getAdminPanelAddAeropuerto().setVisible(false);
            admin.getAdminPanelAddVuelo().setVisible(false);
        }
        if(Tabla.equals("Aeropuerto")){
            admin.getAdminPanelAddUsuario().setVisible(false);
            admin.getAdminPanelAddPais().setVisible(false);
            admin.getAdminPanelAddCiu().setVisible(false);
            admin.getAdminPanelAddAeropuerto().setVisible(true);
            admin.getAdminPanelAddVuelo().setVisible(false);
        }
        if(Tabla.equals("Vuelo")){
            admin.getAdminPanelAddUsuario().setVisible(false);
            admin.getAdminPanelAddPais().setVisible(false);
            admin.getAdminPanelAddCiu().setVisible(false);
            admin.getAdminPanelAddAeropuerto().setVisible(false);
            admin.getAdminPanelAddVuelo().setVisible(true);
        }
    }
    
    public void adminAgregar(){
        String Tabla = admin.getAdminSelTablaAgregar().getSelectedItem().toString();
        String data = "";
        if(Tabla.equals("Usuario") && !control.espacioVacio(admin.getAdminAddUserPasaporte().getText()) &&
                !control.espacioVacio(admin.getAdminAddUserNombre().getText()) && !control.espacioVacio(admin.getAdminAddUserApellido().getText())
                && !control.espacioVacio(admin.getAdminAddUserContrasena().getText()) && !control.espacioVacio(admin.getAdminAddUserPais().getText()) &&
                !control.espacioVacio(admin.getAdminAddUserCelular().getText()) && !control.espacioVacio(admin.getAdminAddUserCorreo().getText()) &&
                !control.espacioVacio(admin.getAdminAddUserFecha().getText())){
            data = "(Pasaporte, Nombre, Apellido, Contrasena, Pais, Celular, Correo, Fecha_Nacimiento)"
                    + "VALUES ('"+admin.getAdminAddUserPasaporte().getText()+"','"+admin.getAdminAddUserNombre().getText()+"',"
                    + "'"+admin.getAdminAddUserApellido().getText()+"','"+admin.getAdminAddUserContrasena().getText()+"',"
                    + "'"+admin.getAdminAddUserPais().getText()+"','"+admin.getAdminAddUserCelular().getText()+"',"
                    + "'"+admin.getAdminAddUserCorreo().getText()+"','"+admin.getAdminAddUserFecha().getText()+"');";
        }
        else{
            if(Tabla.equals("Pais") && !control.espacioVacio(admin.getAdminAddPaisIdCodPais().getText())&&!control.espacioVacio(admin.getAdminAddPaisNombre().getText())){
                data = "(id_Cod_Pais, Nombre) VALUES ('"+admin.getAdminAddPaisIdCodPais().getText()+"', '"+admin.getAdminAddPaisNombre().getText()+"');";
            }
            else{
                if(Tabla.equals("Ciudad")&&!control.espacioVacio(admin.getAdminAddCiu_id_Nom_Ciudad().getText())&&!control.espacioVacio(admin.getAdminAddCiuPais().getText())){
                    data = "(id_Nom_Ciudad, Pais) VALUES ('"+admin.getAdminAddCiu_id_Nom_Ciudad().getText()+"','"+admin.getAdminAddCiuPais().getText()+"');";
                }
                else{
                    if(Tabla.equals("Aeropuerto")&&!control.espacioVacio(admin.getAdminAddAeridNomAer().getText())&&!control.espacioVacio(admin.getAdminAddAerSiglas().getText())&&
                            !control.espacioVacio(admin.getAdminAddAerCiudad().getText())){
                        data = "(id_Nom_Aeropuerto, Siglas, Ciudad) VALUES ('"+admin.getAdminAddAeridNomAer().getText()+"', '"+admin.getAdminAddAerSiglas().getText()+"',"
                                + "'"+admin.getAdminAddAerCiudad().getText()+"');";
                        }
                    else{
                        if(Tabla.equals("Vuelo")&& !control.espacioVacio(admin.getAdminAddVueloIdVuelo().getText())&& !control.espacioVacio(admin.getAdminAddVueloIdUser().getText()) &&
                                !control.espacioVacio(admin.getAdminAddVueloAerOri().getText()) && !control.espacioVacio(admin.getAdminAddVueloAerDest().getText()) && !control.espacioVacio(admin.getAdminAddVueloHoraP().getText())&&
                                !control.espacioVacio(admin.getAdminAddVueloHoraLL().getText())&&!control.espacioVacio(admin.getAdminAddVueloDistancia().getText())&&!control.espacioVacio(admin.getAdminAddVueloDura().getText())&&
                                !control.espacioVacio(admin.getAdminAddVueloCosto().getText())){
                            data = "(id_Vuelo, id_Usuario, Aeropuerto_Origen, Aeropuerto_Destino, Hora_Partida, Hora_Llegada, Distancia, Duracion, Costo) VALUES"
                                    + "('"+admin.getAdminAddVueloIdVuelo().getText()+"', '"+admin.getAdminAddVueloIdUser().getText()+"', '"+admin.getAdminAddVueloAerOri().getText()+"',"
                                    + "'"+admin.getAdminAddVueloAerDest().getText()+"','"+admin.getAdminAddVueloHoraP().getText()+"','"+admin.getAdminAddVueloHoraLL().getText()+"',"
                                    + "'"+admin.getAdminAddVueloDistancia().getText()+"','"+admin.getAdminAddVueloDura().getText()+"','"+admin.getAdminAddVueloCosto().getText()+"');";
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Alguno de tus datos es erroneo, por favor revisa.");
                        }
                    }
                }
            }
        }
        String sql = "INSERT INTO "+Tabla+" "+data;
        try {
            conectar.getComando().executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Registro Exitoso!");
            admin.getAdminAddUserPasaporte().setText("");
            admin.getAdminAddUserNombre().setText("");
            admin.getAdminAddUserApellido().setText("");
            admin.getAdminAddUserContrasena().setText("");
            admin.getAdminAddUserPais().setText("");
            admin.getAdminAddUserCelular().setText("");
            admin.getAdminAddUserCorreo().setText("");
            admin.getAdminAddUserFecha().setText("");
            admin.getAdminAddPaisIdCodPais().setText("");
            admin.getAdminAddPaisNombre().setText("");
            admin.getAdminAddCiu_id_Nom_Ciudad().setText("");
            admin.getAdminAddCiuPais().setText("");
            admin.getAdminAddAeridNomAer().setText("");
            admin.getAdminAddAerSiglas().setText("");
            admin.getAdminAddAerCiudad().setText("");
            admin.getAdminAddVueloIdVuelo().setText("");
            admin.getAdminAddVueloIdUser().setText("");
            admin.getAdminAddVueloAerOri().setText("");
            admin.getAdminAddVueloAerDest().setText("");
            admin.getAdminAddVueloHoraP().setText("");
            admin.getAdminAddVueloHoraLL().setText("");
            admin.getAdminAddVueloDistancia().setText("");
            admin.getAdminAddVueloDura().setText("");
            admin.getAdminAddVueloCosto().setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Alguno de tus datos es erroneo, por favor revisa.");
        }        
    }
    
    public void genVuelo(){
        if(!control.espacioVacio(vista.getC_Personas().getText())){
            vista.getPanelConfirmacionProcesoVuelo().setVisible(false);
            Random random = new Random();
            String Desde = vista.getjComboDESDE().getSelectedItem().toString();
            String Hasta = vista.getjComboHACIA().getSelectedItem().toString();
            Time HoraP = new Time(random.nextLong());
            Time HoraL = new Time(random.nextLong());
            Time Dur = new Time(HoraL.getTime()-HoraP.getTime());
            java.util.Date FechaSalida = vista.getjDateSalida().getDate();
            java.sql.Date F_Salida = new java.sql.Date(FechaSalida.getTime());
            java.sql.Date F_Llegada = F_Salida;
            int Distancia = random.nextInt(100000);
            int Costo = random.nextInt(10000000);
            int Personas = Integer.parseInt(vista.getC_Personas().getText());
            vista.getOpcion1().setEditable(false);
            vista.getOpcion1().setWrapStyleWord(true);
            vista.getOpcion1().setLineWrap(true);
            vista.getOpcion2().setEditable(false);
            vista.getOpcion2().setWrapStyleWord(true);
            vista.getOpcion2().setLineWrap(true);
            vista.getOpcion3().setEditable(false);
            vista.getOpcion3().setWrapStyleWord(true);
            vista.getOpcion3().setLineWrap(true);
            vuelo = new Vuelo(Pasaporte+String.valueOf(random.nextInt(Costo)), Pasaporte,
                                Desde,Hasta, HoraP,HoraL,Distancia, Dur, Costo);
            System.out.println(vuelo.getId_Vuelo()+"\n"+vuelo.getId_Usuario());
            String sql = "INSERT INTO Vuelo (id_Vuelo, id_Usuario, Aeropuerto_Origen, Aeropuerto_Destino, Hora_Partida, Hora_Llegada, Distancia, Duracion, Costo) VALUES "
                    + "('"+vuelo.getId_Vuelo()+"','"+vuelo.getId_Usuario()+"','"+vuelo.getAeropuerto_Origen()+"',"
                    + "'"+vuelo.getAeropuerto_Destino()+"','"+vuelo.getHora_Partida()+"','"+vuelo.getHora_Llegada()+"',"
                    + "'"+vuelo.getDistancia()+"','"+vuelo.getDuracion()+"', '"+vuelo.getCosto()*Personas+"');";
            System.out.println(sql);
            try {
                conectar.getComando().executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Vista_Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            vista.getOpcion1().setText("*Básico* \nDesde:"+Desde+" Destino:"+Hasta+" Hora:"+HoraP+" Costo:"+Costo*Personas+" No incluye comida");
            vista.getOpcion2().setText("**Premium** \nDesde:"+Desde+" Destino:"+Hasta+" Hora:"+HoraP+" Costo:"+Costo*2*Personas+" Incluye comida");
            vista.getOpcion3().setText("***Business*** \nDesde:"+Desde+" Destino:"+Hasta+" Hora:"+HoraP+" Costo:"+Costo*3*Personas+" Incluye comida");
            vista.getPanelBusquedaVuelos().setVisible(true);
            vista.getPanelPrincipal().setVisible(false);
        }
    }
    
    public void comprarVuelo(){
        String dato = JOptionPane.showInputDialog(vista,"Ingresa la opción a comprar");
        if(control.datoNumerico(dato)){
            int Tipo = Integer.parseInt(dato);
            if(control.verificarRango(3, 1, Tipo)){
                String sql = "UPDATE Vuelo SET Costo='"+vuelo.getCosto()*Tipo+"' where id_Usuario='"+Pasaporte+"';";
                try {
                    conectar.getComando().executeUpdate(sql);
                    JOptionPane.showMessageDialog(vista,"Compra Exitosa!!");
                    vista.getPanelBusquedaVuelos().setVisible(false);
                    vista.getPanelPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            else{
                JOptionPane.showMessageDialog(vista,"Alguno de tus datos es erroneo, por favor revisa.");
            }
        }
    }
    
    public void Salir(){
        System.exit(0);
    }
}
