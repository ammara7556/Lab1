import java.util.Scanner;

/**
 * Program Name: ProgChall12_City
 * Description: This program asks the user for a city name and displays the length, uppercase, lowercase, and first character.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-02-16
 */
public class ProgChall12_City
{
    public static void main(String[] args)
    {
        // Declarations
        String city;

        // Input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of your favorite city: ");
        city = keyboard.nextLine();

        // Output
        System.out.println("Number of characters: " + city.length());
        System.out.println("Uppercase: " + city.toUpperCase());
        System.out.println("Lowercase: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));

        keyboard.close();
    }
}