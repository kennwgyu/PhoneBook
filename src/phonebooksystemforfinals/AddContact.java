
package phonebooksystemforfinals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Parent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
/**
 *
 * @author aubso
 */
public class AddContact extends javax.swing.JFrame {

    private Dashboard dashboard;

    // Constructor to accept Dashboard reference
    public AddContact(Dashboard dashboard) {
        this.dashboard = dashboard;
        initComponents();
    }
    
    public AddContact() {
        initComponents();
        Connect ();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private String selectedImagePath = null;
    
    public void Connect()
{
    try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/phone_book_system", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to the database. Please check your connection settings.", "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imglabel = new javax.swing.JLabel();
        removepicture = new javax.swing.JButton();
        uploadimgbtn = new javax.swing.JButton();
        numadd = new javax.swing.JTextField();
        nnameadd = new javax.swing.JTextField();
        lnameadd = new javax.swing.JTextField();
        mnameadd = new javax.swing.JTextField();
        fnameadd = new javax.swing.JTextField();
        addcontactbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bgpicaddcont = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 370));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imglabel.setForeground(new java.awt.Color(255, 255, 255));
        imglabel.setText("       No Photo Uploaded");
        imglabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(imglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 150, 190));

        removepicture.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removepicture.setText("Remove Picture");
        removepicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removepictureActionPerformed(evt);
            }
        });
        getContentPane().add(removepicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 150, 20));

        uploadimgbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        uploadimgbtn.setText("Upload Image");
        uploadimgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadimgbtnActionPerformed(evt);
            }
        });
        getContentPane().add(uploadimgbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, 20));

        numadd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        numadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numaddActionPerformed(evt);
            }
        });
        getContentPane().add(numadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 280, 40));

        nnameadd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(nnameadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 280, 40));

        lnameadd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(lnameadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 280, 40));

        mnameadd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(mnameadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 280, 40));

        fnameadd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(fnameadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 280, 40));

        addcontactbtn.setText("Add");
        addcontactbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcontactbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addcontactbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 70, -1));

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 70, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Add Contact");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Nickname");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Middle Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        bgpicaddcont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backpicaddconts.png"))); // NOI18N
        getContentPane().add(bgpicaddcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 350));

        jPanel1.setBackground(java.awt.SystemColor.windowBorder);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearAllFields() {
    numadd.setText("");
    fnameadd.setText("");
    mnameadd.setText("");
    lnameadd.setText("");
    nnameadd.setText("");
}
    
    
    private void addcontactbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcontactbtnActionPerformed
    String phnuma = numadd.getText().trim();
    String fnamea = fnameadd.getText().trim();
    String mnamea = mnameadd.getText().trim();
    String lnamea = lnameadd.getText().trim();
    String nnamea = nnameadd.getText().trim();

    // Check if any field exceeds 30 characters
    if (phnuma.length() > 30) {
        JOptionPane.showMessageDialog(this, "Max 30 characters allowed in Phone Number.", "Input Error", JOptionPane.WARNING_MESSAGE);
        clearAllFields();
        return;
    }
    if (fnamea.length() > 30) {
        JOptionPane.showMessageDialog(this, "Max 30 characters allowed in First Name.", "Input Error", JOptionPane.WARNING_MESSAGE);
        clearAllFields();
        return;
    }
    if (mnamea.length() > 30) {
        JOptionPane.showMessageDialog(this, "Max 30 characters allowed in Middle Name.", "Input Error", JOptionPane.WARNING_MESSAGE);
        clearAllFields();
        return;
    }
    if (lnamea.length() > 30) {
        JOptionPane.showMessageDialog(this, "Max 30 characters allowed in Last Name.", "Input Error", JOptionPane.WARNING_MESSAGE);
        clearAllFields();
        return;
    }
    if (nnamea.length() > 30) {
        JOptionPane.showMessageDialog(this, "Max 30 characters allowed in Nickname.", "Input Error", JOptionPane.WARNING_MESSAGE);
        clearAllFields();
        return;
    }

    // Check if phone number contains invalid characters
    if (!phnuma.matches("[0-9+\\-*/]*")) {
        JOptionPane.showMessageDialog(this, "Phone number contains invalid characters. Only digits and '+', '-', '*', '/' are allowed.", "Input Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (phnuma.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Phone number is a required field.", "Missing Fields", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        Connect();

        // Update the SQL query to use the "dateandtimeadded" column
        String sql = "INSERT INTO userinfo (fname, mname, lname, nname, pnum, img, dateandtimeadded) VALUES (?, ?, ?, ?, ?, ?, ?)";
        pst = con.prepareStatement(sql);

        pst.setString(1, fnamea);
        pst.setString(2, mnamea);
        pst.setString(3, lnamea);
        pst.setString(4, nnamea);
        pst.setString(5, phnuma);

        if (selectedImagePath != null) {
            java.io.File imageFile = new java.io.File(selectedImagePath);
            java.io.FileInputStream fis = new java.io.FileInputStream(imageFile);
            pst.setBinaryStream(6, fis, (int) imageFile.length());
        } else {
            pst.setNull(6, java.sql.Types.BLOB);
        }

        // Set the current date and time for the "dateandtimeadded" column
        pst.setTimestamp(7, new java.sql.Timestamp(System.currentTimeMillis()));

        pst.executeUpdate();

        JOptionPane.showMessageDialog(this, "Contact added successfully!");
        this.dispose();

        if (dashboard != null) {
            dashboard.FetchDashboard();
        }

    } catch (SQLException ex) {
        Logger.getLogger(AddContact.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error while adding contact.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (java.io.FileNotFoundException ex) {
        Logger.getLogger(AddContact.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddContact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_addcontactbtnActionPerformed

    private void uploadimgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadimgbtnActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Select an Image");
    chooser.setAcceptAllFileFilterUsed(false);
    
    javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
    chooser.addChoosableFileFilter(filter);
    
    int result = chooser.showOpenDialog(this);
    
    if (result == JFileChooser.APPROVE_OPTION) {
        java.io.File selectedFile = chooser.getSelectedFile();
        selectedImagePath = selectedFile.getAbsolutePath();
        
        javax.swing.ImageIcon imageIcon = new javax.swing.ImageIcon(selectedImagePath);
        java.awt.Image image = imageIcon.getImage().getScaledInstance(imglabel.getWidth(), imglabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
        imglabel.setIcon(new javax.swing.ImageIcon(image));
    } else if (result == JFileChooser.CANCEL_OPTION) {
        JOptionPane.showMessageDialog(this, "No file selected.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_uploadimgbtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void removepictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removepictureActionPerformed
        int response = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to remove the picture?",
        "Confirm Removal",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE
    );

    if (response == JOptionPane.YES_OPTION) {
        imglabel.setIcon(null);
        selectedImagePath = null;

        JOptionPane.showMessageDialog(this, "Picture removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_removepictureActionPerformed

    private void numaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numaddActionPerformed
    
    }//GEN-LAST:event_numaddActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcontactbtn;
    private javax.swing.JLabel bgpicaddcont;
    private javax.swing.JTextField fnameadd;
    private javax.swing.JLabel imglabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnameadd;
    private javax.swing.JTextField mnameadd;
    private javax.swing.JTextField nnameadd;
    private javax.swing.JTextField numadd;
    private javax.swing.JButton removepicture;
    private javax.swing.JButton uploadimgbtn;
    // End of variables declaration//GEN-END:variables
}
