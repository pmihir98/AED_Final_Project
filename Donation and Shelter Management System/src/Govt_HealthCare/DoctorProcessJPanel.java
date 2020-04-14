/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Govt_HealthCare;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OrphanageEnterprise;
import Business.Organization.DonationsOrganisation;
import Business.Organization.HealthCareOrganization;
import Business.Organization.Organization;
import Business.RandomFiles.Child;
import Business.RandomFiles.ExpenseManagerWorkRequest;
import Business.RandomFiles.ExpenseObject;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Businesss.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import userInterface.publicDonation.PublicDonationManager;

/**
 *
 * @author Utkarsh
 */
public class DoctorProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorProcessJPanel
     */
    private JPanel rightJPanel;
    private Child child;
    private HealthCareOrganization healthCareOrganization;
    private WorkRequest sendToGovtHealthCareWorkRequest;
     private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    
    public DoctorProcessJPanel( JPanel rightJPanel,Child child,HealthCareOrganization healthCareOrganization,WorkRequest sendToGovtHealthCareWorkRequest,Enterprise enterprise,
            UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.child = child;
        this.healthCareOrganization = healthCareOrganization;
        this.sendToGovtHealthCareWorkRequest = sendToGovtHealthCareWorkRequest;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        
        valueLabel.setText(healthCareOrganization.getName());
        issueLabel.setText(child.getCurrentProblem().getIssue());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        issueLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        presTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 184, 69));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Organization:  ");

        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        valueLabel.setText("<change_it_to_name_of_org>");

        backBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Issue/Concern: ");

        issueLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        issueLabel.setText("<issue>");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Prescription: ");

        presTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presTxtActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(valueLabel)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(issueLabel))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(presTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void presTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        child.getCurrentProblem().setSolution(presTxt.getText());
        sendToGovtHealthCareWorkRequest.setStatus("Completed");
        
        Component[] components = rightJPanel.getComponents();
        
        for(Component c : components){
            if(c instanceof DoctorJPanel){
                ((DoctorJPanel) c).populateReceivedRequests();
            }
        }
        
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.remove(this);
        layout.previous(rightJPanel);
       
        //Push the bill to Expenditure management with a obj 
        
        Organization donationOrganisation = null;
        for (Enterprise e : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof OrphanageEnterprise) {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof DonationsOrganisation) {
                        donationOrganisation = organization;
                        break;
                    }
                }
            }
        }
        
        ExpenseObject expenseObject = new ExpenseObject();
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        
        expenseObject.setAmount(String.valueOf(result));
        expenseObject.setChildId(child.getId());
        
        expenseObject.setPurpose("Medication Charge");
        
        ExpenseManagerWorkRequest expenseManagerWorkRequest = new ExpenseManagerWorkRequest();
        
        expenseManagerWorkRequest.setMessage(expenseObject);
        expenseManagerWorkRequest.setRequestDate(new Date());
        expenseManagerWorkRequest.setSender(userAccount);
        expenseManagerWorkRequest.setStatus("Sent");
        
        
        if (donationOrganisation != null) {
            donationOrganisation.getWorkQueue().getWorkRequestList().add(expenseManagerWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(expenseManagerWorkRequest);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel issueLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField presTxt;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
