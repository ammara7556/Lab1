import java.util.Scanner;

/**
 * This program asks the user for a temperature and a unit (C or F),
 * then converts it to the other unit. It checks for valid input and
 * keeps asking until the user enters something correct. The user can
 * also choose to run the program again.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class Temperature {
    public static void main(String[] args) {

        double inputTemp, output;
        char inputUnit;
        String again;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter a whole number, a space, and C or F (ie 100 F converts to Cels): ");
            inputTemp = keyboard.nextDouble();
            inputUnit = Character.toUpperCase(keyboard.next().charAt(0));

            while (inputUnit != 'C' && inputUnit != 'F') {
                System.out.print("Enter C to convert to F or vice versa: ");
                inputUnit = Character.toUpperCase(keyboard.next().charAt(0));
            }

            if (inputUnit == 'F') {
                output = (inputTemp - 32) * 5.0 / 9;
                System.out.printf("%.0fF converted is: %.1fC%n", inputTemp, output);
            } else {
                output = inputTemp * 9.0 / 5 + 32;
                System.out.printf("%.0fC converted is: %.1fF%n", inputTemp, output);
            }

            System.out.print("Do you want to calculate another temp? If so, enter yes otherwise no: ");
            again = keyboard.next();

        } while (again.equalsIgnoreCase("yes"));

        keyboard.close();
    }
}