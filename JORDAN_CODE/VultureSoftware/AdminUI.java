/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;
import databaseui.*;
import java.util.*;
/**
 *
 * @author jamie
 */
public class AdminUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminUI
     */
    DataBaseToolkit dbtk;
   
    /**
     *
     */
    public AdminUI() {
        initComponents();        
        dbtk = new DataBaseToolkit();        
        populateTextArea();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        newUserButton = new javax.swing.JButton();
        databaseButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        usersScrollpane = new javax.swing.JScrollPane();
        usersTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(175, 0));
        setResizable(false);

        adminPanel.setBackground(new java.awt.Color(102, 153, 255));

        backButton.setBackground(new java.awt.Color(102, 153, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Admin");

        newUserButton.setBackground(new java.awt.Color(102, 153, 255));
        newUserButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newUserButton.setForeground(new java.awt.Color(255, 255, 255));
        newUserButton.setText("Create new user");
        newUserButton.setAlignmentX(0.5F);
        newUserButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        newUserButton.setFocusable(false);
        newUserButton.setOpaque(false);
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        databaseButton.setBackground(new java.awt.Color(102, 153, 255));
        databaseButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        databaseButton.setForeground(new java.awt.Color(255, 255, 255));
        databaseButton.setText("Database Info");
        databaseButton.setAlignmentX(0.5F);
        databaseButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        databaseButton.setFocusable(false);
        databaseButton.setOpaque(false);
        databaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseButtonActionPerformed(evt);
            }
        });

        editUserButton.setBackground(new java.awt.Color(102, 153, 255));
        editUserButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(255, 255, 255));
        editUserButton.setText("Edit a user");
        editUserButton.setAlignmentX(0.5F);
        editUserButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        editUserButton.setFocusable(false);
        editUserButton.setOpaque(false);
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        deleteUserButton.setBackground(new java.awt.Color(102, 153, 255));
        deleteUserButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserButton.setText("Delete a user");
        deleteUserButton.setAlignmentX(0.5F);
        deleteUserButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        deleteUserButton.setFocusable(false);
        deleteUserButton.setOpaque(false);
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        usersTextArea.setColumns(20);
        usersTextArea.setRows(5);
        usersScrollpane.setViewportView(usersTextArea);

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                        .addComponent(databaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usersScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(databaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usersScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new NewUserUI().setVisible(true);

    }//GEN-LAST:event_newUserButtonActionPerformed

    private void databaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DataBaseUI().setVisible(true);
    }//GEN-LAST:event_databaseButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SearchEditUserUI().setVisible(true);
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DeleteUserUI().setVisible(true);
    }//GEN-LAST:event_deleteUserButtonActionPerformed
    
    private void populateTextArea()
    {
        ArrayList<UserObject> users = dbtk.getAllUsers();
        String text = "";
        for(int i = 0; i < users.size(); i++)
        {
            text = text + users.get(i).toString()+"\n\n";
        }
        usersTextArea.setText(text);
    }
    
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
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUI().setVisible(true);             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton databaseButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JButton newUserButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JScrollPane usersScrollpane;
    private javax.swing.JTextArea usersTextArea;
    // End of variables declaration//GEN-END:variables
}
