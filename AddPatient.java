package Patient;

import java.sql.*;
import javax.swing.JOptionPane;

public class AddPatient extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddPatient.class.getName());

    public AddPatient() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("👤Add");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_LName = new javax.swing.JTextField();
        txt_blood = new javax.swing.JTextField();
        txt_Age = new javax.swing.JTextField();
        txt_Contact = new javax.swing.JTextField();
        txt_Addres = new javax.swing.JTextField();
        txt_Major = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_FName = new javax.swing.JTextField();
        btn_Female = new javax.swing.JRadioButton();
        btn_male = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Al Nile", 3, 24)); // NOI18N
        jButton1.setText("🚪close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 170, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Patient id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 83, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("First Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 102, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 83, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 83, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Blood Group");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 91, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Any Major Disease sufferd before");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 247, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 83, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 83, -1));

        txt_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 262, -1));

        txt_LName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 262, -1));

        txt_blood.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 262, -1));

        txt_Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 240, -1));

        txt_Contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 262, -1));

        txt_Addres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Addres, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 275, -1));

        txt_Major.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_Major, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 379, -1));

        jButton2.setBackground(new java.awt.Color(106, 182, 255));
        jButton2.setFont(new java.awt.Font("Al Bayan", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("💾Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 190, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Last Name :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 91, -1));

        txt_FName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txt_FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 262, -1));

        buttonGroup1.add(btn_Female);
        btn_Female.setText("Female");
        getContentPane().add(btn_Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 83, -1));

        buttonGroup1.add(btn_male);
        btn_male.setText("Male");
        getContentPane().add(btn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 83, -1));

        jLabel10.setText(" ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 152, 43, -1));

        jLabel12.setText(" ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 188, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AddPatin.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Patient.HomePatient().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    char Gender() {

        if (btn_male.isSelected()) {
            return 'M';
        }

        return 'F';
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int patientID = Integer.parseInt(txt_ID.getText());
        String FirstName =txt_FName.getText(); 
        String LastName = txt_LName.getText();
        String contactNumber = txt_Contact.getText();
        char gender = Gender();
        int age = Integer.parseInt(txt_Age.getText());
        String bloodgroup = txt_blood.getText();
        String address = txt_Addres.getText();
        String anyMajorDisease = txt_Major.getText();

        try {
            Connection con = DB.getConnection();
            String query = "INSERT INTO Patients (PatientID, Phone, FirstName, LastName, Gender, Age, BloodGroup, Address, AnyMajor) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, patientID);
            ps.setString(2, contactNumber);
            ps.setString(3, FirstName);
            ps.setString(4, LastName);
            ps.setString(5, String.valueOf(gender));
            ps.setInt(6, age);
            ps.setString(7, bloodgroup);
            ps.setString(8, address);
            ps.setString(9, anyMajorDisease);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Successfully Added ✅ ");
            new AddPatient().setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Failed Added ❌ ");
            JOptionPane.showMessageDialog(null, "The Error Is : " + e.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new AddPatient().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_Female;
    private javax.swing.JRadioButton btn_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_Addres;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_Contact;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_Major;
    private javax.swing.JTextField txt_blood;
    // End of variables declaration//GEN-END:variables
}
