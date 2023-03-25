/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas.MenusPrincipales;
import InterfacesGraficas.InicioSesion.InicioSesionMenuPrincipal;
import TrackBitMain.Main;

/**
 *
 * @author Joel
 */
public class MenuVendedorAgregarProducto extends javax.swing.JFrame {
    
    private int xMouse, yMouse;
    
    public MenuVendedorAgregarProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        agregarBoton = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        Barra = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        labelPrecio = new javax.swing.JLabel();
        precioTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(18, 148, 223));
        bg.setMaximumSize(new java.awt.Dimension(900, 600));
        bg.setMinimumSize(new java.awt.Dimension(900, 600));
        bg.setPreferredSize(new java.awt.Dimension(900, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Agregar Producto");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 290, -1));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setText("Nombre");
        bg.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        nombreTextField.setBackground(new java.awt.Color(255, 255, 255));
        nombreTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreTextField.setForeground(new java.awt.Color(0, 0, 0));
        nombreTextField.setBorder(null);
        bg.add(nombreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 550, 40));

        agregarBoton.setBackground(new java.awt.Color(255, 255, 255));
        agregarBoton.setForeground(new java.awt.Color(18, 148, 223));
        agregarBoton.setText("Agregar");
        agregarBoton.setBorder(null);
        agregarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBotonActionPerformed(evt);
            }
        });
        bg.add(agregarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 110, 40));

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

        Salir.setBackground(new java.awt.Color(18, 148, 223));
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

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addContainerGap(821, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        labelPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio");
        bg.add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        precioTextField.setBackground(new java.awt.Color(255, 255, 255));
        precioTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioTextField.setForeground(new java.awt.Color(0, 0, 0));
        precioTextField.setBorder(null);
        bg.add(precioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 290, 40));

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

    private void agregarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBotonActionPerformed
        if(nombreTextField.getText() != "" && precioTextField.getText() != ""){
            Main.agregarProdcuto(nombreTextField.getText(), "$"+precioTextField.getText());
        }
        nombreTextField.setText("");
        precioTextField.setText("");
    }//GEN-LAST:event_agregarBotonActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        MenuVendedorPrincipal b = new MenuVendedorPrincipal();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new java.awt.Color(18, 148, 223));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton agregarBoton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField precioTextField;
    // End of variables declaration//GEN-END:variables
}
