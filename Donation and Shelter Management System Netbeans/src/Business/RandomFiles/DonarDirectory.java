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
 * @author Sudheer Reddy Gaddam
 */
public class DonarDirectory {

    private List<Donar> donarList;

    public DonarDirectory() {
        donarList = new ArrayList<Donar>();
    }
    
    

    public List<Donar> getDonarList() {
        return donarList;
    }

    public void setDonarList(List<Donar> donarList) {
        this.donarList = donarList;
    }

    @Override
    public String toString() {
        return "DonarDirectory{" + "donarList=" + donarList + '}';
    }

    public Donar addDonar() {
        if(donarList == null){
            donarList = new ArrayList<Donar>();
        }
        Donar d = new Donar();
        donarList.add(d);
        return d;
    }

}
