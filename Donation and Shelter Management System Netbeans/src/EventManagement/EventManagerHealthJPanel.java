/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManagement;

import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Organization.EducationOrganisation;
import Business.Organization.EventManagementOrganisation;
import Business.Organization.HealthCareOrganization;
import Business.Organization.Organization;
import Business.RandomFiles.Child;
import Business.RandomFiles.Problem;
import Business.RandomFiles.SendToGovtHealthCareWorkRequest;
import Business.UserAccount.UserAccount;
import Businesss.EcoSystem;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class EventManagerHealthJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventManagerHealthJPanel
     */
    private JPanel rightJPanel;
    private EventManagementOrganisation eventManagementOrganisation;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public EventManagerHealthJPanel(JPanel rightJPanel, EventManagementOrganisation organization, Enterprise enterprise, UserAccount userAccount, EcoSystem business) {
        initComponents();

        this.rightJPanel = rightJPanel;
        this.eventManagementOrganisation = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        valueLabel.setText(organization.getName());
        populateChildrenInTableFetchedFromEduOrg();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        childTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        sendtoHealthCareBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        probTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Organization:  ");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("<change_it_to_name_of_org>");

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        childTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Age", "Gender", "Standard", "CurProSol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(childTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Select student for health Check up from below table");

        sendtoHealthCareBtn.setText("Send to Health Care Center");
        sendtoHealthCareBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoHealthCareBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Problem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(probTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendtoHealthCareBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valueLabel)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(probTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(sendtoHealthCareBtn)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendtoHealthCareBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoHealthCareBtnActionPerformed

        int selectedRow = childTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        Child child = (Child) childTable.getValueAt(selectedRow, 0);

        Problem problem = new Problem(probTxt.getText(), null);
        if(child.getProblems() == null){
            child.setProblems(new ArrayList<>());
        }
        child.getProblems().add(problem);
        child.setCurrentProblem(problem);

        //Make a req and send to Govt health care 
        SendToGovtHealthCareWorkRequest sendToGovtHealthCareWorkRequest = new SendToGovtHealthCareWorkRequest();

        sendToGovtHealthCareWorkRequest.setMessage(child);
        sendToGovtHealthCareWorkRequest.setRequestDate(new Date());
        sendToGovtHealthCareWorkRequest.setSender(userAccount);
        sendToGovtHealthCareWorkRequest.setStatus("Sent");

        
        
        HealthCareOrganization org = null;
        for (Enterprise e : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof GovernmentEnterprise) {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof HealthCareOrganization) {
                        org = (HealthCareOrganization) organization;
                    }
                }
            }
        }

        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(sendToGovtHealthCareWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(sendToGovtHealthCareWorkRequest);
        }

        JOptionPane.showMessageDialog(this, "Whole Body health report of a child is sent to doctor!!!");
        probTxt.setText("");


    }//GEN-LAST:event_sendtoHealthCareBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);   
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable childTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField probTxt;
    private javax.swing.JButton sendtoHealthCareBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateChildrenInTableFetchedFromEduOrg() {

        DefaultTableModel model = (DefaultTableModel) childTable.getModel();
        model.setRowCount(0);
        //fetch education org.
        EducationOrganisation eduOrganization = null;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof EducationOrganisation) {
                eduOrganization = (EducationOrganisation) o;
            }
        }

        if (eduOrganization.getChildDirectory() == null || eduOrganization.getChildDirectory().getChildList() == null) {
            JOptionPane.showMessageDialog(this, "No children are present in orphange as of now!!!");
            return;
        }

        for (Child e : eduOrganization.getChildDirectory().getChildList()) {

            Object[] row = new Object[6];

            row[0] = e;
            row[1] = e.getId();
            row[2] = e.getAge();
            row[3] = e.getGender();
            row[4] = e.getStandard();
            row[5] = e.getCurrentProblem() == null ? null : e.getCurrentProblem().getSolution();

            model.addRow(row);

        }

    }
}
