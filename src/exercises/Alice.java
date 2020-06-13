package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Search term:");
        String term = input.nextLine().toLowerCase().trim();
        boolean result = text.toLowerCase().contains(term);
        System.out.println(result);
        int index = text.toLowerCase().indexOf(term);
        String newText = text.substring(0, index) + text.substring(term.length() + index);
        System.out.println(newText);
    }
}
