
package proyectofinalgrupo45.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalgrupo45.accesoADatos.EjemplarData;
import proyectofinalgrupo45.accesoADatos.LibroData;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Libros;


public class EjemplarView extends javax.swing.JInternalFrame {

    LibroData libro;
    EjemplarData ejemplar;
    private Ejemplar ejemplarActual = null;
    private List<Libros> listaL;
     private DefaultTableModel modelo;
  
    public EjemplarView() {
        
        ejemplar = new EjemplarData();
        libro = new LibroData();
        listaL = libro.listarLibros();
        modelo = new DefaultTableModel();
        initComponents();
        comboListarLibros();
        armarCabecera();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEjemplares = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jrdEstado = new javax.swing.JRadioButton();
        jcbLibros = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jbRegistrar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbtActivos = new javax.swing.JButton();
        jbtNoActivos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEjemplares = new javax.swing.JTable();
        jbActivar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Ejemplar");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("idLibro:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Ejemplares:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jbRegistrar.setBackground(new java.awt.Color(21, 101, 192));
        jbRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jbEliminar.setBackground(new java.awt.Color(21, 101, 192));
        jbEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/eliminar.png"))); // NOI18N
        jbEliminar.setText("    Eliminar");
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

        jbSalir.setBackground(new java.awt.Color(21, 101, 192));
        jbSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbBuscar.setBackground(new java.awt.Color(21, 101, 192));
        jbBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscar.setText("Buscar ");
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

        jtEjemplares.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtEjemplares);

        jbActivar.setBackground(new java.awt.Color(102, 255, 51));
        jbActivar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbActivar.setForeground(new java.awt.Color(255, 255, 255));
        jbActivar.setText("Activar Ejemplar");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jrdEstado)
                                    .addComponent(txtLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                    .addComponent(txtEjemplares)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jbtActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(jbtNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jbActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jrdEstado))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtNoActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        guardarModificarEjemplar();
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarEjemplar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
        ejemplarActual = null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarEjemplar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbtActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActivosActionPerformed
        eliminarFilas();
        ejemplaresActivos();
        jbActivar.setEnabled(false);
    }//GEN-LAST:event_jbtActivosActionPerformed

    private void jbtNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNoActivosActionPerformed
        eliminarFilas();
        ejemplaresNoActivos();
        jbActivar.setEnabled(true);
    }//GEN-LAST:event_jbtNoActivosActionPerformed

    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed
        activarEjemplar();
    }//GEN-LAST:event_jbActivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbtActivos;
    private javax.swing.JButton jbtNoActivos;
    private javax.swing.JComboBox<Libros> jcbLibros;
    private javax.swing.JRadioButton jrdEstado;
    private javax.swing.JTable jtEjemplares;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtLibro;
    // End of variables declaration//GEN-END:variables

 private void comboListarLibros() {

        for (Libros item : listaL) {

            jcbLibros.addItem(item);

        }
    }

    private void buscarEjemplar() {

        Libros selec = (Libros) jcbLibros.getSelectedItem();

        ejemplarActual = ejemplar.buscarEjemplarPorIdLibro(selec.getIdLibro());
        
        if (ejemplarActual != null) {

            txtLibro.setText(ejemplarActual.getLibro().getIdLibro() + "");
            txtEjemplares.setText(ejemplarActual.getCantidad() + "");
            boolean estado = ejemplarActual.isEstado();
            jrdEstado.setSelected(estado);

        }
    }

    private void guardarModificarEjemplar() {

        try {
            int librito = Integer.parseInt(txtLibro.getText());
            Libros l = libro.buscarLibroId(librito);
            
            
            int ejemplarC = Integer.parseInt(txtEjemplares.getText());

            boolean estado = jrdEstado.isSelected();

            if (ejemplarActual == null) {

                ejemplarActual = new Ejemplar(l, ejemplarC, estado);

                ejemplar.guardarEjemplar(ejemplarActual);

            } else {

                ejemplarActual.setLibro(l);
                ejemplarActual.setCantidad(ejemplarC);
                
                ejemplarActual.setEstado(estado);

                ejemplar.modificarEjemplar(ejemplarActual);
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }
    
    private void limpiarCampos() {

        txtLibro.setText("");
        txtEjemplares.setText("");
        jrdEstado.setSelected(false);
    }

    private void eliminarEjemplar() {

        if (ejemplarActual != null) {

            ejemplar.eliminarEjemplar(ejemplarActual.getLibro().getIdLibro());
            ejemplarActual = null;
            limpiarCampos();
        } else {

            JOptionPane.showMessageDialog(this, "No hay un ejemplar seleccionado");

        }
    }
     private void armarCabecera() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Ejemplares");
        

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtEjemplares.setModel(modelo);

    }

    private void ejemplaresActivos() {

        List<Ejemplar> user = ejemplar.listarEjemplares();
        for (Ejemplar e : user) {

            modelo.addRow(new Object[]{
                e.getIdEjemplar(),
                e.getLibro().getNombre(),
                e.getCantidad(),
                });

        }
    }

    private void ejemplaresNoActivos() {

        List<Ejemplar> user = ejemplar.listarEjemplaresNoActivos();
        for (Ejemplar e : user) {

            modelo.addRow(new Object[]{
               e.getIdEjemplar(),
                e.getLibro().getNombre(),
                e.getCantidad(),
                });
        }
    }

    private void eliminarFilas() {

        int f = jtEjemplares.getRowCount() - 1;
        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void activarEjemplar() {

        int filaSeleccionada = jtEjemplares.getSelectedRow();

        if (filaSeleccionada != -1) {

            int id = (int) jtEjemplares.getValueAt(filaSeleccionada, 0);
             String id2 = (String) jtEjemplares.getValueAt(filaSeleccionada, 1);
            

            ejemplar.activarEjemplar(id);
            libro.activarLibro(id2);

            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un ejemplar de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

}
