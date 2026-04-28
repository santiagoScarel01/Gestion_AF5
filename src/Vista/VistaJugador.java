package Vista;

public class VistaJugador extends javax.swing.JFrame {

    public VistaJugador() {
        initComponents();
        this.setResizable(false);   // El usuario no puede agrandar ni achicar la ventana
        this.setSize(350, 450);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcionCargarJugadorVista = new javax.swing.JButton();
        opcionEliminarJugadorVista = new javax.swing.JButton();
        opcionModificarDatosJugadorVista = new javax.swing.JButton();
        opcionMostrarJugadoresVista = new javax.swing.JButton();
        volverAlMenuPrincipalJugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));
        jPanel1.setPreferredSize(new java.awt.Dimension(348, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú de jugadores");

        opcionCargarJugadorVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionCargarJugadorVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionCargarJugadorVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionCargarJugadorVista.setText("Cargar");
        opcionCargarJugadorVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionCargarJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCargarJugadorVistaActionPerformed(evt);
            }
        });

        opcionEliminarJugadorVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionEliminarJugadorVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionEliminarJugadorVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionEliminarJugadorVista.setText("Eliminar");
        opcionEliminarJugadorVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionEliminarJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionEliminarJugadorVistaActionPerformed(evt);
            }
        });

        opcionModificarDatosJugadorVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionModificarDatosJugadorVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionModificarDatosJugadorVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionModificarDatosJugadorVista.setText("Modificar");
        opcionModificarDatosJugadorVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionModificarDatosJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModificarDatosJugadorVistaActionPerformed(evt);
            }
        });

        opcionMostrarJugadoresVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionMostrarJugadoresVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionMostrarJugadoresVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionMostrarJugadoresVista.setText("Mostrar");
        opcionMostrarJugadoresVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionMostrarJugadoresVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMostrarJugadoresVistaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalJugador.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalJugador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        volverAlMenuPrincipalJugador.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalJugador.setText("VOLVER");
        volverAlMenuPrincipalJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volverAlMenuPrincipalJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(opcionModificarDatosJugadorVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcionEliminarJugadorVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcionMostrarJugadoresVista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opcionCargarJugadorVista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(opcionCargarJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionEliminarJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionModificarDatosJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionMostrarJugadoresVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(volverAlMenuPrincipalJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionCargarJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCargarJugadorVistaActionPerformed
        VistaCargaJugador a = new VistaCargaJugador();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionCargarJugadorVistaActionPerformed

    private void opcionEliminarJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionEliminarJugadorVistaActionPerformed
        VistaEliminarJugador b = new VistaEliminarJugador();
        b.setLocationRelativeTo(null);
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionEliminarJugadorVistaActionPerformed

    private void opcionModificarDatosJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModificarDatosJugadorVistaActionPerformed
        VistaModificarJugador c = new VistaModificarJugador();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcionModificarDatosJugadorVistaActionPerformed

    private void opcionMostrarJugadoresVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMostrarJugadoresVistaActionPerformed
        VistaMostrarJugadores d = new VistaMostrarJugadores();
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        this.setVisible(false);
        //Boton doclick
        d.getBotonPrivado().doClick();
    }//GEN-LAST:event_opcionMostrarJugadoresVistaActionPerformed

    private void volverAlMenuPrincipalJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalJugadorActionPerformed
        VistaPersona a = new VistaPersona();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalJugadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opcionCargarJugadorVista;
    private javax.swing.JButton opcionEliminarJugadorVista;
    private javax.swing.JButton opcionModificarDatosJugadorVista;
    private javax.swing.JButton opcionMostrarJugadoresVista;
    private javax.swing.JButton volverAlMenuPrincipalJugador;
    // End of variables declaration//GEN-END:variables
}
