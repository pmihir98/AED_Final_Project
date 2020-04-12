/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Businesss.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public abstract class Role {
public enum RoleType{
        Donations("Donations"),
        Education("Education"),
        EventManagement("EventManagement"),
         FinanceDepartment("FinanceDepartment"), HealthCare("HealthCare"),
         PublicDonation("PublicDonation");
        //Add more 
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
   
   @Override
    public String toString() {
        return this.getClass().getName();
    }
}