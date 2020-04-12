/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EducationOrganization;

import Business.Enterprise.Enterprise;
import Business.Organization.EducationOrganisation;
import Business.RandomFiles.Child;
import Business.RandomFiles.Donar;
import Business.RandomFiles.DonationAddWorkRequest;
import Business.RandomFiles.SendToEduConsuWorkRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Businesss.EcoSystem;
import DonationOrganization.CounsellorSolutionJPanel;
import DonationOrganization.ReqToGovJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutipatil
 */
public class CounsellorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ConsultantJPanel
     */
    private JPanel rightJPanel;
    private EducationOrganisation educationOrganisation;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public CounsellorJPanel(JPanel righJPanel, EducationOrganisation educationOrganisation, Enterprise enterprise, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.rightJPanel = righJPanel;
        this.educationOrganisation = educationOrganisation;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;

        populateCounsellingRequest();
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
        counsellorTabl = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        counsellorTabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Student Name", "Issue/Concern", "Solution"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(counsellorTabl);

        jButton4.setText("Delete");

        jButton1.setText("Update Solution");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Organization: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("value_label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(jLabel2)
                            .addGap(106, 106, 106)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton4)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selectedRow = counsellorTabl.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
       // DonationAddWorkRequest request = (DonationAddWorkRequest) fundManageTbl.getValueAt(selectedRow, 0);
       SendToEduConsuWorkRequest sendToEduConsuWorkRequest = (SendToEduConsuWorkRequest) counsellorTabl.getValueAt(selectedRow, 0); 
       
       
       Child child = sendToEduConsuWorkRequest.getMessage();
        
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        rightJPanel.add("CounsellorSolutionJPanel", new CounsellorSolutionJPanel( rightJPanel, child,educationOrganisation));
        layout.next(rightJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable counsellorTabl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void populateCounsellingRequest() {

        DefaultTableModel model = (DefaultTableModel) counsellorTabl.getModel();
        model.setRowCount(0);

        for (WorkRequest request : educationOrganisation.getWorkQueue().getWorkRequestList()) {
            if (request instanceof SendToEduConsuWorkRequest && request.getMessage() instanceof Child) {

                Child d = (Child) request.getMessage();

                Object[] row = new Object[4];
                row[0] = request;
                row[1] = d.getName();
                row[2] = d.getCurrentProblem().getIssue();
                row[3] = d.getCurrentProblem().getSolution();
                model.addRow(row);
            }

        }

    }
}
