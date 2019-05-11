/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import databaseui.*;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * @author w17012215 Jordan
 */
public class CurrentJobsUI extends javax.swing.JFrame {
    
    DataBaseToolkit dbtk;
    DefaultListModel jobListModel;

    /**
     * Creates new form CurrentJobsUI
     */
    public CurrentJobsUI() {
        initComponents();
        
        jobListModel = new DefaultListModel();
        
        dbtk = new DataBaseToolkit();
        
        setJobList();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentJobsPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        addJobButton = new javax.swing.JButton();
        jobsScrollpane = new javax.swing.JScrollPane();
        jobList = new javax.swing.JList<>();
        refreshButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        infoScrollpane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        currentJobsPanel.setBackground(new java.awt.Color(102, 153, 255));
        currentJobsPanel.setPreferredSize(new java.awt.Dimension(480, 389));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setText("Select a motor here before clicking a button");

        viewButton.setText("View Task List");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        addJobButton.setText("Add Job");
        addJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJobButtonActionPerformed(evt);
            }
        });

        jobsScrollpane.setBorder(null);

        jobList.setBackground(new java.awt.Color(102, 153, 255));
        jobList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jobList.setForeground(new java.awt.Color(255, 255, 255));
        jobList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Job list" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jobList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jobList.setFocusable(false);
        jobList.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jobsScrollpane.setViewportView(jobList);

        refreshButton.setText("Refresh Job List");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Current Jobs");

        editButton.setText("Edit Job");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Job");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Job info");
        infoScrollpane.setViewportView(jTextArea1);

        javax.swing.GroupLayout currentJobsPanelLayout = new javax.swing.GroupLayout(currentJobsPanel);
        currentJobsPanel.setLayout(currentJobsPanelLayout);
        currentJobsPanelLayout.setHorizontalGroup(
            currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentJobsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jobsScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                        .addComponent(infoLabel)
                        .addGap(148, 148, 148))
                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                        .addComponent(infoScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addJobButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        currentJobsPanelLayout.setVerticalGroup(
            currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentJobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(infoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(infoScrollpane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jobsScrollpane))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentJobsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentJobsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //view tasks button
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        //String selectedItem = jList1.getSelectedValue();
        //System.out.println(selectedItem + "view button");
        new CurrentTasksUI().setVisible(true);
    }//GEN-LAST:event_viewButtonActionPerformed

    //add job button
    private void addJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobButtonActionPerformed
        new MotorAddUI().setVisible(true); //only cust support can click 
    }//GEN-LAST:event_addJobButtonActionPerformed

    //refresh button
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        setJobList();        
    }//GEN-LAST:event_refreshButtonActionPerformed

    //edit job button
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int numberEdit = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the job number of the motor to edit"));    
        new MotorEditUI(dbtk.getJob(numberEdit)).setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    //delete button
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        // cust support only 
        
        String numberDel = JOptionPane.showInputDialog(this, "Enter the job number of the motor to delete");
        try{
        if(!dbtk.deleteJob(Integer.parseInt(numberDel)))
        {
            JOptionPane.showMessageDialog(null, "Error: job number " + numberDel + " doesn't exist"); //use both dialog and print?
            System.err.println("Error: job number " + numberDel + " doesn't exist");
        }
        else
        {
            System.out.println("Succussfully deleted job " + numberDel);
            setJobList();
        }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: job number " + numberDel + " doesn't exist");
            System.err.println("Error: must enter a number");
                }
    }//GEN-LAST:event_jBtnDeleteActionPerformed
    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

    }//GEN-LAST:event_deleteButtonActionPerformed
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
            java.util.logging.Logger.getLogger(CurrentJobsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentJobsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentJobsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentJobsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentJobsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJobButton;
    private javax.swing.JPanel currentJobsPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JScrollPane infoScrollpane;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> jobList;
    private javax.swing.JScrollPane jobsScrollpane;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables


    //initialises and refreshes job list
    public void setJobList()
    {  
        ArrayList<JobObject> allJobs = dbtk.getAllJobs();
        jobList.setModel(jobListModel);
                    
        //to test no jobs in db:
        //allJobs = null; 
    
        if(allJobs == null)
        {
            jobListModel.addElement( null);
        }
        else
        {
            jobListModel.removeAllElements();
            
            for(int i = 0; i < allJobs.size(); i++)
            {               
                jobListModel.addElement(allJobs.get(i).getJobNumber()+" "+allJobs.get(i).getJobMotorName());  
            }
        }
        allJobs.clear();
}

}
