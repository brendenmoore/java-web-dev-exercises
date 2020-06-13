package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle:");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Width of rectangle:");
        int width = Integer.parseInt(input.nextLine());
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
