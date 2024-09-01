package org.informatorio.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


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


}