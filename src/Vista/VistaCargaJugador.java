package Vista;

import Controlador.ControladorJugador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaCargaJugador extends javax.swing.JFrame {

    public VistaCargaJugador() {
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
                        "¿Está seguro/a de cerrar el programa? En caso de no guardar correctamente al jugador se perderán sus datos.",
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

        //Estas funciones van a permitir que el usuario solo pueda ingresar el tipo de dato que queremos
        cargaNombreJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // bloquea el carácter
                }
            }
        });
        cargaApellidoJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // bloquea el carácter
                }
            }
        });

        cargaDniJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // bloquea lo que no sea número
                }
            }
        });

        cargaGolesJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        cargaTarjetasAmJugadorVista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        cargaTarjetasRojJugadorVista.addKeyListener(new KeyAdapter() {
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
        jLabel2 = new javax.swing.JLabel();
        cargaNombreJugadorVista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cargaApellidoJugadorVista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cargaNacionalidadJugadorVista = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cargaClubActualJugadorVista = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cargaPosicionJugadorVista = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cargaGolesJugadorVista = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cargaTarjetasAmJugadorVista = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cargaTarjetasRojJugadorVista = new javax.swing.JTextField();
        botonCargarJugadorVista = new javax.swing.JButton();
        cargaDniJugadorVista = new javax.swing.JTextField();
        cargaFechaNacJugadorVista = new com.toedter.calendar.JDateChooser();
        volverAlMenuPrincipalCargaJugador = new javax.swing.JButton();
        volverAlMenuJugador = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 106, 79));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargar Jugador");

        cargaNombreJugadorVista.setCaretColor(new java.awt.Color(0, 0, 0));
        cargaNombreJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaNombreJugadorVistaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de nacimiento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nacionalidad");

        cargaNacionalidadJugadorVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaNacionalidadJugadorVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Albania", "Alemania", "Andorra", "Angola", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Baréin", "Bélgica", "Bielorrusia", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Inglaterra", "Irak", "Irán", "Irlanda", "Islandia", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DNI:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Club Actual:");

        cargaClubActualJugadorVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaClubActualJugadorVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "River Plate", "Boca Juniors", "Independiente", "Racing Club", "San Lorenzo", "Rosario Central", "Newell's Old Boys", "Estudiantes", "Gimnasia La Plata", "Huracán" }));
        cargaClubActualJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaClubActualJugadorVistaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Posición:");

        cargaPosicionJugadorVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaPosicionJugadorVista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "Arquero", "Defensor", "Delantero", "Mediocampista" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cantidad de goles:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tarjetas amarillas:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tarjetas rojas:");

        botonCargarJugadorVista.setBackground(new java.awt.Color(138, 193, 143));
        botonCargarJugadorVista.setForeground(new java.awt.Color(255, 255, 255));
        botonCargarJugadorVista.setText("CARGAR");
        botonCargarJugadorVista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCargarJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarJugadorVistaActionPerformed(evt);
            }
        });

        cargaDniJugadorVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaDniJugadorVistaActionPerformed(evt);
            }
        });

        cargaFechaNacJugadorVista.setForeground(new java.awt.Color(0, 0, 0));
        cargaFechaNacJugadorVista.setMaxSelectableDate(new java.util.Date(1749528084000L));
        cargaFechaNacJugadorVista.setMinSelectableDate(new java.util.Date(14484000L));

        volverAlMenuPrincipalCargaJugador.setBackground(new java.awt.Color(138, 193, 143));
        volverAlMenuPrincipalCargaJugador.setForeground(new java.awt.Color(255, 255, 255));
        volverAlMenuPrincipalCargaJugador.setText("VOLVER MENÚ PRINCIPAL");
        volverAlMenuPrincipalCargaJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volverAlMenuPrincipalCargaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlMenuPrincipalCargaJugadorActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargaNacionalidadJugadorVista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargaClubActualJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cargaDniJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cargaPosicionJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cargaFechaNacJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargaNombreJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cargaApellidoJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(cargaGolesJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(cargaTarjetasAmJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cargaTarjetasRojJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCargarJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volverAlMenuPrincipalCargaJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volverAlMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargaNombreJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cargaApellidoJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cargaFechaNacJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cargaDniJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cargaNacionalidadJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cargaClubActualJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cargaPosicionJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cargaGolesJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(cargaTarjetasRojJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargaTarjetasAmJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volverAlMenuJugador)
                        .addGap(16, 16, 16)
                        .addComponent(volverAlMenuPrincipalCargaJugador))
                    .addComponent(botonCargarJugadorVista, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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

    private void cargaClubActualJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaClubActualJugadorVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaClubActualJugadorVistaActionPerformed

    private void cargaDniJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaDniJugadorVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaDniJugadorVistaActionPerformed

    private void limpiarCamposJugador() {
        cargaNombreJugadorVista.setText("");
        cargaApellidoJugadorVista.setText("");
        cargaFechaNacJugadorVista.setDate(null);
        cargaNacionalidadJugadorVista.setSelectedIndex(0); // O -1 si querés dejarlo sin selección
        cargaDniJugadorVista.setText("");
        cargaClubActualJugadorVista.setSelectedIndex(0);
        cargaPosicionJugadorVista.setSelectedIndex(0);
        cargaGolesJugadorVista.setText("");
        cargaTarjetasAmJugadorVista.setText("");
        cargaTarjetasRojJugadorVista.setText("");
    }

    private void botonCargarJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarJugadorVistaActionPerformed

        try {

            if (cargaNombreJugadorVista.getText().trim().isEmpty()
                    || cargaApellidoJugadorVista.getText().trim().isEmpty()
                    || cargaFechaNacJugadorVista.getDate() == null
                    || cargaNacionalidadJugadorVista.getSelectedItem() == "Seleccione una opción..."
                    || cargaDniJugadorVista.getText().trim().isEmpty()
                    || cargaClubActualJugadorVista.getSelectedItem() == "Seleccione una opción..."
                    || cargaPosicionJugadorVista.getSelectedItem() == "Seleccione una opción..."
                    || cargaGolesJugadorVista.getText().trim().isEmpty()
                    || cargaTarjetasAmJugadorVista.getText().trim().isEmpty()
                    || cargaTarjetasRojJugadorVista.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                return; // Salimos del método para no cargar el jugador
            }
            String dniIngresado = cargaDniJugadorVista.getText().trim();
            if (!dniIngresado.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos numéricos.", "DNI inválido", JOptionPane.WARNING_MESSAGE);
                return;
            }
            ControladorJugador controJugador = new ControladorJugador();

            controJugador.setNombre(cargaNombreJugadorVista.getText());
            controJugador.setApellido(cargaApellidoJugadorVista.getText());

            Date fechaSeleccionada = cargaFechaNacJugadorVista.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaFormateada = sdf.format(fechaSeleccionada);
            controJugador.setFechaNac(fechaFormateada);

            controJugador.setNacionalidad(cargaNacionalidadJugadorVista.getSelectedItem().toString());
            controJugador.setDni(cargaDniJugadorVista.getText());
            controJugador.setClubActual(cargaClubActualJugadorVista.getSelectedItem().toString());
            controJugador.setPosicion(cargaPosicionJugadorVista.getSelectedItem().toString());
            controJugador.setGoles(Integer.parseInt(cargaGolesJugadorVista.getText()));
            controJugador.setTarjetasAma(Integer.parseInt(cargaTarjetasAmJugadorVista.getText()));
            controJugador.setTarjetasRoj(Integer.parseInt(cargaTarjetasRojJugadorVista.getText()));

            String dni = controJugador.getJugador().getDni();
            if (controJugador.existeJugador(dni)) {
                JOptionPane.showMessageDialog(this, "Ya existe un jugador con ese DNI.", "DNI duplicado", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String clubSeleccionado = controJugador.getJugador().getClubActual();

            if (controJugador.contarJugadoresPorEquipo(clubSeleccionado) >= 7) {
                JOptionPane.showMessageDialog(this, "Ese equipo ya tiene 7 jugadores cargados.", "Límite de jugadores", JOptionPane.WARNING_MESSAGE);
                return;
            }
// Guarda el jugador en el mapa usando el DNI como clave
            controJugador.agregarJugador(controJugador.getJugador().getDni(), controJugador.getJugador());

            JOptionPane.showMessageDialog(this, "Jugador cargado correctamente");
            limpiarCamposJugador();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar datos numéricos. Verifique que los goles, tarjetas y expulsiones sean números válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonCargarJugadorVistaActionPerformed

    private void cargaNombreJugadorVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaNombreJugadorVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaNombreJugadorVistaActionPerformed

    private void volverAlMenuPrincipalCargaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuPrincipalCargaJugadorActionPerformed
        // TODO add your handling code here:
        VistaPersona l = new VistaPersona();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_volverAlMenuPrincipalCargaJugadorActionPerformed

    private void volverAlMenuJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlMenuJugadorActionPerformed
        // TODO add your handling code here:
        VistaJugador k = new VistaJugador();
        k.setVisible(true);
        k.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_volverAlMenuJugadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarJugadorVista;
    private javax.swing.JTextField cargaApellidoJugadorVista;
    private javax.swing.JComboBox<String> cargaClubActualJugadorVista;
    private javax.swing.JTextField cargaDniJugadorVista;
    private com.toedter.calendar.JDateChooser cargaFechaNacJugadorVista;
    private javax.swing.JTextField cargaGolesJugadorVista;
    private javax.swing.JComboBox<String> cargaNacionalidadJugadorVista;
    private javax.swing.JTextField cargaNombreJugadorVista;
    private javax.swing.JComboBox<String> cargaPosicionJugadorVista;
    private javax.swing.JTextField cargaTarjetasAmJugadorVista;
    private javax.swing.JTextField cargaTarjetasRojJugadorVista;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton volverAlMenuJugador;
    private javax.swing.JButton volverAlMenuPrincipalCargaJugador;
    // End of variables declaration//GEN-END:variables
}
