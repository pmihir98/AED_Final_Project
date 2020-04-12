/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Govt_FinanceDept;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OrphanageEnterprise;
import Business.Organization.DonationsOrganisation;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.RandomFiles.DonationAddWorkRequest;

import Business.RandomFiles.FundReqToGov;
import Business.RandomFiles.ReqFundFromGovtWorkRequest;
import Business.RandomFiles.SourceAmount;
import Business.RandomFiles.SourceAmountList;
import Business.RandomFiles.Utility;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Businesss.EcoSystem;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutipatil
 */
public class FinanceDeptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinanceDeptJPanel
     */
    private JPanel rightJPanel;
    private FinanceOrganization financeOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public FinanceDeptJPanel(JPanel righJPanel, FinanceOrganization financeOrganization, Enterprise enterprise, UserAccount userAccount, EcoSystem business) {
        initComponents();

        this.rightJPanel = righJPanel;
        this.financeOrganization = financeOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        populateSourceAmount();
        populateRequestsReceived();
        totalIncomeTxt.setEditable(false);
        valLable.setText(financeOrganization.getName());
        totalIncomeTxt.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalIncomeTxt = new javax.swing.JTextField();
        amountTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sourceIncomeTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        workQueTbl = new javax.swing.JTable();
        approveReqBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        incomeTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        valLable = new javax.swing.JLabel();

        addBtn.setText("Add Income");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Source of Income");

        jLabel4.setText("Amount (in $)");

        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Income");

        sourceIncomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceIncomeTxtActionPerformed(evt);
            }
        });

        workQueTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestedBy", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workQueTbl);

        approveReqBtn.setText("ApproveRequest");
        approveReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveReqBtnActionPerformed(evt);
            }
        });

        incomeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Source of income", "Amount"
            }
        ));
        jScrollPane2.setViewportView(incomeTbl);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Organization: ");

        valLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valLable.setText("value_label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(approveReqBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(amountTxt)
                                    .addComponent(sourceIncomeTxt)
                                    .addComponent(totalIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(27, 27, 27)
                                    .addComponent(valLable)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valLable))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(approveReqBtn)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sourceIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        
        if(Utility.isNullOrEmpty(amountTxt.getText())){
           JOptionPane.showMessageDialog(this, "Amount cannot be negative or null!!");
           return;
       }
       
       try{
           Integer.parseInt(amountTxt.getText());
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Enter amount in integer");
           return;
       }
       
       if(Integer.parseInt(amountTxt.getText()) <=  0){
           JOptionPane.showMessageDialog(this, "Amount has to be greater than zero");
           return;
       }
       
        if(Utility.isNullOrEmpty(sourceIncomeTxt.getText())){
           JOptionPane.showMessageDialog(this, "Source of income cannot be empty or null!!");
           return;
       }
        
        //Adding source of icome
        if(financeOrganization.getSourceAmountList() == null){
            SourceAmountList sourceAmountList = new SourceAmountList();
            financeOrganization.setSourceAmountList(sourceAmountList);
        }
        SourceAmount s = financeOrganization.getSourceAmountList().addSourceA();
        s.setAmount(Integer.valueOf(amountTxt.getText()));
        s.setBodyName(sourceIncomeTxt.getText());
        financeOrganization.setTotalIncome(financeOrganization.getTotalIncome() + Integer.valueOf(amountTxt.getText()));
        populateSourceAmount();
        totalIncomeTxt.setText(String.valueOf(financeOrganization.getTotalIncome()));


        amountTxt.setText("");
        sourceIncomeTxt.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTxtActionPerformed

    private void sourceIncomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceIncomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceIncomeTxtActionPerformed

    private void approveReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveReqBtnActionPerformed

        int selectedRow = workQueTbl.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        WorkRequest request = (WorkRequest) workQueTbl.getValueAt(selectedRow, 0);
        
        if(((FundReqToGov)request.getMessage()).getAmount() > financeOrganization.getTotalIncome()){
            JOptionPane.showMessageDialog(this, "Amount requested is greater than the amount present, can't allocate now!!!");
            return;
        }

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            
            request.setReceiver(userAccount);
            request.setStatus("Received");
            request.setResolveDate(new Date());
            
            financeOrganization.setTotalIncome(financeOrganization.getTotalIncome() - ((FundReqToGov)request.getMessage()).getAmount());
            if(financeOrganization.getTotalIncome() - ((FundReqToGov) request.getMessage()).getAmount()< 0){
                financeOrganization.setTotalIncome(0);
            }
            populateRequestsReceived();
            totalIncomeTxt.setText(String.valueOf(financeOrganization.getTotalIncome()));
            
            //Make it fetch the Donations organisation and add this amount to total
            
            for(Enterprise e : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()){
                //Check for Social
                if ( e instanceof OrphanageEnterprise){
                for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof DonationsOrganisation){
                        DonationsOrganisation d = (DonationsOrganisation)o;
                        for(WorkRequest reqFundFromGovtWorkRequest :d.getWorkQueue().getWorkRequestList()){
                            if(request == reqFundFromGovtWorkRequest){
                                
                                reqFundFromGovtWorkRequest.setStatus("Received");
                                
                                
                            }
                        }
                      d.setAvailableFund(d.getAvailableFund() + ((FundReqToGov)request.getMessage()).getAmount());
                    }
                }
            }
            }
            
            
        } else if (request.getStatus().equalsIgnoreCase("received")) {
            JOptionPane.showMessageDialog(null, "The selected row is already processed!!");
        }
        //Need to update the data of the sender also

        //just change the status and add the amount to toatl income

    }//GEN-LAST:event_approveReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton approveReqBtn;
    private javax.swing.JTable incomeTbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField sourceIncomeTxt;
    private javax.swing.JTextField totalIncomeTxt;
    private javax.swing.JLabel valLable;
    private javax.swing.JTable workQueTbl;
    // End of variables declaration//GEN-END:variables

    private void populateRequestsReceived() {

        if (financeOrganization.getWorkQueue().getWorkRequestList() != null) {

            DefaultTableModel model = (DefaultTableModel) workQueTbl.getModel();

            model.setRowCount(0);

            for (WorkRequest request : financeOrganization.getWorkQueue().getWorkRequestList()) {

                if (request instanceof ReqFundFromGovtWorkRequest && request.getMessage() instanceof FundReqToGov) {

                    FundReqToGov d = (FundReqToGov) request.getMessage();
                    Object[] row = new Object[3];
                    row[0] = request;
                    row[1] = d.getAmount();
                    row[2] = request.getStatus();
                    model.addRow(row);
                }
            }
        }
        

    }

    private void populateSourceAmount() {

        

            DefaultTableModel model = (DefaultTableModel) incomeTbl.getModel();

            model.setRowCount(0);

            if (financeOrganization.getSourceAmountList() == null || financeOrganization.getSourceAmountList().getSourceAmounts() == null) {
                JOptionPane.showMessageDialog(this, "No source amounts registered till now!!");
                return;
               
            }
            for (SourceAmount s : financeOrganization.getSourceAmountList().getSourceAmounts()) {

                Object[] row = new Object[2];
                row[0] = s.getBodyName();
                row[1] = s.getAmount();
                model.addRow(row);

            }
            
            totalIncomeTxt.setText(String.valueOf(financeOrganization.getTotalIncome()));
        

    }
}
