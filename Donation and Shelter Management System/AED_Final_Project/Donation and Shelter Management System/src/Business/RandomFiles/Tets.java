/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Utkarsh
 */
public class Tets {
    
    
    public static void main(String[] args) {
        Donar d = new Donar();
        System.out.println(d);
        Organization o;
        o = new Organization("") {
            @Override
            public ArrayList<Role> getSupportedRole() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        System.out.println(o);
    }
    
}
