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
public class Online_delivery extends javax.swing.JFrame {

    /**
     * Creates new form Online_delivery
     */
     
     Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public Online_delivery() {
        initComponents();
         update_table();
    }
    String cname = "" ;
    public Online_delivery(String Cname) {
        initComponents();
       //conn=javaconnect.ConnecrDb();
        cname = Cname ;
       update_table();
    }
    
private void update_table(){
    int rg = -1 ;
        try{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
        PreparedStatement st = (PreparedStatement) 
                con1.prepareStatement("Select * from caterer1 where name = ?");
        st.setString(1, cname);
        ResultSet res = st.executeQuery();
        if(res.next()) {
           
           rg = res.getInt("regno");
  
        }
        } 
           catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
                 
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
        String sql="select * from chef where regno=?";
        pst=conn.prepareStatement(sql);
       pst.setInt(1, rg);
        rs=pst.executeQuery();
        Tablemouse.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
        catch(Exception e){
           
            JOptionPane.showMessageDialog(null,e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        phn = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablemouse = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\project image\\chef bar 2.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name       :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID              :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Email         :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Phone No :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Speciality :");

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(0, 102, 102));
        addbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(0, 102, 102));
        editbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        dltbtn.setBackground(new java.awt.Color(0, 102, 102));
        dltbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dltbtn.setForeground(new java.awt.Color(255, 255, 255));
        dltbtn.setText("Delete");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 0, 0));
        backbtn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Reg No    :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d)
                            .addComponent(mail)
                            .addComponent(phn)
                            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(nm, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(backbtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dltbtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(editbtn)
                    .addComponent(dltbtn))
                .addGap(28, 28, 28)
                .addComponent(backbtn)
                .addGap(28, 28, 28))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 590));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Tablemouse.setBackground(new java.awt.Color(255, 102, 255));
        Tablemouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "REG NO", "NAME", "ID", "EMAIL", "PHONE NO", "SPECIALITY"
            }
        ));
        Tablemouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablemouseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablemouse);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 440, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  Connection con1;
  PreparedStatement insert;
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        int rgi = -1 ;
        try{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
        PreparedStatement st = (PreparedStatement) 
                con1.prepareStatement("Select * from caterer1 where name = ?");
        st.setString(1, cname);
        ResultSet res = st.executeQuery();
        if(res.next()) {
           
           rgi = res.getInt("regno");
  
        }
        } 
           catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
          String regno =rg.getText();
         String name =nm.getText();
        String id =d.getText();
        String email =mail.getText();
        String mobile =phn.getText();
        String speciality =sp.getText();
  java.sql.PreparedStatement push;
       // String photo =txtphoto2.getText();
       // String username =txtousername1.getText();
       if(regno.isEmpty()||name.isEmpty()||id.isEmpty()||email.isEmpty()||mobile.isEmpty()||speciality.isEmpty()){
            JOptionPane.showMessageDialog(this,"Every field must be filled up.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
             
                //Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
               
                //con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
               
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
                 insert = con1.prepareStatement("Select * from caterer1 WHERE regno = ? ");
            insert.setString(1,regno);
            
            
            
            ResultSet res = insert.executeQuery();
            if(res.next()){
               push = con1.prepareStatement("insert into chef (regno,name,id,email,mobile,speciality)values(?,?,?,?,?,?)");
               push.setString(1,regno);
               push.setString(2,name);
               push.setString(3,id);
               push.setString(4,email);
               push.setString(5,mobile);
               push.setString(6,speciality);
               
               //push.setBytes(7,photo);

            
              push.executeUpdate();
              JOptionPane.showMessageDialog(this, "Record Saved");
            
           rg.setText(""); 
           nm.setText("");
            d.setText("");
            mail.setText("");
            phn.setText("");
            sp.setText("");
            
            //txtphoto2.setText("");
            rg.requestFocus();
            update_table();
            //table_show();
            }
            else{
                JOptionPane.showMessageDialog(this,"Registration not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
             
            }
            catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void TablemouseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablemouseMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // FetchPhoto();
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
           String query="select * from chef where id="+tc+"";
           insert=con1.prepareStatement(query);
           ResultSet rs=insert.executeQuery();
           
            String  regno=rs.getString("regno"); 
              String name=rs.getString("name");
               String id=rs.getString("id");
              String email=rs.getString("email");
              
              String mobile=rs.getString("mobile");
              String speciality=rs.getString("speciality");
              //byte[] image=rs.getBytes("photo");
              //format =new ImageIcon(image);
              //txtphoto1.setIcon(format);
              rg.setText(regno);
              nm.setText(name);
               d.setText(""+id);
              mail.setText(email);
              phn.setText(mobile);
              sp.setText(speciality);
              //txtolocation.setText(location);
              //txtofees.setText(fees);
              //txtofacilities.setText(facilities);
              //txtphoto2.setText(photo1);
              insert.close();
              rs.close();
             
              
             
           
        }
        catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }


         rg.setText(Df.getValueAt(selectedIndex, 0).toString()); 
         nm.setText(Df.getValueAt(selectedIndex, 1).toString());
        //  tc=Table1.getModel().getValueAt(selectedIndex, 1).toString();
         d.setText(Df.getValueAt(selectedIndex, 2).toString());
       // tc=Integer.valueOf(Df.getValueAt(selectedIndex, 1).toString());
         mail.setText(Df.getValueAt(selectedIndex, 3).toString());
         phn.setText(Df.getValueAt(selectedIndex, 4).toString());
         sp.setText(Df.getValueAt(selectedIndex, 5).toString());
         //txtolocation.setText(Df.getValueAt(selectedIndex, 3).toString());
         //txtofees.setText(Df.getValueAt(selectedIndex, 4).toString());
         //txtofacilities.setText(Df.getValueAt(selectedIndex, 5).toString());
        //txtphoto2.setText(Df.getValueAt(selectedIndex, 6).toString());
         
    }//GEN-LAST:event_TablemouseMouseClicked

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel) Tablemouse.getModel();
         int selectedIndex = Tablemouse.getSelectedRow();
         String regno =rg.getText();
        String name =nm.getText();
        String id =d.getText();
        String email =mail.getText();
        String mobile =phn.getText();
        String speciality =sp.getText();
    
        if(regno.isEmpty()||name.isEmpty()||id.isEmpty()||email.isEmpty()||mobile.isEmpty()||speciality.isEmpty()){
            JOptionPane.showMessageDialog(this,"Every field must be filled up.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
        
            try {
                
               
           
 
            //Class.forName("com.mysql.cj.jdbc.Driver");
             //con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
             con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
            insert = con1.prepareStatement("Select * from caterer1 WHERE regno = ?");
            insert.setString(1,regno);
            //insert.setString(2,id);
             ResultSet res = insert.executeQuery();
            if(res.next()){
              int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete the record","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           
            insert = con1.prepareStatement("delete from chef where id = ? and regno = ?");
           
           insert.setString(1, id);
           insert.setString(2, regno);
           // insert.setInt(1,id); for auto 
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Delete");
           rg.setText("");
            nm.setText("");
            d.setText("");
            mail.setText("");
            phn.setText("");
            sp.setText("");
          
           // txtphoto1.setText("");
            rg.requestFocus();
            table_show();
            update_table();
            }
          
           
          }
            else{
                 JOptionPane.showMessageDialog(this,"Registration No not matched", "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
          
            
             catch (ClassNotFoundException ex) {
               
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Change Package id", "Error", JOptionPane.ERROR_MESSAGE);
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            
    }                  
    }//GEN-LAST:event_dltbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        this.hide();
        Caterer_portal frm=new Caterer_portal(cname);
        frm.setVisible(true);
         //this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        java.sql.PreparedStatement push;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
             String value1=rg.getText();
            String value2=nm.getText();
            String value3=d.getText();
            String value4=mail.getText();
            String value5=phn.getText();
            String value6=sp.getText();
            String sql="update chef set regno='"+value1+"',name='"+value2+"',id='"+value3+"',email='"+value4+"',mobile='"+value5+"',speciality='"+value6+"' where id='"+value3+"' and regno='"+value1+"'";
            push=con1.prepareStatement(sql);   
            push.execute();
            JOptionPane.showMessageDialog(null,"Updated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        update_table();
    }//GEN-LAST:event_editbtnActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed
     private void table_show() {
           int c;
           try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo2","root","");
           insert = con1.prepareStatement("SELECT * FROM chef");
           ResultSet Rs = insert.executeQuery();
            ResultSetMetaData Rss = Rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) Tablemouse.getModel();
            Df.setRowCount(0);
            while (Rs.next()) {
                Vector v2 = new Vector();
          
                for (int ii = 1; ii <= c; ii++) {
                    v2.add(Rs.getString("regno"));
                    v2.add(Rs.getString("name"));
                    v2.add(Rs.getString("id"));
                    v2.add(Rs.getString("email"));
                    v2.add(Rs.getString("mobile"));
                    v2.add(Rs.getString("speciality"));
                   
                    //v2.add(Rs.getString("location"));
                      
                }
              
                Df.addRow(v2);
            }

            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
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
            java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Online_delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Online_delivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablemouse;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField d;
    private javax.swing.JButton dltbtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField phn;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField sp;
    // End of variables declaration//GEN-END:variables
}
