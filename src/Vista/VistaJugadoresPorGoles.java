package Vista;

import Controlador.ControladorJugador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaJugadoresPorGoles extends javax.swing.JFrame {

    public VistaJugadoresPorGoles() {
        initComponents();
        setResizable(false);
        this.pack();

        cantidadDeGolesIngresada.addKeyListener(new KeyAdapter() {
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
        cantidadDeGolesIngresada = new javax.swing.JTextField();
        botonBuscarCantidadDeGolesVista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadorQueSuperanCantidadDeGolesDada = new javax.swing.JTable();
        volverAlMenuConsulta = new javax.swing.JButton();
        volverAlMenuPrincipal = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jugadores que superen una cantidad de goles dada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de goles");

        botonBuscarCantidadDeGolesVista.setBackground(new java.awt.Color(138, 193, 143));
        botonBuscarCantidadDeGolesVista.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarCantidadDeGolesVista.setText("BUSCAR");
        botonBuscarCantidadDeGolesVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarCantidadDeGolesVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCantidadDeGolesVistaActionPerformed(evt);
            }
        });

        tablaJugadorQueSuperanCantidadDeGolesDada.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaJugadorQueSuperanCantidadDeGolesDada.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tablaJugadorQueSuperanCantidadDeGolesDada);
        tablaJugadorQueSuperanCantidadDeGolesDada.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantidadDeGolesIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBuscarCantidadDeGolesVista, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volverAlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cantidadDeGolesIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(volverAlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscarCantidadDeGolesVista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void botonBuscarCantidadDeGolesVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCantidadDeGolesVistaActionPerformed
        String golesTexto = cantidadDeGolesIngresada.getText().trim();

        if (golesTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa la cantidad de goles.");
            return;
        }

        int golesBuscados;
        try {
            golesBuscados = Integer.parseInt(golesTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un número válido para la cantidad de goles.");
            return;
        }

        ControladorJugador controlador = new ControladorJugador(); // O el que tengas instanciado
        List<Object[]> jugadoresConGolesMayores = controlador.obtenerJugadoresConGolesMayoresQue(golesBuscados);

        DefaultTableModel modelo = (DefaultTableModel) tablaJugadorQueSuperanCantidadDeGolesDada.getModel();
        modelo.setRowCount(0); // Limpiar tabla antes de cargar nueva data

        if (jugadoresConGolesMayores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay jugadores con más goles que la cantidad ingresada.");
            return;
        }

        for (Object[] fila : jugadoresConGolesMayores) {
            modelo.addRow(fila);
        }
    }//GEN-LAST:event_botonBuscarCantidadDeGolesVistaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarCantidadDeGolesVista;
    private javax.swing.JTextField cantidadDeGolesIngresada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaJugadorQueSuperanCantidadDeGolesDada;
    private javax.swing.JButton volverAlMenuConsulta;
    private javax.swing.JButton volverAlMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
