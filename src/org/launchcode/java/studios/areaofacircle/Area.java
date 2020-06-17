package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    // ANSI colors for error messages
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\n\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius = null;
        System.out.print("Enter a radius: ");

        do  {
            // Make sure it is a double
            if (input.hasNextDouble()) {
                radius = input.nextDouble();

                // Make sure it is positive
                if (radius < 0) {
                    input.nextLine();
                    System.out.println(RED + "Error: you entered a negative number!");
                    System.out.print(RESET + "Please enter a positive number: ");
                    radius = null;
                }
            } else {
                input.nextLine();
                System.out.println(RED + "Error: invalid entry.");
                System.out.print(RESET + "Please enter a positive number: ");
            }

        } while (radius == null);

        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
