package Vista;

import Controlador.ControladorJugador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaEliminarJugador extends javax.swing.JFrame {

    public VistaEliminarJugador() {
        initComponents();
        setResizable(false);

        eliminarJugadorDniVista.addKeyListener(new KeyAdapter() {
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
                        "¿Está seguro/a de cerrar el programa? En caso de no eliminar correctamente al jugador antes de cerrar seguirá guardado.",
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
        eliminarJugadorDniVista = new javax.swing.JTextField();
        botonEliminarJugadorVista = new javax.swing.JButton();
        volverAlMenuJugadorEliminarJugador = new javax.swing.JButton();
        volverAlMenuPrincipalEliminarJugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Jugador");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el DNI del jugador que desee eliminar:");

        botonEliminarJugadorVista.setBackground(new java.awt.Color(138, 193, 143));
        botonEliminarJugadorVista.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarJugadorVista.setText("ELIMINAR");
        botonEliminarJugadorVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminarJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarJugadorVistaActionPerformed(evt);
            }
        });

        volverAlMenuJugadorEliminarJugador.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuJugadorEliminarJugador.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuJugadorEliminarJugador.setText("VOLVER ");
        volverAlMenuJugadorEliminarJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuJugadorEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuJugadorEliminarJugadorActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalEliminarJugador.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalEliminarJugador.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalEliminarJugador.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalEliminarJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalEliminarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalEliminarJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarJugadorDniVista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminarJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverAlMenuPrincipalEliminarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volverAlMenuJugadorEliminarJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(eliminarJugadorDniVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminarJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volverAlMenuJugadorEliminarJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volverAlMenuPrincipalEliminarJugador)))
                .addGap(0, 23, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlMenuJugadorEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuJugadorEliminarJugadorActionPerformed
        VistaJugador k = new VistaJugador();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuJugadorEliminarJugadorActionPerformed

    private void volverAlMenuPrincipalEliminarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalEliminarJugadorActionPerformed
        VistaPersona l = new VistaPersona();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalEliminarJugadorActionPerformed

    private void botonEliminarJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarJugadorVistaActionPerformed
        String dniBorrar = eliminarJugadorDniVista.getText().trim();

        if (dniBorrar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ControladorJugador contJuga = new ControladorJugador();

        int resultado = contJuga.eliminarJugadorSiEsValido(dniBorrar);

        switch (resultado) {
            case 1:
                JOptionPane.showMessageDialog(this, "No se encontró ningún jugador con ese DNI.", "DNI no válido", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "No se puede eliminar. El equipo debe tener al menos 5 jugadores.", "Error", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Eliminación cancelada.");
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "Jugador borrado correctamente.");
                eliminarJugadorDniVista.setText("");
                break;
            case 5:
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el jugador.", "Error", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_botonEliminarJugadorVistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarJugadorVista;
    private javax.swing.JTextField eliminarJugadorDniVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton volverAlMenuJugadorEliminarJugador;
    private javax.swing.JButton volverAlMenuPrincipalEliminarJugador;
    // End of variables declaration//GEN-END:variables
}
