package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float miles = Float.parseFloat(input.nextLine());
        System.out.println("How much gas (in gallons) have you consumed?");
        float gas = Float.parseFloat(input.nextLine());
        float milesPerGallon = miles / gas;
        System.out.println("You got " + milesPerGallon + " miles per gallon");
    }
}
