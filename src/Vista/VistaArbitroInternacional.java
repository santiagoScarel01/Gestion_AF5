package Vista;

import Controlador.ControladorArbitro;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaArbitroInternacional extends javax.swing.JFrame {

    public VistaArbitroInternacional() {
        initComponents();
        setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBuscarArbitrosPorInternacionalVista = new javax.swing.JButton();
        volverAMenuPrincipalArbitroInternacionalVista = new javax.swing.JButton();
        volverAlMenuConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seleccionFiltrarInternacionalArbitroVista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFiltrarArbitrosInternacionalVista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        botonBuscarArbitrosPorInternacionalVista.setBackground(new java.awt.Color(138, 193, 143));
        botonBuscarArbitrosPorInternacionalVista.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscarArbitrosPorInternacionalVista.setText("BUSCAR");
        botonBuscarArbitrosPorInternacionalVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscarArbitrosPorInternacionalVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarArbitrosPorInternacionalVistaActionPerformed(evt);
            }
        });

        volverAMenuPrincipalArbitroInternacionalVista.setBackground(new java.awt.Color(138, 193, 143));
        volverAMenuPrincipalArbitroInternacionalVista.setForeground(new java.awt.Color(255, 255, 255));
        volverAMenuPrincipalArbitroInternacionalVista.setText("VOLVER MENÚ PRINCIPAL");
        volverAMenuPrincipalArbitroInternacionalVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAMenuPrincipalArbitroInternacionalVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAMenuPrincipalArbitroInternacionalVistaActionPerformed(evt);
            }
        });

        volverAlMenuConsulta.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuConsulta.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuConsulta.setText("VOLVER ");
        volverAlMenuConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuConsultaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar árbitros por si es internacional o no");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar arbitro internacional");

        seleccionFiltrarInternacionalArbitroVista.setForeground(new java.awt.Color(0, 0, 0));
        seleccionFiltrarInternacionalArbitroVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Sí", "No" }));
        seleccionFiltrarInternacionalArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionFiltrarInternacionalArbitroVistaActionPerformed(evt);
            }
        });

        tablaFiltrarArbitrosInternacionalVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Fecha Nacimiento", "Nacionalidad", "DNI", "Tarjetas Sacadas", "¿Internacional?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFiltrarArbitrosInternacionalVista);
        if (tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumnCount() > 0) {
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(0).setResizable(false);
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(1).setResizable(false);
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(2).setResizable(false);
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(3).setResizable(false);
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(4).setResizable(false);
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(5).setResizable(false);
            tablaFiltrarArbitrosInternacionalVista.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seleccionFiltrarInternacionalArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(botonBuscarArbitrosPorInternacionalVista, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volverAlMenuConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volverAMenuPrincipalArbitroInternacionalVista)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonBuscarArbitrosPorInternacionalVista)
                        .addComponent(volverAlMenuConsulta)
                        .addComponent(volverAMenuPrincipalArbitroInternacionalVista))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(seleccionFiltrarInternacionalArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAMenuPrincipalArbitroInternacionalVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAMenuPrincipalArbitroInternacionalVistaActionPerformed
        VistaPersona h = new VistaPersona();
        h.setVisible(true);
        h.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAMenuPrincipalArbitroInternacionalVistaActionPerformed

    private void volverAlMenuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuConsultaActionPerformed
        VistaMenuConsultas a = new VistaMenuConsultas();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuConsultaActionPerformed

    private void seleccionFiltrarInternacionalArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionFiltrarInternacionalArbitroVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccionFiltrarInternacionalArbitroVistaActionPerformed

    private void botonBuscarArbitrosPorInternacionalVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarArbitrosPorInternacionalVistaActionPerformed
        try {
            String seleccion = seleccionFiltrarInternacionalArbitroVista.getSelectedItem().toString().trim();

            if (seleccion.equals("Seleccione una opción...")) {
                JOptionPane.showMessageDialog(this, "Por favor selecciona una opción: Sí o No.");
                return;
            }

            List<Object[]> filas = ControladorArbitro.obtenerDatosPorInternacionalidad(seleccion);

            DefaultTableModel modelo = (DefaultTableModel) tablaFiltrarArbitrosInternacionalVista.getModel();
            modelo.setRowCount(0); // Limpiar tabla

            if (filas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay árbitros que coincidan con la selección.");
                return;
            }

            for (Object[] fila : filas) {
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error. Asegurate de seleccionar una opción válida.");
            e.printStackTrace(); // Opcional: útil si querés ver el error en consola para debug
        }
    }//GEN-LAST:event_botonBuscarArbitrosPorInternacionalVistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarArbitrosPorInternacionalVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccionFiltrarInternacionalArbitroVista;
    private javax.swing.JTable tablaFiltrarArbitrosInternacionalVista;
    private javax.swing.JButton volverAMenuPrincipalArbitroInternacionalVista;
    private javax.swing.JButton volverAlMenuConsulta;
    // End of variables declaration//GEN-END:variables
}
