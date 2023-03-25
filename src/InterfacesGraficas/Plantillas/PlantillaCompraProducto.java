package InterfacesGraficas.Plantillas;
import InterfacesGraficas.MenusPrincipales.MenuClientePrincipal;
import TrackBitMain.*;

/**
 *
 * @author Joel
 */
public class PlantillaCompraProducto extends javax.swing.JFrame {
    
    private int xMouse, yMouse;

    public PlantillaCompraProducto(Producto producto) {
        initComponents();
        jLabel1.setText(producto.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComprarBoton = new javax.swing.JButton();
        Barra = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        BotonVolver1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(900, 600));
        bg.setMinimumSize(new java.awt.Dimension(900, 600));
        bg.setPreferredSize(new java.awt.Dimension(900, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 442, 119));

        ComprarBoton.setBackground(new java.awt.Color(18, 148, 223));
        ComprarBoton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ComprarBoton.setForeground(new java.awt.Color(255, 255, 255));
        ComprarBoton.setText("Comprar Producto");
        ComprarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprarBoton.setFocusable(false);
        ComprarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarBotonMouseClicked(evt);
            }
        });
        bg.add(ComprarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 250, 50));

        Barra.setOpaque(false);
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("X");
        Salir.setBorder(null);
        Salir.setBorderPainted(false);
        Salir.setFocusPainted(false);
        Salir.setFocusable(false);
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addContainerGap(820, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        BotonVolver1.setBackground(new java.awt.Color(255, 255, 255));
        BotonVolver1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonVolver1.setForeground(new java.awt.Color(18, 148, 223));
        BotonVolver1.setText("<- Volver");
        BotonVolver1.setBorder(null);
        BotonVolver1.setBorderPainted(false);
        BotonVolver1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVolver1.setFocusable(false);
        BotonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolver1ActionPerformed(evt);
            }
        });
        bg.add(BotonVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 110, 60));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 840, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarBotonMouseClicked
        System.out.println("Se ha comprado el producto "+this.jLabel1.getText());
    }//GEN-LAST:event_ComprarBotonMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SalirMouseExited

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void BotonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolver1ActionPerformed
        this.setVisible(false);
        MenuClientePrincipal b = new MenuClientePrincipal();
        b.setVisible(true);
    }//GEN-LAST:event_BotonVolver1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BotonVolver1;
    private javax.swing.JButton ComprarBoton;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
