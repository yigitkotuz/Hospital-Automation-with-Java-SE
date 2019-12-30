
package jframe;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {
    
               
   
    public NewJFrame() {
        initComponents();
      this.setLocationRelativeTo(null);
      this.setResizable(false);
      
    }
    
    
  
       public void girisyap(){
       String sql="select *from kisigiris where Sifre =? and TCNo=?";
        String sql1="select *from randevular where TCNo=?";
        String sql2="select *from doktornotlari where hastatcno=?";
       final String TCNo=jTextField1.getText();
           try{Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");
           PreparedStatement pstmt =conn.prepareStatement(sql);
           pstmt.setString(1, new String(jPasswordField1.getPassword()));
           pstmt.setString(2, jTextField1.getText());
            ResultSet rs=null;
            ResultSet rs1=null;
            ResultSet rs2=null;
           rs=pstmt.executeQuery();
               if(rs.next()){
                   JOptionPane.showMessageDialog(null, "Hoşgeldiniz  " + jTextField1.getText(), "Başarılı Giriş\t", JOptionPane.PLAIN_MESSAGE);
                   hasta hst=new hasta();
                   String tcgiris=rs.getString("TCNo");
                   String isim=rs.getString("Isim");
                   String soyisim=rs.getString("Soyisim");
                   String yas=rs.getString("Yas");
                   String telno=rs.getString("TelNo");
                   String il=rs.getString("Il");
                   String ilce=rs.getString("Ilce");
                   String adres=rs.getString("Adres");
                   String eposta=rs.getString("Eposta");
                   String sifre=rs.getString("Sifre");
                   hst.tckn.setText(tcgiris);
                    hst.isim.setText(isim);
                    hst.soyisim.setText(soyisim);
                    hst.yas.setText(yas);
                    hst.telnokutu.setText(telno);
                    hst.ilkutu.setText(il);
                    hst.ilcekutu.setText(ilce);
                    hst.adreskutu.setText(adres);
                    hst.epostakutu.setText(eposta);
                    hst.sifrekutu.setText(sifre);
                   
                   dispose();             
         try{Class.forName("com.mysql.jdbc.Driver");
          Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");
         PreparedStatement pstmt1=conn.prepareStatement(sql1);
         pstmt1.setString(1, jTextField1.getText());
          rs1=pstmt1.executeQuery();
               if(rs1.next()){
                   
                   String polikinlik=rs1.getString("RandevuKlinik");
                   hst.polikinlikcombo.addItem(polikinlik); 
                    String d =rs1.getString("RandevuTarih");
                    hst.a2.setText(d);   
                     try{Class.forName("com.mysql.jdbc.Driver");
          Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");
         PreparedStatement pstmt2=conn.prepareStatement(sql2);
         pstmt2.setString(1, jTextField1.getText());
          rs2=pstmt2.executeQuery();
               if(rs2.next()){
                    String hastanotozel =rs2.getString("hastanotozel");
                    hst.doktornotgor.setText(hastanotozel);  
                    hst.setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null, "Tanimlanamayan ID veya Sifre\t" + jTextField1.getText(), "Basarisiz Giris", JOptionPane.ERROR_MESSAGE);
               }
               
           }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
    }
               }
               else{
                   JOptionPane.showMessageDialog(null, "Randevunuz Bulunmamaktadır  " + jTextField1.getText(), "Randevu Alınız", JOptionPane.ERROR_MESSAGE);
                  
                   hst.setVisible(true);
               }
               
           }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
   }  
                  
               }
               else{
                  JOptionPane.showMessageDialog(null, "Tanimlanamayan ID veya Sifre   " + jTextField1.getText(), "Başarısız Giriş", JOptionPane.ERROR_MESSAGE);
               }
               conn.close();
           }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
   }  
   }
   
   public void kayitol(){
       new kayitol().setVisible(true);
   
   }
  
   
   
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Hasta Kayıt Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 190, 30));

        jButton2.setText("Giriş Yap");
        jButton2.setToolTipText("");
        jButton2.setAlignmentY(1000.0F);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(913, 889));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 90, 50));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 106, 405, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 57, 402, 31));

        jLabel1.setText("TC NO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, -1, -1));

        jLabel2.setText("ŞİFRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 109, -1, -1));

        jButton3.setText("Kayıt Ara");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, 40));

        jLabel3.setText("Hasta Giriş Ekranı");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton4.setText("Doktor Giriş");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 190, 30));

        jButton5.setText("Kayıt Sil");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe/resimler/kalp (490 x 385).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        kayitol();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
          girisyap();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        kayitara kayit =new kayitara();
        kayit.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new doktorekranigiris().setVisible(true);   
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    new kayitsil().setVisible(true); 
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
