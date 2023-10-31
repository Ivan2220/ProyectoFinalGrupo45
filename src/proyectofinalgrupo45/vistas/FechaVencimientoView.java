package proyectofinalgrupo45.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectofinalgrupo45.accesoADatos.LectorData;
import proyectofinalgrupo45.accesoADatos.PrestamoData;
import proyectofinalgrupo45.entidades.Lector;
import proyectofinalgrupo45.entidades.Prestamo;

public class FechaVencimientoView extends javax.swing.JInternalFrame {

    private List<Prestamo> listaP;
     private List<Lector> listaL;

    private PrestamoData pData;
    private LectorData lData;

    private DefaultTableModel modelo;

    public FechaVencimientoView() {
        pData = new PrestamoData();
        lData = new LectorData();
        modelo = new DefaultTableModel();
        listaL = lData.listarLectores();
        initComponents();
        armarCabecera();
        comboListarLectores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVencimiento = new javax.swing.JTable();
        jcbLectores = new javax.swing.JComboBox<>();
        jrdNoVencidos = new javax.swing.JRadioButton();
        jrdVencidos = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registros de Prestamos Vencidos");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Usuarios:");

        jtVencimiento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtVencimiento);

        jrdNoVencidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrdNoVencidos.setText("Prestamos no vencidos");
        jrdNoVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdNoVencidosActionPerformed(evt);
            }
        });

        jrdVencidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrdVencidos.setText("Prestamos vencidos");
        jrdVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdVencidosActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbLectores, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jrdNoVencidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrdVencidos)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbLectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrdNoVencidos)
                    .addComponent(jrdVencidos))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrdNoVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdNoVencidosActionPerformed
        eliminarFilas();

        jrdNoVencidos.setSelected(false);
        cargaDeDatosNoVencidos();
        
    }//GEN-LAST:event_jrdNoVencidosActionPerformed

    private void jrdVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdVencidosActionPerformed
       
         eliminarFilas();

        jrdVencidos.setSelected(false);
        cargaDeDatosVencidos();
        
    }//GEN-LAST:event_jrdVencidosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Lector> jcbLectores;
    private javax.swing.JRadioButton jrdNoVencidos;
    private javax.swing.JRadioButton jrdVencidos;
    private javax.swing.JTable jtVencimiento;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Libro");
        filaCabecera.add("Fecha del Prestamo");
        filaCabecera.add("Fecha de Devolucion ");
        filaCabecera.add("Dias de Retraso");
        filaCabecera.add("Dias Disponible");

        for (Object it : filaCabecera) {

            modelo.addColumn(it);

        }
        jtVencimiento.setModel(modelo);

    }
    
     private void comboListarLectores() {

        for (Lector item : listaL) {

            jcbLectores.addItem(item);

        }
    }

    private void eliminarFilas() {

        int f = jtVencimiento.getRowCount() - 1;
        for (; f >= 0; f--) {

            modelo.removeRow(f);
        }
    }

    private void cargaDeDatosVencidos() {

        Lector selec = (Lector) jcbLectores.getSelectedItem();
        listaP = pData.obtenerLectoresPrestamoVencido(selec.getIdLector());
        for (Prestamo e : listaP) {

            modelo.addRow(new Object[]{
                
                e.getEjemplar().getLibro().getNombre(),
                e.getFechaInicio(),
                e.getFechaFin(),
                e.getRetraso(),
                e.getDiasD(),});

        }
        
    }
    
     private void cargaDeDatosNoVencidos() {

        Lector selec = (Lector) jcbLectores.getSelectedItem();
        List<Prestamo>  prestamo = pData.obtenerLectoresPrestamoNoVencido(selec.getIdLector());
        for (Prestamo e : prestamo) {

            modelo.addRow(new Object[]{
                e.getEjemplar().getLibro().getNombre(),
                e.getFechaInicio(),
                e.getFechaFin(),
                e.getRetraso(), 
                e.getDiasD(),});

        }
    }
}
