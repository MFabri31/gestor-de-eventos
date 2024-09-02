package org.informatorio.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
import java.util.UUID;

import org.informatorio.enums.CulinaryInterestsEnum;


public class Organizer {
    
    private List<Event> events = new ArrayList();

    public Event createEvent() {

        Event event = new Event();
        Chef chef = new Chef();

        Scanner scann = new Scanner(System.in);

        event.setId(UUID.randomUUID());

        chef.setId(UUID.randomUUID());

        System.out.println("Nombre");

        String name = scann.nextLine();
        scann.nextLine();
        event.setName(name);

        System.out.println("Descripción");

        String description = scann.nextLine();
        scann.nextLine();
        event.setDescription(description);


        System.out.println("Fecha");

        String date = scann.nextLine();
        scann.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateFormatted = LocalDate.parse(date, formatter);

        event.setDate(dateFormatted);


        System.out.println("Ubicación");

        String location = scann.nextLine();
        scann.nextLine();
        event.setLocation(location);


        System.out.println("Capacidad");

        int capacity = scann.nextInt();
        scann.nextLine();
        event.setCapacity(capacity);

        this.events.add(event);

        System.out.println("Evento creado exitosamente!");

        return event;

    }

    public void registerParticipant() {
    
        Scanner scann = new Scanner(System.in);

        Participant participant = new Participant();

        System.out.println("--------------------------");
        System.out.println("Registro de participante");

        System.out.println("Nombre");
        String name = scann.nextLine();
        scann.nextLine();

        participant.setName(name);

        System.out.println("Apellido");
        String lastName = scann.nextLine();
        scann.nextLine();
        
        participant.setLastName(lastName);

        System.out.println("Intereses culinarios");

        System.out.println("[1] Barbacoa");
        System.out.println("[2] Cocina vegana");
        System.out.println("[3] Cocina Italiana");
        System.out.println("[4] Pasteleria Francesa");


        int interest = scann.nextInt();
        scann.nextLine();

        switch (interest) {
            case 1:
                participant.setCulinaryInterests(CulinaryInterestsEnum.MEXICAN_CUISINE);
                break;
            case 2:
                participant.setCulinaryInterests(CulinaryInterestsEnum.BARBECUE);
                break;
            case 3:
                participant.setCulinaryInterests(CulinaryInterestsEnum.FRENCH_PASTRY);
                break;
            case 4:
                participant.setCulinaryInterests(CulinaryInterestsEnum.ITALIAN_CUISINE);
                break;
            default:
                break;
        }

        System.out.println("Evento a asistir");

        String eventName = scann.nextLine();
        scann.nextLine();

        for (Event event : events) {
            if(event.getName().equals(eventName)){
                event.addParticipant(participant);
                participant.setEvents(event);
            }else{
                System.out.println("El evento no existe.");
                return;
            }
        }

        System.out.println("Participante registrado exitosamente!");
    }




public void showEvents() {
        
    if(events.size() > 0){
    
        Scanner scann = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("Ingrese una fecha (yyyy-mm-dd).");
        System.out.println("==============================");
    
        String date = scann.nextLine();
        
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateFormatted = LocalDate.parse(date, formatter);
        
        System.out.println("====================");
        System.out.println("Eventos disponibles.");
        System.out.println("====================");
        
        for (Event event : events) {
            if(event.getDate().isEqual(dateFormatted)){
                System.out.println("Nombre: " + event.getName());
                System.out.println("Descripción: " + event.getDescription());
                System.out.println("Fecha: " + event.getDate());
                System.out.println("Ubicación: " + event.getLocation());
                System.out.println("Capacidad: " + event.getCapacity());
                System.out.println("Total de participantes: " + event.getTotalParticipants());
                System.out.println("----------------------------------------");
              
            }else{
                System.out.println("===============================");
                System.out.println("No hay eventos para esa fecha.");
                System.out.println("===============================");
                return;   
            }
        }
    }else{
        System.out.println("===========================");
        System.out.println("No hay eventos disponibles.");
        System.out.println("===========================");
    }

    }
}