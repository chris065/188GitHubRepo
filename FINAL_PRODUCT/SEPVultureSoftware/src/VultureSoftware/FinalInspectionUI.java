/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;

import databaseui.DataBaseToolkit;
import databaseui.JobObject;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan Thompson 17012215
 */
public class FinalInspectionUI extends javax.swing.JFrame {

    /**
     * Creates new form FinalInspectionUI
     */
    
    static DataBaseToolkit dbtk;
    static ArrayList<JobObject> job;
    
    public FinalInspectionUI(ArrayList job) {
        initComponents();
        
        this.dbtk = new DataBaseToolkit();
        this.job = job;
        
        setField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalInspectionPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        JTFcheckedField = new javax.swing.JTextField();
        checkedLabel = new javax.swing.JLabel();
        endJobButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        JTFdateField = new javax.swing.JTextField();
        infoLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        jobNumberField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        finalInspectionPanel.setBackground(new java.awt.Color(102, 153, 255));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Final Inspection");

        checkedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkedLabel.setForeground(new java.awt.Color(255, 255, 255));
        checkedLabel.setText("Checked By");

        endJobButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        endJobButton.setText("End Job");
        endJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endJobButtonActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Date");

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setText("By clicking 'End Job', you are approving this motor passed the inpection and is ready to be delivered back to the client");

        numberLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberLabel.setText("Job Number");

        jobNumberField.setEditable(false);

        javax.swing.GroupLayout finalInspectionPanelLayout = new javax.swing.GroupLayout(finalInspectionPanel);
        finalInspectionPanel.setLayout(finalInspectionPanelLayout);
        finalInspectionPanelLayout.setHorizontalGroup(
            finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                                .addComponent(numberLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jobNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                                .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateLabel)
                                    .addComponent(checkedLabel))
                                .addGap(18, 18, 18)
                                .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTFcheckedField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(titleLabel))
                    .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infoLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalInspectionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(endJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        finalInspectionPanelLayout.setVerticalGroup(
            finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalInspectionPanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(jobNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(JTFdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(finalInspectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkedLabel)
                    .addComponent(JTFcheckedField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(infoLabel)
                .addGap(21, 21, 21)
                .addComponent(endJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(finalInspectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(finalInspectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void endJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endJobButtonActionPerformed
        trim();
        if(checks()){
            if(!checkDate(JTFdateField.getText() ) ){
                JOptionPane.showMessageDialog(null, "Format for date field must be DD/MM/YYYY", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                int jobNo = parseInt(jobNumberField.getText());
        String date = JTFdateField.getText();
        String checkedBy = JTFcheckedField.getText();
        
        if(dbtk.addNewFinalInspection(jobNo, date, checkedBy)){
        JOptionPane.showMessageDialog(null, "Successfully added to database", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Failed to add to database", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
            }
            
        }
        
        
    }//GEN-LAST:event_endJobButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FinalInspectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalInspectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalInspectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalInspectionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new FinalInspectionUI(job).setVisible(true);
            }
        }); 
    } 
    
    private void setField(){
        jobNumberField.setText(""+job.get(0).getJobNumber() ); 
    }
    
    private void trim(){
        String textDA = JTFdateField.getText().trim();
        JTFdateField.setText(textDA);
        String textCF = JTFcheckedField.getText().trim();
        JTFcheckedField.setText(textCF);
    }
    
    private boolean checkDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try{
            dateFormat.parse(date.trim());
            
        } catch (ParseException pe){
            return false;
        }
 
        return true;
    }
    
    private boolean checks(){
    if(JTFcheckedField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter who performed the inspection", "", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFcheckedField;
    private javax.swing.JTextField JTFdateField;
    private javax.swing.JLabel checkedLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton endJobButton;
    private javax.swing.JPanel finalInspectionPanel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JTextField jobNumberField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
