package Vista;

import Controlador.ControladorJugador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaModificarJugador extends javax.swing.JFrame {

    public VistaModificarJugador() {

        initComponents();
        setResizable(false);

        // Evita que se cierre directamente al hacer clic en la X
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Escuchador para el evento de cierre de ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                Object[] opciones = {"Sí", "No"};
                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "¿Está seguro/a de cerrar el programa? En caso de no modificar correctamente al jugador sus datos no serán modificados.",
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

        dniModificarDatoJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // bloquea lo que no sea número
                }
            }
        });
        modificarGolesJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        modificarTarjetasAmJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dniModificarDatoJugadorVista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        modificarPosicionJugadorVista = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        modificarGolesJugadorVista = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modificarTarjetasAmJugadorVista = new javax.swing.JTextField();
        botonModificarDatosJugadorVista = new javax.swing.JButton();
        volverAlMenuJugador = new javax.swing.JButton();
        volverAlMenuPrincipalCargaJugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Jugador");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el DNI del jugador al que le desee modificar algo:");

        dniModificarDatoJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniModificarDatoJugadorVistaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Posición:");

        modificarPosicionJugadorVista.setForeground(new java.awt.Color(0, 0, 0));
        modificarPosicionJugadorVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Arquero", "Defensor", "Delantero", "Mediocampista" }));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Goles:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarjetas Amarillas:");

        botonModificarDatosJugadorVista.setBackground(new java.awt.Color(138, 193, 143));
        botonModificarDatosJugadorVista.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarDatosJugadorVista.setText("MODIFICAR");
        botonModificarDatosJugadorVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonModificarDatosJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDatosJugadorVistaActionPerformed(evt);
            }
        });

        volverAlMenuJugador.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuJugador.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuJugador.setText("VOLVER ");
        volverAlMenuJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuJugadorActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalCargaJugador.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalCargaJugador.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalCargaJugador.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalCargaJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalCargaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalCargaJugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(botonModificarDatosJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverAlMenuPrincipalCargaJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volverAlMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(modificarPosicionJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarGolesJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarTarjetasAmJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniModificarDatoJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dniModificarDatoJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modificarPosicionJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modificarGolesJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(modificarTarjetasAmJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volverAlMenuJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volverAlMenuPrincipalCargaJugador))
                    .addComponent(botonModificarDatosJugadorVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void volverAlMenuJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuJugadorActionPerformed
        VistaJugador k = new VistaJugador();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuJugadorActionPerformed

    private void volverAlMenuPrincipalCargaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalCargaJugadorActionPerformed
        VistaPersona l = new VistaPersona();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_volverAlMenuPrincipalCargaJugadorActionPerformed

    private void limpiarCamposJugador() {
        dniModificarDatoJugadorVista.setText("");
        modificarPosicionJugadorVista.setSelectedIndex(0);
        modificarGolesJugadorVista.setText("");
        modificarTarjetasAmJugadorVista.setText("");

    }

    private void botonModificarDatosJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDatosJugadorVistaActionPerformed
        String dniModificar = dniModificarDatoJugadorVista.getText().trim();

        if (dniModificar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verificar que sea numérico y tenga exactamente 8 dígitos
        if (!dniModificar.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe contener exactamente 8 dígitos numéricos.", "DNI inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ControladorJugador controj = new ControladorJugador();

        // Verificar si el jugador con ese DNI existe
        if (!controj.existeJugador(dniModificar)) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún jugador con ese DNI.", "DNI inexistente", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener valores ingresados
        String po = modificarPosicionJugadorVista.getSelectedItem().toString();
        String cg = modificarGolesJugadorVista.getText().trim();
        String tj = modificarTarjetasAmJugadorVista.getText().trim();

        // Validar goles si no está vacío
        if (!cg.isEmpty() && !cg.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en goles.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar tarjetas si no está vacío
        if (!tj.isEmpty() && !tj.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en tarjetas.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si se ingresó algún dato a modificar
        String posicionActual = controj.obtenerPosicionJugador(dniModificar);

        boolean modificoPosicion = !po.equals("Seleccione una opción...");
        boolean modificoGoles = !cg.isEmpty();
        boolean modificoTarjetas = !tj.isEmpty();

        if (!modificoPosicion && !modificoGoles && !modificoTarjetas) {
            JOptionPane.showMessageDialog(this, "No ingresó ningún dato nuevo para modificar.", "Nada para modificar", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirmar modificación
        int respuesta = JOptionPane.showOptionDialog(
                this,
                "¿Está seguro que desea modificar los datos del jugador?",
                "Confirmar modificación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "No"
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Si el campo no se modificó, se pasa null
            String nuevaPosicion = modificoPosicion ? po : "Seleccione una opción...";
            String goles = modificoGoles ? cg : "";
            String tarjetas = modificoTarjetas ? tj : "";

            boolean fueModificado = controj.modificarJugador(dniModificar, nuevaPosicion, goles, tarjetas);

            if (fueModificado) {
                JOptionPane.showMessageDialog(this, "Datos modificados correctamente.");
                limpiarCamposJugador();
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al modificar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Modificación cancelada.");
        }

    }//GEN-LAST:event_botonModificarDatosJugadorVistaActionPerformed

    private void dniModificarDatoJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniModificarDatoJugadorVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniModificarDatoJugadorVistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarDatosJugadorVista;
    private javax.swing.JTextField dniModificarDatoJugadorVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modificarGolesJugadorVista;
    private javax.swing.JComboBox<String> modificarPosicionJugadorVista;
    private javax.swing.JTextField modificarTarjetasAmJugadorVista;
    private javax.swing.JButton volverAlMenuJugador;
    private javax.swing.JButton volverAlMenuPrincipalCargaJugador;
    // End of variables declaration//GEN-END:variables
}
