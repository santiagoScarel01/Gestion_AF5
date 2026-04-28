package Vista;

import Controlador.ControladorArbitro;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaCargaArbitro extends javax.swing.JFrame {

    public VistaCargaArbitro() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Escuchador para el evento de cierre de ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                Object[] opciones = {"Si", "No"};
                int respuesta = JOptionPane.showOptionDialog(
                        null,
                        "¿Está seguro/a de cerrar el programa? En caso de no guardar correctamente al árbitro se perderán sus datos.",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        opciones,
                        opciones[1]
                );

                if (respuesta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }
        });
        cargaNombreArbitroVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // bloquea el carácter
                }
            }
        });
        cargaApellidoArbitroVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // bloquea el carácter
                }
            }
        });

        cargarDniArbitroVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // bloquea lo que no sea número
                }
            }
        });

        cargaTarjetasSacadasArbitroVista.addKeyListener(new KeyAdapter() {
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cargaNombreArbitroVista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cargaApellidoArbitroVista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cargaNacionalidadArbitroVista = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cargaTarjetasSacadasArbitroVista = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cargaInternacionalArbitroVista = new javax.swing.JComboBox<>();
        botonVolverMenuCargaArbitroVista = new javax.swing.JButton();
        cargarDniArbitroVista = new javax.swing.JTextField();
        botonCargarArbitroVista = new javax.swing.JButton();
        volverAlMenuPrincipalCargaArbitro = new javax.swing.JButton();
        cargaFechaNacArbitroVista = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar Árbitro");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de nacimiento:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nacionalidad");

        cargaNacionalidadArbitroVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaNacionalidadArbitroVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Albania", "Alemania", "Andorra", "Angola", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Baréin", "Bélgica", "Bielorrusia", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Inglaterra", "Irak", "Irán", "Irlanda", "Islandia", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí" }));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DNI:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cantidad de tarjetas sacadas:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("¿Es internacional?");

        cargaInternacionalArbitroVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaInternacionalArbitroVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Sí", "No" }));

        botonVolverMenuCargaArbitroVista.setBackground(new java.awt.Color(138, 193, 143));
        botonVolverMenuCargaArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        botonVolverMenuCargaArbitroVista.setText("VOLVER");
        botonVolverMenuCargaArbitroVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVolverMenuCargaArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverMenuCargaArbitroVistaActionPerformed(evt);
            }
        });

        cargarDniArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarDniArbitroVistaActionPerformed(evt);
            }
        });

        botonCargarArbitroVista.setBackground(new java.awt.Color(138, 193, 143));
        botonCargarArbitroVista.setForeground(new java.awt.Color(255, 255, 255));
        botonCargarArbitroVista.setText("CARGAR");
        botonCargarArbitroVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCargarArbitroVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarArbitroVistaActionPerformed(evt);
            }
        });

        volverAlMenuPrincipalCargaArbitro.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalCargaArbitro.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalCargaArbitro.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalCargaArbitro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalCargaArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalCargaArbitroActionPerformed(evt);
            }
        });

        cargaFechaNacArbitroVista.setMaxSelectableDate(new java.util.Date(1749528063000L));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargaNombreArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargaApellidoArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cargaTarjetasSacadasArbitroVista))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cargaNacionalidadArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20)
                                .addComponent(cargarDniArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargaInternacionalArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargaFechaNacArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCargarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverAlMenuPrincipalCargaArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVolverMenuCargaArbitroVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cargaNombreArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cargaApellidoArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(volverAlMenuPrincipalCargaArbitro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cargaFechaNacArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cargaNacionalidadArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(cargarDniArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cargaTarjetasSacadasArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(cargaInternacionalArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonVolverMenuCargaArbitroVista)
                        .addComponent(botonCargarArbitroVista, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMenuCargaArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverMenuCargaArbitroVistaActionPerformed
        VistaArbitro n = new VistaArbitro();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverMenuCargaArbitroVistaActionPerformed

    private void volverAlMenuPrincipalCargaArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalCargaArbitroActionPerformed
        VistaPersona n = new VistaPersona();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuPrincipalCargaArbitroActionPerformed

    private void limpiarCamposArbitro() {
        cargaNombreArbitroVista.setText("");
        cargaApellidoArbitroVista.setText("");
        cargaFechaNacArbitroVista.setDate(null);
        cargaNacionalidadArbitroVista.setSelectedIndex(0); // O -1 si querés dejarlo sin selección
        cargarDniArbitroVista.setText("");
        cargaInternacionalArbitroVista.setSelectedIndex(0);
        cargaTarjetasSacadasArbitroVista.setText("");
    }

    private void botonCargarArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarArbitroVistaActionPerformed
        try {
            // Validación de campos vacíos o sin seleccionar
            if (cargaNombreArbitroVista.getText().trim().isEmpty()
                    || cargaApellidoArbitroVista.getText().trim().isEmpty()
                    || cargaFechaNacArbitroVista.getDate() == null
                    || cargaNacionalidadArbitroVista.getSelectedItem().equals("Seleccione una opción...")
                    || cargarDniArbitroVista.getText().trim().isEmpty()
                    || cargaInternacionalArbitroVista.getSelectedItem().equals("Seleccione una opción...")
                    || cargaTarjetasSacadasArbitroVista.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                return; // Salimos para no cargar el árbitro
            }

            // Validación de formato DNI (exactamente 8 dígitos numéricos)
            String dniIngresado = cargarDniArbitroVista.getText().trim();
            if (!dniIngresado.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos numéricos.", "DNI inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }

            ControladorArbitro controArbitro = new ControladorArbitro();

            controArbitro.setNombre(cargaNombreArbitroVista.getText());
            controArbitro.setApellido(cargaApellidoArbitroVista.getText());

            Date fechaSeleccionada = cargaFechaNacArbitroVista.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = sdf.format(fechaSeleccionada);
            controArbitro.setFechaNac(fechaFormateada);

            controArbitro.setNacionalidad(cargaNacionalidadArbitroVista.getSelectedItem().toString());
            controArbitro.setDni(dniIngresado);
            controArbitro.setTarjetasSacadas(Integer.parseInt(cargaTarjetasSacadasArbitroVista.getText()));
            controArbitro.setInternacional(cargaInternacionalArbitroVista.getSelectedItem().toString());

            // Validar si ya existe árbitro con ese DNI
            if (controArbitro.existeArbitro(dniIngresado)) {
                JOptionPane.showMessageDialog(this, "Ya existe un árbitro con ese DNI.", "DNI duplicado", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Guardar árbitro en el sistema
            controArbitro.agregarArbitro(dniIngresado, controArbitro.getArbitro());

            JOptionPane.showMessageDialog(this, "Árbitro cargado correctamente");
            limpiarCamposArbitro();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar datos numéricos. Verifique que las tarjetas sacadas sean un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonCargarArbitroVistaActionPerformed

    private void cargarDniArbitroVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarDniArbitroVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargarDniArbitroVistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarArbitroVista;
    private javax.swing.JButton botonVolverMenuCargaArbitroVista;
    private javax.swing.JTextField cargaApellidoArbitroVista;
    private com.toedter.calendar.JDateChooser cargaFechaNacArbitroVista;
    private javax.swing.JComboBox<String> cargaInternacionalArbitroVista;
    private javax.swing.JComboBox<String> cargaNacionalidadArbitroVista;
    private javax.swing.JTextField cargaNombreArbitroVista;
    private javax.swing.JTextField cargaTarjetasSacadasArbitroVista;
    private javax.swing.JTextField cargarDniArbitroVista;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton volverAlMenuPrincipalCargaArbitro;
    // End of variables declaration//GEN-END:variables
}
