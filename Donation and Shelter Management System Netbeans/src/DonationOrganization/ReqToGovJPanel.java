/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonationOrganization;

import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Organization.DonationsOrganisation;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.RandomFiles.FundReqToGov;
import Business.RandomFiles.ReqFundFromGovtWorkRequest;
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
 * @author Sudheer Reddy Gaddam
 */
public class ReqToGovJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReqToGovJPanle
     */
    private JPanel rightJPanel;
    private DonationsOrganisation donationsOrganisation;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private String receiver;

    public ReqToGovJPanel(JPanel righJPanel, DonationsOrganisation donationsOrganisation,
            Enterprise enterprise, UserAccount userAccount, EcoSystem business) {
        initComponents();
        this.rightJPanel = righJPanel;
        this.donationsOrganisation = donationsOrganisation;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        this.receiver = receiver;
        populateTableWithAmountReasonAndStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReq = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        requestBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reasonTxt = new javax.swing.JTextField();
        amountTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<replace_by_enterprise_name>");

        tableReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender_Name", "Amount", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableReq);
        if (tableReq.getColumnModel().getColumnCount() > 0) {
            tableReq.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setText("Fund Request");

        requestBtn.setText("Request");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Reason");

        jLabel3.setText("Amount");

        jLabel4.setText("Enter the reason and Amount below ");

        jButton1.setText("<<Back");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(valueLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(74, 74, 74)
                                    .addComponent(amountTxt))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(reasonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(requestBtn))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(reasonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestBtn)
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        //make a req obejct and sent to govt finance department

        //FundReqToGovList fundReqToGovList = donationsOrganisation.getFundRequestslist();
        //FundReqToGov fundReqToGov = fundReqToGovList.addReq();
        FundReqToGov fundReqToGov = new FundReqToGov();

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
       
        if(Utility.isNullOrEmpty(reasonTxt.getText())){
           JOptionPane.showMessageDialog(this, "Reason cannot be empty or null!!");
           return;
       }
        
        fundReqToGov.setAmount(Integer.parseInt(amountTxt.getText()));
        fundReqToGov.setReason(reasonTxt.getText());

        //Fetch organisation which is finfncaceOrganisarion in govt enterpise
        ReqFundFromGovtWorkRequest reqFundFromGovtWorkRequest = new ReqFundFromGovtWorkRequest();

        //create a new Fund request to gov obj and add it to message
        reqFundFromGovtWorkRequest.setMessage(fundReqToGov);
        reqFundFromGovtWorkRequest.setRequestDate(new Date());
        reqFundFromGovtWorkRequest.setSender(userAccount);
        reqFundFromGovtWorkRequest.setStatus("Sent");

        Organization financeOrganization = null;
        for (Enterprise e : business.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof GovernmentEnterprise) {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof FinanceOrganization) {
                        financeOrganization = organization;
                        break;
                    }
                }
            }
        }
        //Object is aadded to use accotn and pushed to fincanceOrganisation of govet enterprise
        if (financeOrganization != null) {
            financeOrganization.getWorkQueue().getWorkRequestList().add(reqFundFromGovtWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(reqFundFromGovtWorkRequest);
        }

        JOptionPane.showMessageDialog(this, "Funding request has been sent to Government. Will soon be processed");
         populateTableWithAmountReasonAndStatus();
        amountTxt.setText("");
        reasonTxt.setText("");
       


    }//GEN-LAST:event_requestBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField reasonTxt;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTable tableReq;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateTableWithAmountReasonAndStatus() {

        DefaultTableModel model = (DefaultTableModel) tableReq.getModel();

        //In wrklist only those with message type fundreqtoGiv are considered
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof  ReqFundFromGovtWorkRequest && request.getMessage() instanceof FundReqToGov) {
                FundReqToGov f = (FundReqToGov) request.getMessage();
                Object[] row = new Object[4];
                row[0] = request;
                row[1] = f.getAmount();
                row[2] = f.getReason();

                row[3] = "Requested";

                model.addRow(row);
            }
        }

    }
}