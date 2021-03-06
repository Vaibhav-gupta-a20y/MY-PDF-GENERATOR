/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypdfgenerator;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhrit pc
 */
public class ThankuScreen extends javax.swing.JInternalFrame {

    String filePath = null;
    /**
     * Creates new form ThankuScreen
     */
    public ThankuScreen(String path) {
        initComponents();
        filePath = path;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mailPdfBtn = new javax.swing.JButton();
        openBtn = new javax.swing.JButton();
        retakeBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        mailPdfBtn.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        mailPdfBtn.setIcon(new javax.swing.ImageIcon("D:\\Project images and icons\\must_have_icon_set\\Mail\\Mail_48x48.png")); // NOI18N
        mailPdfBtn.setText("Mail PDF");

        openBtn.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        openBtn.setIcon(new javax.swing.ImageIcon("D:\\Project images and icons\\must_have_icon_set\\Find\\Find_48x48.png")); // NOI18N
        openBtn.setText("Open PDF");
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openBtnMouseClicked(evt);
            }
        });

        retakeBtn.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        retakeBtn.setIcon(new javax.swing.ImageIcon("D:\\Project images and icons\\must_have_icon_set\\Undo\\Undo_48x48.png")); // NOI18N
        retakeBtn.setText("Retake");
        retakeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retakeBtnMouseClicked(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI Symbol", 3, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Project images and icons\\must_have_icon_set\\Log Out\\Log Out_48x48.png")); // NOI18N
        jButton4.setText("Exit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dhrit pc\\Documents\\NetBeansProjects\\TestImage\\src\\main\\java\\mypdfgenerator\\Wn2j.gif")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(retakeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailPdfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailPdfBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retakeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jButton4MouseClicked

    
    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked
        System.out.println("Open btn clicked");
        if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
        {  
            System.out.println("not supported");  
            return;  
        }  
        File file = new File(filePath);   
        Desktop desktop = Desktop.getDesktop();  
        if(file.exists()){         try {
            System.out.println("Yes file exists ===> File path :" +filePath) ;                               //checks file exists or not
            desktop.open(file);              //opens the specified file  
            } catch (IOException ex) {
                Logger.getLogger(ThankuScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }//GEN-LAST:event_openBtnMouseClicked

    private void retakeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retakeBtnMouseClicked
        
        new ScreenOpening(new OptionsScreen());
    }//GEN-LAST:event_retakeBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mailPdfBtn;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton retakeBtn;
    // End of variables declaration//GEN-END:variables
}
