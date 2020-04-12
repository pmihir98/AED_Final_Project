/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public enum Gender {
        Male("Male"), Female("Female");
        
        private String value;

        private Gender(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }