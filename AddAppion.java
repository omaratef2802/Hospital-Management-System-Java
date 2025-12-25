package Appiontment;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.sql.*;
import javax.swing.JOptionPane;
public class AddAppion extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddAppion.class.getName());

    public AddAppion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("👤Add");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Type = new javax.swing.JTextField();
        txt_PatientID = new javax.swing.JTextField();
        txt_ID = new javax.swing.JTextField();
        txt_DoctorID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();
        txt_Room = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setText("DoctorID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 112, -1));

        txt_Type.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        getContentPane().add(txt_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 268, -1));

        txt_PatientID.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        getContentPane().add(txt_PatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 268, -1));

        txt_ID.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 268, -1));

        txt_DoctorID.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        getContentPane().add(txt_DoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 268, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel2.setText("PatientID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 104, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel4.setText("Type :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 71, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel5.setText("ID :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 77, -1));

        btn_Save.setBackground(new java.awt.Color(255, 153, 0));
        btn_Save.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(153, 153, 153));
        btn_Save.setText("💾Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 200, 90));

        btn_Close.setBackground(new java.awt.Color(255, 0, 0));
        btn_Close.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        btn_Close.setForeground(new java.awt.Color(255, 255, 255));
        btn_Close.setText("🚪close");
        btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, 210, 90));

        txt_Room.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        getContentPane().add(txt_Room, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 268, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel6.setText("Number'Rooms  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/e5e94bb8-8cef-4f15-ba7e-406eea5b84bb.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed

        int AppionID = Integer.parseInt(txt_ID.getText());
        int NumbersRoom = Integer.valueOf(txt_Room.getText());
        String Type = txt_Type.getText();
        int PatientID = Integer.parseInt(txt_PatientID.getText());
        int DoctorID = Integer.parseInt(txt_DoctorID.getText());

        Connection con = DB.getConnection();

        try {

            String sql = "INSERT INTO Appointments(ID, Numberroom, Type, Date, PatientID, DoctorID) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, AppionID);
            pst.setInt(2, NumbersRoom);
            pst.setString(3, Type);
            LocalDate today = LocalDate.now();
            pst.setDate(4, Date.valueOf(today));
            pst.setInt(5, PatientID);
            pst.setInt(6, DoctorID);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Successfully Added ✅ ");
            new AddAppion().setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed Added ❌ ");
            JOptionPane.showMessageDialog(null, "The Error Is : " + e.getMessage());
        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseActionPerformed
        // TODO add your handling code here:
        new Appiontment.HomeAppiont().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CloseActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new AddAppion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_DoctorID;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_PatientID;
    private javax.swing.JTextField txt_Room;
    private javax.swing.JTextField txt_Type;
    // End of variables declaration//GEN-END:variables
}
