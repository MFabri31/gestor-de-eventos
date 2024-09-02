package org.informatorio.domain;

import java.util.ArrayList;
import java.util.List;

import org.informatorio.enums.CulinaryInterestsEnum;

public class Participant {

    private String name;
    private String lastName;
    private List<CulinaryInterestsEnum> culinaryInterests = new ArrayList();
    private List<Event> events = new ArrayList();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCulinaryInterests(CulinaryInterestsEnum culinaryInterest) {
        this.culinaryInterests.add(culinaryInterest);
    }


    public void setEvents(Event event) {
        this.events.add(event);
    }

}
