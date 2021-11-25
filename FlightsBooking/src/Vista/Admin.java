package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    public JTextField getAdminAddPaisNombre() {
        return adminAddPaisNombre;
    }

    public JButton getBtnSelectTabla() {
        return BtnSelectTabla;
    }

    public JTextField getAdminAddUserCelular() {
        return AdminAddUserCelular;
    }

    public JPasswordField getAdminAddUserContrasena() {
        return AdminAddUserContrasena;
    }

    public JTextField getAdminAddUserCorreo() {
        return AdminAddUserCorreo;
    }

    public JTextField getAdminAddUserFecha() {
        return AdminAddUserFecha;
    }

    public JTextField getAdminAddUserPais() {
        return AdminAddUserPais;
    }

    public JTextField getAdminAddAerCiudad() {
        return adminAddAerCiudad;
    }

    public JTextField getAdminAddAerSiglas() {
        return adminAddAerSiglas;
    }

    public JTextField getAdminAddAeridNomAer() {
        return adminAddAeridNomAer;
    }

    public JTextField getAdminAddCiuPais() {
        return adminAddCiuPais;
    }

    public JTextField getAdminAddCiu_id_Nom_Ciudad() {
        return adminAddCiu_id_Nom_Ciudad;
    }

    public JTextField getAdminAddPaisIdCodPais() {
        return adminAddPaisIdCodPais;
    }

    public JTextField getAdminAddUserApellido() {
        return adminAddUserApellido;
    }

    public JTextField getAdminAddUserNombre() {
        return adminAddUserNombre;
    }

    public JTextField getAdminAddUserPasaporte() {
        return adminAddUserPasaporte;
    }

    public JTextField getAdminAddVueloAerDest() {
        return adminAddVueloAerDest;
    }

    public JTextField getAdminAddVueloAerOri() {
        return adminAddVueloAerOri;
    }

    public JTextField getAdminAddVueloCosto() {
        return adminAddVueloCosto;
    }

    public JTextField getAdminAddVueloDistancia() {
        return adminAddVueloDistancia;
    }

    public JTextField getAdminAddVueloDura() {
        return adminAddVueloDura;
    }

    public JTextField getAdminAddVueloHoraLL() {
        return adminAddVueloHoraLL;
    }

    public JTextField getAdminAddVueloHoraP() {
        return adminAddVueloHoraP;
    }

    public JTextField getAdminAddVueloIdUser() {
        return adminAddVueloIdUser;
    }

    public JTextField getAdminAddVueloIdVuelo() {
        return adminAddVueloIdVuelo;
    }

    public JButton getAdminBtnAdd() {
        return adminBtnAdd;
    }

    public JPanel getAdminPanelAddAeropuerto() {
        return adminPanelAddAeropuerto;
    }

    public JPanel getAdminPanelAddCiu() {
        return adminPanelAddCiu;
    }

    public JPanel getAdminPanelAddPais() {
        return adminPanelAddPais;
    }

    public JPanel getAdminPanelAddUsuario() {
        return adminPanelAddUsuario;
    }

    public JPanel getAdminPanelAddVuelo() {
        return adminPanelAddVuelo;
    }

    public JButton getAdminSalirAdd() {
        return adminSalirAdd;
    }

    public JComboBox<String> getAdminSelTablaAgregar() {
        return adminSelTablaAgregar;
    }

    public JButton getjButton1() {
        return BtnSelectTabla;
    }

    public JPanel getPanelAgregar() {
        return PanelAgregar;
    }

    public JButton getAdminSalirConsul() {
        return adminSalirConsul;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public JPanel getPanelConsulVuelo() {
        return panelConsulVuelo;
    }

    public JTable getTablaConsulVuelo() {
        return tablaConsulVuelo;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public JPanel getPanelConsulAer() {
        return panelConsulAer;
    }

    public JTable getTablaConsulAer() {
        return tablaConsulAer;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public JPanel getPanelConsulCiudad() {
        return panelConsulCiudad;
    }

    public JTable getTablaConsulCiudad() {
        return tablaConsulCiudad;
    }

    public JPanel getPanelConsulUsuarios() {
        return panelConsulUsuarios;
    }

    public JTable getTablaConsul() {
        return tablaConsul;
    }

    public JComboBox<String> getOpcConsul() {
        return OpcConsul;
    }

    public JPanel getPanelConsultas() {
        return PanelConsultas;
    }

    public JButton getBtnConsultar() {
        return BtnConsultar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JPanel getPanelConsulPais() {
        return panelConsulPais;
    }

    public JTable getTablaConsulPais() {
        return tablaConsulPais;
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConsultas = new javax.swing.JPanel();
        OpcConsul = new javax.swing.JComboBox<>();
        adminSalirConsul = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        panelConsulUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsul = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelConsulPais = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsulPais = new javax.swing.JTable();
        panelConsulCiudad = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsulCiudad = new javax.swing.JTable();
        panelConsulAer = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaConsulAer = new javax.swing.JTable();
        panelConsulVuelo = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaConsulVuelo = new javax.swing.JTable();
        PanelAgregar = new javax.swing.JPanel();
        adminSelTablaAgregar = new javax.swing.JComboBox<>();
        BtnSelectTabla = new javax.swing.JButton();
        adminSalirAdd = new javax.swing.JButton();
        adminPanelAddVuelo = new javax.swing.JPanel();
        adminAddVueloIdVuelo = new javax.swing.JTextField();
        adminAddVueloIdUser = new javax.swing.JTextField();
        adminAddVueloAerOri = new javax.swing.JTextField();
        adminAddVueloAerDest = new javax.swing.JTextField();
        adminAddVueloHoraP = new javax.swing.JTextField();
        adminAddVueloHoraLL = new javax.swing.JTextField();
        adminAddVueloDistancia = new javax.swing.JTextField();
        adminAddVueloDura = new javax.swing.JTextField();
        adminAddVueloCosto = new javax.swing.JTextField();
        adminPanelAddAeropuerto = new javax.swing.JPanel();
        adminAddAeridNomAer = new javax.swing.JTextField();
        adminAddAerSiglas = new javax.swing.JTextField();
        adminAddAerCiudad = new javax.swing.JTextField();
        adminPanelAddUsuario = new javax.swing.JPanel();
        adminAddUserNombre = new javax.swing.JTextField();
        adminAddUserApellido = new javax.swing.JTextField();
        adminAddUserPasaporte = new javax.swing.JTextField();
        AdminAddUserContrasena = new javax.swing.JPasswordField();
        AdminAddUserPais = new javax.swing.JTextField();
        AdminAddUserCelular = new javax.swing.JTextField();
        AdminAddUserCorreo = new javax.swing.JTextField();
        AdminAddUserFecha = new javax.swing.JTextField();
        adminPanelAddPais = new javax.swing.JPanel();
        adminAddPaisIdCodPais = new javax.swing.JTextField();
        adminAddPaisNombre = new javax.swing.JTextField();
        adminPanelAddCiu = new javax.swing.JPanel();
        adminAddCiu_id_Nom_Ciudad = new javax.swing.JTextField();
        adminAddCiuPais = new javax.swing.JTextField();
        adminBtnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        PanelConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OpcConsul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Pais", "Ciudad", "Aeropuerto", "Vuelo" }));
        PanelConsultas.add(OpcConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 523, -1));

        adminSalirConsul.setText("X");
        adminSalirConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSalirConsulActionPerformed(evt);
            }
        });
        PanelConsultas.add(adminSalirConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, -1));

        BtnConsultar.setText("Consultar");
        BtnConsultar.setToolTipText("");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        PanelConsultas.add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 0, 300, -1));

        panelConsulUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConsul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pasaporte", "Nombre", "Apellido", "Contrasena", "Pais", "Celular", "Correo", "Fecha_Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(tablaConsul);
        if (tablaConsul.getColumnModel().getColumnCount() > 0) {
            tablaConsul.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            tablaConsul.getColumnModel().getColumn(3).setHeaderValue("Contrasena");
            tablaConsul.getColumnModel().getColumn(4).setHeaderValue("Pais");
            tablaConsul.getColumnModel().getColumn(5).setHeaderValue("Celular");
            tablaConsul.getColumnModel().getColumn(6).setHeaderValue("Correo");
            tablaConsul.getColumnModel().getColumn(7).setHeaderValue("Fecha_Nacimiento");
        }

        panelConsulUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 810, 480));

        PanelConsultas.add(panelConsulUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 31, 850, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        PanelConsultas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, -1, 570));

        panelConsulPais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConsulPais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Cod_Pais", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tablaConsulPais);

        panelConsulPais.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        PanelConsultas.add(panelConsulPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 870, 480));

        panelConsulCiudad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConsulCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Nom_Ciudad", "Pais"
            }
        ));
        jScrollPane3.setViewportView(tablaConsulCiudad);

        panelConsulCiudad.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        PanelConsultas.add(panelConsulCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 870, 480));

        panelConsulAer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConsulAer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Nom_Aeropuerto", "Siglas", "Ciudad"
            }
        ));
        jScrollPane4.setViewportView(tablaConsulAer);

        panelConsulAer.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        PanelConsultas.add(panelConsulAer, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 870, 480));

        panelConsulVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConsulVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_Vuelo", "id_Usuario", "Aeropuerto_Origen", "Aeropuerto_Destino", "Hora_Partida", "Hora_Llegada", "Distancia", "Duracion", "Costo"
            }
        ));
        jScrollPane5.setViewportView(tablaConsulVuelo);

        panelConsulVuelo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        PanelConsultas.add(panelConsulVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 870, 480));

        PanelAgregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminSelTablaAgregar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Pais", "Ciudad", "Aeropuerto", "Vuelo" }));
        PanelAgregar.add(adminSelTablaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 660, 40));

        BtnSelectTabla.setText("Seleccionar Tabla");
        PanelAgregar.add(BtnSelectTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, 40));

        adminSalirAdd.setText("X");
        adminSalirAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSalirAddActionPerformed(evt);
            }
        });
        PanelAgregar.add(adminSalirAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 50, 40));

        adminPanelAddVuelo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vuelo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N
        adminPanelAddVuelo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminAddVueloIdVuelo.setBorder(javax.swing.BorderFactory.createTitledBorder("id_Vuelo:"));
        adminPanelAddVuelo.add(adminAddVueloIdVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 390, 60));

        adminAddVueloIdUser.setBorder(javax.swing.BorderFactory.createTitledBorder("id_Usuario:"));
        adminPanelAddVuelo.add(adminAddVueloIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 390, 60));

        adminAddVueloAerOri.setBorder(javax.swing.BorderFactory.createTitledBorder("Aeropuerto Origen:"));
        adminPanelAddVuelo.add(adminAddVueloAerOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 390, 60));

        adminAddVueloAerDest.setBorder(javax.swing.BorderFactory.createTitledBorder("Aeropuerto Destino:"));
        adminPanelAddVuelo.add(adminAddVueloAerDest, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 390, 60));

        adminAddVueloHoraP.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora Partida:"));
        adminPanelAddVuelo.add(adminAddVueloHoraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 390, 60));

        adminAddVueloHoraLL.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora Llegada:"));
        adminPanelAddVuelo.add(adminAddVueloHoraLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 390, 60));

        adminAddVueloDistancia.setBorder(javax.swing.BorderFactory.createTitledBorder("Distancia:"));
        adminPanelAddVuelo.add(adminAddVueloDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 390, 60));

        adminAddVueloDura.setBorder(javax.swing.BorderFactory.createTitledBorder("Duración:"));
        adminPanelAddVuelo.add(adminAddVueloDura, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 390, 60));

        adminAddVueloCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo:"));
        adminPanelAddVuelo.add(adminAddVueloCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 390, 60));

        PanelAgregar.add(adminPanelAddVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 430));

        adminPanelAddAeropuerto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aeropuerto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N
        adminPanelAddAeropuerto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminAddAeridNomAer.setBorder(javax.swing.BorderFactory.createTitledBorder("id_Nom_Aeropuerto:"));
        adminPanelAddAeropuerto.add(adminAddAeridNomAer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 390, 60));

        adminAddAerSiglas.setBorder(javax.swing.BorderFactory.createTitledBorder("Siglas:"));
        adminPanelAddAeropuerto.add(adminAddAerSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 390, 60));

        adminAddAerCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudad:"));
        adminPanelAddAeropuerto.add(adminAddAerCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 390, 60));

        PanelAgregar.add(adminPanelAddAeropuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 430));

        adminPanelAddUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N
        adminPanelAddUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminAddUserNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));
        adminPanelAddUsuario.add(adminAddUserNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 390, 60));

        adminAddUserApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido:"));
        adminPanelAddUsuario.add(adminAddUserApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 390, 60));

        adminAddUserPasaporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Pasaporte: "));
        adminPanelAddUsuario.add(adminAddUserPasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 390, 60));

        AdminAddUserContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña:"));
        adminPanelAddUsuario.add(AdminAddUserContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 390, 60));

        AdminAddUserPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Pais:"));
        adminPanelAddUsuario.add(AdminAddUserPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 390, 60));

        AdminAddUserCelular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular:"));
        adminPanelAddUsuario.add(AdminAddUserCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 390, 60));

        AdminAddUserCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo:"));
        adminPanelAddUsuario.add(AdminAddUserCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 390, 60));

        AdminAddUserFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Nacimiento:"));
        adminPanelAddUsuario.add(AdminAddUserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 390, 60));

        PanelAgregar.add(adminPanelAddUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 430));

        adminPanelAddPais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N
        adminPanelAddPais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminAddPaisIdCodPais.setBorder(javax.swing.BorderFactory.createTitledBorder("id_Cod_Pais:"));
        adminPanelAddPais.add(adminAddPaisIdCodPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 390, 60));

        adminAddPaisNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre:"));
        adminPanelAddPais.add(adminAddPaisNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 390, 60));

        PanelAgregar.add(adminPanelAddPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 430));

        adminPanelAddCiu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciudad:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24))); // NOI18N
        adminPanelAddCiu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminAddCiu_id_Nom_Ciudad.setBorder(javax.swing.BorderFactory.createTitledBorder("id_Nom_Ciudad:"));
        adminPanelAddCiu.add(adminAddCiu_id_Nom_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 390, 60));

        adminAddCiuPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Pais:"));
        adminPanelAddCiu.add(adminAddCiuPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 390, 60));

        PanelAgregar.add(adminPanelAddCiu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 430));

        adminBtnAdd.setText("Agregar");
        adminBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnAddActionPerformed(evt);
            }
        });
        PanelAgregar.add(adminBtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void adminSalirConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSalirConsulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSalirConsulActionPerformed

    private void adminSalirAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSalirAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSalirAddActionPerformed

    private void adminBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBtnAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminAddUserCelular;
    private javax.swing.JPasswordField AdminAddUserContrasena;
    private javax.swing.JTextField AdminAddUserCorreo;
    private javax.swing.JTextField AdminAddUserFecha;
    private javax.swing.JTextField AdminAddUserPais;
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnSelectTabla;
    private javax.swing.JComboBox<String> OpcConsul;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JPanel PanelConsultas;
    private javax.swing.JTextField adminAddAerCiudad;
    private javax.swing.JTextField adminAddAerSiglas;
    private javax.swing.JTextField adminAddAeridNomAer;
    private javax.swing.JTextField adminAddCiuPais;
    private javax.swing.JTextField adminAddCiu_id_Nom_Ciudad;
    private javax.swing.JTextField adminAddPaisIdCodPais;
    private javax.swing.JTextField adminAddPaisNombre;
    private javax.swing.JTextField adminAddUserApellido;
    private javax.swing.JTextField adminAddUserNombre;
    private javax.swing.JTextField adminAddUserPasaporte;
    private javax.swing.JTextField adminAddVueloAerDest;
    private javax.swing.JTextField adminAddVueloAerOri;
    private javax.swing.JTextField adminAddVueloCosto;
    private javax.swing.JTextField adminAddVueloDistancia;
    private javax.swing.JTextField adminAddVueloDura;
    private javax.swing.JTextField adminAddVueloHoraLL;
    private javax.swing.JTextField adminAddVueloHoraP;
    private javax.swing.JTextField adminAddVueloIdUser;
    private javax.swing.JTextField adminAddVueloIdVuelo;
    private javax.swing.JButton adminBtnAdd;
    private javax.swing.JPanel adminPanelAddAeropuerto;
    private javax.swing.JPanel adminPanelAddCiu;
    private javax.swing.JPanel adminPanelAddPais;
    private javax.swing.JPanel adminPanelAddUsuario;
    private javax.swing.JPanel adminPanelAddVuelo;
    private javax.swing.JButton adminSalirAdd;
    private javax.swing.JButton adminSalirConsul;
    private javax.swing.JComboBox<String> adminSelTablaAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panelConsulAer;
    private javax.swing.JPanel panelConsulCiudad;
    private javax.swing.JPanel panelConsulPais;
    private javax.swing.JPanel panelConsulUsuarios;
    private javax.swing.JPanel panelConsulVuelo;
    private javax.swing.JTable tablaConsul;
    private javax.swing.JTable tablaConsulAer;
    private javax.swing.JTable tablaConsulCiudad;
    private javax.swing.JTable tablaConsulPais;
    private javax.swing.JTable tablaConsulVuelo;
    // End of variables declaration//GEN-END:variables
}
