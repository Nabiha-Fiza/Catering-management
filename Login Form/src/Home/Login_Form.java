/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Login_Form extends javax.swing.JFrame {

    /**
     * Creates new form Login_Form
     */
    DBConnection conn;
    public Login_Form() {
        initComponents();
        this.eye2.setVisible(false);
        conn=new DBConnection();
        if(conn==null){
            JOptionPane.showMessageDialog(this,"DB Connection not avialable.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        signin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        pas = new javax.swing.JPasswordField();
        eye1 = new javax.swing.JLabel();
        eye2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        fpass = new javax.swing.JButton();
        cussignin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));

        jLabel8.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("C A T E R . COM");

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("WELCOME");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\image_1-removebg-preview.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 350));

        jPanel3.setBackground(new java.awt.Color(174, 214, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 153, 250, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(149, 165, 166));
        jLabel6.setText(" X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 100, 30));

        signin.setBackground(new java.awt.Color(0, 153, 153));
        signin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 255, 255));
        signin.setText("Caterer?Sign in");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel3.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\unlock icon.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\usericon.png")); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 30, 30));

        nm.setText("Username");
        nm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nmFocusGained(evt);
            }
        });
        nm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmMouseClicked(evt);
            }
        });
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        jPanel3.add(nm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 250, -1));

        pas.setText("jPasswordField1");
        pas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pasFocusGained(evt);
            }
        });
        jPanel3.add(pas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 250, -1));

        eye1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye 2.png")); // NOI18N
        eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye1MousePressed(evt);
            }
        });
        jPanel3.add(eye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 20));

        eye2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye hide 2.png")); // NOI18N
        eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye2MousePressed(evt);
            }
        });
        jPanel3.add(eye2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 250, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 250, 20));

        fpass.setBackground(new java.awt.Color(0, 153, 153));
        fpass.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fpass.setForeground(new java.awt.Color(255, 255, 255));
        fpass.setText("Forget Password?");
        fpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpassActionPerformed(evt);
            }
        });
        jPanel3.add(fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 190, -1));

        cussignin.setBackground(new java.awt.Color(0, 153, 153));
        cussignin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        cussignin.setForeground(new java.awt.Color(255, 255, 255));
        cussignin.setText("Customer?Sign in");
        cussignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cussigninActionPerformed(evt);
            }
        });
        jPanel3.add(cussignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 160, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\back image 2.jpg")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 350));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 390, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Custom_login x=new Custom_login();
        x.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nmMouseClicked

    private void nmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nmFocusGained
       nm.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_nmFocusGained

    private void pasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pasFocusGained
        pas.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_pasFocusGained

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void eye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye1MousePressed
        eye2.setVisible(true);
        eye1.setVisible(false);
        pas.setEchoChar((char)0);// TODO add your handling code here:
    }//GEN-LAST:event_eye1MousePressed

    private void eye2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye2MousePressed
        eye1.setVisible(true);
        eye2.setVisible(false);
        pas.setEchoChar('*');// TODO add your handling code here:
    }//GEN-LAST:event_eye2MousePressed
 Connection con1;
 PreparedStatement insert;
    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
      
     String name=nm.getText();
      String password=pas.getText();
      if(name.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username / Password should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            insert = con1.prepareStatement("Select * from caterer1 WHERE name = ? AND password = ?");
            //insert = con1.prepareStatement("Select * from customer WHERE name = ? AND password = ?");
            insert.setString(1,name);
            insert.setString(2,password);
            
            ResultSet res = insert.executeQuery();
            if(res.next()){
                dispose();
                new  Caterer_portal(name).setVisible(true);
                
            }
            else{
                 JOptionPane.showMessageDialog(this,"Username / Password not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
      
      
    }//GEN-LAST:event_signinActionPerformed

    private void fpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpassActionPerformed
           Forgotcuscat y=new  Forgotcuscat();
        y.setVisible(true);// TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_fpassActionPerformed
    static public String us="";
    private void cussigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cussigninActionPerformed
        // TODO add your handling code here:
        String lname=nm.getText();
        String pass=pas.getText();
        if(lname.isEmpty()||pass.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username / Password should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            insert = con1.prepareStatement("Select * from customer WHERE lname = ? AND pass = ?");
            //insert = con1.prepareStatement("Select * from customer WHERE name = ? AND password = ?");
            insert.setString(1,lname);
            insert.setString(2,pass);
            
            ResultSet res = insert.executeQuery();
            if(res.next()){
                String username = nm.getText();
                us = username;
                new Map(username).setVisible(true);
                this.setVisible(false);
            }
            else{
                 JOptionPane.showMessageDialog(this,"Username / Password not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
      
        
    }//GEN-LAST:event_cussigninActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cussignin;
    private javax.swing.JLabel eye1;
    private javax.swing.JLabel eye2;
    private javax.swing.JButton fpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nm;
    private javax.swing.JPasswordField pas;
    private javax.swing.JButton signin;
    // End of variables declaration//GEN-END:variables
//private void userLogin(String username,String password){
    //throw new UnsupportOperationExcept("Not supported yet.");
/*    Connection dbconn= DBConnection.connectDB();
    PreparedStatement st=(preparedStatement) 
            dbconn.preparedStatement("Select * from users");*/

}