package proyectofinalgrupo45.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalgrupo45.accesoADatos.LectorData;
import proyectofinalgrupo45.entidades.Lector;

public class LectorView extends javax.swing.JInternalFrame {

    LectorData lector;
    private Lector lectorActual = null;
    private DefaultTableModel modelo;

    public LectorView() {

        lector = new LectorData();
        modelo = new DefaultTableModel();

        initComponents();
        armarCabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLtelef = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbBuscar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbtActivos = new javax.swing.JButton();
        jbtNoActivos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        jbActivarUsuario = new javax.swing.JButton();

        jLabel1.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Domicilio:");

        jLtelef.setText("Telefono:");

        jLestado.setText("Estado:");

        jLabel6.setText("Registrar un Nuevo Usuario");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jbBuscar.setBackground(new java.awt.Color(21, 101, 192));
        jbBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar Uusario");
        jbBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbBuscar.setBorderPainted(false);
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbBuscar.setIconTextGap(13);
        jbBuscar.setInheritsPopupMenu(true);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbRegistrar.setBackground(new java.awt.Color(21, 101, 192));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setText("Registrar");
        jbRegistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbRegistrar.setBorderPainted(false);
        jbRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbRegistrar.setIconTextGap(13);
        jbRegistrar.setInheritsPopupMenu(true);
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(21, 101, 192));
        jbEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setText("Eliminar");
        jbEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbEliminar.setBorderPainted(false);
        jbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbEliminar.setIconTextGap(13);
        jbEliminar.setInheritsPopupMenu(true);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(21, 101, 192));
        jbNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setText("Nuevo");
        jbNuevo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbNuevo.setBorderPainted(false);
        jbNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbNuevo.setIconTextGap(13);
        jbNuevo.setInheritsPopupMenu(true);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(21, 101, 192));
        jbSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbSalir.setBorderPainted(false);
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbSalir.setIconTextGap(13);
        jbSalir.setInheritsPopupMenu(true);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtActivos.setBackground(new java.awt.Color(51, 255, 0));
        jbtActivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtActivos.setForeground(new java.awt.Color(255, 255, 255));
        jbtActivos.setText("Activos");
        jbtActivos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtActivos.setBorderPainted(false);
        jbtActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtActivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtActivos.setIconTextGap(13);
        jbtActivos.setInheritsPopupMenu(true);
        jbtActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActivosActionPerformed(evt);
            }
        });

        jbtNoActivos.setBackground(new java.awt.Color(255, 0, 0));
        jbtNoActivos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtNoActivos.setForeground(new java.awt.Color(255, 255, 255));
        jbtNoActivos.setText("No activos");
        jbtNoActivos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtNoActivos.setBorderPainted(false);
        jbtNoActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtNoActivos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtNoActivos.setIconTextGap(13);
        jbtNoActivos.setInheritsPopupMenu(true);
        jbtNoActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNoActivosActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuario");

        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtUsuarios);

        jbActivarUsuario.setBackground(new java.awt.Color(102, 255, 51));
        jbActivarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbActivarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jbActivarUsuario.setText("Activar Usuario");
        jbActivarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbActivarUsuario.setBorderPainted(false);
        jbActivarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbActivarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbActivarUsuario.setIconTextGap(13);
        jbActivarUsuario.setInheritsPopupMenu(true);
        jbActivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jbtActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61)
                        .addComponent(jbtNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)
                                        .addGap(49, 49, 49)
                                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLtelef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLestado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrEstado))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(jbActivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLtelef))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLestado)
                            .addComponent(jrEstado))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbActivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarUsuario();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        guardarModificarUsuario();
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarLector();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
        lectorActual = null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbtActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActivosActionPerformed
        eliminarFilas();
        usuariosActivos();
        jbActivarUsuario.setEnabled(false);
    }//GEN-LAST:event_jbtActivosActionPerformed

    private void jbtNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNoActivosActionPerformed
        eliminarFilas();
        usuariosNoActivos();
        jbActivarUsuario.setEnabled(true);
    }//GEN-LAST:event_jbtNoActivosActionPerformed

    private void jbActivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarUsuarioActionPerformed
        activarUsuario();
    }//GEN-LAST:event_jbActivarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLtelef;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActivarUsuario;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbtActivos;
    private javax.swing.JButton jbtNoActivos;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {

        txtDNI.setText("");
        txtNombre.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");
        jrEstado.setSelected(true);
    }

    private void eliminarLector() {

        if (lectorActual != null) {

            lector.desactivarlector(lectorActual.getIdLector());
            lectorActual = null;
            limpiarCampos();
        } else {

            JOptionPane.showMessageDialog(this, "No hay un usuario seleccionado");

        }
    }

    private void buscarUsuario() {
        String dni = JOptionPane.showInputDialog(this, "Ingrese el DNI del Usuario:", "DNI", JOptionPane.PLAIN_MESSAGE);

        if (dni != null && !dni.isEmpty()) {
            try {
                int d = Integer.parseInt(dni);
                lectorActual = lector.buscarLectorDni(d);

                if (lectorActual != null) {
                    actualizarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un usuario con el DNI especificado.", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El DNI ingresado no es válido. Debe ser un número entero.", "DNI inválido", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido.", "DNI vacío", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void actualizarCampos() {
        txtDNI.setText(String.valueOf(lectorActual.getDni()));
        txtNombre.setText(lectorActual.getNombre());
        txtDomicilio.setText(lectorActual.getDomicilio());
        txtTelefono.setText(String.valueOf(lectorActual.getTelefono()));
        jrEstado.setSelected(lectorActual.isEstado());

    }

    private void guardarModificarUsuario() {

        try {

            int dni = Integer.parseInt(txtDNI.getText());
            String nombre = txtNombre.getText();
            String domicilio = txtDomicilio.getText();
            int telefono = Integer.parseInt(txtTelefono.getText());

            if (contieneNumeros(nombre)) {

                JOptionPane.showMessageDialog(this, "Solo se pueden ingresar letras");
                return;

            }

            if (nombre.isEmpty() || domicilio.isEmpty()) {

                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            boolean estado = jrEstado.isSelected();

            if (lectorActual == null) {

                lectorActual = new Lector(dni, nombre, domicilio, telefono, estado);

                lector.guardarLector(lectorActual);

            } else {

                lectorActual.setDni(dni);
                lectorActual.setNombre(nombre);
                lectorActual.setDomicilio(domicilio);
                lectorActual.setTelefono(telefono);
                lectorActual.setEstado(estado);

                lector.modificarLector(lectorActual);

            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }

    private boolean contieneNumeros(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private void armarCabecera() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Nombre");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Telefono");

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtUsuarios.setModel(modelo);

    }

    private void usuariosActivos() {

        List<Lector> user = lector.listarLectores();
        for (Lector e : user) {

            modelo.addRow(new Object[]{
                e.getIdLector(),
                e.getDni(),
                e.getNombre(),
                e.getDomicilio(),
                e.getTelefono(),});

        }
    }

    private void usuariosNoActivos() {

        List<Lector> user = lector.listarLectoresNoActivos();
        for (Lector e : user) {

            modelo.addRow(new Object[]{
                e.getIdLector(),
                e.getDni(),
                e.getNombre(),
                e.getDomicilio(),
                e.getTelefono(),});

        }
    }

    private void eliminarFilas() {

        int f = jtUsuarios.getRowCount() - 1;
        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void activarUsuario() {

        int filaSeleccionada = jtUsuarios.getSelectedRow();

        if (filaSeleccionada != -1) {

            int id = (int) jtUsuarios.getValueAt(filaSeleccionada, 0);

            lector.activarlector(id);

            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un usuario de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
}
