/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas.InicioSesion;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author Joel
 */
public class InicioSesionMenuPrincipal extends javax.swing.JFrame {
    private static InicioSesionMenuPrincipal instancia = null;
    int xMouse, yMouse;
    
    private InicioSesionMenuPrincipal() {
        initComponents();
        setearImagenes();
        InicioSesionDefault();
    }
    
    public static InicioSesionMenuPrincipal getInstancia() {
        if (instancia == null) {
            instancia = new InicioSesionMenuPrincipal();
        }
        return instancia;
    }
    
    public void InicioSesionDefault(){
        MenuInicio contenidoInicial = new MenuInicio();
        contenidoInicial.setSize(500,600);
        contenidoInicial.setLocation(0,0);
        Contenedor.removeAll();
        Contenedor.add(contenidoInicial, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        Barra = new javax.swing.JPanel();
        LogoJPG = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
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
        bg.add(LogoJPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 323, 105));

        Contenedor.setBackground(new java.awt.Color(18, 148, 223));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        bg.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

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

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraMouseDragged

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(new java.awt.Color(18, 148, 223));
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_SalirMouseExited

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked
      
    public void cambiarVentana(String opcion){
        if(opcion.equals("cliente")){
            MenuClienteInicio NuevoContentido = new MenuClienteInicio();
            NuevoContentido.setSize(500,600);
            NuevoContentido.setLocation(0,0);
            Contenedor.add(NuevoContentido, BorderLayout.CENTER);
            Contenedor.revalidate();
            Contenedor.repaint(); 
        } else if(opcion.equals("vendedor")){
            MenuVendedorInicio NuevoContentido = new MenuVendedorInicio();
            NuevoContentido.setSize(500,600);
            NuevoContentido.setLocation(0,0);
            Contenedor.add(NuevoContentido, BorderLayout.CENTER);
            Contenedor.revalidate();
            Contenedor.repaint(); 
        } else{
            MenuCrearUsuario NuevoContenido = new MenuCrearUsuario(opcion);
            NuevoContenido.setSize(500,600);
            NuevoContenido.setLocation(0,0);
            Contenedor.add(NuevoContenido, BorderLayout.CENTER);
            Contenedor.revalidate();
            Contenedor.repaint(); 
        }
    }
    
    private void setearImagenes(){
        try{
            LogoJPG.setIcon(new ImageIcon(getClass().getResource("/imagenes/logoTrackBit.png")));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel LogoJPG;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
}
