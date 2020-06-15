package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    static int sumEven(ArrayList<Integer> intList){
        int sum = 0;
        for (int i : intList) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    static void printSameLetterWords(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters should the word be?");
        int numLetters = Integer.parseInt(input.nextLine());
        for (String word : wordList){
            if(word.length() == numLetters){
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(intList));

        ArrayList<String> wordList = new ArrayList<>(List.of("Happy", "Birthday", "To", "You", "Sarah"));
        printSameLetterWords(wordList);

        String[] excerptArray = ArrayPractice.excerptText.split(" ");
        ArrayList<String> excerptList = new ArrayList<>(Arrays.asList(excerptArray));

        printSameLetterWords(excerptList);
    }
}
