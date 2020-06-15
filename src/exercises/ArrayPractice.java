package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static String excerptText = "I would not, could not, in a box. " +
            "I would not, could not with a fox. " +
            "I will not eat them in a house. " +
            "I will not eat them with a mouse.";
    public static void main(String[] args){
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        String excerpt = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] wordsArray = excerpt.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        String[] wordsArray2 = excerpt.split("\\. ");
        System.out.println(Arrays.toString(wordsArray2));
    }
}
