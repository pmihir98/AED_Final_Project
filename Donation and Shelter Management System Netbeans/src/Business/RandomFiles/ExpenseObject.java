/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class ExpenseObject {
    
    private String amount;
    private int childId;
    private String purpose;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    @Override
    public String toString() {
        return "ExpenseObject{" + "amount=" + amount + ", childId=" + childId + '}';
    }
    
    
    
}
