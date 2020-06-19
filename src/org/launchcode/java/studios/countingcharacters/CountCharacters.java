package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
    public static void printCharacterCounts(String aString) {
        String lowercaseString = aString.toLowerCase();
        char[] charactersInString = lowercaseString.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (Character c : charactersInString) {
            if (Character.isAlphabetic((c))){
                if (!charMap.containsKey(c)) {
                    charMap.put(c, 1);
                } else {
                    int numOfChars = charMap.get(c);
                    numOfChars++;
                    charMap.replace(c, numOfChars);
                }
            }


        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : charMap.entrySet()) {
            char c = characterIntegerEntry.getKey();
            int numOfChars = characterIntegerEntry.getValue();
            System.out.println(c + " - " + numOfChars);
        }
    }
    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String inputString = in.nextLine();

        Path fileName = Path.of("C:\\Users\\Brenden\\Desktop\\java-practice\\chapter-one\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingcharacters\\demo.txt");

        String actual = Files.readString(fileName);
        System.out.println(actual);

        String sampleText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        printCharacterCounts(actual);
    }
}
