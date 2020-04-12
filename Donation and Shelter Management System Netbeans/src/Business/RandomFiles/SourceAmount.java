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
public class SourceAmount {
    
    private String bodyName;
    private int amount;

    public String getBodyName() {
        return bodyName;
    }

    public void setBodyName(String bodyName) {
        this.bodyName = bodyName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SourceAmount{" + "bodyName=" + bodyName + ", amount=" + amount + '}';
    }
    
    
    
    
    
}
