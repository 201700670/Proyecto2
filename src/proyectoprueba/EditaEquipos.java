/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

/**
 *
 * @author Andrea Palomo
 */
public class EditaEquipos extends javax.swing.JFrame {

    /**
     * Creates new form EditaJugadores
     */
    public EditaEquipos() {
        initComponents();
        setTitle("EDITAR EQUIPOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mundiales = new javax.swing.JTextField();
        nombreequipo = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Edición DE EQUIPOS");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 226, -1));

        Editar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 250, 131, -1));

        Buscar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 89, 105, -1));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("código");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 94, 60, -1));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Equipo:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 139, -1, -1));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mundiales ganados:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 182, -1, -1));

        mundiales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mundiales.setToolTipText("");
        getContentPane().add(mundiales, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 179, 190, -1));

        nombreequipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombreequipo.setToolTipText("");
        nombreequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreequipoActionPerformed(evt);
            }
        });
        getContentPane().add(nombreequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 136, 190, -1));

        codigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        codigo.setToolTipText("");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 93, 190, -1));

        Regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 250, 155, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Después de realiza la búsqueda realice la edición de campos y presione editar.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 228, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Andrea Palomo\\Documents\\NetBeansProjects\\ProyectoPrueba\\panini.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 720, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        String obcodigo,obnomb, obmundiales;
        obcodigo = codigo.getText();
        obnomb = nombreequipo.getText();
        obmundiales=mundiales.getText();
        RegistroEquipos.listitaequipos.buscareditar(obcodigo, obnomb, obmundiales);
        codigo.setText(null);
        nombreequipo.setText(null);
        mundiales.setText(null);
    }//GEN-LAST:event_EditarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:}
        String obcodigo,obnomb, obmundiales;
        boolean probar = true;
        obcodigo = codigo.getText();
        obnomb = nombreequipo.getText();
        obmundiales = mundiales.getText();
        RegistroEquipos.listitaequipos.buscareditarbuscar(obcodigo, obnomb, obmundiales);
        
        codigo.setText(ListaEquipos.obcodigo);
        nombreequipo.setText(ListaEquipos.nombre_equipo);
        mundiales.setText(ListaEquipos.mundiales_ganados);
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void nombreequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreequipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreequipoActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        FrameAdministrador obj = new FrameAdministrador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(EditaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditaEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mundiales;
    private javax.swing.JTextField nombreequipo;
    // End of variables declaration//GEN-END:variables
}
