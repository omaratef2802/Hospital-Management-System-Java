package Doctors;

import java.sql.*;
import javax.swing.JOptionPane;

public class AddDoctor extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddDoctor.class.getName());

    public AddDoctor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("👤Add");
    }

    char Gender() {

        if (btn_male.isSelected()) {
            return 'M';
        }

        return 'F';
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        txt_FName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Num = new javax.swing.JTextField();
        btn_male = new javax.swing.JRadioButton();
        txt_Age = new javax.swing.JTextField();
        btn_Female = new javax.swing.JRadioButton();
        txt_Adress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_LName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Spec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Age : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 83, -1));

        txt_FName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 262, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Address : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 440, 100, -1));

        txt_Num.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 262, -1));

        buttonGroup1.add(btn_male);
        btn_male.setForeground(new java.awt.Color(0, 204, 204));
        btn_male.setText("Male");
        getContentPane().add(btn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 83, -1));

        txt_Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 380, 262, -1));

        buttonGroup1.add(btn_Female);
        btn_Female.setForeground(new java.awt.Color(153, 0, 204));
        btn_Female.setText("Female");
        getContentPane().add(btn_Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 83, -1));

        txt_Adress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 262, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("gender :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 83, -1));

        txt_LName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 290, 262, -1));

        jButton2.setBackground(new java.awt.Color(106, 182, 255));
        jButton2.setFont(new java.awt.Font("Al Bayan", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("💾Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 230, 90));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Al Nile", 3, 24)); // NOI18N
        jButton1.setText("🚪close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 230, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Patient id : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 160, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("First Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 140, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Last Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 290, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("Contact No :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 130, -1));

        txt_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 262, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Specialist : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 110, -1));

        txt_Spec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 262, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Doctor3.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 1740, 1160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String Temp1=txt_id.getText();
        if (!Temp1.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ Please enter numbers only!");
            return;
        }
        
        int patientID = Integer.parseInt(txt_id.getText());
        
        
        
        String FirstName = txt_FName.getText();
        String LastName = txt_LName.getText();
        String contactNumber = txt_Num.getText();
        char gender = Gender();
        int age = Integer.parseInt(txt_Age.getText());
        String Temp2=txt_Age.getText();
        if (!Temp2.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "❌ Please enter numbers only!");
            return;
        }
        String address = txt_Adress.getText();
        String Spec = txt_Spec.getText();

        try {
            Connection con = DB.getConnection();
            String query = "INSERT INTO Doctors (DoctorID, Phone, FirstName, LastName, Gender, Age, Address , Specialest) " + "VALUES (?, ?, ?, ?, ?, ?, ? , ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, patientID);
            ps.setString(2, contactNumber);
            ps.setString(3, FirstName);
            ps.setString(4, LastName);
            ps.setString(5, String.valueOf(gender));
            ps.setInt(6, age);
            ps.setString(7, address);
            ps.setString(8,Spec);
            
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Successfully Added ✅ ");
            new AddDoctor().setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Failed Added ❌ ");
            JOptionPane.showMessageDialog(null, "The Error Is : " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new HomeDoctor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new AddDoctor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_Female;
    private javax.swing.JRadioButton btn_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Adress;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_Num;
    private javax.swing.JTextField txt_Spec;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
