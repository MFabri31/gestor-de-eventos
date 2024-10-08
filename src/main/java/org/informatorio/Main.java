package org.informatorio;

import java.util.Scanner;

import org.informatorio.domain.Organizer;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Gestor de Eventos =====");

        Organizer organizer = new Organizer();

        int option;

        Scanner scann = new Scanner(System.in);

        do {
            System.out.println("[1] Crear evento");
            System.out.println("[2] Agregar participante");
            System.out.println("[3] Listar eventos");
            System.out.println("[4] Asginar chef a evento");
            System.out.println("[5] Salir");

            option = scann.nextInt();

            switch (option) {
                case 1:
                    organizer.createEvent();
                    break;
                case 2:
                    organizer.registerParticipant();
                    break;
                case 3:
                    organizer.showEvents();
                    break;
                case 4:
                    organizer.assignChefToEvent();;
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida!.");
                    break;
            }

        } while (option != 5);

        scann.close();
    }
}
