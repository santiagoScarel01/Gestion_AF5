package Vista;

public class VistaArbitro extends javax.swing.JFrame {

    public VistaArbitro() {
        initComponents();
        this.setResizable(false);   // El usuario no puede agrandar ni achicar la ventana
        this.setSize(350, 450);
        this.setLocationRelativeTo(null); // Centrar en pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcionCargarArbitroVista = new javax.swing.JButton();
        opcionEliminarArbitroVista = new javax.swing.JButton();
        opcionModificarDatosArbitroVista = new javax.swing.JButton();
        opcionMostrarArbitrosVista = new javax.swing.JButton();
        volverAlMenuPrincipalArbitro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu de árbitros");

        opcionCargarArbitroVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionCargarArbitroVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionCargarArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionCargarArbitroVista.setText("Cargar Árbitro");
        opcionCargarArbitroVista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionCargarArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCargarArbitroVistaActionPerformed(evt);
            }
        });

        opcionEliminarArbitroVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionEliminarArbitroVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionEliminarArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionEliminarArbitroVista.setText("Eliminar Árbitro");
        opcionEliminarArbitroVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionEliminarArbitroVista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcionEliminarArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionEliminarArbitroVistaActionPerformed(evt);
            }
        });

        opcionModificarDatosArbitroVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionModificarDatosArbitroVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionModificarDatosArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionModificarDatosArbitroVista.setText("Modificar dato/s ");
        opcionModificarDatosArbitroVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionModificarDatosArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionModificarDatosArbitroVistaActionPerformed(evt);
            }
        });

        opcionMostrarArbitrosVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionMostrarArbitrosVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionMostrarArbitrosVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionMostrarArbitrosVista.setText("Mostrar Árbitros");
        opcionMostrarArbitrosVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionMostrarArbitrosVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMostrarArbitrosVistaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalArbitro.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalArbitro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        volverAlMenuPrincipalArbitro.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalArbitro.setText("VOLVER");
        volverAlMenuPrincipalArbitro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalArbitroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volverAlMenuPrincipalArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionEliminarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionModificarDatosArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionCargarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcionMostrarArbitrosVista, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(opcionCargarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionEliminarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionModificarDatosArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionMostrarArbitrosVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volverAlMenuPrincipalArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {opcionCargarArbitroVista, opcionEliminarArbitroVista, opcionModificarDatosArbitroVista, opcionMostrarArbitrosVista});

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionCargarArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCargarArbitroVistaActionPerformed
        VistaCargaArbitro e = new VistaCargaArbitro();
        e.setVisible(true);
        e.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_opcionCargarArbitroVistaActionPerformed

    private void opcionEliminarArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionEliminarArbitroVistaActionPerformed
        VistaEliminarArbitro g = new VistaEliminarArbitro();
        g.setVisible(true);
        g.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_opcionEliminarArbitroVistaActionPerformed

    private void opcionModificarDatosArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionModificarDatosArbitroVistaActionPerformed
        VistaModificarArbitro j = new VistaModificarArbitro();
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_opcionModificarDatosArbitroVistaActionPerformed

    private void opcionMostrarArbitrosVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMostrarArbitrosVistaActionPerformed
        VistaMostrarArbitro k = new VistaMostrarArbitro();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
        this.setVisible(false);
        k.getBotonPrivado().doClick();
    }//GEN-LAST:event_opcionMostrarArbitrosVistaActionPerformed

    private void volverAlMenuPrincipalArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalArbitroActionPerformed
        VistaPersona n = new VistaPersona();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalArbitroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opcionCargarArbitroVista;
    private javax.swing.JButton opcionEliminarArbitroVista;
    private javax.swing.JButton opcionModificarDatosArbitroVista;
    private javax.swing.JButton opcionMostrarArbitrosVista;
    private javax.swing.JButton volverAlMenuPrincipalArbitro;
    // End of variables declaration//GEN-END:variables
}
