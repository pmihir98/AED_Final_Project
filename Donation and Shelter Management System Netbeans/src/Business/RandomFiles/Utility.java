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
public class Utility {
    
    public static boolean  isNullOrEmpty(String s){
        if(s == null || s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
}