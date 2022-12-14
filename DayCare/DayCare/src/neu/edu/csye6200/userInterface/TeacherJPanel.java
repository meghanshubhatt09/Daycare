/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author moinu
 */
public class TeacherJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherJPanel
     */
    private JPanel userProcessContainerJPanel;
    private UpdateTeacherJPanel updateTeacherJPanel;
    private AddTeacherJPanel  addTeacherJPanel;
    public TeacherJPanel(JPanel userProcessContainerJPanel) {
        initComponents();
        this.userProcessContainerJPanel =userProcessContainerJPanel;
    }


    public void updateTeacherJPanel(){
       updateTeacherJPanel = new UpdateTeacherJPanel();
        userProcessContainerJPanel.add("UpdateTeacherJPanel",updateTeacherJPanel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
   }
   public void addTeacherJPanel(){
       addTeacherJPanel = new AddTeacherJPanel();
        userProcessContainerJPanel.add("AddTeacherJPanel",addTeacherJPanel);
        CardLayout layout = (CardLayout) userProcessContainerJPanel.getLayout();
        layout.next(userProcessContainerJPanel);
   }

    public UpdateTeacherJPanel getUpdateTeacherJPanel() {
        return updateTeacherJPanel;
    }

    public void setUpdateTeacherJPanel(UpdateTeacherJPanel udateTeacherJPanel) {
        this.updateTeacherJPanel = udateTeacherJPanel;
    }

    public AddTeacherJPanel getAddTeacherJPanel() {
        return addTeacherJPanel;
    }

    public void setAddTeacherJPanel(AddTeacherJPanel addTeacherJPanel) {
        this.addTeacherJPanel = addTeacherJPanel;
    }
    
    public JPanel getUserProcessContainerJPanel() {
        return userProcessContainerJPanel;
    }

    public void setUserProcessContainerJPanel(JPanel userProcessContainerJPanel) {
        this.userProcessContainerJPanel = userProcessContainerJPanel;
    }

    public JButton getBtnAddTeacher() {
        return btnAddTeacher;
    }

    public void setBtnAddTeacher(JButton btnAddTeacher) {
        this.btnAddTeacher = btnAddTeacher;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnUpdateTeacher() {
        return btnUpdateTeacher;
    }

    public void setBtnUpdateTeacher(JButton btnUpdateTeacher) {
        this.btnUpdateTeacher = btnUpdateTeacher;
    }

    public JTable getTblTeacherRecords() {
        return tblTeacherRecords;
    }

    public void setTblTeacherRecords(JTable tblTeacherRecords) {
        this.tblTeacherRecords = tblTeacherRecords;
    }

 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeacherRecords = new javax.swing.JTable();
        btnAddTeacher = new javax.swing.JButton();
        btnUpdateTeacher = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblTeacherRecords.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTeacherRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "First Name", "Last Name", "Class Assigned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTeacherRecords);

        btnAddTeacher.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnAddTeacher.setText("Add New Teacher");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnUpdateTeacher.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnUpdateTeacher.setText("Update Selected Teacher");
        btnUpdateTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTeacherActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnDelete.setText("Delete Selected Teacher");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Teacher Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAddTeacher)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateTeacher)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTeacherActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTeacherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdateTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTeacherRecords;
    // End of variables declaration//GEN-END:variables
}
