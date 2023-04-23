

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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;

public class main_quiz_page extends javax.swing.JFrame {

 
    public main_quiz_page(String abc, String tablename) {
        initComponents();
        unique_id = abc;
        table_name = tablename;
        Random random = new Random();
        while(list_of_files.size()<= 15)
        {
            int num = random.nextInt(40);
            if(num!=0)  //error aara with 0 index. can't access sql table
                {list_of_files.add(num);}
        }

        are_you_sure.setVisible(false);
        
        if("language".equals(table_name))
        {
        Question_label.setFont(new Font("MS Gothic",Font.BOLD,24));
        }
    }
    
    private static String unique_id,table_name;
    private static Set <Integer> list_of_files = new HashSet<Integer>();
    private Iterator i = list_of_files.iterator();
    private static boolean start_check = false; //this is for shubh aahramb
    private static boolean game_on = true;  //this to check if galat ans or not
    private static char correct_answer;
    private static char chosen_option;
    private static String database_user = "root";
    private static String database_pass = "rootroot";
    private static String url = "jdbc:mysql://127.0.0.1:3306/quiz";
    private static boolean next_question = false;   //using this to track next question change
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confirm = new javax.swing.JPanel();
        are_you_sure_option = new javax.swing.JLabel();
        are_you_ready = new javax.swing.JLabel();
        are_you_sure = new javax.swing.JLabel();
        yes = new javax.swing.JButton();
        no = new javax.swing.JButton();
        money = new javax.swing.JLabel();
        option_d = new javax.swing.JLabel();
        option_c = new javax.swing.JLabel();
        option_b = new javax.swing.JLabel();
        option_a = new javax.swing.JLabel();
        Question_label = new javax.swing.JLabel();
        main_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirm.setBackground(new java.awt.Color(255, 255, 255));
        Confirm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        Confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        are_you_sure_option.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Confirm.add(are_you_sure_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 40, 80));

        are_you_ready.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        are_you_ready.setText("Are you ready to start the game?");
        Confirm.add(are_you_ready, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        are_you_sure.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        are_you_sure.setText("Are you sure you want to select Option :");
        Confirm.add(are_you_sure, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        Confirm.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 110, 50));

        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        Confirm.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 110, 50));

        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 580, 400));

        money.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        money.setForeground(new java.awt.Color(255, 255, 255));
        money.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(money, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 310, 40));

        option_d.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        option_d.setForeground(new java.awt.Color(255, 255, 255));
        option_d.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        option_d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option_dMouseClicked(evt);
            }
        });
        getContentPane().add(option_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 690, 360, 50));

        option_c.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        option_c.setForeground(new java.awt.Color(255, 255, 255));
        option_c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        option_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option_cMouseClicked(evt);
            }
        });
        getContentPane().add(option_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 360, 50));

        option_b.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        option_b.setForeground(new java.awt.Color(255, 255, 255));
        option_b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        option_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option_bMouseClicked(evt);
            }
        });
        getContentPane().add(option_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 360, 50));

        option_a.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        option_a.setForeground(new java.awt.Color(255, 255, 255));
        option_a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        option_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option_aMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                option_aMousePressed(evt);
            }
        });
        getContentPane().add(option_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 360, 50));

        Question_label.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Question_label.setForeground(new java.awt.Color(255, 255, 255));
        Question_label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Question_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 920, 120));

        main_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quiz_interface,png.png"))); // NOI18N
        main_background.setText("asdas");
        getContentPane().add(main_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 1, 1500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void option_aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option_aMouseClicked
        chosen_option = 'A';
        are_you_sure_option.setText(Character.toString(chosen_option));
        are_you_sure.setVisible(true);
        Confirm.setVisible(true);
    }//GEN-LAST:event_option_aMouseClicked

    private void option_aMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option_aMousePressed

    }//GEN-LAST:event_option_aMousePressed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        if(start_check == false)
        {
                        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection(url, database_user, database_pass);
                main_quiz_page ob = new main_quiz_page(unique_id,table_name);
                int fist = (Integer)ob.i.next();
                int first = fist;
                String query = "select * from "+table_name+" where id ="+first;
                PreparedStatement stmt = connect.prepareStatement(query);
                ResultSet rs = stmt.executeQuery();
                Confirm.setVisible(false);
                are_you_ready.setVisible(false);
                if(rs.next())
                {
                    Question_label.setText("<html>" + rs.getString(2)+ "</html>");
                    option_a.setText(rs.getString(3));
                    option_b.setText(rs.getString(4));
                    option_c.setText(rs.getString(5));
                    option_d.setText(rs.getString(6));
                    correct_answer = rs.getString(7).toUpperCase().charAt(0);
                    start_check = true;
                }             
                else
                {
                    System.out.println("SQL ERROR SEE KYA HUA");
                    System.out.println(first);
                    System.exit(-1);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(main_quiz_page.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        else
        {
            if(game_on == false)
            {
                new main_quiz_page(unique_id,table_name).setVisible(true);
                this.dispose();
            }
            else if(next_question == true)
            {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connect = DriverManager.getConnection(url, database_user, database_pass);
                    int next_option = (int) i.next();
                    String query = "select * from"+table_name+"where id ="+next_option;
                    
                    
                    
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(main_quiz_page.class.getName()).log(Level.SEVERE, null, ex);
                }   finally {
                    next_question = false;
                    no.setVisible(true);
                    are_you_sure.setVisible(true);
                    are_you_sure_option.setVisible(true);
                }
                
            }
            
            else if(chosen_option == correct_answer)
            {
                // change the picture here
                no.setVisible(false);
                are_you_sure.setVisible(false);
                are_you_sure_option.setVisible(false);
                are_you_ready.setVisible(true);
                are_you_ready.setText("Right Answer! Continue by pressing Yes");
                next_question = true;
            }
            else
            {
                are_you_sure.setVisible(false);
                are_you_sure_option.setVisible(false);
                are_you_ready.setText("Wrong Answer! Try again?");
                game_on = false;

            }
        }
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        if(start_check == false || game_on == false)
        {
            new quiz_page1(unique_id).setVisible(true);
            this.dispose();
        }
        else
        {
            Confirm.setVisible(false);
        }
    }//GEN-LAST:event_noActionPerformed

    private void option_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option_bMouseClicked
        chosen_option = 'B';
        are_you_sure.setVisible(true);
        are_you_sure_option.setText(Character.toString(chosen_option));
        are_you_sure_option.setVisible(true);
        Confirm.setVisible(true);
    }//GEN-LAST:event_option_bMouseClicked

    private void option_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option_cMouseClicked
        chosen_option = 'C';
        are_you_sure.setVisible(true);
        are_you_sure_option.setText(Character.toString(chosen_option));
        are_you_sure_option.setVisible(true);
        Confirm.setVisible(true);
    }//GEN-LAST:event_option_cMouseClicked

    private void option_dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option_dMouseClicked
        chosen_option = 'D';
        are_you_sure.setVisible(true);
        are_you_sure_option.setText(Character.toString(chosen_option));
        are_you_sure_option.setVisible(true);
        Confirm.setVisible(true);
    }//GEN-LAST:event_option_dMouseClicked



    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_quiz_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_quiz_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_quiz_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_quiz_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_quiz_page(unique_id,table_name).setVisible(true);
            }
        });
        
//        System.out.println(list_of_files.size());
//        System.out.println(unique_id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Confirm;
    private javax.swing.JLabel Question_label;
    private javax.swing.JLabel are_you_ready;
    private javax.swing.JLabel are_you_sure;
    private javax.swing.JLabel are_you_sure_option;
    private javax.swing.JLabel main_background;
    private javax.swing.JLabel money;
    private javax.swing.JButton no;
    private javax.swing.JLabel option_a;
    private javax.swing.JLabel option_b;
    private javax.swing.JLabel option_c;
    private javax.swing.JLabel option_d;
    private javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables
}
