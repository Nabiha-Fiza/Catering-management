/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

/**
 *
 * @author Lenovo
 */
import com.mysql.cj.protocol.Resultset;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import java.sql.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.Statement;

public class profile_cus2 extends javax.swing.JFrame {

    /**
     * Creates new form profile_cus2
     */
    public profile_cus2() {
        initComponents();
        //System.out.println("dfdfds");
    }
     String username1 = "dfgdf";
     
        public profile_cus2 (String uname){
            initComponents();
            username1 = uname ;
            System.out.println(username1);
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            PreparedStatement st = (PreparedStatement)
            con.prepareStatement("select * from caterer1 where name = ?");
            st.setString(1, username1);
            ResultSet res = st.executeQuery();

            if(res.next())
            {       
                    String Fn = res.getString("name");
                    String Em=res.getString("email");
                    int reg=res.getInt("regno");
                    String Phn=res.getString("mobile");
                    String Loc=res.getString("address");
                    String Reg = String.valueOf(reg);
                    
                    fn.setText(Fn);
                    //ln.setText(Ln);
                    em.setText(Em);
                    rg.setText(Reg);
                    phn.setText(Phn);
                    loc.setText(Loc);
                    
            }
            //con.close();
            //rs.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in connection!");
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

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        repass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        eye1 = new javax.swing.JLabel();
        eye2 = new javax.swing.JLabel();
        eye3 = new javax.swing.JLabel();
        eye4 = new javax.swing.JLabel();
        eye5 = new javax.swing.JLabel();
        eye6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name                    :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, -1));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 224, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email                     :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, -1));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 224, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone No             :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, -1));
        jPanel1.add(phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 224, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Location               :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 196, 130, -1));
        jPanel1.add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 224, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Old Password      :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 243, 130, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 224, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("New password      :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 291, 130, -1));
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 224, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Re-write password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 341, -1, -1));

        repass.setText("jPasswordField3");
        jPanel1.add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 224, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 397, 89, 31));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 397, -1, 31));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Reg No                :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));
        jPanel1.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 230, -1));

        eye1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye 2.png")); // NOI18N
        eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye1MousePressed(evt);
            }
        });
        jPanel1.add(eye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 30, 20));

        eye2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye hide 2.png")); // NOI18N
        eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye2MousePressed(evt);
            }
        });
        jPanel1.add(eye2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 30, 20));

        eye3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye 2.png")); // NOI18N
        eye3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye3MousePressed(evt);
            }
        });
        jPanel1.add(eye3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 30, 20));

        eye4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye hide 2.png")); // NOI18N
        eye4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye4MousePressed(evt);
            }
        });
        jPanel1.add(eye4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 20, 20));

        eye5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye 2.png")); // NOI18N
        eye5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye5MousePressed(evt);
            }
        });
        jPanel1.add(eye5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 30, 20));

        eye6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\eye hide 2.png")); // NOI18N
        eye6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eye6MousePressed(evt);
            }
        });
        jPanel1.add(eye6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\cus .jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        String Fn = fn.getText();
        //String Ln = ln.getText();
        String Em = em.getText();
        String Rg = rg.getText();
         int regno = Integer.valueOf(Rg);
        String mobile = phn.getText();
        String Loc = loc.getText();
       
        String np1 = newpass.getText();
        String np2 = repass.getText();
        if(np1.equals(np2))
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
                PreparedStatement st = (PreparedStatement)
                con.prepareStatement("update caterer1 set name=?, email=?, regno=?, mobile=?, address=? ,password=? where name = ?");
                 
                st.setString(1, Fn);
                //st.setString(2, Ln);
                st.setString(2, Em);
                //st.setString(4, Phn);
                st.setInt(3, regno);
                 st.setString(4, mobile);
                st.setString(5, Loc);
                st.setString(6 ,np1);
                
                st.setString(7, username1);
                int res = st.executeUpdate();
                //System.out.println(username1);
                JOptionPane.showMessageDialog(null,"Information successfully updated");
                //con.close();
                //rs.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
         this.hide();
        Login_Form frm=new  Login_Form();
        frm.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye1MousePressed
        // TODO add your handling code here:
        eye2.setVisible(true);
        eye1.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_eye1MousePressed

    private void eye2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye2MousePressed
        // TODO add your handling code here:
        eye1.setVisible(true);
        eye2.setVisible(false);
        pass.setEchoChar('*');
    }//GEN-LAST:event_eye2MousePressed

    private void eye3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye3MousePressed
        // TODO add your handling code here:
        eye4.setVisible(true);
        eye3.setVisible(false);
        newpass.setEchoChar((char)0);
    }//GEN-LAST:event_eye3MousePressed

    private void eye4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye4MousePressed
        // TODO add your handling code here:
          eye3.setVisible(true);
        eye4.setVisible(false);
        newpass.setEchoChar('*');
    }//GEN-LAST:event_eye4MousePressed

    private void eye5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye5MousePressed
        // TODO add your handling code here:
        eye6.setVisible(true);
        eye5.setVisible(false);
        repass.setEchoChar((char)0);
    }//GEN-LAST:event_eye5MousePressed

    private void eye6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye6MousePressed
        // TODO add your handling code here:
          eye5.setVisible(true);
        eye6.setVisible(false);
        repass.setEchoChar('*');
    }//GEN-LAST:event_eye6MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Caterer_portal frm=new  Caterer_portal(username1);
        frm.setVisible(true);
        this.dispose();
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(profile_cus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile_cus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile_cus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile_cus2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile_cus2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField em;
    private javax.swing.JLabel eye1;
    private javax.swing.JLabel eye2;
    private javax.swing.JLabel eye3;
    private javax.swing.JLabel eye4;
    private javax.swing.JLabel eye5;
    private javax.swing.JLabel eye6;
    private javax.swing.JTextField fn;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField loc;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phn;
    private javax.swing.JPasswordField repass;
    private javax.swing.JTextField rg;
    // End of variables declaration//GEN-END:variables
}
