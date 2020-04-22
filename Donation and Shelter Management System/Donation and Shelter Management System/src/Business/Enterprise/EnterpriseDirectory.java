/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.GoverningBody) {

            if (name.equalsIgnoreCase("public")) {
                enterprise = new PublicEnterprise(name);
                enterpriseList.add(enterprise);
            } else {
                enterprise = new GovernmentEnterprise(name);
                enterpriseList.add(enterprise);
            }
        }
        if (type == Enterprise.EnterpriseType.SocialCause) {
            enterprise = new OrphanageEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }
}
