package Vista;

public class VistaMenuConsultas extends javax.swing.JFrame {

    public VistaMenuConsultas() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        opcionBuscarCantidadDeJugadoresPorEquipoVista = new javax.swing.JButton();
        opcionBuscarJugadorPorGoles = new javax.swing.JButton();
        opcionBuscarJugadorPorExpulsiones = new javax.swing.JButton();
        opcionBuscarArbitroPorInternacionalidad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        opcionBuscarPorPosicionVista = new javax.swing.JButton();
        volverAlMenuPrincipalConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        opcionBuscarCantidadDeJugadoresPorEquipoVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionBuscarCantidadDeJugadoresPorEquipoVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionBuscarCantidadDeJugadoresPorEquipoVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionBuscarCantidadDeJugadoresPorEquipoVista.setText("Buscar por equipo");
        opcionBuscarCantidadDeJugadoresPorEquipoVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionBuscarCantidadDeJugadoresPorEquipoVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBuscarCantidadDeJugadoresPorEquipoVistaActionPerformed(evt);
            }
        });

        opcionBuscarJugadorPorGoles.setBackground(new java.awt.Color(29, 170, 97));
        opcionBuscarJugadorPorGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionBuscarJugadorPorGoles.setForeground(new java.awt.Color(255, 255, 255));
        opcionBuscarJugadorPorGoles.setText("Buscar por goles");
        opcionBuscarJugadorPorGoles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionBuscarJugadorPorGoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBuscarJugadorPorGolesActionPerformed(evt);
            }
        });

        opcionBuscarJugadorPorExpulsiones.setBackground(new java.awt.Color(29, 170, 97));
        opcionBuscarJugadorPorExpulsiones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionBuscarJugadorPorExpulsiones.setForeground(new java.awt.Color(255, 255, 255));
        opcionBuscarJugadorPorExpulsiones.setText("Buscar por expulsiones");
        opcionBuscarJugadorPorExpulsiones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionBuscarJugadorPorExpulsiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBuscarJugadorPorExpulsionesActionPerformed(evt);
            }
        });

        opcionBuscarArbitroPorInternacionalidad.setBackground(new java.awt.Color(29, 170, 97));
        opcionBuscarArbitroPorInternacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionBuscarArbitroPorInternacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        opcionBuscarArbitroPorInternacionalidad.setText("Buscar por internacionalidad");
        opcionBuscarArbitroPorInternacionalidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionBuscarArbitroPorInternacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBuscarArbitroPorInternacionalidadActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido al menú de Consultas");

        opcionBuscarPorPosicionVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionBuscarPorPosicionVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionBuscarPorPosicionVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionBuscarPorPosicionVista.setText("Buscar por posición");
        opcionBuscarPorPosicionVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionBuscarPorPosicionVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionBuscarPorPosicionVistaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalConsultas.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalConsultas.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalConsultas.setText("VOLVER");
        volverAlMenuPrincipalConsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opcionBuscarCantidadDeJugadoresPorEquipoVista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opcionBuscarArbitroPorInternacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opcionBuscarPorPosicionVista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opcionBuscarJugadorPorExpulsiones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opcionBuscarJugadorPorGoles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(volverAlMenuPrincipalConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionBuscarCantidadDeJugadoresPorEquipoVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcionBuscarJugadorPorGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionBuscarJugadorPorExpulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionBuscarPorPosicionVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionBuscarArbitroPorInternacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volverAlMenuPrincipalConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlMenuPrincipalConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalConsultasActionPerformed
        VistaPersona n = new VistaPersona();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalConsultasActionPerformed

    private void opcionBuscarCantidadDeJugadoresPorEquipoVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBuscarCantidadDeJugadoresPorEquipoVistaActionPerformed
        VistaJugadoresPorEquipo b = new VistaJugadoresPorEquipo();
        b.setLocationRelativeTo(null);
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionBuscarCantidadDeJugadoresPorEquipoVistaActionPerformed

    private void opcionBuscarJugadorPorGolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBuscarJugadorPorGolesActionPerformed
        VistaJugadoresPorGoles c = new VistaJugadoresPorGoles();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionBuscarJugadorPorGolesActionPerformed

    private void opcionBuscarJugadorPorExpulsionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBuscarJugadorPorExpulsionesActionPerformed
        VistaJugadoresPorExpulsiones d = new VistaJugadoresPorExpulsiones();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        this.setVisible(false);

        d.getBotonPrivado().doClick();
    }//GEN-LAST:event_opcionBuscarJugadorPorExpulsionesActionPerformed

    private void opcionBuscarPorPosicionVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBuscarPorPosicionVistaActionPerformed
        VistaJugadoresPorPosicion e = new VistaJugadoresPorPosicion();
        e.setLocationRelativeTo(null);
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionBuscarPorPosicionVistaActionPerformed

    private void opcionBuscarArbitroPorInternacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionBuscarArbitroPorInternacionalidadActionPerformed
        VistaArbitroInternacional f = new VistaArbitroInternacional();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionBuscarArbitroPorInternacionalidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opcionBuscarArbitroPorInternacionalidad;
    private javax.swing.JButton opcionBuscarCantidadDeJugadoresPorEquipoVista;
    private javax.swing.JButton opcionBuscarJugadorPorExpulsiones;
    private javax.swing.JButton opcionBuscarJugadorPorGoles;
    private javax.swing.JButton opcionBuscarPorPosicionVista;
    private javax.swing.JButton volverAlMenuPrincipalConsultas;
    // End of variables declaration//GEN-END:variables
}
