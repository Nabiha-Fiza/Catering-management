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
import java.sql.*;
import javax.swing.JOptionPane;
public class Forgotpass extends javax.swing.JFrame {

    /**
     * Creates new form Forgotpass
     */
    public Forgotpass() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        sq = new javax.swing.JTextField();
        ans = new javax.swing.JTextField();
        newpass = new javax.swing.JTextField();
        fsearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fsearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Security Question");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Answer");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 240, -1));
        jPanel1.add(sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 240, -1));
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 240, -1));

        newpass.setEnabled(false);
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 240, -1));

        fsearch.setBackground(new java.awt.Color(153, 255, 153));
        fsearch.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        fsearch.setText("Search");
        fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchActionPerformed(evt);
            }
        });
        jPanel1.add(fsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("C A T E R .com");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 346, 140, 20));

        fsearch1.setBackground(new java.awt.Color(153, 255, 153));
        fsearch1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        fsearch1.setText("OK");
        fsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearch1ActionPerformed(evt);
            }
        });
        jPanel1.add(fsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearch1ActionPerformed
        // TODO add your handling code here:
        String Ans = ans.getText();
        String name = fname.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            PreparedStatement st = (PreparedStatement)
            con.prepareStatement("select * from caterer1 where name = ?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();

            if(rs.next())
            {
                String qstn = rs.getString("secuirityq");
                String ans = rs.getString("secuirityans");
                sq.setText(qstn);
                if(ans.equals(Ans))
                    newpass.setEnabled(true);
                //JOptionPane.showMessageDialog(null,"Your Password is successfully updated!");
                //setVisible(false);
                //new Login_Form().setVisible(true);
            }
            else
            JOptionPane.showMessageDialog(null,"Please write correct username or answer.");
            //con.close();
            //rs.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in connection!");
        }
    }//GEN-LAST:event_fsearch1ActionPerformed

    private void fsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchActionPerformed
        // TODO add your handling code here:
        String name=fname.getText();

        String secuirityq=sq.getText();
        String secuirityans=ans.getText();
        String password=newpass.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            PreparedStatement st = (PreparedStatement)
            con.prepareStatement("select * from caterer1 where name = ?");
            st.setString(1, name);
            ResultSet rs = st.executeQuery();

            if(rs.next())
            {
                String qstn = rs.getString("secuirityq");
                String ans = rs.getString("secuirityans");
                sq.setText(qstn);
                //st.executeUpdate("update set password='"+password+"'where name='"+name+"'and secuirityans='"+secuirityans+"'");
                //JOptionPane.showMessageDialog(null,"Your Password is successfully updated!");
                //setVisible(false);
                //new Login_Form().setVisible(true);
            }
            else
            JOptionPane.showMessageDialog(null,"Please write correct username or answer.");
            //con.close();
            //rs.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in connection!");
        }
    }//GEN-LAST:event_fsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String np = newpass.getText();
        String name = fname.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            System.out.println(np);
            PreparedStatement st = (PreparedStatement)
                con.prepareStatement("UPDATE caterer1 SET password = ? WHERE name = ?");
            st.setString(1, np);
            st.setString(2, name);
            int rs = st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Your Password is successfully updated!");
            new Login_Form().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in connection!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Login_Form().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgotpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgotpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JTextField fname;
    private javax.swing.JButton fsearch;
    private javax.swing.JButton fsearch1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField sq;
    // End of variables declaration//GEN-END:variables
}
