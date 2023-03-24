package InterfacesGraficas.InicioSesion;

import TrackBitMain.Main;

/**
 *
 * @author Joel
 */
public class MenuCrearUsuario extends javax.swing.JPanel {
    private String tipo;
    public MenuCrearUsuario(String tipo) {
        if(tipo.equals("cliente_registro")){
            this.tipo = "cliente";
        } else if(tipo.equals("vendedor_registro")){
            this.tipo = "vendedor";
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        RegistrarmeBoton = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 600));

        bg.setBackground(new java.awt.Color(18, 148, 223));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Creación de Usuario");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, -1));

        UsuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLabel.setText("Usuario");
        bg.add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        usuarioTextField.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarioTextField.setForeground(new java.awt.Color(0, 0, 0));
        usuarioTextField.setBorder(null);
        bg.add(usuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 400, 30));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Contraseña");
        bg.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(0, 0, 0));
        passwordTextField.setBorder(null);
        bg.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 400, 30));

        RegistrarmeBoton.setBackground(new java.awt.Color(255, 255, 255));
        RegistrarmeBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RegistrarmeBoton.setForeground(new java.awt.Color(18, 148, 223));
        RegistrarmeBoton.setText("Registrarse");
        RegistrarmeBoton.setBorder(null);
        RegistrarmeBoton.setBorderPainted(false);
        RegistrarmeBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarmeBoton.setFocusable(false);
        RegistrarmeBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarmeBotonMouseClicked(evt);
            }
        });
        RegistrarmeBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarmeBotonActionPerformed(evt);
            }
        });
        bg.add(RegistrarmeBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 400, 40));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarmeBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarmeBotonMouseClicked
        if(!usuarioTextField.getText().equals("") || !passwordTextField.getText().equals("")){
            Main.agregarUsuario(usuarioTextField.getText(), passwordTextField.getText(), this.tipo);
            InicioSesionMenuPrincipal.getInstancia().InicioSesionDefault();
        }
    }//GEN-LAST:event_RegistrarmeBotonMouseClicked

    private void RegistrarmeBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarmeBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarmeBotonActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        InicioSesionMenuPrincipal.getInstancia().InicioSesionDefault();
    }//GEN-LAST:event_BotonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegistrarmeBoton;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
