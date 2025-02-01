package com.jg;

import java.sql.Array;
import java.util.Scanner;

public class UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    private static void init() {
    }

    public static void display() {
        mainMenu();
    }

    private static void mainMenu() {
        init();
        short menuCommand;
        do {
            System.out.println("Welcome to the Slums of shaolin");
            System.out.println("Praise to the almighty Wu");
            System.out.println("1. Start initiation");
            System.out.println("36. Exit");
            menuCommand = scanner.nextShort();
            switch (menuCommand) {
                case 1:
                    System.out.println("You have chosen to start initiation");
                    nameThatWhu();
                    break;
                case 36:
                    System.out.println("You have chosen to exit");
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        } while (menuCommand != 36);
    }

    private static void nameThatWhu() {
        String wuName;
        short counter = 0;
        String[] wuNames = {"RZA", "GZA", "ODB", "MethodMan", "Raekwon", "GhostfaceKillah", "InspectahDeck", "UGod", "MastaKilla", "Cappadonna"};
        scanner.nextLine();
        do {
            System.out.println("Enter a members name");
            wuName = scanner.nextLine();
            for (String name : wuNames) {
                if (wuName.equalsIgnoreCase(name)) {
                   if(counter > 0) {
                       System.out.println((3 - counter) + " attempts left");
                   }
                    System.out.println("Correct");
                    break;
                } else {
                    System.out.println("Incorrect");
                    counter++;
                    break;
                }
            }
        } while (counter != 3);
    }
}
