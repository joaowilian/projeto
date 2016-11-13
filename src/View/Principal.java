
package View;

import dao.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author joao
 */
public class Principal extends javax.swing.JFrame {
    private Session session;
  
    public Principal() {
        session = HibernateUtil.getSessionFactory().openSession();
        initComponents();
        setLocationRelativeTo(null); //centralizar janela
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDeposito = new javax.swing.JButton();
        btnExtrato = new javax.swing.JButton();
        btnConta = new javax.swing.JButton();
        btnTranferencia = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSaque1 = new javax.swing.JButton();
        btnSaque2 = new javax.swing.JButton();
        btnSaque4 = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setAutoscrolls(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDeposito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeposito.setText("Deposito");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnExtrato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExtrato.setText("Extrato");
        btnExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtratoActionPerformed(evt);
            }
        });

        btnConta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConta.setText("Conta");
        btnConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaActionPerformed(evt);
            }
        });

        btnTranferencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTranferencia.setText("Tranferencia");
        btnTranferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranferenciaActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSaque1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaque1.setText("Saque");

        btnSaque2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaque2.setText("Saque");

        btnSaque4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaque4.setText("Saque");

        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaque1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaque4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaque2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTranferencia)
                    .addComponent(btnCliente))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTranferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnExtrato)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaque1)
                            .addComponent(btnSaque4)
                            .addComponent(btnSaque2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeposito)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConta)
                    .addComponent(btnCliente))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
      
       Deposito de = new Deposito();
       de.setVisible(true);       
       
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtratoActionPerformed
        Extrato ex = new Extrato();        // TODO add your handling code here:
        ex.setVisible(true);
    }//GEN-LAST:event_btnExtratoActionPerformed

    private void btnTranferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTranferenciaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaActionPerformed
       
        Conta conta = new Conta(session);
        conta.setVisible(true);
    }//GEN-LAST:event_btnContaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        Cliente cli = new Cliente();
        cli.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConta;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnExtrato;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaque1;
    private javax.swing.JButton btnSaque2;
    private javax.swing.JButton btnSaque4;
    private javax.swing.JButton btnTranferencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
