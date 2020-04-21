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
 * @author Utkarsh
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

        setBackground(new java.awt.Color(240, 184, 69));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        setLayout(null);

        enterpriseLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(11, 26, 180, 30);

        valueLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        valueLabel.setText("<replace_by_enterprise_name>");
        add(valueLabel);
        valueLabel.setBounds(240, 30, 389, 26);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(87, 107, 454, 144);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Fund Request");
        add(jLabel1);
        jLabel1.setBounds(87, 72, 122, 17);

        requestBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        requestBtn.setText("Request");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn);
        requestBtn.setBounds(538, 421, 99, 29);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Reason");
        add(jLabel2);
        jLabel2.setBounds(87, 285, 80, 22);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Amount");
        add(jLabel3);
        jLabel3.setBounds(87, 319, 80, 22);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Enter the reason and Amount below ");
        add(jLabel4);
        jLabel4.setBounds(87, 257, 300, 17);
        add(reasonTxt);
        reasonTxt.setBounds(205, 287, 182, 26);
        add(amountTxt);
        amountTxt.setBounds(205, 321, 182, 26);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(11, 421, 97, 29);
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
