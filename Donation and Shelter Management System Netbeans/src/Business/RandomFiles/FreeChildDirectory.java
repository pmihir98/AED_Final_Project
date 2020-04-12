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
 * @author praneethreddy
 */
public class FreeChildDirectory {

    private List<FreeChild> freeChilds;

    public FreeChildDirectory() {
        this.freeChilds = new ArrayList<>();
    }

    public List<FreeChild> getFreeChilds() {
        return freeChilds;
    }

    public void setFreeChilds(List<FreeChild> freeChilds) {
        this.freeChilds = freeChilds;
    }
    
     public FreeChild addChild(){
        if(freeChilds == null){
            freeChilds = new ArrayList<>();
        }
        ParentFreeChild parentFreeChild = new ParentFreeChild();
        FreeChild freeChild = new FreeChild();
        freeChild.setParentFreeChild(parentFreeChild);
        freeChilds.add(freeChild);
        return freeChild;
    }
    
    

}
