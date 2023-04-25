import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;
import java.util.Vector;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
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
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        data_table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer);
        data_table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer);
        data_table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection(url, database_user, database_pass);
                String query = "select * from user"+unique_id;
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                ResultSetMetaData res = rs.getMetaData();
                DefaultTableModel mera_model = (DefaultTableModel)data_table.getModel();
                while(rs.next())
                {
                String[] row = {(Integer.toString(rs.getInt(1)+1)),rs.getString(2),rs.getString(3)};
                int temp = rs.getInt(4);
                total += temp;
                count++;
                if(high < temp)
                    high = temp;
                
                if(low > temp)
                    low = temp;
                
                mera_model.addRow(row);
                }
                avg = total/count;
        }
         catch (ClassNotFoundException ex){
                Logger.getLogger(main_quiz_page.class.getName()).log(Level.SEVERE, null, ex);
            } catch ( SQLException ex) {
            Logger.getLogger(main_quiz_page.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
            min_a.setText("₹ "+low);
            max_a.setText("₹ "+high);
            total_a.setText("₹ "+total);
            average_a.setText("₹ "+avg);
        }
    }
    
    private static String unique_id;
    private static int total = 0;
    private static int avg = 0;
    private static int high =0;
    private static int low =0;
    private static int count = 0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        totala = new javax.swing.JLabel();
        average = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        max_a = new javax.swing.JLabel();
        min_a = new javax.swing.JLabel();
        average_a = new javax.swing.JLabel();
        total_a = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(153, 153, 255));
        back.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Go Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 40));

        data_table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game Number", "Amount Won", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data_table.setToolTipText("");
        data_table.setGridColor(new java.awt.Color(255, 255, 255));
        data_table.setRowHeight(35);
        data_table.setRowSelectionAllowed(false);
        data_table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(data_table);
        if (data_table.getColumnModel().getColumnCount() > 0) {
            data_table.getColumnModel().getColumn(0).setResizable(false);
            data_table.getColumnModel().getColumn(1).setResizable(false);
            data_table.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 510, 560));

        totala.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        totala.setForeground(new java.awt.Color(255, 255, 255));
        totala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totala.setText("Total Amount Won");
        getContentPane().add(totala, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 430, -1));

        average.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        average.setForeground(new java.awt.Color(255, 255, 255));
        average.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        average.setText("Average Amount Won");
        getContentPane().add(average, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 430, -1));

        min.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min.setText("Minimum Amount Won");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 430, -1));

        max.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        max.setForeground(new java.awt.Color(255, 255, 255));
        max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        max.setText("Maximum Amount Won");
        getContentPane().add(max, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 430, -1));

        max_a.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        max_a.setForeground(new java.awt.Color(255, 255, 255));
        max_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(max_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 430, -1));

        min_a.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        min_a.setForeground(new java.awt.Color(255, 255, 255));
        min_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(min_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 430, -1));

        average_a.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        average_a.setForeground(new java.awt.Color(255, 255, 255));
        average_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(average_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 430, -1));

        total_a.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total_a.setForeground(new java.awt.Color(255, 255, 255));
        total_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(total_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 430, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new quiz_page1(unique_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

 
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile(unique_id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel average;
    private javax.swing.JLabel average_a;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTable data_table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel max;
    private javax.swing.JLabel max_a;
    private javax.swing.JLabel min;
    private javax.swing.JLabel min_a;
    private javax.swing.JLabel total_a;
    private javax.swing.JLabel totala;
    // End of variables declaration//GEN-END:variables
}
