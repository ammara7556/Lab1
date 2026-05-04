import java.util.Scanner;

/**
 * This program reads a line of words and checks each one.
 * It moves the first letter to the end, reverses the word,
 * and compares it to the original to see if it works.
 * The program stops when the user enters "quit".
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class ReverseWord {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String word, combined, flipped;
        char firstLetter;
        String again;

        do {
            System.out.print("Enter words separated by a space ending with the word quit: ");
            word = keyboard.next().toLowerCase();

            while (!word.equals("quit")) {

                combined = "";
                flipped = "";

                firstLetter = word.charAt(0);
                String remaining = word.substring(1);

                combined = remaining + firstLetter;

                for (int i = combined.length() - 1; i >= 0; i--) {
                    flipped += combined.charAt(i);
                }

                if (flipped.equals(word)) {
                    System.out.println(word + " works");
                } else {
                    System.out.println(word + " does not work");
                }

                word = keyboard.next().toLowerCase();
            }

            System.out.print("Enter yes to process another line? ");
            again = keyboard.next();

        } while (again.equalsIgnoreCase("yes"));

        keyboard.close();
    }
}