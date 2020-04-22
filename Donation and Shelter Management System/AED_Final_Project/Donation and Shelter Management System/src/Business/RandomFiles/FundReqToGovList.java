/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utkarsh
 */
public class FundReqToGovList {
    
    private List<FundReqToGov> fundReqToGovs;
    

    public FundReqToGovList() {
        this.fundReqToGovs = new ArrayList<>();
    }

    public List<FundReqToGov> getFundReqToGovs() {
        return fundReqToGovs;
    }

    public void setFundReqToGovs(List<FundReqToGov> fundReqToGovs) {
        this.fundReqToGovs = fundReqToGovs;
    }
    
    public FundReqToGov addReq(){
        if(fundReqToGovs == null){
            fundReqToGovs = new ArrayList<>();
        }
        FundReqToGov fun = new FundReqToGov();
        fundReqToGovs.add(fun);
        return fun;
    }

    @Override
    public String toString() {
        return "FundReqToGovList{" + "fundReqToGovs=" + fundReqToGovs + '}';
    }
    
    
    
}
