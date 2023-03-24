package InterfacesGraficas.Plantillas;
import InterfacesGraficas.MenusPrincipales.MenuClientePrincipal;
import TrackBitMain.*;

/**
 *
 * @author Joel
 */
public class PlantillaCompraProducto extends javax.swing.JFrame {


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
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(900, 600));
        bg.setMinimumSize(new java.awt.Dimension(900, 600));
        bg.setPreferredSize(new java.awt.Dimension(900, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 442, 119));

        ComprarBoton.setBackground(new java.awt.Color(18, 148, 223));
        ComprarBoton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ComprarBoton.setForeground(new java.awt.Color(255, 255, 255));
        ComprarBoton.setText("Comprar Producto");
        ComprarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprarBotonMouseClicked(evt);
            }
        });
        bg.add(ComprarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 250, 100));

        BotonVolver.setBackground(new java.awt.Color(0, 0, 0));
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setText("Volver");
        BotonVolver.setMinimumSize(new java.awt.Dimension(73, 23));
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        bg.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        this.setVisible(false);
        MenuClientePrincipal b = new MenuClientePrincipal();
        b.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void ComprarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprarBotonMouseClicked
        System.out.println("Se ha comprado el producto "+this.jLabel1.getText());
    }//GEN-LAST:event_ComprarBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton ComprarBoton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
