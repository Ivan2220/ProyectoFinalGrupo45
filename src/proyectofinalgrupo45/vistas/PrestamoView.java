package proyectofinalgrupo45.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
        title2 = new javax.swing.JLabel();
        jcbuser = new javax.swing.JComboBox<>();
        rdLibrosPrestados = new javax.swing.JRadioButton();
        rdLibrosNoPrestados = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLib = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbPrestar = new javax.swing.JButton();

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Prestamos");

        title2.setText("Usuarios");

        rdLibrosPrestados.setText("Libros Prestados");
        rdLibrosPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLibrosPrestadosActionPerformed(evt);
            }
        });

        rdLibrosNoPrestados.setText("Libros no Prestados");
        rdLibrosNoPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLibrosNoPrestadosActionPerformed(evt);
            }
        });

        jtLib.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtLib);

        jbSalir.setBackground(new java.awt.Color(255, 0, 0));
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

        jbAnular.setBackground(new java.awt.Color(255, 0, 0));
        jbAnular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbAnular.setForeground(new java.awt.Color(255, 255, 255));
        jbAnular.setText("Anular Prestamo");
        jbAnular.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbAnular.setBorderPainted(false);
        jbAnular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAnular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbAnular.setIconTextGap(13);
        jbAnular.setInheritsPopupMenu(true);
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbPrestar.setBackground(new java.awt.Color(102, 255, 51));
        jbPrestar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbPrestar.setForeground(new java.awt.Color(255, 255, 255));
        jbPrestar.setText("Prestar");
        jbPrestar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jbPrestar.setBorderPainted(false);
        jbPrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPrestar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbPrestar.setIconTextGap(13);
        jbPrestar.setInheritsPopupMenu(true);
        jbPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2)
                    .addComponent(jcbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(rdLibrosPrestados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdLibrosNoPrestados)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdLibrosPrestados)
                            .addComponent(rdLibrosNoPrestados)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(title2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(jcbuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rdLibrosPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLibrosPrestadosActionPerformed
         eliminarFilas();

       rdLibrosPrestados .setSelected(false);
        cargaDatosPrestados();
        jbPrestar.setEnabled(false);
        jbAnular.setEnabled(true);
        
    }//GEN-LAST:event_rdLibrosPrestadosActionPerformed

    private void rdLibrosNoPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdLibrosNoPrestadosActionPerformed

        eliminarFilas();

        rdLibrosNoPrestados.setSelected(false);
        cargaDatosNoPrestados();
        jbPrestar.setEnabled(true);
        jbAnular.setEnabled(false);
    }//GEN-LAST:event_rdLibrosNoPrestadosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        anularPrestamo();
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrestarActionPerformed
       prestarLibro();
    }//GEN-LAST:event_jbPrestarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbPrestar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Lector> jcbuser;
    private javax.swing.JTable jtLib;
    private javax.swing.JRadioButton rdLibrosNoPrestados;
    private javax.swing.JRadioButton rdLibrosPrestados;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables

   private void armarCabecera() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Ejemplar");
        filaCabecera.add("Libro");
        filaCabecera.add("Cantidad de Ejemplares");
        
        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtLib.setModel(modelo);

    }

    private void comboListarLectores() {

        for (Lector item : listaL) {

            jcbuser.addItem(item);

        }
    }

    private void eliminarFilas() {

        int f = jtLib.getRowCount() - 1;
        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void cargaDatosNoPrestados() {

        Lector selec = (Lector) jcbuser.getSelectedItem();
        listaE = presData.listarLibrosNoPrestados(selec.getIdLector());
        for (Ejemplar e : listaE) {

            modelo.addRow(new Object[]{
                e.getIdEjemplar(),
                e.getLibro().getNombre(),
                e.getCantidad(),});

        }
    }

    private void cargaDatosPrestados() {

        Lector selec = (Lector) jcbuser.getSelectedItem();
        List<Ejemplar> lista = presData.listarLibrosPrestados(selec.getIdLector());
        for (Ejemplar e : lista) {

            modelo.addRow(new Object[]{
                e.getIdEjemplar(),
                e.getLibro().getNombre(),
                e.getCantidad(),});

        }

}
    
   
private void prestarLibro() {
  
    int filaSeleccionada = jtLib.getSelectedRow();

    if (filaSeleccionada != -1) {
        Lector lector = (Lector) jcbuser.getSelectedItem();
        int idEjemplar = (int) jtLib.getValueAt(filaSeleccionada, 0);
        Ejemplar libro = eData.buscarEjemplar(idEjemplar);
        Libros libroObj = libro.getLibro();

        int cant = (Integer) modelo.getValueAt(filaSeleccionada, 2);
        if (cant == 0) {
            JOptionPane.showMessageDialog(this, "No hay más libros");
            return;
        }

        Ejemplar ejemplar = new Ejemplar(idEjemplar, libroObj, cant, true);

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaDevolucion = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String fechaD = JOptionPane.showInputDialog(this, "Ingrese la fecha de devolución (yyyy-MM-dd):", "Fecha Devolución", JOptionPane.PLAIN_MESSAGE);

        if (fechaD != null) {
            try {
                fechaDevolucion = LocalDate.parse(fechaD, formatter);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(this, "Fecha de devolución inválida. Utilice el formato yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Prestamo prestamo = new Prestamo(lector, ejemplar, fechaActual, fechaDevolucion, 0, 0);

            presData.solicitarLibro(prestamo);
            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un Ejemplar de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

private void anularPrestamo(){
    
     // Obtener la fila seleccionada en la JTable
        int filaSeleccionada = jtLib.getSelectedRow();

        if (filaSeleccionada != -1) {

           Lector lector = (Lector) jcbuser.getSelectedItem();

            // Obtener el ID de el ejemplar seleccionado en la JTable
            int idEjemplar = (int) jtLib.getValueAt(filaSeleccionada, 0);;

            presData.devolverLibro(lector.getIdLector(), idEjemplar);
            eliminarFilas();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un ejemplar de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
}

    

}
