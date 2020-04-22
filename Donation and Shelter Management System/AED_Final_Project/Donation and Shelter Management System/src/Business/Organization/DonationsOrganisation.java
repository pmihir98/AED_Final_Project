/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RandomFiles.FundReqToGovList;

import Business.Role.ExpenseManagerRole;
import Business.Role.FundManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utkarsh
 */
public class DonationsOrganisation extends Organization{
    
   
    
   // private FundReqToGovList fundRequestslist;
    
     public DonationsOrganisation(String name) {
         super(name);
       //  this.fundRequestslist = new FundReqToGovList();
        
    }
    
    private int availableFund;
    
    private int totalExpenditure;
    
    

    public int getAvailableFund() {
        return availableFund;
    }

    public void setAvailableFund(int availableFund) {
        this.availableFund = availableFund;
    }

    public int getTotalExpenditure() {
        return totalExpenditure;
    }

    public void setTotalExpenditure(int totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }

    
        
    
    //Need ot add supported roles

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundManagerRole());
        roles.add(new ExpenseManagerRole());
        return roles;
    }
    
}
