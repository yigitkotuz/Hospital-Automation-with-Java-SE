/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yiğit
 */
public class hasta extends javax.swing.JFrame {
   
    /**
     * Creates new form hasta
     */
    public hasta() {
        initComponents();
        ComboGetir();
        this.setLocationRelativeTo(null);
      this.setResizable(false);
       
    }
    interface hastaguncelle{
           public void guncelleme();
    }
    class hastam implements hastaguncelle{
        public void guncelleme(){
            String sql="UPDATE kisigiris set Isim=?,Soyisim=?,Yas=?,TelNo=?,Il=?,Ilce=?,Adres=?,Eposta=?,Sifre=? where TCNo=?";
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");    
            PreparedStatement pstmt=conn.prepareStatement(sql);
            
            pstmt.setString(1, isim.getText());
            pstmt.setString(2, soyisim.getText());
            pstmt.setInt(3, Integer.parseInt(yas.getText())) ;
             pstmt.setString(4, telnokutu.getText());
             pstmt.setString(5, ilkutu.getText());
            pstmt.setString(6, ilcekutu.getText());
            pstmt.setString(7, adreskutu.getText());
            pstmt.setString(8, epostakutu.getText());
            pstmt.setInt(9, Integer.parseInt(sifrekutu.getText()));
            pstmt.setString(10, tckn.getText());
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "İslem Basarili");
             conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
           
        }
    }
   
     public void ComboGetir(){
        try{
            String sql="select *from doktorgiris";
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");
           PreparedStatement pstmt =conn.prepareStatement(sql);
           ResultSet rs =pstmt.executeQuery();
           while(rs.next()){
               String polikinlik=rs.getString("Polikinlik");
              jComboBox1.addItem(polikinlik);
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void hastarandevukayit(){
       String sql="select *from kisigiris where Sifre =? and TCNo=?";
     
           try{Class.forName("com.mysql.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");
           PreparedStatement pstmt =conn.prepareStatement(sql);
           pstmt.setString(1, new String(jPasswordField1.getPassword()));
           pstmt.setString(2, jTextField1.getText());
               ResultSet rs =pstmt.executeQuery();
               if(rs.next()){
                       
                           PreparedStatement iceri = conn.prepareStatement("INSERT INTO randevular(RandevuKlinik, RandevuTarih,TCNo,Sifre) VALUES (?, ?,?,?)");
                           iceri.setString(1, (String)jComboBox1.getSelectedItem());
                           java.util.Date utilDate = jDateChooser1.getDate();
                           java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                            iceri.setDate(2, sqlDate);
                            iceri.setString(3, jTextField1.getText());
                            iceri.setString(4, new String(jPasswordField1.getPassword()));
                            iceri.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Basarili Ekleme  " + jTextField1.getText(), "Basarili", JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                   JOptionPane.showMessageDialog(null, "Tanimlanamayan ID veya Sifre\t" + jTextField1.getText(), "Basarisiz Giris", JOptionPane.ERROR_MESSAGE);
               }
               conn.close();
           }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
   }    
   }
   
    
                
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        polikinlikcombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        a2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doktornotgor = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ilkutu = new javax.swing.JTextField();
        il = new javax.swing.JLabel();
        yas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ilcekutu = new javax.swing.JTextField();
        ilce = new javax.swing.JLabel();
        sifrekutu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        adreskutu = new javax.swing.JTextField();
        adres = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        epostakutu = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        soyisim = new javax.swing.JTextField();
        isim = new javax.swing.JTextField();
        telnokutu = new javax.swing.JTextField();
        telno = new javax.swing.JLabel();
        tckn = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        polikinlikcombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        polikinlikcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        polikinlikcombo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel6.setText("Polikinlik:");

        jLabel7.setText("Tarih:");

        a2.setEnabled(false);

        jLabel5.setText("Lütfen Randevu Saatinden 1 Saat Önce Sırada Olunuz");

        jLabel10.setText("Hoşgeldiniz ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(13, 13, 13)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(polikinlikcombo, 0, 194, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)))))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(polikinlikcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Randevularımı Gör", jPanel1);

        doktornotgor.setColumns(20);
        doktornotgor.setRows(5);
        jScrollPane1.setViewportView(doktornotgor);

        jLabel8.setText("Doktor Notu :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Doktor Notunu Gör", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 87, 227, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 122, 227, -1));

        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 37, 227, -1));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 157, 227, -1));

        jLabel1.setText("Polikinlik Seçiniz:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 40, -1, -1));

        jLabel2.setText("Tarih Seçiniz:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, -1, -1));

        jLabel3.setText("TCNo:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 125, -1, -1));

        jLabel4.setText("Şifre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 160, -1, -1));

        jButton1.setText("Randevu Oluştur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jTabbedPane4.addTab("Randevu Al", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(ilkutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 175, 290, 30));

        il.setText("İl:");
        jPanel5.add(il, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 178, -1, -1));
        jPanel5.add(yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 117, 290, 30));

        jLabel13.setText("Soyisim:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 88, -1, -1));
        jPanel5.add(ilcekutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 204, 290, 30));

        ilce.setText("İlçe:");
        jPanel5.add(ilce, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 207, -1, -1));
        jPanel5.add(sifrekutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 291, 290, 30));

        jLabel14.setText("TCKN:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 16, -1, -1));
        jPanel5.add(adreskutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 233, 290, 30));

        adres.setText("Adres:");
        jPanel5.add(adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 236, -1, -1));

        jLabel15.setText("Sifre:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 294, -1, -1));

        jLabel16.setText("Yaş:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 120, -1, -1));
        jPanel5.add(epostakutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 262, 290, 30));

        jButton2.setText("Kayıt Güncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel17.setText("E-Posta:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 265, -1, -1));

        jButton3.setText("Geri Don");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));
        jPanel5.add(soyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 82, 290, 30));

        isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimActionPerformed(evt);
            }
        });
        jPanel5.add(isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 53, 290, 30));
        jPanel5.add(telnokutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 146, 290, 30));

        telno.setText("TelefonNo:");
        jPanel5.add(telno, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 146, -1, -1));

        tckn.setEnabled(false);
        tckn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcknActionPerformed(evt);
            }
        });
        jPanel5.add(tckn, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 13, 290, 30));

        jLabel18.setText("İsim :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 56, -1, -1));

        jTabbedPane4.addTab("Kayıt Güncelle", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    hastarandevukayit();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
hastam hstg=new hastam();
hstg.guncelleme();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        NewJFrame jfr=new NewJFrame();
        jfr.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimActionPerformed

    private void tcknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcknActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hasta().setVisible(true);
                hasta hst=new hasta();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField a2;
    private javax.swing.JLabel adres;
    public javax.swing.JTextField adreskutu;
    public javax.swing.JTextArea doktornotgor;
    public javax.swing.JTextField epostakutu;
    private javax.swing.JLabel il;
    private javax.swing.JLabel ilce;
    public javax.swing.JTextField ilcekutu;
    public javax.swing.JTextField ilkutu;
    public javax.swing.JTextField isim;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JComboBox polikinlikcombo;
    public javax.swing.JTextField sifrekutu;
    public javax.swing.JTextField soyisim;
    public javax.swing.JTextField tckn;
    private javax.swing.JLabel telno;
    public javax.swing.JTextField telnokutu;
    public javax.swing.JTextField yas;
    // End of variables declaration//GEN-END:variables
}
