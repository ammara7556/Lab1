import java.util.Scanner;

/**
 * Program Name: ProbChall1
 * Description: This program converts a number from 1 to 3 into a Roman numeral using a switch statement.
 * @author Ammara Agsalud
 * @version 1.0
 * @since 2026-03-01
 */
public class ProbChall1
{
    public static void main(String[] args)
    {
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 3: ");
        number = keyboard.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("1 converted to Roman Numeral is I");
                break;

            case 2:
                System.out.println("2 converted to Roman Numeral is II");
                break;

            case 3:
                System.out.println("3 converted to Roman Numeral is III");
                break;

            default:
                System.out.println(number + " is not a valid number. Must be between 1 and 3.");
                break;
        }

        keyboard.close();
    }
}