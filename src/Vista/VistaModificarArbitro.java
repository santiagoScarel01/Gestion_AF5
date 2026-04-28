package Vista;

import Controlador.ControladorArbitro;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaModificarArbitro extends javax.swing.JFrame {

    public VistaModificarArbitro() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Escuchador para el evento de cierre de ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                Object[] opciones = {"Sí", "No"};
                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "¿Está seguro/a de cerrar el programa? En caso de no modificar correctamente al árbitro sus datos no serán modificados.",
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

        dniModificarDatoArbitroVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // bloquea lo que no sea número
                }
            }
        });

        modificarTarjetasSacadasArbitroVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // bloquea lo que no sea número
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
        dniModificarDatoArbitroVista = new javax.swing.JTextField();
        modificarTarjetasSacadasArbitroVista = new javax.swing.JTextField();
        modificarInternacionalArbitroVista = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        botonModificarDatosArbitroVista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonVolverMenuMdificacionArbitroVista = new javax.swing.JButton();
        volverAlMenuPrincipalModificacionArbitro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar Arbitro");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el DNI del árbitro al que le desee modificar algo:");

        modificarInternacionalArbitroVista.setForeground(new java.awt.Color(0, 0, 0));
        modificarInternacionalArbitroVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Sí", "No" }));
        modificarInternacionalArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarInternacionalArbitroVistaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Internacional:");

        botonModificarDatosArbitroVista.setBackground(new java.awt.Color(138, 193, 143));
        botonModificarDatosArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarDatosArbitroVista.setText("MODIFICAR");
        botonModificarDatosArbitroVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonModificarDatosArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDatosArbitroVistaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de tarjetas sacadas:");

        botonVolverMenuMdificacionArbitroVista.setBackground(new java.awt.Color(138, 193, 143));
        botonVolverMenuMdificacionArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverMenuMdificacionArbitroVista.setText("VOLVER");
        botonVolverMenuMdificacionArbitroVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolverMenuMdificacionArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuMdificacionArbitroVistaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalModificacionArbitro.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalModificacionArbitro.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalModificacionArbitro.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalModificacionArbitro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalModificacionArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalModificacionArbitroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonModificarDatosArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonVolverMenuMdificacionArbitroVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(volverAlMenuPrincipalModificacionArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dniModificarDatoArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(modificarInternacionalArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(modificarTarjetasSacadasArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolverMenuMdificacionArbitroVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volverAlMenuPrincipalModificacionArbitro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dniModificarDatoArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarTarjetasSacadasArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(modificarInternacionalArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(botonModificarDatosArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarInternacionalArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarInternacionalArbitroVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarInternacionalArbitroVistaActionPerformed

    private void limpiarCamposArbitro() {
        dniModificarDatoArbitroVista.setText("");
        modificarTarjetasSacadasArbitroVista.setText("");
        modificarInternacionalArbitroVista.setSelectedIndex(0);
    }
    private void botonVolverMenuMdificacionArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuMdificacionArbitroVistaActionPerformed
        VistaArbitro n = new VistaArbitro();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverMenuMdificacionArbitroVistaActionPerformed

    private void volverAlMenuPrincipalModificacionArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalModificacionArbitroActionPerformed
        VistaPersona n = new VistaPersona();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalModificacionArbitroActionPerformed

    private void botonModificarDatosArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDatosArbitroVistaActionPerformed
        String dniModificar = dniModificarDatoArbitroVista.getText().trim();

        if (dniModificar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verificar que sea numérico y tenga exactamente 8 dígitos
        if (!dniModificar.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe contener exactamente 8 dígitos numéricos.", "DNI inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ControladorArbitro controA = new ControladorArbitro();

        // Verificar si el árbitro con ese DNI existe
        if (!controA.existeArbitro(dniModificar)) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún árbitro con ese DNI.", "DNI inexistente", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener valores ingresados
        String tarjetas = modificarTarjetasSacadasArbitroVista.getText().trim();
        String internacional = modificarInternacionalArbitroVista.getSelectedItem().toString();

        boolean modificoTarjetas = !tarjetas.isEmpty();
        boolean modificoInternacional = !internacional.equals("Seleccione una opción...");

        if (!modificoTarjetas && !modificoInternacional) {
            JOptionPane.showMessageDialog(this, "No ingresó ningún dato nuevo para modificar.", "Nada para modificar", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar tarjetas si no está vacío
        if (modificoTarjetas && !tarjetas.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido en tarjetas sacadas.", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirmar modificación
        int respuesta = JOptionPane.showOptionDialog(
                this,
                "¿Está seguro que desea modificar los datos del árbitro?",
                "Confirmar modificación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "No"
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Si el campo no se modificó, se pasa valor nulo o default
            String nuevasTarjetas = modificoTarjetas ? tarjetas : "";
            String nuevoInternacional = modificoInternacional ? internacional : "Seleccione una opción...";

            boolean fueModificado = controA.modificarArbitro(dniModificar, nuevasTarjetas, nuevoInternacional);

            if (fueModificado) {
                JOptionPane.showMessageDialog(this, "Datos del árbitro modificados correctamente.");
                limpiarCamposArbitro(); // Suponiendo que tenés este método para limpiar campos
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al modificar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Modificación cancelada.");
        }
    }//GEN-LAST:event_botonModificarDatosArbitroVistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarDatosArbitroVista;
    private javax.swing.JButton botonVolverMenuMdificacionArbitroVista;
    private javax.swing.JTextField dniModificarDatoArbitroVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> modificarInternacionalArbitroVista;
    private javax.swing.JTextField modificarTarjetasSacadasArbitroVista;
    private javax.swing.JButton volverAlMenuPrincipalModificacionArbitro;
    // End of variables declaration//GEN-END:variables
}
