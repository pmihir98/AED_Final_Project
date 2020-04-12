/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RandomFiles.DonarDirectory;
import Business.Role.PublicFundManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class PublicDonationOrganization extends Organization {

    private DonarDirectory donarDirectory;

    public PublicDonationOrganization(String name) {
        super(name);
        donarDirectory = new DonarDirectory();
    }

    public DonarDirectory getDonarDirectory() {
        return donarDirectory;
    }

    public void setDonarDirectory(DonarDirectory donarDirectory) {
        this.donarDirectory = donarDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PublicFundManagerRole());
        return roles;
    }

}
