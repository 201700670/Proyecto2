/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea Palomo
 */
public class EditaU extends javax.swing.JFrame {

    /**
     * Creates new form EditaU
     */
    public EditaU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cui = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usuario.setToolTipText("");

        contrasena.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contrasena.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar USUARIOs");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel1.setText("CUI:");
        jLabel1.setToolTipText("");

        Editar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Editar.setText("Registrarse");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("");

        Regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Regresar.setText("Regresar Login");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel3.setText("Correo electrónico:");
        jLabel3.setToolTipText("");

        buscar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel4.setText("Nombre usuario:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel5.setText("Contraseña:");
        jLabel5.setToolTipText("");

        cui.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cui.setToolTipText("");
        cui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuiActionPerformed(evt);
            }
        });

        correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        correo.setToolTipText("");

        nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombre.setToolTipText("");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cui)
                                    .addComponent(correo)
                                    .addComponent(nombre)
                                    .addComponent(usuario)
                                    .addComponent(contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Editar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        String id=cui.getText();
        String nom=nombre.getText();
        String electronico=correo.getText();
        String nomusuario=usuario.getText();
        String contra=contrasena.getText();
        if("".equals(id)||"".equals(nom)||"".equals(electronico)||"".equals(nomusuario)||"".equals(contra)){
            JOptionPane.showMessageDialog(null,"DEBE LLENAR TODOS LOS CAMPOS","ERROR",JOptionPane.WARNING_MESSAGE);
        }
        DatoUsuario.creausuario[DatoUsuario.contausuario]=new DatoUsuario(id, nom, electronico, nomusuario, contra);
        for(int persona1=1;persona1<DatoUsuario.contausuario;persona1++){
            while((DatoUsuario.creausuario[DatoUsuario.contausuario].usuario).equals((DatoUsuario.creausuario[persona1].usuario))){
                JOptionPane.showMessageDialog(null,"YA EXISTE UN USUARIO CON ESE NOMBRE, CAMBIARLO","ERROR",JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        DatoUsuario.contausuario++;
        System.out.println(DatoUsuario.contausuario);
        JOptionPane.showMessageDialog(null,"USUARIO CREADO EXITOSAMENTE","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        cui.setText(null);
        nombre.setText(null);
        correo.setText(null);
        usuario.setText(null);
        contrasena.setText(null);
    }//GEN-LAST:event_EditarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        Login obj= new Login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:}
        cui.setText(null);
        nombre.setText(null);
        correo.setText(null);
        usuario.setText(null);
        contrasena.setText(null);
    }//GEN-LAST:event_buscarActionPerformed

    private void cuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuiActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(EditaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditaU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton buscar;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField cui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}