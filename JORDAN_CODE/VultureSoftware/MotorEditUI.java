/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import databaseui.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan 17012215
 */
public class MotorEditUI extends javax.swing.JFrame {

    /**
     * Creates new form MotorEditUI
     */
    DataBaseToolkit dbtk;
    static ArrayList<JobObject> job;
    
    public MotorEditUI(ArrayList job) 
    {
        initComponents();
        dbtk = new DataBaseToolkit();
        this.job = job;
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTFMotorName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFDateCollected = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFClient = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFEstimated = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFChecked = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTFReturnDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TAParts = new java.awt.TextArea();
        JCBMan = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(175, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Motor Name");

        JTFMotorName.setNextFocusableComponent(JTFDateCollected);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Edit Job");

        JTFDateCollected.setNextFocusableComponent(JTFEstimated);
        JTFDateCollected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFDateCollectedMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Date Collected");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Client");

        JTFEstimated.setNextFocusableComponent(TAParts);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Estimated Hours");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Checked By");

        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveButton.setText("Save Job");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Manufacturer");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Return Date");

        JTFReturnDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFReturnDateMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Parts Needed");

        JCBMan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JCBMan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actiro", "Buhler", "PG", "Other" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Customer Service");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Technician");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFEstimated, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFChecked, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAParts, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFMotorName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JCBMan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(432, 432, 432))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(377, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(149, 149, 149))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFClient, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFDateCollected, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFMotorName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBMan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFEstimated, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFChecked, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFClient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFDateCollected, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(JTFReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TAParts, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
               
        trim();
        if (checks()) {
            //if both fields are edited
            if (!JTFDateCollected.getText().equals("DD/MM/YYYY") && !JTFReturnDate.getText().equals("DD/MM/YYYY")) 
            {
                if (!checkDate(JTFDateCollected.getText() ) && !checkDate(JTFReturnDate.getText() ) )
                {
                  JOptionPane.showMessageDialog(null, "Format for date fields must be DD/MM/YYYY", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    {
                        update();
                    }                
            }
            //only date collected is edited
            else if(!JTFDateCollected.getText().equals("DD/MM/YYYY") && JTFReturnDate.getText().equals("DD/MM/YYYY"))
            {
                if (!checkDate(JTFDateCollected.getText() )){
                    JOptionPane.showMessageDialog(null, "Format is incorrect for date collected. Must be DD/MM/YYYY", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    update();
                }
            }
            //only return date edited
            else if(JTFDateCollected.getText().equals("DD/MM/YYYY") && !JTFReturnDate.getText().equals("DD/MM/YYYY"))
            {
                if (!checkDate(JTFReturnDate.getText() )){
                    JOptionPane.showMessageDialog(null, "Format is incorrect for return date. Must be DD/MM/YYYY", "", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    update();
                }
            }
            //neither edited
            else
            {
                update();
            }
        }              
        
       

        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void JTFDateCollectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFDateCollectedMousePressed
        JTFDateCollected.setText("");
    }//GEN-LAST:event_JTFDateCollectedMousePressed

    private void JTFReturnDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFReturnDateMousePressed
        JTFReturnDate.setText("");
    }//GEN-LAST:event_JTFReturnDateMousePressed

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
            java.util.logging.Logger.getLogger(MotorEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorEditUI(job).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBMan;
    private javax.swing.JTextField JTFChecked;
    private javax.swing.JTextField JTFClient;
    private javax.swing.JTextField JTFDateCollected;
    private javax.swing.JTextField JTFEstimated;
    private javax.swing.JTextField JTFMotorName;
    private javax.swing.JTextField JTFReturnDate;
    private java.awt.TextArea TAParts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables


//textArea1.setLineWrap(true);
//textArea1.setWrapStyleWord(true);
public void setFields()
{
    JTFMotorName.setText(job.get(0).getJobMotorName());    
    JTFChecked.setText(job.get(0).getJobCheckBy());
    JTFEstimated.setText(""+job.get(0).getJobExpectedTime());
    JTFDateCollected.setText(job.get(0).getJobDateCollected());
    TAParts.setText(job.get(0).getJobParts());
    JTFClient.setText(job.get(0).getJobClient());
    JTFReturnDate.setText(job.get(0).getJobReturnDate());
    JTFChecked.setText(job.get(0).getJobCheckBy());   
                
}

private void trim(){
        String textMN = JTFMotorName.getText().trim();
        JTFMotorName.setText(textMN);
        String textE = JTFEstimated.getText().trim();
        JTFEstimated.setText(textE);
        String textP = TAParts.getText().trim();
        TAParts.setText(textP);
        String textCh = JTFChecked.getText().trim();
        JTFChecked.setText(textCh);
        String textCl = JTFClient.getText().trim();
        JTFClient.setText(textCl);
        String textDC = JTFDateCollected.getText().trim();
        JTFDateCollected.setText(textDC);
        String textRD = JTFReturnDate.getText().trim();
        JTFReturnDate.setText(textRD);

        //set text field to default if left blank
        if (JTFDateCollected.getText().equals("")) {
            JTFDateCollected.setText("DD/MM/YYYY");
        }
        if (JTFReturnDate.getText().equals("")) {
            JTFReturnDate.setText("DD/MM/YYYY");
        }
        if (JTFClient.getText().equals("")) {
            JTFClient.setText(null);
        }
}

private boolean checks() {
        if (JTFMotorName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the motor", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (JCBMan.getSelectedItem().equals("Select a manufacturer")) {
            JOptionPane.showMessageDialog(null, "Please select a manufacturer from the drop down menu", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (JTFEstimated.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter estimated working hours required", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (JTFChecked.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name of who checked this motor", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (TAParts.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the parts required", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

private boolean update() {
        //public boolean updateJob(int jobNumber, String jobMotorName, String jobDateCollected, String jobParts, 
        //String jobClient, String jobMan, String jobReturnDate, String jobCheck, String expectedTime)
        int jobNo = job.get(0).getJobNumber();
        String motorName = JTFMotorName.getText();
        String dateCollected = JTFDateCollected.getText();
        String estimatedHours = JTFEstimated.getText();
        String partsNeeded = TAParts.getText();
        String checkedBy = JTFChecked.getText();
        String client = JTFClient.getText();
        String manufacturer = (String)JCBMan.getSelectedItem();
        String returnDate = JTFReturnDate.getText();
        
        if (dbtk.updateJob(jobNo, motorName, dateCollected, partsNeeded, client, manufacturer, returnDate, checkedBy, estimatedHours)) {
            JOptionPane.showMessageDialog(null, "Successfully updated job: " + motorName, "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            return true;
            //CurrentJobsUI.setJobList(); to refresh on add. static context error
        } else {
            System.out.println(jobNo); //job no is working fine
            JOptionPane.showMessageDialog(null, "Failed to update database", "Error", JOptionPane.ERROR_MESSAGE); //get this error when editing jobs
            this.dispose();
            return false;
        }
    }

private boolean checkDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormat.parse(date.trim());

        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
}