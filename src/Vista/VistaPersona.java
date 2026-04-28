package Vista;

import Controlador.ControladorArbitro;
import Controlador.ControladorJugador;

public class VistaPersona extends javax.swing.JFrame {

    private static VistaPersona instancia;

    private ControladorJugador controladorJugador;
    private ControladorArbitro controladorArbitro;

    public VistaPersona() {
        initComponents();
        this.setResizable(false);   // El usuario no puede agrandar ni achicar la ventana
        this.setSize(350, 450);     // Tamaño fijo (ajustalo según tu diseño)
        this.setLocationRelativeTo(null); // Centrar en pantalla
    }

    public static VistaPersona getInstancia() {
        if (instancia == null) {
            instancia = new VistaPersona();
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        panelMenuPersona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonMenuJugadores = new javax.swing.JButton();
        botonMenuArbitros = new javax.swing.JButton();
        opcionMenuConsultasVista = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenuPersona.setBackground(new java.awt.Color(45, 106, 79));
        panelMenuPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Menú Principal");
        jLabel1.setAlignmentY(0.0F);

        botonMenuJugadores.setBackground(new java.awt.Color(29, 170, 97));
        botonMenuJugadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMenuJugadores.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuJugadores.setText("Jugadores");
        botonMenuJugadores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMenuJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuJugadoresActionPerformed(evt);
            }
        });

        botonMenuArbitros.setBackground(new java.awt.Color(29, 170, 97));
        botonMenuArbitros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMenuArbitros.setForeground(new java.awt.Color(255, 255, 255));
        botonMenuArbitros.setText("Árbitros");
        botonMenuArbitros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMenuArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuArbitrosActionPerformed(evt);
            }
        });

        opcionMenuConsultasVista.setBackground(new java.awt.Color(29, 170, 97));
        opcionMenuConsultasVista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcionMenuConsultasVista.setForeground(new java.awt.Color(255, 255, 255));
        opcionMenuConsultasVista.setText("Consultas");
        opcionMenuConsultasVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcionMenuConsultasVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultasVistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuPersonaLayout = new javax.swing.GroupLayout(panelMenuPersona);
        panelMenuPersona.setLayout(panelMenuPersonaLayout);
        panelMenuPersonaLayout.setHorizontalGroup(
            panelMenuPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPersonaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelMenuPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuPersonaLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(panelMenuPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(opcionMenuConsultasVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMenuArbitros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMenuJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMenuPersonaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        panelMenuPersonaLayout.setVerticalGroup(
            panelMenuPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuPersonaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonMenuJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMenuArbitros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcionMenuConsultasVista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuJugadoresActionPerformed
        VistaJugador x = new VistaJugador();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonMenuJugadoresActionPerformed

    private void botonMenuArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuArbitrosActionPerformed
        VistaArbitro l = new VistaArbitro();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonMenuArbitrosActionPerformed

    private void opcionMenuConsultasVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultasVistaActionPerformed
        VistaMenuConsultas o = new VistaMenuConsultas();
        o.setVisible(true);
        o.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_opcionMenuConsultasVistaActionPerformed

    public void setControladorJugador(ControladorJugador controladorJugador) {
        this.controladorJugador = controladorJugador;
    }

    public void setControladorArbitro(ControladorArbitro controladorArbitro) {
        this.controladorArbitro = controladorArbitro;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuArbitros;
    private javax.swing.JButton botonMenuJugadores;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton opcionMenuConsultasVista;
    private javax.swing.JPanel panelMenuPersona;
    // End of variables declaration//GEN-END:variables
}
