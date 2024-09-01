package org.informatorio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Gestor de Eventos =====");

        int option;

        Scanner scann = new Scanner(System.in);

        do {
            System.out.println("[1] Crear evento");
            System.out.println("[2] Agregar participante");
            System.out.println("[3] Listar eventos");
            System.out.println("[4] Salir");

            option = scann.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Creando evento");
                    break;
                case 2:
                    System.out.println("Agregando participante");
                    break;
                case 3:
                    System.out.println("Listando eventos");
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida!.");
                    break;
            }

        } while (option != 4);

        scann.close();
    }
}