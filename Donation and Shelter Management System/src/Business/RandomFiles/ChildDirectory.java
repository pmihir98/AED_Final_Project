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
public class ChildDirectory {
    
    private List<Child> childList;

    public ChildDirectory() {
        
        childList =  new ArrayList<>();
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }
    
    
    public Child addChild(){
        if(childList == null){
            childList = new ArrayList<Child>();
        }
        Child child = new Child();
        childList.add(child);
        return child;
    }
    
    
    
    
    
    
    
}
