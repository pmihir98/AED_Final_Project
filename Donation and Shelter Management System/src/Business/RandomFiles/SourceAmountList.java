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
 * @author Utkasrh
 */
public class SourceAmountList {

    private List<SourceAmount> sourceAmounts;

    public SourceAmountList() {
        this.sourceAmounts = new ArrayList<SourceAmount>();
    }

    public List<SourceAmount> getSourceAmounts() {
        return sourceAmounts;
    }

    public void setSourceAmounts(List<SourceAmount> sourceAmounts) {
        this.sourceAmounts = sourceAmounts;
    }

    @Override
    public String toString() {
        return "SourceAmountList{" + "sourceAmounts=" + sourceAmounts + '}';
    }
    
    public SourceAmount addSourceA(){
        if(sourceAmounts == null){
            sourceAmounts = new ArrayList<>();
        }
        SourceAmount fun = new SourceAmount();
        sourceAmounts.add(fun);
        return fun;
    }

}
