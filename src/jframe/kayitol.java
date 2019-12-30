/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Yiğit
 */
public class kayitol extends javax.swing.JFrame {

    /**
     * Creates new form kayitol
     */
    public kayitol() {
        initComponents();
        this.setLocationRelativeTo(null);
      this.setResizable(false);
    }
  
        
   public void kayitolhasta(){ 
       String sql="insert into kisigiris values(?,?,?,?,?,?,?,?,?,?)";
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useTimezone=true&serverTimezone=UTC", "root", "123321aA");    
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, tckn.getText());
            pstmt.setString(2, isim.getText());
            pstmt.setString(3, soyisim.getText());
            pstmt.setInt(4, Integer.parseInt(yas.getText())) ;
             pstmt.setString(5, telnokutu.getText());
             pstmt.setString(6, ilkutu.getText());
            pstmt.setString(7, ilcekutu.getText());
            pstmt.setString(8, adreskutu.getText());
            pstmt.setString(9, epostakutu.getText());
            pstmt.setInt(10, Integer.parseInt(sifrekutu.getText()));
  
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "İslem Basarili");
             conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog3 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog4 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog5 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog6 = new datechooser.beans.DateChooserDialog();
        jButton1 = new javax.swing.JButton();
        isim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soyisim = new javax.swing.JTextField();
        tckn = new javax.swing.JTextField();
        yas = new javax.swing.JTextField();
        sifrekutu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telno = new javax.swing.JLabel();
        il = new javax.swing.JLabel();
        ilce = new javax.swing.JLabel();
        adres = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        telnokutu = new javax.swing.JTextField();
        ilkutu = new javax.swing.JTextField();
        ilcekutu = new javax.swing.JTextField();
        adreskutu = new javax.swing.JTextField();
        epostakutu = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Kayıt Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimActionPerformed(evt);
            }
        });
        getContentPane().add(isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 229, -1));

        jLabel1.setText("İsim :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setText("Soyisim:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("TCKN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setText("Yaş:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        getContentPane().add(soyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 229, -1));

        tckn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcknActionPerformed(evt);
            }
        });
        getContentPane().add(tckn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 229, -1));
        getContentPane().add(yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 229, -1));
        getContentPane().add(sifrekutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 229, -1));

        jLabel6.setText("Sifre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 385, -1, -1));

        telno.setText("TelefonNo:");
        getContentPane().add(telno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        il.setText("İl:");
        getContentPane().add(il, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        ilce.setText("İlçe:");
        getContentPane().add(ilce, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        adres.setText("Adres:");
        getContentPane().add(adres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel8.setText("E-Posta:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        getContentPane().add(telnokutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 229, -1));
        getContentPane().add(ilkutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 229, -1));
        getContentPane().add(ilcekutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 229, -1));
        getContentPane().add(adreskutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 229, -1));
        getContentPane().add(epostakutu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 229, -1));

        jButton2.setText("Geri Don");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe/resimler/kayitarka (350 x 400).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kayitolhasta();
        
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tcknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcknActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcknActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        NewJFrame jfr=new NewJFrame();
        jfr.setVisible(true);// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayitol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayitol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adres;
    private javax.swing.JTextField adreskutu;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private datechooser.beans.DateChooserDialog dateChooserDialog3;
    private datechooser.beans.DateChooserDialog dateChooserDialog4;
    private datechooser.beans.DateChooserDialog dateChooserDialog5;
    private datechooser.beans.DateChooserDialog dateChooserDialog6;
    private javax.swing.JTextField epostakutu;
    private javax.swing.JLabel il;
    private javax.swing.JLabel ilce;
    private javax.swing.JTextField ilcekutu;
    private javax.swing.JTextField ilkutu;
    private javax.swing.JTextField isim;
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
    private javax.swing.JTextField sifrekutu;
    private javax.swing.JTextField soyisim;
    private javax.swing.JTextField tckn;
    private javax.swing.JLabel telno;
    private javax.swing.JTextField telnokutu;
    private javax.swing.JTextField yas;
    // End of variables declaration//GEN-END:variables
}
