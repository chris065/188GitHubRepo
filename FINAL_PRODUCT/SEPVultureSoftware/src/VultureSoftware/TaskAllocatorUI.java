/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import java.util.ArrayList;

/**
 *
 * @author jamie
 */
public class TaskAllocatorUI extends javax.swing.JFrame {

    private static ArrayList<String> user;
    private static String role;
    /**
     * Creates new form JobAllocator
     */
    public TaskAllocatorUI(ArrayList user) 
    {
        initComponents();
        this.user = user;
        this.role = this.user.get(5).toString();
        setButtons(role);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskAllocatorPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        techLabel = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        dailyTaskButton = new javax.swing.JButton();
        allocateTaskButton = new javax.swing.JButton();
        taskListButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(175, 0));
        setResizable(false);

        taskAllocatorPanel.setBackground(new java.awt.Color(102, 153, 255));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Task Allocator");

        techLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        techLabel.setForeground(new java.awt.Color(255, 255, 255));
        techLabel.setText("Technician");

        Separator.setForeground(new java.awt.Color(255, 255, 255));

        dailyTaskButton.setBackground(new java.awt.Color(102, 153, 255));
        dailyTaskButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dailyTaskButton.setForeground(new java.awt.Color(255, 255, 255));
        dailyTaskButton.setText("My daily tasks");
        dailyTaskButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        dailyTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyTaskButtonActionPerformed(evt);
            }
        });

        allocateTaskButton.setBackground(new java.awt.Color(102, 153, 255));
        allocateTaskButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        allocateTaskButton.setForeground(new java.awt.Color(255, 255, 255));
        allocateTaskButton.setText("Allocate Tasks");
        allocateTaskButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        allocateTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocateTaskButtonActionPerformed(evt);
            }
        });

        taskListButton.setBackground(new java.awt.Color(102, 153, 255));
        taskListButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskListButton.setForeground(new java.awt.Color(255, 255, 255));
        taskListButton.setText("View task list");
        taskListButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        taskListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskListButtonActionPerformed(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setText("Customer support");

        javax.swing.GroupLayout taskAllocatorPanelLayout = new javax.swing.GroupLayout(taskAllocatorPanel);
        taskAllocatorPanel.setLayout(taskAllocatorPanelLayout);
        taskAllocatorPanelLayout.setHorizontalGroup(
            taskAllocatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separator)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taskAllocatorPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(allocateTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(taskListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(taskAllocatorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskAllocatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(techLabel)
                    .addComponent(adminLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taskAllocatorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(taskAllocatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(dailyTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        taskAllocatorPanelLayout.setVerticalGroup(
            taskAllocatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskAllocatorPanelLayout.createSequentialGroup()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(techLabel)
                .addGap(47, 47, 47)
                .addComponent(dailyTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminLabel)
                .addGap(34, 34, 34)
                .addGroup(taskAllocatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allocateTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskAllocatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskAllocatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskListButtonActionPerformed
        // TODO add your handling code here:
        new TaskListUI().setVisible(true);
    }//GEN-LAST:event_taskListButtonActionPerformed

    private void dailyTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyTaskButtonActionPerformed
        // TODO add your handling code here:
        new DailyTaskUI(user).setVisible(true);
    }//GEN-LAST:event_dailyTaskButtonActionPerformed

    private void allocateTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocateTaskButtonActionPerformed
        // TODO add your handling code here:
        new AllocateATaskUI().setVisible(true);
    }//GEN-LAST:event_allocateTaskButtonActionPerformed

    private void setButtons(String role)
    {
        if(role.toLowerCase().equals("tech"))
        {
            allocateTaskButton.setEnabled(false);
            taskListButton.setEnabled(false);
        }
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
            java.util.logging.Logger.getLogger(TaskAllocatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskAllocatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskAllocatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskAllocatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskAllocatorUI(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton allocateTaskButton;
    private javax.swing.JButton dailyTaskButton;
    private javax.swing.JPanel taskAllocatorPanel;
    private javax.swing.JButton taskListButton;
    private javax.swing.JLabel techLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
