
package proyectofinalgrupo45.vistas;

import java.awt.Color;
import proyectofinalgrupo45.entidades.Libros;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jRadioButton1 = new javax.swing.JRadioButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/proyectofinalgrupo45/Recursos/sistemabiblioteca.jpg "));
        Image miImagen = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                super.paintComponent(g);
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMLibro = new javax.swing.JMenu();
        jMformlibro = new javax.swing.JMenuItem();
        jMejemplar = new javax.swing.JMenu();
        jMformejemplar = new javax.swing.JMenuItem();
        jMprestamo = new javax.swing.JMenu();
        jMformprestamo = new javax.swing.JMenuItem();
        jmPrestamosVencidos = new javax.swing.JMenuItem();
        jMformlector = new javax.swing.JMenu();
        jMitemformlector = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setMaximumSize(new java.awt.Dimension(2047483647, 2147483647));
        escritorio.setPreferredSize(new java.awt.Dimension(446, 331));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );

        jMLibro.setText("Libro ");
        jMLibro.setMaximumSize(new java.awt.Dimension(41, 32767));

        jMformlibro.setText("Formulario de Libro");
        jMformlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformlibroActionPerformed(evt);
            }
        });
        jMLibro.add(jMformlibro);

        jMenuBar1.add(jMLibro);

        jMejemplar.setText("Ejemplar");

        jMformejemplar.setText("Formulario de ejemplar ");
        jMformejemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformejemplarActionPerformed(evt);
            }
        });
        jMejemplar.add(jMformejemplar);

        jMenuBar1.add(jMejemplar);

        jMprestamo.setText("Prestamo");

        jMformprestamo.setText("Formulario de Prestamo");
        jMformprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformprestamoActionPerformed(evt);
            }
        });
        jMprestamo.add(jMformprestamo);

        jmPrestamosVencidos.setText("Prestamos Vencidos");
        jmPrestamosVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrestamosVencidosActionPerformed(evt);
            }
        });
        jMprestamo.add(jmPrestamosVencidos);

        jMenuBar1.add(jMprestamo);

        jMformlector.setText("Lector");

        jMitemformlector.setText("Formulario de Lector");
        jMitemformlector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMitemformlectorActionPerformed(evt);
            }
        });
        jMformlector.add(jMitemformlector);

        jMenuBar1.add(jMformlector);

        jMsalir.setText("Salir");

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMsalir.add(jMSalir);

        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMformejemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformejemplarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        EjemplarView p = new EjemplarView();
        p.setVisible(true);
        escritorio.add(p);
        p.getContentPane().setBackground(new Color(153, 153, 255));
        escritorio.moveToFront(p);
    }//GEN-LAST:event_jMformejemplarActionPerformed

    private void jMformprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformprestamoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        PrestamoView p = new PrestamoView();
        p.setVisible(true);
        escritorio.add(p);
        p.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.moveToFront(p);
    }//GEN-LAST:event_jMformprestamoActionPerformed

    private void jMformlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformlibroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        LibroView l = new LibroView();
        l.setVisible(true);
        escritorio.add(l);
        l.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.moveToFront(l);
    }//GEN-LAST:event_jMformlibroActionPerformed

    private void jMitemformlectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMitemformlectorActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        LectorView lec = new LectorView();
        lec.setVisible(true);
        escritorio.add(lec);
        lec.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.moveToFront(lec);
        
        
        
    }//GEN-LAST:event_jMitemformlectorActionPerformed

    private void jmPrestamosVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrestamosVencidosActionPerformed
        
        escritorio.removeAll();
        escritorio.repaint();
        FechaVencimientoView f = new FechaVencimientoView();
        f.setVisible(true);
        escritorio.add(f);
        f.getContentPane().setBackground(new Color(68, 167, 132));
        escritorio.moveToFront(f);
    }//GEN-LAST:event_jmPrestamosVencidosActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMLibro;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMejemplar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMformejemplar;
    private javax.swing.JMenu jMformlector;
    private javax.swing.JMenuItem jMformlibro;
    private javax.swing.JMenuItem jMformprestamo;
    private javax.swing.JMenuItem jMitemformlector;
    private javax.swing.JMenu jMprestamo;
    private javax.swing.JMenu jMsalir;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JMenuItem jmPrestamosVencidos;
    // End of variables declaration//GEN-END:variables
}
