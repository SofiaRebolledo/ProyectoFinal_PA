package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
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
        BtnConsultar = new javax.swing.JButton();
        panelConsulUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsul = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OpcConsul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Pais", "Ciudad", "Aeropuerto", "Vuelo" }));
        PanelConsultas.add(OpcConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 523, -1));

        BtnConsultar.setText("Consultar");
        BtnConsultar.setToolTipText("");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        PanelConsultas.add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 0, 356, -1));

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

        panelConsulUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 880, 480));

        PanelConsultas.add(panelConsulUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConsultarActionPerformed

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
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JComboBox<String> OpcConsul;
    private javax.swing.JPanel PanelConsultas;
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
