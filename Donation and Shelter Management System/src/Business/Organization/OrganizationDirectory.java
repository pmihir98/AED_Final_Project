/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utkarsh
 */
public class OrganizationDirectory {
    
    private List<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
    
        public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.Donations.getValue())){
            organization = new DonationsOrganisation("DonationsOrganisation");
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.EventManagement.getValue())){
            organization = new EventManagementOrganisation("EventManagementOrganisation");
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Education.getValue())){
            organization = new EducationOrganisation("EducationOrganisation");
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FinanceDepartment.getValue())){
            organization = new FinanceOrganization("FinanceOrganization");
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HealthCare.getValue())){
            organization = new HealthCareOrganization("HealthCareOrganization");
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.publicDonations.getValue())){
            organization = new PublicDonationOrganization("PublicDonationOrganization");
            organizationList.add(organization);
        }
        
        return organization;
    }
     
}
