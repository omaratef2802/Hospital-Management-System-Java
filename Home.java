package projecthospital;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("🏠Home");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPatient = new javax.swing.JButton();
        btnDocotr = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnAppiontment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPatient.setBackground(new java.awt.Color(135, 206, 250));
        btnPatient.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnPatient.setText("👳Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 220, 88));

        btnDocotr.setBackground(new java.awt.Color(135, 206, 250));
        btnDocotr.setFont(new java.awt.Font("Hiragino Sans", 3, 24)); // NOI18N
        btnDocotr.setForeground(new java.awt.Color(255, 255, 255));
        btnDocotr.setText("🥼Doctor");
        btnDocotr.setToolTipText("");
        btnDocotr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocotrActionPerformed(evt);
            }
        });
        getContentPane().add(btnDocotr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 220, 88));

        btnLogout.setBackground(new java.awt.Color(135, 206, 250));
        btnLogout.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("⏎Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 220, 88));

        btnAppiontment.setBackground(new java.awt.Color(135, 206, 250));
        btnAppiontment.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnAppiontment.setForeground(new java.awt.Color(255, 255, 255));
        btnAppiontment.setText("⌚Appiontment");
        btnAppiontment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppiontmentActionPerformed(evt);
            }
        });
        getContentPane().add(btnAppiontment, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 220, 88));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/e5e94bb8-8cef-4f15-ba7e-406eea5b84bb.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 2150, 1060));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed

        new Patient.HomePatient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDocotrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocotrActionPerformed

        new Doctors.HomeDoctor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDocotrActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAppiontmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppiontmentActionPerformed
        // TODO add your handling code here:
        new Appiontment.HomeAppiont().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAppiontmentActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppiontment;
    private javax.swing.JButton btnDocotr;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatient;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
