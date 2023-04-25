/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Vishal
 */
public class quiz_page1 extends javax.swing.JFrame {

        public quiz_page1(String abs) {
        initComponents();
        unique_id = abs;
    }
    private static String unique_id;
    private static String passable = "none"; 
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        drop_down = new javax.swing.JComboBox<>();
        politics = new javax.swing.JButton();
        misc = new javax.swing.JButton();
        automobiles = new javax.swing.JButton();
        literature = new javax.swing.JButton();
        pop_culture = new javax.swing.JButton();
        science = new javax.swing.JButton();
        movies = new javax.swing.JButton();
        history = new javax.swing.JButton();
        geography = new javax.swing.JButton();
        profile = new javax.swing.JLabel();
        sports = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        main_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 170, 50));

        drop_down.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        drop_down.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select your movie" }));
        drop_down.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drop_down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drop_downActionPerformed(evt);
            }
        });
        getContentPane().add(drop_down, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 250, 50));

        politics.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        politics.setText("Politics");
        politics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                politicsActionPerformed(evt);
            }
        });
        getContentPane().add(politics, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 170, 50));

        misc.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        misc.setText("Misc");
        misc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miscActionPerformed(evt);
            }
        });
        getContentPane().add(misc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 170, 50));

        automobiles.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        automobiles.setText("Automobiles");
        automobiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                automobilesActionPerformed(evt);
            }
        });
        getContentPane().add(automobiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 170, 50));

        literature.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        literature.setText("Literature");
        literature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                literatureActionPerformed(evt);
            }
        });
        getContentPane().add(literature, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 170, 50));

        pop_culture.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pop_culture.setText("Pop-Culture");
        pop_culture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop_cultureActionPerformed(evt);
            }
        });
        getContentPane().add(pop_culture, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 170, 50));

        science.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        science.setText("Science");
        science.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceActionPerformed(evt);
            }
        });
        getContentPane().add(science, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 170, 50));

        movies.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        movies.setText("Movies");
        movies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesActionPerformed(evt);
            }
        });
        getContentPane().add(movies, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 170, 50));

        history.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        history.setText("History");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        getContentPane().add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 170, 50));

        geography.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        geography.setText("Geography");
        geography.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geographyActionPerformed(evt);
            }
        });
        getContentPane().add(geography, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 170, 50));

        profile.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.setToolTipText("");
        profile.setAlignmentY(0.0F);
        profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profile.setOpaque(true);
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 110, 40));

        sports.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        sports.setText("Sports");
        sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsActionPerformed(evt);
            }
        });
        getContentPane().add(sports, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, 50));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pick a topic of your interest");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Kaun Banega Arabpati");
        jLabel2.setToolTipText("");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 460, 80));

        main_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/selection_background.png"))); // NOI18N
        getContentPane().add(main_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("General Sports");
        drop_down.addItem("Olympics");
    }//GEN-LAST:event_sportsActionPerformed

    private void geographyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geographyActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("World Geography");
        drop_down.addItem("Indian Geography");
    }//GEN-LAST:event_geographyActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Indian History");
        drop_down.addItem("European History");
        drop_down.addItem("Roman History");
        drop_down.addItem("Asian History");
    }//GEN-LAST:event_historyActionPerformed

    private void moviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Bollywood");
        drop_down.addItem("Hollywood");
    }//GEN-LAST:event_moviesActionPerformed

    private void automobilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_automobilesActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Cars");
        drop_down.addItem("Bikes");
        drop_down.addItem("Luxury Vehicles");
    }//GEN-LAST:event_automobilesActionPerformed

    private void literatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_literatureActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Books and Authors");
        drop_down.addItem("Awards in Literature");
    }//GEN-LAST:event_literatureActionPerformed

    private void pop_cultureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop_cultureActionPerformed
         drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Celebrities");
        drop_down.addItem("TV Shows");
        
    }//GEN-LAST:event_pop_cultureActionPerformed

    private void scienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceActionPerformed
       drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Astronomy");
        drop_down.addItem("Inventors n' Inventions");
        drop_down.addItem("Biology");
        drop_down.addItem("General Science");
    }//GEN-LAST:event_scienceActionPerformed

    private void politicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_politicsActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Geopolitics");
        drop_down.addItem("Politics in India");
        drop_down.addItem("United Nations");
        drop_down.addItem("Noble Prizes");
    }//GEN-LAST:event_politicsActionPerformed

    private void miscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miscActionPerformed
        drop_down.removeAllItems();
        drop_down.addItem("Select Topic");
        drop_down.addItem("Guess the Language");
        drop_down.addItem("National Foods");
        drop_down.addItem("National Animals");
        drop_down.addItem("General Knowledge");
        drop_down.addItem("Companies and TagLines");
    }//GEN-LAST:event_miscActionPerformed

    private void drop_downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drop_downActionPerformed
        int item = drop_down.getSelectedIndex();
        if(item == -1)
        {}
        else
        {
       String selected_item = drop_down.getItemAt(item);
       switch(selected_item){
                case "General Sports":
                        passable = "general_sports";
			break;
		
		case "Olympics":
                        passable = "olympics";
			break;

		case "World Geography":
                        passable = "world_geography";
			break;
	
		case "Indian Geography":
                        passable = "indian_geography";
			break;

		case "Indian History":
                        passable = "indian_history";
			break;

		case "European History":    
                        passable = "european_history";
			break;

		case "Roman History":
                        passable = "roman_history";
			break;
		
		case "Asian History":
                        passable = "asian_history";
			break;

		case "Bollywood":
                        passable = "bollywood";
			break;

		case "Hollywood":
                        passable = "hollywood";
			break;

		case "Cars":
                        passable = "cars";
			break;

		case "Bikes":
                        passable = "bikes";
			break;

		case "Luxury Vehicles":
                        passable = "luxury_vehicles";
			break;

		case "Books and Authors":
                        passable = "books_authors";
			break;

		case "Awards in Literature":
                        passable = "awards_literature";
			break;
	
		case "Astronomy":
                        passable = "astronomy";
			break;

		case "Inventors n' Inventions":
                        passable = "inventors";
			break;

		case "Biology": 
                        passable = "biology";
			break;

		case "General Science":
                        passable = "general_science";
			break;

		case "Celebrities":
                        passable = "celebrities";
			break;

		case "TV Shows":
                        passable = "tv_shows";
			break;

		case "Geopolitics": 
                        passable = "geopolitics";
			break;
		
		case "Politics in India":
                        passable = "politics_india";
			break;

		case "United Nations":
                        passable = "united_nations";
			break;
		
		case "Noble Prizes":
                        passable = "noble_prizes";
			break;

		case "Guess the Language":
                        passable = "language";
			break;

		case "National Foods":  
                        passable = "foods";
			break;

		case "National Animals":
                        passable = "animals";
			break;

		case "General Knowledge":
                        passable = "gk";
			break;

		case "Companies and TagLines":
                        passable = "taglines";
			break;
                        
                default:
                        passable = "none";
                        break;
          }

        System.out.println(passable);
        }
    }//GEN-LAST:event_drop_downActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        new main_quiz_page(unique_id,passable).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new profile(unique_id).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileMouseClicked

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
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz_page1(unique_id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton automobiles;
    private javax.swing.JComboBox<String> drop_down;
    private javax.swing.JButton geography;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton literature;
    private javax.swing.JLabel main_Background;
    private javax.swing.JButton misc;
    private javax.swing.JButton movies;
    private javax.swing.JButton politics;
    private javax.swing.JButton pop_culture;
    private javax.swing.JLabel profile;
    private javax.swing.JButton science;
    private javax.swing.JButton sports;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
