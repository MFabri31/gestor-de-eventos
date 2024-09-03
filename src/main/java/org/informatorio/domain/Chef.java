package org.informatorio.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Chef {
    private UUID id;
    private String name;
    private String specialty;
    private List<Event> events = new ArrayList();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setEvents(Event event) {
        this.events.add(event);
    }


}
