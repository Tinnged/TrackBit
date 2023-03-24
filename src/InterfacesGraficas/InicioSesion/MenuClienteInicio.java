/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfacesGraficas.InicioSesion;

import InterfacesGraficas.MenusPrincipales.MenuClientePrincipal;
import TrackBitMain.Main;

/**
 *
 * @author Joel
 */
public class MenuClienteInicio extends javax.swing.JPanel {

    public MenuClienteInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        UsuarioLabel = new javax.swing.JLabel();
        IngresarBoton = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        RegistrarseBoton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 600));
        setMinimumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 148, 223));
        jPanel1.setForeground(new java.awt.Color(18, 148, 223));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Sesión Cliente");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Titulo1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setText("Ingrese los siguientes datos");
        jPanel1.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Contraseña");
        jPanel1.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        usuarioTextField.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarioTextField.setForeground(new java.awt.Color(0, 0, 0));
        usuarioTextField.setBorder(null);
        jPanel1.add(usuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 400, 30));

        UsuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLabel.setText("Usuario");
        jPanel1.add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        IngresarBoton.setBackground(new java.awt.Color(255, 255, 255));
        IngresarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IngresarBoton.setForeground(new java.awt.Color(18, 148, 223));
        IngresarBoton.setText("Ingresar");
        IngresarBoton.setBorder(null);
        IngresarBoton.setBorderPainted(false);
        IngresarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IngresarBoton.setFocusable(false);
        IngresarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarBotonMouseClicked(evt);
            }
        });
        IngresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(IngresarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 140, 40));

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
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 110, 60));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.setBorder(null);
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 400, 30));

        RegistrarseBoton.setBackground(new java.awt.Color(18, 148, 223));
        RegistrarseBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegistrarseBoton.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarseBoton.setText("Registrarme");
        RegistrarseBoton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RegistrarseBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarseBoton.setFocusable(false);
        RegistrarseBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseBotonActionPerformed(evt);
            }
        });
        jPanel1.add(RegistrarseBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 140, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBotonMouseClicked
        boolean validacion = Main.vereficarUsuario(usuarioTextField.getText(), passwordTextField.getText(), "cliente");
        if(validacion){
            MenuClientePrincipal b = new MenuClientePrincipal();
            b.setVisible(true);
            InicioSesionMenuPrincipal.getInstancia().dispose();
        }
    }//GEN-LAST:event_IngresarBotonMouseClicked

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        InicioSesionMenuPrincipal.getInstancia().InicioSesionDefault();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void IngresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarBotonActionPerformed

    private void RegistrarseBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseBotonActionPerformed
        this.setVisible(false);
        InicioSesionMenuPrincipal.getInstancia().cambiarVentana("cliente_registro");
    }//GEN-LAST:event_RegistrarseBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton IngresarBoton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegistrarseBoton;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
