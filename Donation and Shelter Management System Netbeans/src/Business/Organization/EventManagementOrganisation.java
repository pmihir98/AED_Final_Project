/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RandomFiles.EventInEventMangDirectory;
import Business.Role.ActivityConsultantRole;
import Business.Role.ActivityManagerRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class EventManagementOrganisation extends Organization {

    public EventInEventMangDirectory eventInEventMangDirectory;

    public EventManagementOrganisation(String name) {
        super(name);
        eventInEventMangDirectory = new EventInEventMangDirectory();
    }

    public EventInEventMangDirectory getEventInEventMangDirectory() {
        return eventInEventMangDirectory;
    }

    public void setEventInEventMangDirectory(EventInEventMangDirectory eventInEventMangDirectory) {
        this.eventInEventMangDirectory = eventInEventMangDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ActivityManagerRole());
        roles.add(new ActivityConsultantRole());
        return roles;
    }

}
