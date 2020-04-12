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
public class EventInEventMangDirectory {
    
    List<EventInEventManagement> eventInEventManagements;

    public EventInEventMangDirectory() {
        this.eventInEventManagements = new ArrayList<>();
        
    }

    public List<EventInEventManagement> getEventInEventManagements() {
        return eventInEventManagements;
    }

    public void setEventInEventManagements(List<EventInEventManagement> eventInEventManagements) {
        this.eventInEventManagements = eventInEventManagements;
    }

    @Override
    public String toString() {
        return "EventInEventMangDirectory{" + "eventInEventManagements=" + eventInEventManagements + '}';
    }
    
    public EventInEventManagement addEventInEventManagement(){
        if(eventInEventManagements == null){
            eventInEventManagements = new ArrayList<>();
        }
        
        EventInEventManagement e = new EventInEventManagement();
        
        eventInEventManagements.add(e);
        return e;
    }
    
    
    
}
