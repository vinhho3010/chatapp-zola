/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raven.form;

import com.raven.event.PublicEvent;
import com.raven.main.Main;
import com.raven.model.Model_User_Account;
import com.raven.service.Service;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author RAVEN
 */
public class Menu_Right extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Left
     */
    public Menu_Right() {
        initComponents();
    }

    protected void paintChildren(Graphics grphcs){
        Graphics2D g2d = (Graphics2D)grphcs;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gdp = new GradientPaint(0,0,Color.decode("#80E2FF"),0,getHeight(),Color.decode("#9E74D0"));
        g2d.setPaint(gdp);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2d.fillRect(0, getWidth()-20, getWidth(), getHeight());
        setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        super.paintChildren(grphcs);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_current_user = new javax.swing.JLabel();
        imageAvatar1 = new com.raven.swing.ImageAvatar();
        btn_logout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        txt_current_user.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        txt_current_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_current_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        imageAvatar1.setBorderColor(new java.awt.Color(126, 226, 255));
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/profileTest.jpg"))); // NOI18N

        btn_logout.setBackground(new java.awt.Color(158, 72, 192));
        btn_logout.setFont(new java.awt.Font("Berlin Sans FB", 0, 26)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Log out");
        btn_logout.setBorderPainted(false);
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_current_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txt_current_user, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
       
       int isLogout = JOptionPane.showConfirmDialog(this, "Do you want to log out?", "Log out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       
       
       if(isLogout == JOptionPane.YES_OPTION){
            Service.getInstance().getClient().disconnect();
            PublicEvent.getInstance().getEventLogin().goLogOut();
       } else {
           return;
       }
       
           
    }//GEN-LAST:event_btn_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private com.raven.swing.ImageAvatar imageAvatar1;
    public static javax.swing.JLabel txt_current_user;
    // End of variables declaration//GEN-END:variables
}
