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
public class MenuClientePrincipal extends javax.swing.JFrame {
    
    private int xMouse, yMouse;
    
    public MenuClientePrincipal() {
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
        BotonVolver = new javax.swing.JButton();
        cabezera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(18, 148, 223));
        bg.setMaximumSize(new java.awt.Dimension(900, 600));
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

        bg.add(PanelDeScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 640, 520));

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

        cabezera.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Productos a la venta");

        javax.swing.GroupLayout cabezeraLayout = new javax.swing.GroupLayout(cabezera);
        cabezera.setLayout(cabezeraLayout);
        cabezeraLayout.setHorizontalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezeraLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        cabezeraLayout.setVerticalGroup(
            cabezeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezeraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bg.add(cabezera, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 640, 80));

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

    public void mostrarProductos(){
        for (int i = 0; i < Main.listaDeProductos.size(); i++) {
            PlantillaProductos plantilla = new PlantillaProductos();
            Producto productoActual = Main.listaDeProductos.get(i);
            JPanel plantillaProducto = plantilla.devolverComponente();
            plantilla.cambiarNombre(productoActual.getNombre());
            plantilla.cambiarPrecio(productoActual.getPrecio());
            plantillaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirPaginaProducto(productoActual);
            }
            });
            
            panelDeProductos.add(plantillaProducto);
        }
    }
    
    public void abrirPaginaProducto(Producto producto){
        PlantillaCompraProducto nuevaPlantilla = new PlantillaCompraProducto(producto);
        nuevaPlantilla.setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
