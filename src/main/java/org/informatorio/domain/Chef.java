package org.informatorio.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Chef {
    private UUID id;
    private String name;
    private String specialties;
    private List<Event> events = new ArrayList();
    
    public String getName() {
        return name;
    }
    public String getSpecialties() {
        return specialties;
    }
    public List<Event> getEvents() {
        return events;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

}
