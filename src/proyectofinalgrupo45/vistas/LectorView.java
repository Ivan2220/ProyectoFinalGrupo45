package proyectofinalgrupo45.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalgrupo45.accesoADatos.LectorData;
import proyectofinalgrupo45.entidades.Lector;

public class LectorView extends javax.swing.JInternalFrame {

    LectorData lector;
    private Lector lectorActual = null;
    private List<Lector> listaLec;

    public LectorView() {

        lector = new LectorData();

        listaLec = lector.listarLectores();

        initComponents();
        comboListarLectores();

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
        jTdni = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTdomicilio = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jcbLector = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTidlector = new javax.swing.JTextField();
        JBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();

        jLabel1.setText("Documento");

        jLabel2.setText("Nombre");

        jLabel3.setText("Domicilio");

        jLtelef.setText("Telefono");

        jLestado.setText("Estado");

        jLabel6.setText("Lector");

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });

        jcbLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLectorActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        jTidlector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidlectorActionPerformed(evt);
            }
        });

        JBnuevo.setText("Nuevo");
        JBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBnuevoActionPerformed(evt);
            }
        });

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
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLtelef, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(jLestado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrbEstado))
                                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTidlector, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBnuevo)
                                .addGap(35, 35, 35)
                                .addComponent(jBeliminar)
                                .addGap(46, 46, 46)
                                .addComponent(jBguardar)
                                .addGap(33, 33, 33)
                                .addComponent(jBsalir)))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcbLector, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBuscar)
                        .addGap(60, 60, 60))))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBuscar)
                            .addComponent(jcbLector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLestado)
                            .addComponent(jrbEstado))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(123, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTidlector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLtelef)
                            .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniActionPerformed

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jTidlectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidlectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidlectorActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        guardarModificarLector();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        eliminarLector();

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jcbLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbLectorActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        buscarLector();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void JBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBnuevoActionPerformed
        limpiarCampos();
        lectorActual = null;

    }//GEN-LAST:event_JBnuevoActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBnuevo;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLestado;
    private javax.swing.JLabel jLtelef;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JTextField jTidlector;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JComboBox<Lector> jcbLector;
    private javax.swing.JRadioButton jrbEstado;
    // End of variables declaration//GEN-END:variables

    private void comboListarLectores() {

        for (Lector item : listaLec) {

            jcbLector.addItem(item);

        }
    }

    private void limpiarCampos() {

        jTidlector.setText("");
        jTdni.setText("");
        jTnombre.setText("");
        jTdomicilio.setText("");
        jTelefono.setText("");
        jrbEstado.setSelected(true); // aqui para que por defecto me coloque activo el lector
    }

    private void eliminarLector() {

        if (lectorActual != null) {

            lector.desactivarlector(lectorActual.getIdLector());
            lectorActual = null;
            limpiarCampos();
        } else {

            JOptionPane.showMessageDialog(this, "No hay un lector seleccionado");

        }
    }

    private void buscarLector() {

        Lector selec = (Lector) jcbLector.getSelectedItem();

        lectorActual = lector.buscarLector(selec.getIdLector());
        if (lectorActual != null) {

            jTidlector.setText(lectorActual.getIdLector() + "");
            jTdni.setText(lectorActual.getDni() + "");
            jTnombre.setText(lectorActual.getNombre());
            jTdomicilio.setText(lectorActual.getDomicilio());
            jTelefono.setText(lectorActual.getTelefono() + "");
            boolean estado = lectorActual.isEstado();
            jrbEstado.setSelected(estado);

        }
    }

    private void guardarModificarLector() {

        try {
            int id = Integer.parseInt(jTidlector.getText());

            int dni = Integer.parseInt(jTdni.getText());
            String nombre = jTnombre.getText();
            String domicilio = jTdomicilio.getText();
            int telefono = Integer.parseInt(jTelefono.getText());

            if (contieneNumeros(nombre) || contieneNumeros(domicilio)) {

                JOptionPane.showMessageDialog(this, "Solo se pueden ingresar letras");
                return;

            }

            if (nombre.isEmpty() || domicilio.isEmpty()) {

                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            boolean estado = jrbEstado.isSelected();

            if (lectorActual == null) {

                lectorActual = new Lector(dni, nombre, domicilio, telefono, estado);

                lector.guardarLector(lectorActual);

            } else {

                lectorActual.setIdLector(id);
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
        for (char c : input.toCharArray()) {// Procesa cada carácter individualmente en una cadena.
            if (Character.isDigit(c)) {//Verifique si es un dígito numérico
                return true;
            }
        }
        return false;
    }

}
