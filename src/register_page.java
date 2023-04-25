
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.sql.*;
import javafx.scene.control.Alert;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;  
/**
 *
 * @author Vishal
 */
public class register_page extends javax.swing.JFrame {

    public register_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Error_m = new javax.swing.JDialog();
        register_text = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        register_button = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        main_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_text.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        register_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_text.setText("REGISTER");
        getContentPane().add(register_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 220, 40));

        username.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 220, 50));

        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 220, 50));

        register_button.setBackground(new java.awt.Color(134, 113, 255));
        register_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        register_button.setForeground(new java.awt.Color(255, 255, 255));
        register_button.setText("Register");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(register_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 160, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
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

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        String user = username.getText().trim();
        char[] pass_char = password.getPassword();
        String pass = new String(pass_char).trim();
        
        DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
        Date da= new Date();
        String unique_num = dateFormat.format(da);
        
        if("".equals(user) || "".equals(pass))
        {
            username.setText("");
            password.setText("");
            JOptionPane.showMessageDialog(null, 
                              "Enter username/password", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);

        }
        else
        {
            String database_user = "root";
            String database_pass = "rootroot";
            String url = "jdbc:mysql://127.0.0.1:3306/server";
            String users_url = "jdbc:mysql://127.0.0.1:3306/users";
            String Query = "Insert into users values ('"+unique_num+"','"+user+"','"+pass+"')";
            String create_user = "CREATE TABLE user" + unique_num + "(game_number int PRIMARY KEY, amount_display varchar(50), category varchar(50), amount_count int )";
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(url, database_user, database_pass);
            Connection user_data = DriverManager.getConnection(users_url,database_user,database_pass);
            PreparedStatement stmt = connect.prepareStatement(Query);
            PreparedStatement usr = user_data.prepareStatement(create_user);
            stmt.execute();
            usr.execute();
            this.dispose();
            new login_page().setVisible(true);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        }
        
    }//GEN-LAST:event_register_buttonActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Error_m;
    private javax.swing.JLabel background;
    private javax.swing.JLabel main_Background;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel register_text;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
