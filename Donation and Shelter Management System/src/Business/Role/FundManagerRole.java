/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.DonationsOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Businesss.EcoSystem;
import DonationOrganization.FundManager;
import javax.swing.JPanel;

/**
 *
 * @author Utkarsh
 */
public class FundManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return  new FundManager( userProcessContainer,  (DonationsOrganisation) organization, enterprise,  account,  business); 
//To change body of generated methods, choose Tools | Templates.
    }
    
}
