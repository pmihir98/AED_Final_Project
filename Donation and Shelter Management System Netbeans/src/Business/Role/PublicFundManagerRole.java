/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PublicDonationOrganization;
import Business.UserAccount.UserAccount;
import Businesss.EcoSystem;
import javax.swing.JPanel;
import userInterface.publicDonation.PublicDonationManager;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class PublicFundManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new  PublicDonationManager(userProcessContainer, (PublicDonationOrganization)organization, enterprise, account,business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
