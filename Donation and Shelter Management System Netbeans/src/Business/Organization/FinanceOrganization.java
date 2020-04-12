/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RandomFiles.SourceAmountList;
import Business.Role.FundsAllocationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class FinanceOrganization extends Organization {

    private long totalIncome;
    private SourceAmountList sourceAmountList;

    public long getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(long totalIncome) {
        this.totalIncome = totalIncome;
    }

    public SourceAmountList getSourceAmountList() {
        return sourceAmountList;
    }

    public void setSourceAmountList(SourceAmountList sourceAmountList) {
        this.sourceAmountList = sourceAmountList;
    }

    public FinanceOrganization(String name) {
        super(name);
        sourceAmountList = new SourceAmountList();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundsAllocationRole());

        return roles;
    }

}
