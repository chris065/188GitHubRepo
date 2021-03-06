/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import databaseui.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 17012215 Jordan
 */
public class TaskEditUI extends javax.swing.JFrame {

    /**
     * Creates new form MotorAddUI
     */
    DataBaseToolkit dbtk;
    static ArrayList<TaskObject> task;
    
    public TaskEditUI(ArrayList task) 
    {
        initComponents();
        dbtk = new DataBaseToolkit();
        this.task = task;
                
        setFields();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        JTFTaskName = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        JCBType = new javax.swing.JComboBox<>();
        JTFTech = new javax.swing.JTextField();
        assignedLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        JTFTime = new javax.swing.JTextField();
        prefLabel = new javax.swing.JLabel();
        JTFPref = new javax.swing.JTextField();
        JTFTals = new javax.swing.JTextField();
        talentsLabel = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(175, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Task Name");

        typeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        typeLabel.setText("Type of Task");

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updateButton.setText("Update Task");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Edit Task");

        JCBType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JCBType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a task type", "Cleaning", "Replacement", "Insulating", "Other" }));

        assignedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        assignedLabel.setForeground(new java.awt.Color(255, 255, 255));
        assignedLabel.setText("Assigned To");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Expected Date");

        prefLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prefLabel.setForeground(new java.awt.Color(255, 255, 255));
        prefLabel.setText("Preferences");

        talentsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        talentsLabel.setForeground(new java.awt.Color(255, 255, 255));
        talentsLabel.setText("Talents");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel)
                            .addComponent(typeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBType, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFTime, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(assignedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFTech, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(prefLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFPref, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(talentsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFTals, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTFTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeLabel)
                            .addComponent(JCBType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignedLabel)
                    .addComponent(JTFTech, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(JTFTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prefLabel)
                    .addComponent(JTFPref, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(talentsLabel)
                    .addComponent(JTFTals, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
                
        trim();
        if (checks()) {
            
            int taskID = task.get(0).getID();
            boolean taskDelayed = task.get(0).getDelay();
            String taskType = task.get(0).getType();
            String taskPri = task.get(0).getPriority();
            String taskName = JTFTaskName.getText();
            String taskTech = JTFTech.getText();
            String taskTime = JTFTime.getText();
            String taskPref = JTFPref.getText();
            String taskTals = JTFTals.getText();

if(dbtk.updateTasks(taskID, taskDelayed, taskName, taskType, taskTech, taskTime, taskPref, taskTals, taskPri)){
    JOptionPane.showMessageDialog(null, "Successfully updated task: " + taskName, "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
}            
else{
    JOptionPane.showMessageDialog(null, "Failed to update database", "Error", JOptionPane.ERROR_MESSAGE); 
            this.dispose();
}
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(TaskEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TaskEditUI(task).setVisible(true);
            }
        });
    }
    
    private void trim(){
        String textTN = JTFTaskName.getText().trim();
        JTFTaskName.setText(textTN);
        String textTE = JTFTech.getText().trim();
        JTFTech.setText(textTE);
        String textTI = JTFTime.getText().trim();
        JTFTime.setText(textTI);
        String textPR = JTFPref.getText().trim();
        JTFPref.setText(textPR);
        String taskTA = JTFTals.getText();
        JTFTals.setText(taskTA);
    }
    
    private boolean checks(){
        if(JTFTaskName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the name of the task", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else if(JCBType.getSelectedItem().equals("Select a task type")){
            JOptionPane.showMessageDialog(null, "Please select the type of task from the drop down menu", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else if(JTFTech.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the technician the task was assigned to", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else if(JTFTime.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the expected date of completion", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else if(JTFPref.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the preferences for this task", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else if(JTFTals.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the talents needed for this task", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
    
    public void setFields()
{
    
    JTFTaskName.setText(task.get(0).getTaskName() );
    JTFTech.setText(task.get(0).getAssignedTo() );
    JTFTime.setText(task.get(0).getExpectedTime() );
    JTFPref.setText(task.get(0).getPrefs() );
    JTFTals.setText(task.get(0).getTalents() );
    
    dbtk.closeConnectionToDB();
    
                    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBType;
    private javax.swing.JTextField JTFPref;
    private javax.swing.JTextField JTFTals;
    private javax.swing.JTextField JTFTaskName;
    private javax.swing.JTextField JTFTech;
    private javax.swing.JTextField JTFTime;
    private javax.swing.JLabel assignedLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel prefLabel;
    private javax.swing.JLabel talentsLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


//textArea1.setLineWrap(true);
//textArea1.setWrapStyleWord(true);
}