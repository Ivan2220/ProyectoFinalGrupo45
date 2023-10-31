package proyectofinalgrupo45.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalgrupo45.accesoADatos.LibroData;
import proyectofinalgrupo45.entidades.Libros;

public class LibroView extends javax.swing.JInternalFrame {

    LibroData libro;
    private Libros libroActual = null;
    private List<Libros> listaL;
     private DefaultTableModel modelo;

    public LibroView() {

        modelo = new DefaultTableModel();
        libro = new LibroData();
        listaL = libro.listarLibros();

        initComponents();
        armarCabecera();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        image = new javax.swing.JLabel();
        jbEliminar1 = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbtNoActivos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLibros = new javax.swing.JTable();
        jbtActivos1 = new javax.swing.JButton();
        jbActivar = new javax.swing.JButton();
        txtAutorlist = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registros de Libros");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Isbn:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Editorial:");

        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Autor:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        image.setBackground(new java.awt.Color(153, 153, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/336799ebb339821f342bc5a13386aff2.jpg"))); // NOI18N

        jbEliminar1.setBackground(new java.awt.Color(255, 0, 0));
        jbEliminar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/eliminar.png"))); // NOI18N
        jbEliminar1.setText("Eliminar");
        jbEliminar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbEliminar1.setBorderPainted(false);
        jbEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbEliminar1.setIconTextGap(13);
        jbEliminar1.setInheritsPopupMenu(true);
        jbEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminar1ActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/buscar libro.png"))); // NOI18N
        jbBuscar.setText("Buscar Libro");
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

        jbNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jbNuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/nuevoejem.png"))); // NOI18N
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

        jbRegistrar.setBackground(new java.awt.Color(51, 204, 0));
        jbRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/guardar ejemplar.png"))); // NOI18N
        jbRegistrar.setText("Guardar");
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

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/salir.png"))); // NOI18N
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

        jbtNoActivos.setBackground(new java.awt.Color(255, 0, 0));
        jbtNoActivos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jtLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtLibros);

        jbtActivos1.setBackground(new java.awt.Color(51, 255, 0));
        jbtActivos1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtActivos1.setForeground(new java.awt.Color(255, 255, 255));
        jbtActivos1.setText("Activos");
        jbtActivos1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtActivos1.setBorderPainted(false);
        jbtActivos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtActivos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtActivos1.setIconTextGap(13);
        jbtActivos1.setInheritsPopupMenu(true);
        jbtActivos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActivos1ActionPerformed(evt);
            }
        });

        jbActivar.setBackground(new java.awt.Color(102, 102, 102));
        jbActivar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbActivar.setForeground(new java.awt.Color(255, 255, 255));
        jbActivar.setText("Activar Libro");
        jbActivar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbActivar.setBorderPainted(false);
        jbActivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbActivar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbActivar.setIconTextGap(13);
        jbActivar.setInheritsPopupMenu(true);
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });

        txtAutorlist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAutorlistKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Libros por Autor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbBuscar)
                                .addGap(27, 27, 27)
                                .addComponent(jbNuevo)
                                .addGap(42, 42, 42)
                                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtAutorlist, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jbtActivos1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jbtNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))
                                            .addComponent(jLabel8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(286, 286, 286)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbEstado)
                                                .addGap(81, 81, 81))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(image)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(372, 372, 372))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jbActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jbRegistrar)
                    .addComponent(jbEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir)
                    .addComponent(jbNuevo))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jrbEstado)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtActivos1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutorlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarLibros();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminar1ActionPerformed
        eliminarLibro();
    }//GEN-LAST:event_jbEliminar1ActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
        libroActual = null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        guardarModificarLibro();
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed
        activarLibro();
    }//GEN-LAST:event_jbActivarActionPerformed

    private void jbtActivos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActivos1ActionPerformed
        eliminarFilas();
        librosActivos();
        jbActivar.setEnabled(false);
    }//GEN-LAST:event_jbtActivos1ActionPerformed

    private void jbtNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNoActivosActionPerformed
        eliminarFilas();
        librosNoActivos();
        jbActivar.setEnabled(true);
    }//GEN-LAST:event_jbtNoActivosActionPerformed

    private void txtAutorlistKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorlistKeyReleased
       eliminarFilas();
       librosPorAutor();
       jbActivar.setEnabled(false);
       
    }//GEN-LAST:event_txtAutorlistKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar1;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbtActivos1;
    private javax.swing.JButton jbtNoActivos;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTable jtLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAutorlist;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

   

    
     private void buscarLibros() {
        String isb = JOptionPane.showInputDialog(this, "Ingrese el ISBN del Libro:", "ISBN", JOptionPane.PLAIN_MESSAGE);

        if (isb != null && !isb.isEmpty()) {
            try {
                int d = Integer.parseInt(isb);
                libroActual = libro.buscarLibroPorIsbn(d);

                if (libroActual != null) {
                    actualizarCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un libro con el ISBN especificado.", "Libro no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El ISBN ingresado no es válido. Debe ser un número entero.", "ISBN inválido", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un ISBN válido.", "ISBN vacío", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void actualizarCampos() {
        txtIsbn.setText(libroActual.getIsbn() + "");
            txtNombre.setText(libroActual.getNombre());
            txtTipo.setText(libroActual.getTipo());
            txtEditorial.setText(libroActual.getEditorial());
            txtAutor.setText(libroActual.getAutor());
            boolean estado = libroActual.isEstado();
            jrbEstado.setSelected(estado);

    }

    private void guardarModificarLibro() {

        try {
            int isbn = Integer.parseInt(txtIsbn.getText());

            String nombre = txtNombre.getText();

            String tipo = txtTipo.getText();
            String editorial = txtEditorial.getText();
            String autor = txtAutor.getText();

            if (contieneNumeros(tipo) || contieneNumeros(editorial) || contieneNumeros(autor)) {

                JOptionPane.showMessageDialog(this, "Solo se pueden ingresar letras");
                return;

            }

            if (nombre.isEmpty() || tipo.isEmpty() || editorial.isEmpty() || autor.isEmpty()) {

                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            boolean estado = jrbEstado.isSelected();

            if (libroActual == null) {

                libroActual = new Libros(isbn, nombre, tipo, editorial, autor, estado);

                libro.guardarLibro(libroActual);

            } else {

                libroActual.setIsbn(isbn);
                libroActual.setNombre(nombre);
                libroActual.setTipo(tipo);
                libroActual.setEditorial(editorial);
                libroActual.setEstado(estado);

                libro.modificarLibro(libroActual);
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }

    /*
    Toma una cadena inputcomo argumento y verifica si esa 
    cadena contiene al menos un carácter que sea un dígito numérico.
    Este método retorna true si el carácter es un dígito numérico,
    de lo contrario retorna false.         
     */
    private boolean contieneNumeros(String input) {
        for (char c : input.toCharArray()) {// Procesa cada carácter individualmente en una cadena.
            if (Character.isDigit(c)) {//Verifique si es un dígito numérico
                return true;
            }
        }
        return false;
    }

    private void limpiarCampos() {

        txtIsbn.setText("");
        txtNombre.setText("");
        txtTipo.setText("");
        txtEditorial.setText("");
        txtAutor.setText("");
        jrbEstado.setSelected(false);
    }

    private void eliminarLibro() {

        if (libroActual != null) {

            libro.eliminarLibro(libroActual.getIdLibro());
            libroActual = null;
            limpiarCampos();
        } else {

            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado");

        }
    }
    
     private void armarCabecera() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("ISBN");
        filaCabecera.add("Nombre");
        filaCabecera.add("Tipo");
        filaCabecera.add("Editorial");
        filaCabecera.add("Autor");
        

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtLibros.setModel(modelo);

    }

    private void librosActivos() {

        List<Libros> user = libro.listarLibros();
        for (Libros e : user) {

            modelo.addRow(new Object[]{
                e.getIdLibro(),
                e.getIsbn(),
                e.getNombre(),
                e.getTipo(),
                e.getEditorial(),
                e.getAutor()
                    ,});

        }
    }

    private void librosNoActivos() {

        List<Libros> user = libro.listarLibrosNoActivos();
        for (Libros e : user) {

            modelo.addRow(new Object[]{
                 e.getIdLibro(),
                e.getIsbn(),
                e.getNombre(),
                e.getTipo(),
                e.getEditorial(),
                e.getAutor()
                    ,});

        }
    }
    
     private void librosPorAutor() {

        String n = txtAutorlist.getText();
         
        List<Libros> user = libro.listarLibrosAutor(n);
        for (Libros e : user) {

          if (e.getAutor().startsWith(txtAutorlist.getText())) {
            modelo.addRow(new Object[]{
                e.getIdLibro(),
                e.getIsbn(),
                e.getNombre(),
                e.getTipo(),
                e.getEditorial(),
                e.getAutor()
                    ,});

        }}
    }

    private void eliminarFilas() {

        int f = jtLibros.getRowCount() - 1;
        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void activarLibro() {

        int filaSeleccionada = jtLibros.getSelectedRow();

        if (filaSeleccionada != -1) {

            String nombre = (String) jtLibros.getValueAt(filaSeleccionada, 2);

            libro.activarLibro(nombre);

            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un libro de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
