/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EducationOrganization;

import Business.Organization.EducationOrganisation;
import Business.RandomFiles.Child;
import Business.RandomFiles.ChildDirectory;
import Business.RandomFiles.FreeChild;
import Business.RandomFiles.FreeChildDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Utkarsh
 */
public class FreeAChildJPanel extends javax.swing.JPanel {
    
    private JPanel rightJPanel;
    private EducationOrganisation educationOrganisatin;
    private Child child;
    
    FreeAChildJPanel(JPanel rightJPanel, EducationOrganisation educationOrganisation, Child child) {
        this.rightJPanel = rightJPanel;
        this.educationOrganisatin = educationOrganisation;
        this.child = child;
        initComponents();
        
        parentNametxt.setEnabled(false);
        addrTxt.setEnabled(false);
        
        bioCOmbo.setEnabled(false);
        fosterCOmbo.setEnabled(false);
        phyCombo.setEnabled(false);
        workCombo.setEnabled(false);
        marriageCombo.setEnabled(false);
        occuCombo.setEnabled(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        reasonBox = new javax.swing.JComboBox<>();
        parentNametxt = new javax.swing.JTextField();
        addrTxt = new javax.swing.JTextField();
        occuCombo = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        marriageCombo = new javax.swing.JComboBox<>();
        bioCOmbo = new javax.swing.JComboBox<>();
        fosterCOmbo = new javax.swing.JComboBox<>();
        phyCombo = new javax.swing.JComboBox<>();
        workCombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(240, 189, 69));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Basic Information before Relieving Child");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Reason");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Adopted by biological parents/ family members?");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Adopted by foster parents?");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Is child physically handicapped?");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Parent Details");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel7.setText("Marital Status");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel9.setText("Occupation");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Does child have any work opportunity?");

        reasonBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        reasonBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Living Independently", "Reached Maximum Age", "Adopted", "Joined Military", "Higher Education" }));
        reasonBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonBoxActionPerformed(evt);
            }
        });

        occuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Self Employed", "Salaried Employee", "Business", "Item 4" }));

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jButton1.setText("<<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        marriageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Single" }));
        marriageCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriageComboActionPerformed(evt);
            }
        });

        bioCOmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        bioCOmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bioCOmboActionPerformed(evt);
            }
        });

        fosterCOmbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        fosterCOmbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fosterCOmboActionPerformed(evt);
            }
        });

        phyCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        phyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phyComboActionPerformed(evt);
            }
        });

        workCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        workCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reasonBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bioCOmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(parentNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(occuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(marriageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fosterCOmbo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(reasonBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bioCOmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fosterCOmbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(workCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(parentNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(marriageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(occuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submitBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Component[] components = rightJPanel.getComponents();
        
        for(Component c : components){
            if(c instanceof EducationAdminJPanel){
                ((EducationAdminJPanel) c).populateChildren();
            }
        }
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void marriageComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriageComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marriageComboActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String reason = String.valueOf(reasonBox.getSelectedItem());
        
        
        if(educationOrganisatin.getFreeChildDirectory() == null || educationOrganisatin.getFreeChildDirectory().getFreeChilds() == null){
            educationOrganisatin.setFreeChildDirectory(new FreeChildDirectory());
        }
        
        
        FreeChild freeChild = educationOrganisatin.getFreeChildDirectory().addChild();
        if (!reason.equalsIgnoreCase("Adopted")) {
            freeChild.setReason(reason);
            if (String.valueOf(workCombo.getSelectedItem()).equalsIgnoreCase("Yes")) {
                freeChild.setWorkOpportunity(true);
            } else {
                freeChild.setWorkOpportunity(false);
            }
            if (String.valueOf(phyCombo.getSelectedItem()).equalsIgnoreCase("Yes")) {
                freeChild.setPhysicalhandicap(true);
            } else {
                freeChild.setPhysicalhandicap(false);
            }
        } else {
            freeChild.setReason(reason);
            if (String.valueOf(workCombo.getSelectedItem()).equalsIgnoreCase("Yes")) {
                freeChild.setWorkOpportunity(true);
            } else {
                freeChild.setWorkOpportunity(false);
            }
            if (String.valueOf(phyCombo.getSelectedItem()).equalsIgnoreCase("Yes")) {
                freeChild.setPhysicalhandicap(true);
            } else {
                freeChild.setPhysicalhandicap(false);
            }
            
            freeChild.getParentFreeChild().setName(parentNametxt.getText());
            if (String.valueOf(marriageCombo.getSelectedItem()).equalsIgnoreCase("married")) {
                freeChild.getParentFreeChild().setMarried(true);
            } else {
                freeChild.getParentFreeChild().setMarried(false);
            }
            
            freeChild.getParentFreeChild().setOccupation(String.valueOf(occuCombo.getSelectedItem()));
            if (String.valueOf(fosterCOmbo.getSelectedItem()).equalsIgnoreCase("Yes")) {
                freeChild.setAdoptionFoster(true);
            } else {
                freeChild.setAdoptionFoster(false);
            }
            if (String.valueOf(bioCOmbo.getSelectedItem()).equalsIgnoreCase("Yes")) {
                freeChild.setAdoptionFamily(true);
            } else {
                freeChild.setAdoptionFamily(false);
            }
            freeChild.getParentFreeChild().setAddress(addrTxt.getText());
        }
        
        educationOrganisatin.getChildDirectory().getChildList().remove(child);
        JOptionPane.showMessageDialog(this, "Child details are saved successfully!!!");
        
        parentNametxt.setText("");
        addrTxt.setText("");
        

    }//GEN-LAST:event_submitBtnActionPerformed

    private void bioCOmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bioCOmboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bioCOmboActionPerformed

    private void fosterCOmboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fosterCOmboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fosterCOmboActionPerformed

    private void phyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phyComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phyComboActionPerformed

    private void workComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboActionPerformed

    private void reasonBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonBoxActionPerformed
        String reason = String.valueOf(reasonBox.getSelectedItem());
        if (reason.equalsIgnoreCase("Adopted")) {
            
            parentNametxt.setEnabled(true);
            addrTxt.setEnabled(true);
            bioCOmbo.setEnabled(true);
            fosterCOmbo.setEnabled(true);
            phyCombo.setEnabled(true);
            workCombo.setEnabled(true);
            marriageCombo.setEnabled(true);
            occuCombo.setEnabled(true);
        }

    }//GEN-LAST:event_reasonBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrTxt;
    private javax.swing.JComboBox<String> bioCOmbo;
    private javax.swing.JComboBox<String> fosterCOmbo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> marriageCombo;
    private javax.swing.JComboBox<String> occuCombo;
    private javax.swing.JTextField parentNametxt;
    private javax.swing.JComboBox<String> phyCombo;
    private javax.swing.JComboBox<String> reasonBox;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> workCombo;
    // End of variables declaration//GEN-END:variables
}
