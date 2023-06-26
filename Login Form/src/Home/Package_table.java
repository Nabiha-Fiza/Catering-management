/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;
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
import java.sql.ResultSetMetaData;

/**
 *
 * @author Lenovo
 */
public class Package_table extends javax.swing.JFrame {

    /**
     * Creates new form Package_table
     */
    static String user = Login_Form.us;
    public Package_table(){
        initComponents();
    }
    public String uname="";
    public Package_table(String sm){
        uname=sm;
        initComponents();
    }
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int cname = -1 ;
    public Package_table(int Cname) {


        initComponents();
       //table_show();
         cname = Cname ;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
        con = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
        pst=con.prepareStatement("select id , name ,detail, price , mobile from package where regno = ?");
        pst.setInt(1, cname);
        rs=pst.executeQuery();
        DefaultTableModel dtm=(DefaultTableModel)Tablemouse.getModel();
        dtm.setRowCount(0);
        while(rs.next()){
            String id = String.valueOf(rs.getInt("id"));
            String name = rs.getString("name");
            String detail = rs.getString("detail");
            String price = String.valueOf( rs.getFloat("price"));
            String phn = rs.getString("mobile");
            String tbdata[] = {id, name, detail, price, phn} ;    
            dtm.addRow(tbdata);
            
        }
        //v2.add(Rs.getString("location"));
                      
                
    }
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,ex);
                java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablemouse = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        g = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Package Table");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 19, -1, -1));

        Tablemouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "DETAILS", "PRICE", "MOBILE"
            }
        ));
        Tablemouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablemouseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablemouse);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Package ID       :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 89, 116, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Package Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 129, 116, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price                 :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Quantity           :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 156, -1));
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 156, -1));
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 156, -1));

        d.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dStateChanged(evt);
            }
        });
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 156, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("Add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, 36));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Go to cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 117, 36));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 96, 36));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mobile              :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address            :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 107, -1));
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 156, -1));
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 156, -1));

        g.setColumns(20);
        g.setRows(5);
        jScrollPane2.setViewportView(g);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 170, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Details               :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        Customer_portal frm=new Customer_portal(cname);

        frm.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
 Connection con1;
  PreparedStatement insert;
    private void TablemouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablemouseMouseClicked
        // TODO add your handling code here:
         DefaultTableModel Df = (DefaultTableModel) Tablemouse.getModel();
        int selectedIndex = Tablemouse.getSelectedRow();
        
       
        // txtphoto1.setIcon(Df.getValueAt(selectedIndex, 6).toString());
       // txtphoto1.setIcon(format);
          
        
        // FetchPhoto();
         
      //  int row=Table1.getSelectedRow();
       int vv=Tablemouse.getSelectedColumn();
       String tc=Tablemouse.getModel().getValueAt(selectedIndex, 1).toString();
       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
           String query="select * from package where id="+tc+"";
           insert=con1.prepareStatement(query);
           ResultSet rs=insert.executeQuery();
           
             if(rs.next()){
           //String regno=rs.getString("regno");
           String id=rs.getString("id");
           String name=rs.getString("name");
           String detail=rs.getString("detail");
           
           String price=rs.getString("price");
           //String mobile=rs.getString("mobile");
           
           
              
              //String photo1=rs.getString("photo");
              //byte[] image=rs.getBytes("photo");
              //format =new ImageIcon(image);
              //txtphoto1.setIcon(format);
              //rg.setText(regno);
             a.setText(""+id);
              b.setText(name);
              g.setText(detail);
               
              c.setText(price);
              //phn.setText(mobile);
              
              //txtolocation.setText(location);
              //txtofees.setText(fees);
              //txtofacilities.setText(facilities);
              //txtphoto2.setText(photo1);
              insert.close();
              rs.close();
             }
              
             
           
        }
        catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }


           //rg.setText(Df.getValueAt(selectedIndex, 0).toString());
           a.setText(Df.getValueAt(selectedIndex, 0).toString());
         b.setText(Df.getValueAt(selectedIndex, 1).toString());
        //  tc=Table1.getModel().getValueAt(selectedIndex, 1).toString();
         g.setText(Df.getValueAt(selectedIndex, 2).toString());
       // tc=Integer.valueOf(Df.getValueAt(selectedIndex, 1).toString());
         c.setText(Df.getValueAt(selectedIndex, 3).toString());
         //txtolocation.setText(Df.getValueAt(selectedIndex, 3).toString());
         //phn.setText(Df.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_TablemouseMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = b.getText();
        //            //String bid = jTextField6.getText();
        int qty = (Integer)d.getValue();
        //            try {
       
        //                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
//            } catch (ClassNotFoundException ex) {
//                java.util.logging.Logger.getLogger(Menu_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//            Connection conX = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
          String mis= a.getText();
          int mi =Integer.parseInt(mis);
          
//            String mn = b.getText();
      String prs= c.getText();
        float pr = Float.parseFloat(prs);
         InsertToCart(name, qty,mi,pr);
        String show = name+" is added to cart" ;
        JOptionPane.showMessageDialog(this,show,"Success",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dStateChanged
        // TODO add your handling code here:
        String packagename=b.getText();
        int v=(Integer)d.getValue();
        int op=QueryPrice(packagename);
        int str=op*v;
       String ss=String.valueOf(str);
       c.setText(ss);
    }//GEN-LAST:event_dStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Cart2(cname).setVisible(true);
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
            java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Package_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Package_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablemouse;
    public static javax.swing.JTextField a;
    public static javax.swing.JTextField b;
    public static javax.swing.JTextField c;
    private javax.swing.JSpinner d;
    public static javax.swing.JTextField e;
    public static javax.swing.JTextField f;
    private javax.swing.JTextArea g;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void InsertToCart(String pn, int quantity,int pid,float price) {
        String pp = c.getText();
        String mobile=e.getText();
        String address =f.getText();
        int p_id = pid ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
        con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
//            PreparedStatement st = (PreparedStatement) 
//                con1.prepareStatement("select * from package where name=? and price=?");
//                st.setString(1,pn);
//                st.setString(2,pp);
//                ResultSet res = st.executeQuery();
//                if(res.next()) {
//                    p_id = res.getInt("id") ;
//                }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try{
        PreparedStatement st = (PreparedStatement) 
                con1.prepareStatement("INSERT INTO package_table (pid, pquan, username, mobile, address,price) VALUES (?,?,?,?,?,?)");
        
        int q = Integer.valueOf(quantity);
        
        st.setInt(1, p_id);
        st.setInt(2, q);
        st.setString(3, user);
        st.setString(4, mobile);
        st.setString(5, address);
        st.setFloat(6, price);
        
        int res = st.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    private int QueryPrice(String packagename) {
        int pr = 1 ;
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            pst = con1.prepareStatement("select * from package where name = ?");
         
      
       pst.setString(1, packagename);
        
        ResultSet res = pst.executeQuery();
        if(res.next()) {
            //String book_id = String.valueOf(res.getInt("b_id"));
            String price = String.valueOf(res.getInt("price"));
            
                pr = Integer.valueOf(price);
        }
        } 
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return pr ;
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}