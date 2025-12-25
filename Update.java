package Appiontment;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.Date;

public class Update extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Update.class.getName());

    public Update() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton1.setFont(null);
        this.setTitle("🔧Update");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_num = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Type = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_DoctorID = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_PatientID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_num.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_num.setText(" ");
        getContentPane().add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 303, 230, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("Type : ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 302, 90, 30));

        txt_Type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Type.setText(" ");
        getContentPane().add(txt_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 303, 230, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Appiontment Id :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 170, 30));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("🚪Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 200, 80));

        jButton2.setBackground(new java.awt.Color(102, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("🔧Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 200, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Number'Room : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 20));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("🔍Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Patient ID : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 390, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("Doctor ID : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 382, 120, 30));

        txt_DoctorID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_DoctorID.setText(" ");
        getContentPane().add(txt_DoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 383, 226, 30));

        txt_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 200, 30));

        txt_PatientID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_PatientID.setText(" ");
        txt_PatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PatientIDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_PatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 220, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/e5e94bb8-8cef-4f15-ba7e-406eea5b84bb.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new Appiontment.HomeAppiont().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Connection con = null;
        PreparedStatement ps = null;

        String Temp1 = txt_num.getText();
        if (!Temp1.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ Please enter numbers only!");
            return;
        }

        Temp1 = txt_PatientID.getText();
        if (!Temp1.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ Please enter numbers only!");
            return;
        }

        Temp1 = txt_DoctorID.getText();
        if (!Temp1.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ Please enter numbers only!");
            return;
        }

        try {
            int AppionID = Integer.parseInt(txt_ID.getText());
            String Type = txt_Type.getText();
            int NumberRoom = Integer.parseInt(txt_num.getText());
            int PatientID = Integer.parseInt(txt_PatientID.getText());
            int DoctorID = Integer.parseInt(txt_DoctorID.getText());

            con = DB.getConnection();

            String sql = "UPDATE Appointments SET Type=?, NumberRoom=?, PatientID=?, DoctorID=? WHERE ID=?";
            ps = con.prepareStatement(sql);

            ps.setString(1, Type);
            ps.setInt(2, NumberRoom);
            ps.setInt(3, PatientID);
            ps.setInt(4, DoctorID);
            ps.setInt(5, AppionID);
            ps.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Successfully Updated ✅");
            new Appiontment.Update().setVisible(true);
            this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update Failed!");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String AppiontID = txt_ID.getText();

        if (!AppiontID.matches("\\d+")) {

            JOptionPane.showMessageDialog(null, "Please Enter The number");
            return;
        }

        try {
            Connection con = DB.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Appointments WHERE ID = " + AppiontID);
            if (rs.next()) {

                txt_Type.setText(rs.getString("Type"));
                txt_num.setText(rs.getString("Numberroom"));
                txt_PatientID.setText(rs.getString("PatientID"));
                txt_DoctorID.setText(rs.getString("DoctorID"));
                txt_ID.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "DoctorsID does not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error ❌");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_PatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PatientIDActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Update().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_DoctorID;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_PatientID;
    private javax.swing.JTextField txt_Type;
    private javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}
