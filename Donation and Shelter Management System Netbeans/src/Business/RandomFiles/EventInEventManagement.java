/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

import Business.Role.EventType;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class EventInEventManagement {
    
    private String name;
    private String dateTime;
    private EventType eventType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    
}
