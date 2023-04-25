import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;
import java.util.Vector;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Vishal
 */
public class profile extends javax.swing.JFrame {

    public profile(String abc) {
        unique_id = abc;
        initComponents();
        
        String database_user = "root";
        String database_pass = "rootroot";
        String url = "jdbc:mysql://127.0.0.1:3306/users";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection(url, database_user, database_pass);
                String query = "select * from user"+unique_id;
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    data_table.add
                }
        }
         catch (ClassNotFoundException ex){
                Logger.getLogger(main_quiz_page.class.getName()).log(Level.SEVERE, null, ex);
            } catch ( SQLException ex) {
            Logger.getLogger(main_quiz_page.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
        
        }
    }
    
    private static String unique_id;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 970, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile(unique_id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables
}
