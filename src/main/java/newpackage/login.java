/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author aakas
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        login_user = new javax.swing.JTextField();
        username_log = new javax.swing.JLabel();
        login_pass = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        login_submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_userActionPerformed(evt);
            }
        });
        getContentPane().add(login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 224, 34));

        username_log.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        username_log.setForeground(new java.awt.Color(255, 255, 255));
        username_log.setText("Username");
        getContentPane().add(username_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 150, 26));

        login_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_passActionPerformed(evt);
            }
        });
        getContentPane().add(login_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 224, 35));

        password.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, -1));

        title.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Login");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 170, 50));

        login_submit.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        login_submit.setText("LOGIN");
        login_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_submitActionPerformed(evt);
            }
        });
        getContentPane().add(login_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 210, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/mac/Desktop/NetBeansProjects/JavaMiniProject/src/main/img/college copy.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_userActionPerformed

    private void login_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_passActionPerformed

    private void login_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_submitActionPerformed
        // TODO add your handling code here:
        scoreTaker scoreTaker = new scoreTaker();
        scoreTaker.setVisible(true);
    }//GEN-LAST:event_login_submitActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField login_pass;
    private javax.swing.JButton login_submit;
    private javax.swing.JTextField login_user;
    private javax.swing.JLabel password;
    private javax.swing.JLabel title;
    private javax.swing.JLabel username_log;
    // End of variables declaration//GEN-END:variables
}
