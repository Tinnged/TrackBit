/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesGraficas.InicioSesion;

/**
 *
 * @author Joel
 */
public class MenuInicio extends javax.swing.JPanel {

    public MenuInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonCliente = new javax.swing.JButton();
        BotonVendedor = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));

        jPanel1.setBackground(new java.awt.Color(18, 148, 223));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCliente.setBackground(new java.awt.Color(18, 148, 223));
        BotonCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonCliente.setForeground(new java.awt.Color(255, 255, 255));
        BotonCliente.setText("Cliente");
        BotonCliente.setBorder(null);
        BotonCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCliente.setFocusable(false);
        BotonCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonClienteMouseExited(evt);
            }
        });
        BotonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 500, 150));

        BotonVendedor.setBackground(new java.awt.Color(18, 148, 223));
        BotonVendedor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonVendedor.setForeground(new java.awt.Color(255, 255, 255));
        BotonVendedor.setText("Vendedor");
        BotonVendedor.setBorder(null);
        BotonVendedor.setBorderPainted(false);
        BotonVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVendedor.setFocusable(false);
        BotonVendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonVendedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonVendedorMouseExited(evt);
            }
        });
        BotonVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 500, 150));

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Bienvenido, ");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("¿Cómo desea iniciar sesión?");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonClienteMouseEntered
        BotonCliente.setBackground(new java.awt.Color(255, 255, 255));
        BotonCliente.setForeground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_BotonClienteMouseEntered

    private void BotonClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonClienteMouseExited
        BotonCliente.setForeground(new java.awt.Color(255, 255, 255));
        BotonCliente.setBackground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_BotonClienteMouseExited

    private void BotonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClienteActionPerformed
        this.setVisible(false);
        InicioSesionMenuPrincipal.getInstancia().cambiarVentana("cliente");
    }//GEN-LAST:event_BotonClienteActionPerformed

    private void BotonVendedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVendedorMouseEntered
        BotonVendedor.setBackground(new java.awt.Color(255, 255, 255));
        BotonVendedor.setForeground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_BotonVendedorMouseEntered

    private void BotonVendedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVendedorMouseExited
        BotonVendedor.setForeground(new java.awt.Color(255, 255, 255));
        BotonVendedor.setBackground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_BotonVendedorMouseExited

    private void BotonVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVendedorActionPerformed
        this.setVisible(false);
        InicioSesionMenuPrincipal.getInstancia().cambiarVentana("vendedor");
    }//GEN-LAST:event_BotonVendedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCliente;
    private javax.swing.JButton BotonVendedor;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
