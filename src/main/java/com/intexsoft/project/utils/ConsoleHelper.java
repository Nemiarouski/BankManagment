package com.intexsoft.project.utils;

import java.util.Scanner;

public class ConsoleHelper {
    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        String name;
        do {
            name = scanner.nextLine();
        } while (name.length() <= 0);
        return name;
    }

    public int validateIntToValue(int value) {
        int inputNumber;
        do {
            System.out.println("[INFO]: Input number 1-" + value + ":");
            while (!scanner.hasNextInt()) {
                System.out.println("[INFO]: Input number 1-" + value + ":");
                scanner.next();
            }
            inputNumber = scanner.nextInt();
        } while (inputNumber <= 0 || inputNumber > value);
        return inputNumber;
    }


    public int validateInt() {
        int inputNumber;
        do {
            System.out.println("[INFO]: Input positive number:");
            while (!scanner.hasNextInt()) {
                System.out.println("[INFO]: Input positive number:");
                scanner.next();
            }
            inputNumber = scanner.nextInt();
        } while (inputNumber <= 0);
        return inputNumber;
    }

    public double validateDouble() {
        double inputNumber;
        do {
            System.out.println("[INFO]: Input positive number:");
            while (!scanner.hasNextDouble()) {
                System.out.println("[INFO]: Input positive number:");
                scanner.next();
            }
            inputNumber = scanner.nextDouble();
        } while (inputNumber <= 0);
        return inputNumber;
    }
}