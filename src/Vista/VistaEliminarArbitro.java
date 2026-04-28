package Vista;

import Controlador.ControladorArbitro;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaEliminarArbitro extends javax.swing.JFrame {

    public VistaEliminarArbitro() {
        initComponents();
        setResizable(false);

        dniEliminarArbitroVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // bloquea lo que no sea número
                }
            }
        });
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Escuchador para el evento de cierre de ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                Object[] opciones = {"Sí", "No"};
                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "¿Está seguro/a de cerrar el programa? En caso de no eliminar correctamente al árbitro antes de cerrar seguirá guardado.",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        opciones,
                        opciones[1] // opción por defecto
                );

                if (respuesta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                // Si elige "No", simplemente no se cierra
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dniEliminarArbitroVista = new javax.swing.JTextField();
        botonVolverMenuAnterior = new javax.swing.JButton();
        volverAlMenuPrincipalEliminarArbitro = new javax.swing.JButton();
        botonEliminarArbitroVista1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Árbitro");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el DNI del árbitro que desee eliminar:");

        botonVolverMenuAnterior.setBackground(new java.awt.Color(138, 193, 143));
        botonVolverMenuAnterior.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverMenuAnterior.setText("VOLVER");
        botonVolverMenuAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolverMenuAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuAnteriorActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalEliminarArbitro.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalEliminarArbitro.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalEliminarArbitro.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalEliminarArbitro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalEliminarArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalEliminarArbitroActionPerformed(evt);
            }
        });

        botonEliminarArbitroVista1.setBackground(new java.awt.Color(138, 193, 143));
        botonEliminarArbitroVista1.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarArbitroVista1.setText("ELIMINAR");
        botonEliminarArbitroVista1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminarArbitroVista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarArbitroVista1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dniEliminarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminarArbitroVista1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverAlMenuPrincipalEliminarArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVolverMenuAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dniEliminarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonVolverMenuAnterior)
                        .addGap(12, 12, 12)
                        .addComponent(volverAlMenuPrincipalEliminarArbitro))
                    .addComponent(botonEliminarArbitroVista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlMenuPrincipalEliminarArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalEliminarArbitroActionPerformed
        // TODO add your handling code here:
        VistaPersona n = new VistaPersona();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalEliminarArbitroActionPerformed

    private void botonVolverMenuAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuAnteriorActionPerformed
        // TODO add your handling code here:
        VistaArbitro a = new VistaArbitro();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverMenuAnteriorActionPerformed

    private void botonEliminarArbitroVista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarArbitroVista1ActionPerformed
        String dniBorrar = dniEliminarArbitroVista.getText().trim();

        if (dniBorrar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ControladorArbitro controlador = new ControladorArbitro();

        int respuesta = JOptionPane.showOptionDialog(
                this,
                "¿Está seguro que desea eliminar al árbitro?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "No"
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            boolean eliminado = controlador.eliminarArbitroSiExiste(dniBorrar);

            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Árbitro eliminado correctamente.");
                dniEliminarArbitroVista.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún árbitro con ese DNI.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Eliminación cancelada.");
        }
    }//GEN-LAST:event_botonEliminarArbitroVista1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarArbitroVista1;
    private javax.swing.JButton botonVolverMenuAnterior;
    private javax.swing.JTextField dniEliminarArbitroVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton volverAlMenuPrincipalEliminarArbitro;
    // End of variables declaration//GEN-END:variables
}
