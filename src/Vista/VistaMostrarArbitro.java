package Vista;

import Controlador.ControladorArbitro;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class VistaMostrarArbitro extends javax.swing.JFrame {

    public VistaMostrarArbitro() {
        initComponents();
    }

    public JButton getBotonPrivado() {
        return botonMostrarArbitros;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrarArbitros = new javax.swing.JTable();
        botonVolverMenuMdificacionArbitroVista = new javax.swing.JButton();
        volverAlMenuPrincipalModificacionArbitro = new javax.swing.JButton();
        botonMostrarArbitros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mostrar Árbitros");

        tablaMostrarArbitros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaMostrarArbitros);

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

        botonMostrarArbitros.setBackground(new java.awt.Color(138, 193, 143));
        botonMostrarArbitros.setForeground(new java.awt.Color(255, 255, 255));
        botonMostrarArbitros.setText("MOSTRAR");
        botonMostrarArbitros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMostrarArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarArbitrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(botonMostrarArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVolverMenuMdificacionArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volverAlMenuPrincipalModificacionArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolverMenuMdificacionArbitroVista)
                    .addComponent(volverAlMenuPrincipalModificacionArbitro)
                    .addComponent(jLabel1)
                    .addComponent(botonMostrarArbitros))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void botonMostrarArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarArbitrosActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaMostrarArbitros.getModel();
        model.setRowCount(0); // limpia la tabla

        for (Object[] fila : ControladorArbitro.obtenerDatosTablaArbitros()) {
            model.addRow(fila);
        }
    }//GEN-LAST:event_botonMostrarArbitrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrarArbitros;
    private javax.swing.JButton botonVolverMenuMdificacionArbitroVista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMostrarArbitros;
    private javax.swing.JButton volverAlMenuPrincipalModificacionArbitro;
    // End of variables declaration//GEN-END:variables
}
