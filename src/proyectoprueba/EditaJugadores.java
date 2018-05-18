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
public class EditaJugadores extends javax.swing.JFrame {

    /**
     * Creates new form EditaJugadores
     */
    public EditaJugadores() {
        initComponents();
        
        RegistroEquipos.listitaequipos.itemsdeequipos(idequipo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Editar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idequipo = new javax.swing.JComboBox<>();
        Regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombrej = new javax.swing.JTextField();
        nocamisola = new javax.swing.JTextField();
        posicion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        titular = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Editar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel2.setText("No. Camisola:");
        jLabel2.setToolTipText("");

        idequipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Regresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel3.setText("Posición:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel4.setText("Titular o Banca:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel5.setText("Id Equipo:");
        jLabel5.setToolTipText("");

        nombrej.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombrej.setToolTipText("");
        nombrej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrejActionPerformed(evt);
            }
        });

        nocamisola.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nocamisola.setToolTipText("");
        nocamisola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nocamisolaActionPerformed(evt);
            }
        });

        posicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        posicion.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        titular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        titular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titular", "Banca" }));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar DE JUGADORES");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Buscar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrej, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(posicion)
                            .addComponent(nocamisola)
                            .addComponent(titular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idequipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addComponent(Buscar)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nocamisola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(Regresar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        String nombrejs, numcamisola, posicionc, titularob = null;
        nombrejs = nombrej.getText();
        numcamisola = nocamisola.getText();
        posicionc = posicion.getText();;
        
        String valorComboBox = "";
        valorComboBox = titular.getSelectedItem().toString();
        if ("Titular".equals(valorComboBox)) {
            titularob = "titular";
        } else if ("Banca".equals(valorComboBox)) {
            titularob = "banca";
        }
        String idequipos = (String) idequipo.getSelectedItem();
        
        Registrosjugadores.listitajugadores.buscareditar(nombrejs, numcamisola, posicionc, titularob, idequipos);
        Registrosjugadores.listitajugadores.mostrar();
        
        nombrej.setText(null);
        nocamisola.setText(null);
        posicion.setText(null);
        
    }//GEN-LAST:event_EditarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        FrameAdministrador obj = new FrameAdministrador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void nombrejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrejActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrejActionPerformed

    private void nocamisolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nocamisolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nocamisolaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        String nombrejs, numcamisola, posicionc, titularob = null;
        nombrejs = nombrej.getText();
        numcamisola = nocamisola.getText();
        posicionc = posicion.getText();;
        
        String valorComboBox = "";
        valorComboBox = titular.getSelectedItem().toString();
        if ("Titular".equals(valorComboBox)) {
            titularob = "titular";
        } else if ("Banca".equals(valorComboBox)) {
            titularob = "banca";
        }
        String idequipos = (String) idequipo.getSelectedItem();
        
        Registrosjugadores.listitajugadores.buscareditarbuscar(nombrejs, numcamisola, posicionc, titularob, idequipos);
        Registrosjugadores.listitajugadores.mostrar();
        nombrej.setText(ListaJugadores.nombre_jugador);
        nocamisola.setText(ListaJugadores.num_camisola);
        posicion.setText(ListaJugadores.posicion_campo);
    }//GEN-LAST:event_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(EditaJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaJugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditaJugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Regresar;
    private javax.swing.JComboBox<String> idequipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nocamisola;
    private javax.swing.JTextField nombrej;
    private javax.swing.JTextField posicion;
    private javax.swing.JComboBox<String> titular;
    // End of variables declaration//GEN-END:variables
}
