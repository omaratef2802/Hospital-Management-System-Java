package Patient;

public class HomePatient extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HomePatient.class.getName());

    public HomePatient() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnDiag.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18));
        this.setTitle("🏠Home");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLog = new javax.swing.JButton();
        btnDiag = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFullHistory = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLog.setBackground(new java.awt.Color(0, 153, 255));
        btnLog.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLog.setText("🚪Logout");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, 220, 88));

        btnDiag.setBackground(new java.awt.Color(135, 206, 250));
        btnDiag.setFont(new java.awt.Font("Hiragino Sans", 3, 24)); // NOI18N
        btnDiag.setForeground(new java.awt.Color(255, 255, 255));
        btnDiag.setText("🩺📋Diagnosis");
        btnDiag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 220, 88));

        btnUpdate.setBackground(new java.awt.Color(135, 206, 250));
        btnUpdate.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("🔧Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 220, 88));

        btnFullHistory.setBackground(new java.awt.Color(135, 206, 250));
        btnFullHistory.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btnFullHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnFullHistory.setText("📜Full Histroy");
        btnFullHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFullHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnFullHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 540, 220, 88));

        btnAdd.setBackground(new java.awt.Color(135, 206, 250));
        btnAdd.setFont(new java.awt.Font("Hiragino Sans", 3, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("👤Add");
        btnAdd.setToolTipText("");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 220, 88));

        btn_Search.setBackground(new java.awt.Color(135, 206, 250));
        btn_Search.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btn_Search.setForeground(new java.awt.Color(255, 255, 255));
        btn_Search.setText("🔍Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 220, 88));

        btn_Delete.setBackground(new java.awt.Color(135, 206, 250));
        btn_Delete.setFont(new java.awt.Font("Hoefler Text", 3, 24)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("🗑Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 220, 88));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/e5e94bb8-8cef-4f15-ba7e-406eea5b84bb.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 1040));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed

        new projecthospital.Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnDiagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagActionPerformed

        new Patient.Diagnosis().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDiagActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        new Patient.UpdatePateint().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFullHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFullHistoryActionPerformed

        new Patient.FullHistory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFullHistoryActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        new Patient.AddPatient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        new Patient.Search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        new Patient.Delete().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_DeleteActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new HomePatient().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDiag;
    private javax.swing.JButton btnFullHistory;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Search;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
