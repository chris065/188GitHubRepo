/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VultureSoftware;
import databaseui.*;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Nathan
 *         + Jordan Thompson 17012215
 */
public class CurrentTasksUI extends javax.swing.JFrame {

    //Connect to database and utilize database tools.
    DataBaseToolkit dbtk;
    //Create a new list model for the task list.
    DefaultListModel taskListModel = new DefaultListModel();
    //Create a new list model for the task list for filtering items.
    DefaultListModel filteredItems = new DefaultListModel();
    /**
     * Creates new form TaskList
     */
    public CurrentTasksUI() {
        dbtk = new DataBaseToolkit();
        initComponents();
        populateList();
        test();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskListPanel = new javax.swing.JPanel();
        taskListScrollPane = new javax.swing.JScrollPane();
        taskList = new javax.swing.JList<>();
        titleLabel = new javax.swing.JLabel();
        detailsScrollPane = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        searchTextField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        taskEditButton = new javax.swing.JButton();
        taskDeleteButton = new javax.swing.JButton();
        taskAddButton = new javax.swing.JButton();
        taskRefreshButton = new javax.swing.JButton();
        taskDelayButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        finalInspectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taskListPanel.setBackground(new java.awt.Color(102, 153, 255));

        taskListScrollPane.setBorder(null);

        taskList.setBackground(new java.awt.Color(102, 153, 255));
        taskList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taskList.setForeground(new java.awt.Color(255, 255, 255));
        taskList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Task list" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        taskList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        taskList.setFocusable(false);
        taskList.setSelectionBackground(new java.awt.Color(102, 153, 255));
        taskList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                taskListValueChanged(evt);
            }
        });
        taskListScrollPane.setViewportView(taskList);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Task List");

        detailsTextArea.setEditable(false);
        detailsTextArea.setColumns(20);
        detailsTextArea.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        detailsTextArea.setRows(5);
        detailsScrollPane.setViewportView(detailsTextArea);

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search/Filter:");

        taskEditButton.setText("Edit Task");

        taskDeleteButton.setText("Delete Task");

        taskAddButton.setText("Add Task");
        taskAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskAddButtonActionPerformed(evt);
            }
        });

        taskRefreshButton.setText("Refresh List");

        taskDelayButton.setText("Delay Task");

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setText("Select a task here before clicking a button");

        finalInspectButton.setText("Final Inspection");
        finalInspectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalInspectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout taskListPanelLayout = new javax.swing.GroupLayout(taskListPanel);
        taskListPanel.setLayout(taskListPanelLayout);
        taskListPanelLayout.setHorizontalGroup(
            taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(taskListPanelLayout.createSequentialGroup()
                        .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taskListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(taskListPanelLayout.createSequentialGroup()
                                .addComponent(searchLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoLabel)
                            .addComponent(detailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskDelayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taskRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalInspectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        taskListPanelLayout.setVerticalGroup(
            taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskListPanelLayout.createSequentialGroup()
                .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(taskListPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(taskListPanelLayout.createSequentialGroup()
                                .addComponent(infoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detailsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(taskListPanelLayout.createSequentialGroup()
                                .addComponent(taskDelayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(taskEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(taskDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(taskAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(taskRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(finalInspectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(taskListPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(13, 13, 13)
                        .addGroup(taskListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taskListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    When a task is selected, displays information about said task in the text area.
    
    old nathan method - does not get tasks for the job its linked to
    */
    private void taskListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_taskListValueChanged
        String taskName = taskList.getSelectedValue();
        //Used to prevent errors with the filter function.
        if(taskName == null)
        {
            taskName = null;
        }
        //Get task details and assign them to the text area.
        else 
        {
        ArrayList<TaskObject> taskData = dbtk.getTask(taskName);
        
        String tech = taskData.get(0).getAssignedTo();
        //int expectedTime = taskData.get(0).getExpectedTime();
        String prefs = taskData.get(0).getPrefs();
        String talents = taskData.get(0).getTalents();
        String priority = taskData.get(0).getPriority();
        
        detailsTextArea.setText(null);
        detailsTextArea.setText("Technician assigned to this task: " + tech + "\n\n");
        //detailsTextArea.append("This task is expected to be completed in " + Integer.toString(expectedTime) + " days.\n\n");
        detailsTextArea.append("Task Preferences:\n" + prefs + "\n\n");
        detailsTextArea.append("Requiered Talents:\n" + talents + "\n\n");
        detailsTextArea.append("This tasks priority is " + priority + ".");
        }
    }//GEN-LAST:event_taskListValueChanged
    /*
    When a key is released in the search field, call searchFilter().
    */
    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        searchFilter(searchTextField.getText());
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void taskAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskAddButtonActionPerformed
        new TaskAddUI().setVisible(true);
    }//GEN-LAST:event_taskAddButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void finalInspectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalInspectButtonActionPerformed
        new FinalInspectionUI().setVisible(true);
    }//GEN-LAST:event_finalInspectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CurrentTasksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentTasksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentTasksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentTasksUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentTasksUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane detailsScrollPane;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JButton finalInspectButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton taskAddButton;
    private javax.swing.JButton taskDelayButton;
    private javax.swing.JButton taskDeleteButton;
    private javax.swing.JButton taskEditButton;
    private javax.swing.JList<String> taskList;
    private javax.swing.JPanel taskListPanel;
    private javax.swing.JScrollPane taskListScrollPane;
    private javax.swing.JButton taskRefreshButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    /*
    Populates the task list with allocated tasks.
    */
    public void populateList()
    {
        
        taskList.setModel(taskListModel);
        ArrayList tasks = dbtk.getAllTasks();
        
        for(int i = 0; i < tasks.size(); i++)
        {
            ArrayList<TaskObject> taskData = dbtk.getTask(tasks.get(i).toString());
            
            //If a task is not assigned then it is not added to the list.
            if (taskData.get(0).getAssignedTo() == null)
            {
                taskData = null;
            }
            else
            {
                taskListModel.addElement(tasks.get(i).toString());
            }
        }
    }
    
    /*
    Allows the user to search and filter through tasks.
    */
    public void searchFilter(String searchTerm)
    {   
        detailsTextArea.setText(null);
        
        taskList.setModel(filteredItems);
        
        ArrayList tasks = dbtk.getAllTasks();
        
        if(tasks == null)
        {
            JOptionPane.showMessageDialog(null, "No tasks could be found in the database. Please contact an administrator if this problem persists.", "Error", JOptionPane.WARNING_MESSAGE);
            taskList.setEnabled(false);
            searchTextField.setEnabled(false);
            detailsTextArea.setEnabled(false);
        }
        else
        {
            //If the search field is not empty, find allocated tasks to match the search term.
            if(!searchTextField.getText().equals(""))
            {
                filteredItems.removeAllElements();
                
                for(int i = 0; i < tasks.size(); i++)
                {
                    ArrayList<TaskObject> taskData = dbtk.getTask(tasks.get(i).toString());

                    //If task is not assigned then exclude from search. Else add taks to filteredItems ans set filteredItems as the list model.
                    if (taskData.get(0).getAssignedTo() == null)
                    {
                        taskData = null;
                    }
                    else
                    {

                    String taskName = tasks.get(i).toString();
                    if(taskName.toLowerCase().contains(searchTerm.toLowerCase()))
                        {
                                filteredItems.addElement(taskName);
                        }
                    }
                }
                tasks.clear();
            }
            //Set the task list model to taskListModel.
            else
            {
                taskList.setModel(taskListModel);
            }  
        }
    }
        public String test()
        {
             ArrayList tasks = dbtk.getAllTasks();
             
            for(int i = 0; i < tasks.size(); i++)
            {
                String taskName = tasks.get(i).toString();
                System.out.println(taskName);
            }
            return null;
        }
}
