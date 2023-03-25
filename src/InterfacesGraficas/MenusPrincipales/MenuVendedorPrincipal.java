package InterfacesGraficas.MenusPrincipales;
import InterfacesGraficas.InicioSesion.InicioSesionMenuPrincipal;
import InterfacesGraficas.Plantillas.PlantillaProductos;
import InterfacesGraficas.Plantillas.PlantillaCompraProducto;
import TrackBitMain.*;
import java.awt.Cursor;

import javax.swing.JPanel;

/**
 *
 * @author Joel
 */
public class MenuVendedorPrincipal extends javax.swing.JFrame {
    
    private int xMouse, yMouse;
    
    public MenuVendedorPrincipal() {
        initComponents();
        mostrarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        PanelDeScroll = new javax.swing.JScrollPane();
        panelDeProductos = new javax.swing.JPanel();
        cabezera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AgregarBoton = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        Barra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(18, 148, 223));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        bg.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 80, 70));

        PanelDeScroll.setBackground(new java.awt.Color(255, 255, 255));
        PanelDeScroll.setBorder(null);

        panelDeProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelDeProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelDeProductos.setLayout(new javax.swing.BoxLayout(panelDeProductos, javax.swing.BoxLayout.Y_AXIS));
        PanelDeScroll.setViewportView(panelDeProductos);

        bg.add(PanelDeScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 660, 520));

        cabezera.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mis productos");

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezeraLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezeraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 660, 80));

        AgregarBoton.setBackground(new java.awt.Color(18, 148, 223));
        AgregarBoton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarBoton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setText("Agregar Producto");
        AgregarBoton.setBorder(null);
        AgregarBoton.setBorderPainted(false);
        AgregarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarBoton.setFocusPainted(false);
        AgregarBoton.setFocusable(false);
        AgregarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarBotonMouseExited(evt);
            }
        });
        bg.add(AgregarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 60));

        BotonVolver.setBackground(new java.awt.Color(18, 148, 223));
        BotonVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setText("<- Volver");
        BotonVolver.setBorder(null);
        BotonVolver.setBorderPainted(false);
        BotonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVolver.setFocusable(false);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        bg.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 110, 60));

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

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        bg.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

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

    private void AgregarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseClicked
        new MenuVendedorAgregarProducto().setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_AgregarBotonMouseClicked

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        this.setVisible(false);
        InicioSesionMenuPrincipal.getInstancia().InicioSesionDefault();
        InicioSesionMenuPrincipal.getInstancia().setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed

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

    private void AgregarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseEntered
        AgregarBoton.setBackground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setForeground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_AgregarBotonMouseEntered

    private void AgregarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBotonMouseExited
        AgregarBoton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarBoton.setBackground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_AgregarBotonMouseExited

    public void mostrarProductos(){
        for (int i = 0; i < Main.listaDeProductos.size(); i++) {
            PlantillaProductos plantilla = new PlantillaProductos();
            Producto productoActual = Main.listaDeProductos.get(i);
            JPanel plantillaProducto = plantilla.devolverComponente();
            plantilla.cambiarNombre(productoActual.getNombre());
            plantilla.cambiarPrecio(productoActual.getPrecio());
            
            panelDeProductos.add(plantillaProducto);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBoton;
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JScrollPane PanelDeScroll;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel cabezera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelDeProductos;
    // End of variables declaration//GEN-END:variables
}
