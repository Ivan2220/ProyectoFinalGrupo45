
package proyectofinalgrupo45.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.accesoADatos.EjemplarData;
import proyectofinalgrupo45.accesoADatos.LibroData;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Libros;


public class EjemplarView extends javax.swing.JInternalFrame {
    
    EjemplarData ejemplar;
    private Ejemplar ejemplarActual = null;
    private List<Ejemplar> listaEjem;

    public EjemplarView() {
        ejemplar = new EjemplarData();
        listaEjem = ejemplar.listarEjemplares();
       
        initComponents();
         
        comboListarEjemplares();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFidejemplar = new javax.swing.JTextField();
        jTFidlibro = new javax.swing.JTextField();
        jTFcantidad = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jcbejemplar = new javax.swing.JComboBox<>();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jRBestado = new javax.swing.JRadioButton();

        jLabel1.setText("Ejemplar");

        jLabel2.setText("IdEjemplar");

        jLabel3.setText("IdLibro");

        jLabel4.setText("Cantidad");

        jLabel5.setText("Estado");

        jTFidejemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFidejemplarActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBnuevo.setText("Nuevo");

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(jTFidlibro)
                                .addComponent(jTFidejemplar))
                            .addComponent(jRBestado))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBnuevo)
                        .addGap(44, 44, 44)
                        .addComponent(jBeliminar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jcbejemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBuscar)
                                .addContainerGap(52, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jBguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir)
                                .addGap(70, 70, 70))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFidejemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFidlibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTFcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRBestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbejemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        guardarModificarEjemplar();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTFidejemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFidejemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFidejemplarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        buscarEjemplar();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        eliminarEjemplar();
    }//GEN-LAST:event_jBeliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRBestado;
    private javax.swing.JTextField jTFcantidad;
    private javax.swing.JTextField jTFidejemplar;
    private javax.swing.JTextField jTFidlibro;
    private javax.swing.JComboBox<Ejemplar> jcbejemplar;
    // End of variables declaration//GEN-END:variables

    private void comboListarEjemplares() {

        for (Ejemplar item : listaEjem) {

            jcbejemplar.addItem(item);

        }
    }

    private void limpiarCampos() {

        jTFidejemplar.setText("");
        jTFidlibro.setText("");
        jTFcantidad.setText("");
        jRBestado.setText("");

    }

    private void eliminarEjemplar() {

        if (ejemplarActual != null) {

            ejemplar.eliminarEjemplar(ejemplarActual.getIdEjemplar());
            ejemplarActual = null;
            limpiarCampos();
        } else {

            JOptionPane.showMessageDialog(this, "No hay un ejemplar seleccionado");

        }
    }

    private void buscarEjemplar() {

        Ejemplar selec = (Ejemplar) jcbejemplar.getSelectedItem();

        ejemplarActual = ejemplar.buscarEjemplar(selec.getIdEjemplar());
        if (ejemplarActual != null) {

            jTFidejemplar.setText(ejemplarActual.getIdEjemplar() + "");
            jTFidlibro.setText(ejemplarActual.getLibro() + "");
            jTFcantidad.setText(ejemplarActual.getCantidad() + "");
            boolean estado = ejemplarActual.isEstado();
            jRBestado.setSelected(estado);

        }
    }

    private void guardarModificarEjemplar() {
        
       

        try {
            int idEjemplar = Integer.parseInt(jTFidejemplar.getText());

            Ejemplar libro = ejemplar.buscarEjemplar(idEjemplar);
            Libros libroObj = libro.getLibro();

            int cantidad = Integer.parseInt(jTFcantidad.getText());

           
            boolean estado = jRBestado.isSelected();

            if (ejemplarActual == null) {

                ejemplarActual = new Ejemplar(idEjemplar, libroObj, cantidad, estado);

                ejemplar.guardarEjemplar(ejemplarActual);

            } else {

                ejemplarActual.setIdEjemplar(idEjemplar);
                ejemplarActual.setLibro(libroObj);
                ejemplarActual.setCantidad(cantidad);
                ejemplarActual.setEstado(estado);

                ejemplar.modificarEjemplar(ejemplarActual);

            }
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un numero valido");
        }
    }
}
