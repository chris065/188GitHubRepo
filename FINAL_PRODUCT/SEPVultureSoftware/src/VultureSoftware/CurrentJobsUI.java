/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import databaseui.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Jordan 17012215
 */
public class CurrentJobsUI extends javax.swing.JFrame {
    
    DataBaseToolkit dbtk;
    DefaultListModel jobListModel;
    
    private static String role;
    private static ArrayList user;
    

    /**
     * Creates new form CurrentJobsUI
     */
    public CurrentJobsUI(ArrayList user) {
        initComponents();
                
        jobListModel = new DefaultListModel();
        
        dbtk = new DataBaseToolkit();
        
        setJobList();
        
        this.user = user;
        this.role = this.user.get(5).toString();
        setButtons(role);
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
        viewTasksButton = new javax.swing.JButton();
        addJobButton = new javax.swing.JButton();
        jobsScrollpane = new javax.swing.JScrollPane();
        jobList = new javax.swing.JList<>();
        refreshButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        finalButton = new javax.swing.JButton();
        viewInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        currentJobsPanel.setBackground(new java.awt.Color(102, 153, 255));
        currentJobsPanel.setPreferredSize(new java.awt.Dimension(480, 389));

        viewTasksButton.setText("View Task List");
        viewTasksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTasksButtonActionPerformed(evt);
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

        finalButton.setText("Final Inpsection");
        finalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalButtonActionPerformed(evt);
            }
        });

        viewInfoButton.setText("View Job Info");
        viewInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout currentJobsPanelLayout = new javax.swing.GroupLayout(currentJobsPanel);
        currentJobsPanel.setLayout(currentJobsPanelLayout);
        currentJobsPanelLayout.setHorizontalGroup(
            currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentJobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                        .addComponent(jobsScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(currentJobsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                                        .addComponent(viewTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                                        .addComponent(viewInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(currentJobsPanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(finalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        currentJobsPanelLayout.setVerticalGroup(
            currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentJobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentJobsPanelLayout.createSequentialGroup()
                        .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(currentJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jobsScrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentJobsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentJobsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //view tasks button
    private void viewTasksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTasksButtonActionPerformed
        try{
        int numberTask = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the job number to view the tasks of"));
        ArrayList<JobObject> jobArray = dbtk.getJob(numberTask);
        new CurrentTasksUI(jobArray).setVisible(true);
        this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: must enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewTasksButtonActionPerformed

    //add job button
    private void addJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJobButtonActionPerformed
        new MotorAddUI().setVisible(true);
    }//GEN-LAST:event_addJobButtonActionPerformed

    //refresh button
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        setJobList();    
    }//GEN-LAST:event_refreshButtonActionPerformed

    //edit job button
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try{
        int numberEdit = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the job number of the motor to edit"));
        ArrayList<JobObject> jobArray = dbtk.getJob(numberEdit);
        new MotorEditUI(jobArray, dbtk).setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: must enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_editButtonActionPerformed

    //delete button
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
          
        String numberDel = JOptionPane.showInputDialog(this, "Enter the job number of the motor to delete");
        try{
        if(!dbtk.deleteJob(Integer.parseInt(numberDel)))
        {
            JOptionPane.showMessageDialog(null, "Error: job number " + numberDel + " doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Succussfully deleted job " + numberDel);
            setJobList();
        }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: job number " + numberDel + " doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jBtnDeleteActionPerformed
    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void finalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalButtonActionPerformed
        
        try{
        int numberFin = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the job number that has been inspected"));
        ArrayList<JobObject> jobArray = dbtk.getJob(numberFin);
        
        //final inspection already confirmed
        if( jobArray.get(0).isJobCompleted() ){
            JOptionPane.showMessageDialog(null, "This job has already been inspected and saved", "", JOptionPane.WARNING_MESSAGE);
            
        }
        //else open UI to add inspection
        else{
            new FinalInspectionUI(jobArray).setVisible(true); 
        }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: job not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_finalButtonActionPerformed

    private void viewInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInfoButtonActionPerformed
        try{
        int numberView = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the job number of the motor to view"));
        new MotorViewUI(dbtk.getJob(numberView)).setVisible(true);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: must enter a number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewInfoButtonActionPerformed
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
                new CurrentJobsUI(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJobButton;
    private javax.swing.JPanel currentJobsPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton finalButton;
    private javax.swing.JList<String> jobList;
    private javax.swing.JScrollPane jobsScrollpane;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewInfoButton;
    private javax.swing.JButton viewTasksButton;
    // End of variables declaration//GEN-END:variables


    /*
    * initialises and refreshes job list, sorting by completed and non completed jobs
    */
    public void setJobList()
    {  

        
        ArrayList<JobObject> allJobs = dbtk.getAllJobs();    

        jobList.setModel(jobListModel);
        
        ArrayList<JobObject> compJobs = new ArrayList<JobObject>();
        ArrayList<JobObject> nonCompJobs = new ArrayList<JobObject>();
        
        ArrayList<String> dates = new ArrayList<String>();
        
        //adds completed and non completed jobs to appropriate array
        for(int i = 0; i < allJobs.size(); i++)
            {               
                if(allJobs.get(i).isJobCompleted()){                    
                compJobs.add(allJobs.get(i));
                }
                else{
                    nonCompJobs.add(allJobs.get(i));
                }              
            }
        
        if(allJobs == null)
        {
            jobListModel.addElement( null);
        }
        else{
            jobListModel.removeAllElements();
            

            
            for(int i = 0; i < nonCompJobs.size(); i++)
            {               
                jobListModel.addElement(nonCompJobs.get(i).getJobNumber()+" "+nonCompJobs.get(i).getJobMotorName()); 
                dates.add(nonCompJobs.get(i).getJobReturnDate());
            }
            
            //title to say not completed
            jobListModel.addElement(" ");
            jobListModel.addElement("Completed jobs:");
            
            for(int i = 0; i < compJobs.size(); i++)
            {               
                jobListModel.addElement(compJobs.get(i).getJobNumber()+" "+compJobs.get(i).getJobMotorName());  
            }
            allJobs.clear();        
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = null;
        
        for(int i = 0; i < dates.size(); i++)
        {
            try{
            Date date = dateFormat.parse(dates.get(i));
            cal2.setTime(date);
            if(cal.after(cal2)){
                JOptionPane.showMessageDialog(null, "Job " + i +" has taken longer than expected time", "", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e){
            System.err.println(e);
        }
            
        }

 
        
}
    /*
    * Makes only specific users able to click certain buttons
    */
    private void setButtons(String role){
        if(role.toLowerCase().equals("tech")){
            deleteButton.setEnabled(false);
            addJobButton.setEnabled(false);
            editButton.setEnabled(false);
            
        }
        if(role.toLowerCase().equals("collection and delivery")){
            deleteButton.setEnabled(false);
            addJobButton.setEnabled(false);
            finalButton.setEnabled(false);
            editButton.setEnabled(false);
            finalButton.setEnabled(false);
        }
    }

}
