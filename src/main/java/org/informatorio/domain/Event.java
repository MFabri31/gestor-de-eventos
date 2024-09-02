package org.informatorio.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Event {

    private UUID id;
    private String name;
    private String description;
    private LocalDate date;
    private String Location;
    private Integer capacity;
    private List<Participant> participants = new ArrayList();

    public UUID getId() {
        return id;
    }
    
    public void setId(UUID id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
     public void setDate(LocalDate date) {
         this.date = date;
     }
    
    public void setLocation(String location) {
        Location = location;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return Location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public int getTotalParticipants() {
        return this.participants.size();
    }


    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

}
