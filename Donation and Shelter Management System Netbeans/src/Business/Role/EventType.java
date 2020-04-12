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
public enum EventType {

    Cultural("Cultural"), SexualAwareness("SexualAwareness"), Sports("Sports");

    private String value;

    private EventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
