/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.sql.*;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Vishal
 */
public class login_page extends javax.swing.JFrame {

    public login_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_empty = new javax.swing.JLabel();
        password_empty = new javax.swing.JLabel();
        To_register = new javax.swing.JLabel();
        Login_text = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        main_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username_empty.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        username_empty.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(username_empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 220, 20));

        password_empty.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        password_empty.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(password_empty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 220, 20));

        To_register.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        To_register.setText("Not a user? Register here");
        To_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                To_registerMouseClicked(evt);
            }
        });
        getContentPane().add(To_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 170, 40));

        Login_text.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Login_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_text.setText("LOGIN !");
        getContentPane().add(Login_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 220, 40));

        username.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 220, 50));

        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, 50));

        login_button.setBackground(new java.awt.Color(134, 113, 255));
        login_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_button.setForeground(new java.awt.Color(255, 255, 255));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.lightGray));
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 720, 410));

        main_Background.setBackground(new java.awt.Color(240, 240, 249));
        main_Background.setForeground(new java.awt.Color(204, 204, 255));
        main_Background.setOpaque(true);
        getContentPane().add(main_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        String user = username.getText();
        char[] pass_char = password.getPassword();
        String pass = new String(pass_char);
        
        if("".equals(user) && "".equals(pass) )
        {
            username_empty.setText("Username can't be empty!");
            password_empty.setText("Password can't be empty!");
        }
        else if("".equals(user))
        {
            username_empty.setText("Username can't be empty!");
        }
        else if("".equals(pass))
        {
            password_empty.setText("Password can't be empty!");
        }
        else
        {
        
        String database_user = "root";
        String database_pass = "rootroot";
        String url = "jdbc:mysql://127.0.0.1:3306/server";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, database_user, database_pass);
            String sql = "Select id from users where username='"+user+"' and password='"+pass+"'";
            PreparedStatement stmt = connect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
                String unique_id = rs.getString(1);
                new quiz_page1(unique_id).setVisible(true);
                this.dispose();
            }
            else
            {
                username.setText("");
                password.setText("");
                JOptionPane.showMessageDialog(null, 
                              "Wrong username/password", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
    }//GEN-LAST:event_login_buttonActionPerformed

    private void To_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_To_registerMouseClicked
        this.dispose();
        new register_page().setVisible(true);

    }//GEN-LAST:event_To_registerMouseClicked

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_text;
    private javax.swing.JLabel To_register;
    private javax.swing.JLabel background;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel main_Background;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_empty;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_empty;
    // End of variables declaration//GEN-END:variables
}
