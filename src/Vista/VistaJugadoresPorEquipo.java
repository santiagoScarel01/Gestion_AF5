package Vista;

import Controlador.ControladorJugador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaJugadoresPorEquipo extends javax.swing.JFrame {

    public VistaJugadoresPorEquipo() {
        initComponents();
        setResizable(false);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        equipoABuscarSeleccionada = new javax.swing.JComboBox<>();
        botonBuscarJugadoresPorEquipoVista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCantidadJugadoresPorEquipo = new javax.swing.JTable();
        volverAlMenuConsulta = new javax.swing.JButton();
        volverAlMenuPrincipalJugadoresPorEquipoVista = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad de jugadores por equipo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Equipo a buscar");

        equipoABuscarSeleccionada.setForeground(new java.awt.Color(0, 0, 0));
        equipoABuscarSeleccionada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "River Plate", "Boca Juniors", "Independiente", "Racing Club", "San Lorenzo", "Rosario Central", "Newell's Old Boys", "Estudiantes", "Gimnasia La Plata", "Huracán" }));
        equipoABuscarSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoABuscarSeleccionadaActionPerformed(evt);
            }
        });

        botonBuscarJugadoresPorEquipoVista.setBackground(new java.awt.Color(138, 193, 143));
        botonBuscarJugadoresPorEquipoVista.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarJugadoresPorEquipoVista.setText("BUSCAR");
        botonBuscarJugadoresPorEquipoVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarJugadoresPorEquipoVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarJugadoresPorEquipoVistaActionPerformed(evt);
            }
        });

        tablaCantidadJugadoresPorEquipo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCantidadJugadoresPorEquipo.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaCantidadJugadoresPorEquipo);
        tablaCantidadJugadoresPorEquipo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaCantidadJugadoresPorEquipo.getColumnModel().getColumnCount() > 0) {
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(0).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(1).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(2).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(3).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(4).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(5).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(6).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(7).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(8).setResizable(false);
            tablaCantidadJugadoresPorEquipo.getColumnModel().getColumn(9).setResizable(false);
        }

        volverAlMenuConsulta.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuConsulta.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuConsulta.setText("VOLVER ");
        volverAlMenuConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuConsultaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalJugadoresPorEquipoVista.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalJugadoresPorEquipoVista.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalJugadoresPorEquipoVista.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalJugadoresPorEquipoVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalJugadoresPorEquipoVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalJugadoresPorEquipoVistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equipoABuscarSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1381, 1381, 1381)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonBuscarJugadoresPorEquipoVista, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(volverAlMenuPrincipalJugadoresPorEquipoVista))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volverAlMenuPrincipalJugadoresPorEquipoVista)
                            .addComponent(volverAlMenuConsulta)
                            .addComponent(botonBuscarJugadoresPorEquipoVista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(equipoABuscarSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlMenuPrincipalJugadoresPorEquipoVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalJugadoresPorEquipoVistaActionPerformed
        VistaPersona l = new VistaPersona();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalJugadoresPorEquipoVistaActionPerformed

    private void volverAlMenuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuConsultaActionPerformed
        VistaMenuConsultas a = new VistaMenuConsultas();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuConsultaActionPerformed

    private void botonBuscarJugadoresPorEquipoVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarJugadoresPorEquipoVistaActionPerformed
        String equipoSeleccionado = (String) equipoABuscarSeleccionada.getSelectedItem();

        if (equipoSeleccionado == null || equipoSeleccionado.equals("Seleccione una opción...")) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un equipo válido.");
            return;
        }

        List<Object[]> jugadoresFiltrados = ControladorJugador.obtenerJugadoresPorEquipo(equipoSeleccionado);

        DefaultTableModel modelo = (DefaultTableModel) tablaCantidadJugadoresPorEquipo.getModel();
        modelo.setRowCount(0);

        if (jugadoresFiltrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron jugadores para el equipo seleccionado.");
            return;
        }

        for (Object[] fila : jugadoresFiltrados) {
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_botonBuscarJugadoresPorEquipoVistaActionPerformed

    private void equipoABuscarSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoABuscarSeleccionadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoABuscarSeleccionadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarJugadoresPorEquipoVista;
    private javax.swing.JComboBox<String> equipoABuscarSeleccionada;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaCantidadJugadoresPorEquipo;
    private javax.swing.JButton volverAlMenuConsulta;
    private javax.swing.JButton volverAlMenuPrincipalJugadoresPorEquipoVista;
    // End of variables declaration//GEN-END:variables
}
