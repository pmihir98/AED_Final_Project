/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RandomFiles.Utility;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Utkarsh
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;

    public ManageEmployeeJPanel(OrganizationDirectory directory, JPanel userProcessContainer) {
        initComponents();
        this.directory = directory;
        this.userProcessContainer = userProcessContainer;
        populate(directory);
        // populateTable(organization);
        displayOrganizationComboBox();
        addOrganizationComboBox();

        empAddTxt.setEnabled(false);
        empPhoneTxt.setEnabled(false);
        emplNameTxt.setEnabled(false);
        addEmpBtn.setEnabled(false);
    }

    public void displayOrganizationComboBox() {
        displayComboBox.removeAllItems();

        for (Organization organization : directory.getOrganizationList()) {
            displayComboBox.addItem(organization);
        }
    }

    public void addOrganizationComboBox() {
        AddComboBox.removeAllItems();

        for (Organization organization : directory.getOrganizationList()) {
            AddComboBox.addItem(organization);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        empPhoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        AddComboBox = new javax.swing.JComboBox();
        emplNameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        displayComboBox = new javax.swing.JComboBox();
        empAddTxt = new javax.swing.JTextField();
        deleteEmpBtn = new javax.swing.JButton();
        addEmpBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 184, 69));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        setLayout(null);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(0, 14, 80, 29);

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Contact");
        add(jLabel5);
        jLabel5.setBounds(322, 403, 70, 17);

        empPhoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPhoneTxtActionPerformed(evt);
            }
        });
        add(empPhoneTxt);
        empPhoneTxt.setBounds(462, 400, 144, 26);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        add(jLabel6);
        jLabel6.setBounds(322, 441, 70, 17);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3);
        jLabel3.setBounds(322, 365, 60, 17);

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact", "Address"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(60, 117, 546, 186);

        AddComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(AddComboBox);
        AddComboBox.setBounds(462, 322, 144, 27);

        emplNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplNameTxtActionPerformed(evt);
            }
        });
        add(emplNameTxt);
        emplNameTxt.setBounds(460, 360, 144, 26);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Organization");
        add(jLabel1);
        jLabel1.setBounds(145, 58, 100, 17);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Organization");
        add(jLabel2);
        jLabel2.setBounds(322, 325, 90, 17);

        displayComboBox.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        displayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        displayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayComboBoxActionPerformed(evt);
            }
        });
        add(displayComboBox);
        displayComboBox.setBounds(278, 55, 179, 27);

        empAddTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAddTxtActionPerformed(evt);
            }
        });
        add(empAddTxt);
        empAddTxt.setBounds(462, 438, 144, 26);

        deleteEmpBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deleteEmpBtn.setText("Delete");
        deleteEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpBtnActionPerformed(evt);
            }
        });
        add(deleteEmpBtn);
        deleteEmpBtn.setBounds(440, 470, 70, 23);

        addEmpBtn.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addEmpBtn.setText("Add");
        addEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpBtnActionPerformed(evt);
            }
        });
        add(addEmpBtn);
        addEmpBtn.setBounds(531, 470, 70, 29);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Employees of an Organisation");
        add(jLabel4);
        jLabel4.setBounds(150, 10, 430, 30);

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setText("Add new Employee?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(60, 321, 186, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void empPhoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPhoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empPhoneTxtActionPerformed

    private void emplNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emplNameTxtActionPerformed

    private void empAddTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAddTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empAddTxtActionPerformed

    private void addEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpBtnActionPerformed

        if (Utility.isNullOrEmpty(emplNameTxt.getText())) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty or null!");
            return;
        }
        if (Utility.isNullOrEmpty(empAddTxt.getText())) {
            JOptionPane.showMessageDialog(this, "Address cannot be empty or null!");
            return;

        }
        if (Utility.isNullOrEmpty(empPhoneTxt.getText())) {
            JOptionPane.showMessageDialog(this, "Phone Number cannot be empty or null!");
            return;
        }
        if (empPhoneTxt.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Phone number has to 10 digited!!");
            return;
        }

        //Need to add checks on this
        Organization organization = (Organization) AddComboBox.getSelectedItem();
        String name = emplNameTxt.getText();
        String address = empAddTxt.getText();
        long phoneNumber = Long.parseLong(empPhoneTxt.getText());

        organization.getEmployeeDirectory().createEmployeeForPanel(name, address, phoneNumber);
        populateTable(organization);
        
        emplNameTxt.setText("");
        empAddTxt.setText("");  
        empPhoneTxt.setText("");
    }//GEN-LAST:event_addEmpBtnActionPerformed

    private void displayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayComboBoxActionPerformed
        Organization organization = (Organization) displayComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }

    }//GEN-LAST:event_displayComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        empAddTxt.setEnabled(true);
        empPhoneTxt.setEnabled(true);
        emplNameTxt.setEnabled(true);
        addEmpBtn.setEnabled(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpBtnActionPerformed

        Organization organization = (Organization) displayComboBox.getSelectedItem();
        int selectedRow = empTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        Integer empId = (Integer) empTable.getValueAt(selectedRow, 0);

        for (Employee e : organization.getEmployeeDirectory().getEmployeeList()) {

            if (e.getId() == empId) {
                organization.getEmployeeDirectory().getEmployeeList().remove(e);
                break;
            }

        }
        
        populateTable(organization);


    }//GEN-LAST:event_deleteEmpBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AddComboBox;
    private javax.swing.JButton addEmpBtn;
    private javax.swing.JButton deleteEmpBtn;
    private javax.swing.JComboBox displayComboBox;
    private javax.swing.JTextField empAddTxt;
    private javax.swing.JTextField empPhoneTxt;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField emplNameTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[4];
            row[0] = employee.getId();
            row[1] = employee.getName();

            row[2] = employee.getPhone();
            row[3] = employee.getAddress();

            model.addRow(row);
        }
    }

    public void populate(OrganizationDirectory directory) {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        model.setRowCount(0);
        for (Organization organization : directory.getOrganizationList()) {
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[4];
                row[0] = employee.getId();
                row[1] = employee.getName();
                row[2] = employee.getPhone();
                row[3] = employee.getAddress();
                model.addRow(row);
            }
        }
    }
}
