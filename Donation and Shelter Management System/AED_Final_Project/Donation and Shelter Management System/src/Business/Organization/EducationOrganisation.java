/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;



import Business.RandomFiles.ChildDirectory;
import Business.RandomFiles.FreeChildDirectory;
import Business.Role.EduCounselorRole;
import Business.Role.EducationAdminRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Utkarsh
 */
public class EducationOrganisation extends Organization{
    
    private ChildDirectory childDirectory;
    
    private FreeChildDirectory freeChildDirectory;

    public EducationOrganisation(String name) {
        super(name);
        this.childDirectory = new ChildDirectory();
        this.freeChildDirectory = new FreeChildDirectory();
    }

    public ChildDirectory getChildDirectory() {
        return childDirectory;
    }

    public void setChildDirectory(ChildDirectory childDirectory) {
        this.childDirectory = childDirectory;
    }

    public FreeChildDirectory getFreeChildDirectory() {
        return freeChildDirectory;
    }

    public void setFreeChildDirectory(FreeChildDirectory freeChildDirectory) {
        this.freeChildDirectory = freeChildDirectory;
    }

    
    
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new EduCounselorRole());
        roles.add(new EducationAdminRole());
        return roles;
    }
    
}
