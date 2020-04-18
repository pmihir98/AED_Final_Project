/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ActivityConsultantRole;
import Business.Role.ActivityManagerRole;
import Business.Role.DoctorRole;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Utkarsh
 */
public class HealthCareOrganization extends Organization {

    public HealthCareOrganization(String name) {
        super(name);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
       // roles.add(new LabAssistantRole());
        return roles;
    }

}
