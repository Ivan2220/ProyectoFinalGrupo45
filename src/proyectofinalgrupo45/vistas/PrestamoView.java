package proyectofinalgrupo45.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalgrupo45.accesoADatos.EjemplarData;
import proyectofinalgrupo45.accesoADatos.LectorData;
import proyectofinalgrupo45.accesoADatos.PrestamoData;
import proyectofinalgrupo45.entidades.Ejemplar;
import proyectofinalgrupo45.entidades.Lector;
import proyectofinalgrupo45.entidades.Libros;
import proyectofinalgrupo45.entidades.Prestamo;

public class PrestamoView extends javax.swing.JInternalFrame {

    private List<Ejemplar> listaE;
    private List<Lector> listaL;

    private PrestamoData presData;
    private LectorData lData;
    private EjemplarData eData;
    private Prestamo prestamoActual = null;
    private Ejemplar ejemplarActual = null;
    private DefaultTableModel modelo;

    public PrestamoView() {

        lData = new LectorData();
        listaL = lData.listarLectores();
        modelo = new DefaultTableModel();
        presData = new PrestamoData();
        eData = new EjemplarData();

        initComponents();
        armarCabecera();
        comboListarLectores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbLectores = new javax.swing.JComboBox<>();
        jrbLibrosInscriptos = new javax.swing.JRadioButton();
        jrbLibrosNoInscriptos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPrestamo = new javax.swing.JTable();
        jbtSalir = new javax.swing.JButton();
        jbtAnularPrestamo = new javax.swing.JButton();
        jbtPrestar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdcFechaP = new com.toedter.calendar.JDateChooser();
        jdcFechaD = new com.toedter.calendar.JDateChooser();

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Formulario Prestamo");

        jLabel2.setText("Seleccione un Lector:");

        jcbLectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbLectoresActionPerformed(evt);
            }
        });

        jrbLibrosInscriptos.setText("Libros Prestados");
        jrbLibrosInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbLibrosInscriptosActionPerformed(evt);
            }
        });

        jrbLibrosNoInscriptos.setText("Libros no Prestados");
        jrbLibrosNoInscriptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbLibrosNoInscriptosActionPerformed(evt);
            }
        });

        jtPrestamo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtPrestamo);

        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jbtAnularPrestamo.setText("Anular Prestamo");
        jbtAnularPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAnularPrestamoActionPerformed(evt);
            }
        });

        jbtPrestar.setText("Prestar");
        jbtPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrestarActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de Prestamos");

        jLabel4.setText("Fecha prestamo:");

        jLabel5.setText("Fecha devolucion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)
                        .addComponent(jcbLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jrbLibrosInscriptos)
                        .addGap(92, 92, 92)
                        .addComponent(jrbLibrosNoInscriptos)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdcFechaP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcFechaD, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jbtPrestar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jbtAnularPrestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtSalir)
                                .addGap(60, 60, 60))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbLectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbLibrosInscriptos)
                    .addComponent(jrbLibrosNoInscriptos))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcFechaP, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jdcFechaD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAnularPrestamo)
                    .addComponent(jbtPrestar)
                    .addComponent(jbtSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed

    private void jcbLectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbLectoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbLectoresActionPerformed

    private void jrbLibrosInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbLibrosInscriptosActionPerformed
        eliminarFilas();

        jrbLibrosInscriptos.setSelected(false);
        cargaDatosPrestados();
        jbtPrestar.setEnabled(false);
        jbtAnularPrestamo.setEnabled(true);
    }//GEN-LAST:event_jrbLibrosInscriptosActionPerformed

    private void jrbLibrosNoInscriptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbLibrosNoInscriptosActionPerformed

        eliminarFilas();

        jrbLibrosNoInscriptos.setSelected(false);
        cargaDatosNoPrestados();
        jbtPrestar.setEnabled(true);
        jbtAnularPrestamo.setEnabled(false);
    }//GEN-LAST:event_jrbLibrosNoInscriptosActionPerformed

    private void jbtPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrestarActionPerformed
        int filaSeleccionada = jtPrestamo.getSelectedRow();

        if (filaSeleccionada != -1) {
           
            Lector lector = (Lector) jcbLectores.getSelectedItem();
            int idEjemplar = (int) jtPrestamo.getValueAt(filaSeleccionada, 0);
             Ejemplar libro = eData.buscarEjemplar(idEjemplar);
             Libros libroObj = libro.getLibro();
            
             int cant = (Integer) modelo.getValueAt(filaSeleccionada, 2);
             if (cant==0){
                 JOptionPane.showMessageDialog(this, "No hay mas libros");
                 return;
             }
            Ejemplar ejemplar = new Ejemplar(idEjemplar,libroObj, cant, true);

            java.util.Date sfecha1 = jdcFechaP.getDate();
            LocalDate fecha1 = sfecha1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            java.util.Date sfecha2 = jdcFechaD.getDate();
            LocalDate fecha2 = sfecha2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                Prestamo prestamo = new Prestamo(lector, ejemplar, fecha1, fecha2, 0,0);

                presData.solicitarLibro(prestamo);
      
            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un Ejemplar de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtPrestarActionPerformed

    private void jbtAnularPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAnularPrestamoActionPerformed
       // Obtener la fila seleccionada en la JTable
        int filaSeleccionada = jtPrestamo.getSelectedRow();

        if (filaSeleccionada != -1) {

           Lector lector = (Lector) jcbLectores.getSelectedItem();

            // Obtener el ID de el ejemplar seleccionado en la JTable
            int idEjemplar = (int) jtPrestamo.getValueAt(filaSeleccionada, 0);;

            presData.devolverLibro(lector.getIdLector(), idEjemplar);
            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un ejemplar de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtAnularPrestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAnularPrestamo;
    private javax.swing.JButton jbtPrestar;
    private javax.swing.JButton jbtSalir;
    private javax.swing.JComboBox<Lector> jcbLectores;
    private com.toedter.calendar.JDateChooser jdcFechaD;
    private com.toedter.calendar.JDateChooser jdcFechaP;
    private javax.swing.JRadioButton jrbLibrosInscriptos;
    private javax.swing.JRadioButton jrbLibrosNoInscriptos;
    private javax.swing.JTable jtPrestamo;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Ejemplar");
        filaCabecera.add("Libro");
        filaCabecera.add("Cantidad de Ejemplares");
        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtPrestamo.setModel(modelo);

    }

    private void comboListarLectores() {

        for (Lector item : listaL) {

            jcbLectores.addItem(item);

        }
    }

    private void eliminarFilas() {

        int f = jtPrestamo.getRowCount() - 1;
        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void cargaDatosNoPrestados() {

        Lector selec = (Lector) jcbLectores.getSelectedItem();
        listaE = presData.listarLibrosNoPrestados(selec.getIdLector());
        for (Ejemplar e : listaE) {

            modelo.addRow(new Object[]{
                e.getIdEjemplar(),
                e.getLibro().getNombre(),
                e.getCantidad(),});

        }
    }

    private void cargaDatosPrestados() {

        Lector selec = (Lector) jcbLectores.getSelectedItem();
        List<Ejemplar> lista = presData.listarLibrosPrestados(selec.getIdLector());
        for (Ejemplar e : lista) {

            modelo.addRow(new Object[]{
                e.getIdEjemplar(),
                e.getLibro().getNombre(),
                e.getCantidad(),});

        }

       prestamoActual = presData.buscarPrestamoPorLector(selec.getIdLector());
      
        if (prestamoActual != null) {

            LocalDate f1 = prestamoActual.getFechaInicio();
            java.util.Date date = java.util.Date.from(f1.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaP.setDate(date);
            LocalDate f2 = prestamoActual.getFechaFin();
            java.util.Date date2 = java.util.Date.from(f2.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaD.setDate(date2);

        }
    }

}
