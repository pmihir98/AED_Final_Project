/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.HealthCareOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Businesss.EcoSystem;
import Govt_HealthCare.DoctorJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Utkarsh
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {

        return new DoctorJPanel(userProcessContainer, (HealthCareOrganization)organization, enterprise, account, business);
    }
    
}
