package Vista;

import Controlador.ControladorJugador;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaJugadoresPorExpulsiones extends javax.swing.JFrame {

    public VistaJugadoresPorExpulsiones() {
        initComponents();
        setResizable(false);
        this.pack();
    }

    public JButton getBotonPrivado() {
        return botonBuscarJugadorConMasExpulsiones;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadorConMasExpulsiones = new javax.swing.JTable();
        volverAlMenuConsulta = new javax.swing.JButton();
        volverAlMenuPrincipal = new javax.swing.JButton();
        botonBuscarJugadorConMasExpulsiones = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jugador con más expulsiones");

        tablaJugadorConMasExpulsiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Fecha  Nacimiento", "Nacionalidad", "DNI", "Club Actual", "Posición", "Goles", "Tarjetas Amarillas", "Tarjetas Rojas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaJugadorConMasExpulsiones.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaJugadorConMasExpulsiones);
        tablaJugadorConMasExpulsiones.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        volverAlMenuConsulta.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuConsulta.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuConsulta.setText("VOLVER ");
        volverAlMenuConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuConsultaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipal.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipal.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalActionPerformed(evt);
            }
        });

        botonBuscarJugadorConMasExpulsiones.setBackground(new java.awt.Color(138, 193, 143));
        botonBuscarJugadorConMasExpulsiones.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarJugadorConMasExpulsiones.setText("BUSCAR");
        botonBuscarJugadorConMasExpulsiones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarJugadorConMasExpulsiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarJugadorConMasExpulsionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(310, 310, 310)
                        .addComponent(botonBuscarJugadorConMasExpulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volverAlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverAlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(botonBuscarJugadorConMasExpulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlMenuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuConsultaActionPerformed
        VistaMenuConsultas a = new VistaMenuConsultas();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuConsultaActionPerformed

    private void volverAlMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalActionPerformed
        VistaPersona l = new VistaPersona();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalActionPerformed

    private void botonBuscarJugadorConMasExpulsionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarJugadorConMasExpulsionesActionPerformed
        ControladorJugador controladorJugador = new ControladorJugador();

        List<Object[]> jugadores = controladorJugador.obtenerJugadorConMasExpulsiones();

        DefaultTableModel modelo = (DefaultTableModel) tablaJugadorConMasExpulsiones.getModel();
        modelo.setRowCount(0);

        if (jugadores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay jugadores cargados.");
            return;
        }

        for (Object[] fila : jugadores) {
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_botonBuscarJugadorConMasExpulsionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarJugadorConMasExpulsiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaJugadorConMasExpulsiones;
    private javax.swing.JButton volverAlMenuConsulta;
    private javax.swing.JButton volverAlMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
