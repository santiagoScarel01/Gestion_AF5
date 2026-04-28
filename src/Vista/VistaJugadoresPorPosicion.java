package Vista;

import Controlador.ControladorJugador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaJugadoresPorPosicion extends javax.swing.JFrame {

    public VistaJugadoresPorPosicion() {
        initComponents();
        setResizable(false);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonBuscarJugadoresPorPosicion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJugadorQueSonDePosicionDada = new javax.swing.JTable();
        cargaPosicionJugadorDadaPorVista = new javax.swing.JComboBox<>();
        volverAlMenuConsulta = new javax.swing.JButton();
        volverAlMenuPrincipal = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad de jugadores por posición");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Posición a buscar");

        botonBuscarJugadoresPorPosicion.setBackground(new java.awt.Color(138, 193, 143));
        botonBuscarJugadoresPorPosicion.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarJugadoresPorPosicion.setText("BUSCAR");
        botonBuscarJugadoresPorPosicion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarJugadoresPorPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarJugadoresPorPosicionActionPerformed(evt);
            }
        });

        tablaJugadorQueSonDePosicionDada.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaJugadorQueSonDePosicionDada.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(tablaJugadorQueSonDePosicionDada);
        tablaJugadorQueSonDePosicionDada.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        cargaPosicionJugadorDadaPorVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaPosicionJugadorDadaPorVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Arquero", "Defensor", "Delantero", "Mediocampista" }));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargaPosicionJugadorDadaPorVista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(284, 284, 284)
                        .addComponent(botonBuscarJugadoresPorPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volverAlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBuscarJugadoresPorPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cargaPosicionJugadorDadaPorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(volverAlMenuConsulta)
                        .addComponent(volverAlMenuPrincipal)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void botonBuscarJugadoresPorPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarJugadoresPorPosicionActionPerformed
        String posicionSeleccionada = (String) cargaPosicionJugadorDadaPorVista.getSelectedItem();

        if (posicionSeleccionada == null || posicionSeleccionada.equals("Seleccione una opción...")) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una posición.");
            return;
        }

        // ✅ Ahora accede al controlador (no al modelo)
        List<Object[]> filas = ControladorJugador.obtenerFilasPorPosicion(posicionSeleccionada);

        DefaultTableModel modelo = (DefaultTableModel) tablaJugadorQueSonDePosicionDada.getModel();
        modelo.setRowCount(0); // Limpia la tabla

        if (filas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay jugadores con esa posición.");
            return;
        }

        for (Object[] fila : filas) {
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_botonBuscarJugadoresPorPosicionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarJugadoresPorPosicion;
    private javax.swing.JComboBox<String> cargaPosicionJugadorDadaPorVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaJugadorQueSonDePosicionDada;
    private javax.swing.JButton volverAlMenuConsulta;
    private javax.swing.JButton volverAlMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
