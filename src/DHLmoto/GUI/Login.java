/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DHLmoto.GUI;

import DHLmoto.BUS.DanhSachTaiKhoanBUS;
import DHLmoto.GUI.mainFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.net.ssl.SSLEngineResult.Status.OK;
import javax.swing.JOptionPane;

/**
 *
 * @author AlienWare
 */
public class Login extends javax.swing.JFrame {
    String manv = null;
    String mkdn = null;
    mainFrame mf = new mainFrame();
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jPanel3 = new javax.swing.JPanel();
        kc = new javax.swing.JPanel();
        mnv = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chonquyen = new javax.swing.JComboBox<>();
        manhanvien = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        matkhau = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kc.setBackground(new java.awt.Color(255, 102, 102));

        mnv.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mnv.setForeground(new java.awt.Color(255, 255, 255));
        mnv.setText("MÃ NHÂN VIÊN :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MẬT KHẨU :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PHẦN ĐĂNG NHẬP :");

        chonquyen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chonquyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NHÂN VIÊN", "QUẢN LÝ" }));
        chonquyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonquyenActionPerformed(evt);
            }
        });

        manhanvien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        manhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manhanvienActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("ĐĂNG NHẬP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("NHẬP LẠI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        matkhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("HỆ THỐNG CỬA HÀNG");

        javax.swing.GroupLayout kcLayout = new javax.swing.GroupLayout(kc);
        kc.setLayout(kcLayout);
        kcLayout.setHorizontalGroup(
            kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kcLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kcLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kcLayout.createSequentialGroup()
                        .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(mnv)
                            .addGroup(kcLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(19, 19, 19))
                            .addComponent(jLabel4))
                        .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kcLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chonquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(matkhau)))
                            .addGroup(kcLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton2)))
                        .addGap(0, 43, Short.MAX_VALUE))))
            .addGroup(kcLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(0, 79, Short.MAX_VALUE))
        );
        kcLayout.setVerticalGroup(
            kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kcLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chonquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kcLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(kcLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mnv)
                            .addComponent(manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(kcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(kc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        manhanvien.setText("");
        manhanvien.requestFocus();
        matkhau.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int quyen = 0;
        boolean kt = true;
        if( manhanvien.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"MÃ NHÂN VIÊN KHÔNG ĐƯỢC ĐỂ TRỐNG");
            kt = false;
            manhanvien.requestFocus();
        } else if(0 ==  chonquyen.getSelectedIndex()){
            quyen = 1;
            manv=manhanvien.getText();
            kt=true;
        }
        else{
            quyen = 2;
            manv="quanly";
            kt=true;            
        }
        
        if(kt == true && matkhau.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane,"MẬT KHẨU KHÔNG KHÔNG ĐƯỢC ĐỂ TRỐNG");
            kt = false;
            matkhau.requestFocus();
        }
        else{ try {
            mkdn = getMD5(matkhau.getText()) ;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            kt = true;}
        DanhSachTaiKhoanBUS dn = new DanhSachTaiKhoanBUS();
        if(dn.kt(manv,mkdn) == "Sai Ma Dang Nhap" && kt == true){
            JOptionPane.showMessageDialog(rootPane,"MÃ NHÂN VIÊN KHÔNG ĐÚNG");
            manhanvien.setText(null);
            manhanvien.requestFocus();
            matkhau.setText("");
        }
        else if(dn.kt(manv,mkdn) == "Sai Mat Khau" && kt == true){
            JOptionPane.showMessageDialog(rootPane,"MẬT KHẨU KHÔNG ĐÚNG");     
            matkhau.setText("");
            matkhau.requestFocus();
        }
        else if((dn.kt(manv,mkdn) != "Sai Ma Dang Nhap" || dn.kt(manv,mkdn) != "Sai Mat Khau") && kt == true && quyen == 1){
            if(dn.LayTT(manhanvien.getText()) == 1){
                mainFrame mf= new mainFrame();
                mf.selectnv();
                mf.setMa(manv);
                mf.showhoadonnv();
                mf.setVisible(true);
                dispose();}
            else if(dn.LayTT(manhanvien.getText()) == 2){
                matkhau.setText("");
                manhanvien.setText("");
                manhanvien.requestFocus();
                JOptionPane.showMessageDialog(rootPane,"TÀI KHOẢN BỊ KHOÁ KHÔNG THỂ ĐĂNG NHẬP !!!");
            }
            else {
                matkhau.setText("");
                manhanvien.setText("");
                manhanvien.requestFocus();
                JOptionPane.showMessageDialog(rootPane,"TÀI KHOẢN KHÔNG TỒN TẠI !!!");
                
            }
        }
        else if((dn.kt(manv,mkdn) != "Sai Ma Dang Nhap" || dn.kt(manv,mkdn) != "Sai Mat Khau") && kt == true && quyen == 2){
            mainFrame mf= new mainFrame();
            mf.selectql();
            mf.showhoadonql();
            mf.setVisible(true);
            dispose(); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void sete(){
        matkhau.setEchoChar('*');
    }      
    public static String getMD5(String input) throws NoSuchAlgorithmException {
   
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] messageDigest = md.digest(input.getBytes());
      return convertByteToHex(messageDigest);
    
  }
  public static String getMD5(File file) {
    MessageDigest md;
    try {
      md = MessageDigest.getInstance("MD5");
      FileInputStream fis = new FileInputStream(file);
      byte[] dataBytes = new byte[1024];
      int nread = 0;
      while ((nread = fis.read(dataBytes)) != -1) {
        md.update(dataBytes, 0, nread);
      }
      byte[] byteData = md.digest();
      fis.close();
      return convertByteToHex(byteData);
    } catch (NoSuchAlgorithmException | IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
  public static String convertByteToHex(byte[] data) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < data.length; i++) {
      sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
    }
    return sb.toString();
  }
    private void chonquyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonquyenActionPerformed
        
        if(chonquyen.getSelectedIndex() == 1)
        {
            manhanvien.setText("--------QUẢN LÝ--------");
            manhanvien.setEditable(false);
            matkhau.setText("");
            matkhau.requestFocus();
            
        }
        else
        {
            manhanvien.setText("");
            matkhau.setText("");
            manhanvien.setEditable(true);
            manhanvien.requestFocus();
        }
    
    }//GEN-LAST:event_chonquyenActionPerformed

    private void manhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manhanvienActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_manhanvienActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chonquyen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel kc;
    private javax.swing.JTextField manhanvien;
    private javax.swing.JPasswordField matkhau;
    private javax.swing.JLabel mnv;
    // End of variables declaration//GEN-END:variables
}
