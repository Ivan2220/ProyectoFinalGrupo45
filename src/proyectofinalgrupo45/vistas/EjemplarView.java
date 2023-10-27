
package proyectofinalgrupo45.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.accesoADatos.EjemplarData;
import proyectofinalgrupo45.accesoADatos.LibroData;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Libros;


public class EjemplarView extends javax.swing.JInternalFrame {

    LibroData libro;
    EjemplarData ejemplar;
    private Ejemplar ejemplarActual = null;
    private List<Libros> listaL;
  
    public EjemplarView() {
        
        ejemplar = new EjemplarData();
        libro = new LibroData();
        listaL = libro.listarLibros();
        initComponents();
        comboListarLibros();
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
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbLibros = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();

        jLabel1.setText("Ejemplar");

        jLabel2.setText("idLibro:");

        jLabel3.setText("Ejemplares:");

        jLabel5.setText("Estado:");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrdEstado))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevo)
                .addGap(28, 28, 28)
                .addComponent(jbEliminar)
                .addGap(30, 30, 30)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbBuscar)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5))
                    .addComponent(jrdEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
       limpiarCampos();
       ejemplarActual=null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        eliminarEjemplar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        guardarModificarEjemplar();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        buscarEjemplar();
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Libros> jcbLibros;
    private javax.swing.JRadioButton jrdEstado;
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

            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado");

        }
    }
}
